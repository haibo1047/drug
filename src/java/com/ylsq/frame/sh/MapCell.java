/**
 * 
 */
package com.ylsq.frame.sh;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.extremecomponents.table.bean.Column;
import org.extremecomponents.table.cell.AbstractCell;
import org.extremecomponents.table.core.TableModel;

/**
 * @author hopper
 *
 */
public class MapCell extends AbstractCell{

	@SuppressWarnings("unchecked")
	@Override
	protected String getCellValue(TableModel model, Column column) {
		Map<String,String> map = (Map<String,String>)column.getPropertyValue();
		String value = map.toString();
		String ft = column.getParse();
		if (map != null && StringUtils.isNotBlank(ft)){
			value = map.get(ft);
		}
        return value;
	}

}
