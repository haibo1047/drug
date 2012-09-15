/**
 * 
 */
package com.ylsq.frame.web.common;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ylsq.frame.dict.common.DrugType;
import com.ylsq.frame.model.common.Drug;
import com.ylsq.frame.model.common.Provider;
import com.ylsq.frame.service.common.CommonService;
import com.ylsq.frame.service.common.DrugService;
import com.ylsq.frame.service.common.ProviderService;
import com.ylsq.frame.utils.StringHelper;

/**
 * @author hopper
 *
 */

@Controller
@RequestMapping("drug")
public class DrugController extends CommonController<Drug>{
	private static Logger logger = LoggerFactory.getLogger(DrugController.class);
	@Autowired
	private DrugService drugService;
	@Autowired
	private ProviderService providerService;
	@Override
	protected String dir() {
		return "drug";
	}

	@Override
	protected Class<Drug> getObjectClass() {
		return Drug.class;
	}

	@Override
	protected CommonService<Drug> getModelService() {
		return drugService;
	}

	@Override
	protected void beforeSave() {
		object = (Drug)object;
		object.setSimpleSpell(StringHelper.getSimpleSpell(object.getDrugName()));
	}

	@Override
	protected void beforeEdit(Model model) {
		List<Provider> providers = providerService.findAll();
		model.addAttribute("providers", providers);
		model.addAttribute("drugTypes", DrugType.values());
	}
	
	@RequestMapping("importDrug")
	public String importDrug(Model model){
		objectDir(model);
		return dir()+"/importDrug";
	}
	
	@RequestMapping("doImport")
	public String doImport(@RequestParam("file") MultipartFile file,Model model){
		try{
			HSSFWorkbook book = new HSSFWorkbook(file.getInputStream());
			drugService.parseExcel(book);
		}catch(Exception e){
			logger.error("",e);
		}
		return list(model);
	}
	
	@RequestMapping("exportDrug")
	public void exportDrug(HttpServletResponse response){
		HSSFWorkbook book = new HSSFWorkbook();
		drugService.exportExcel(book);
		exportFile(response, book);
	}
}
