/**
 * 
 */
package com.ylsq.frame.sh;

import org.apache.commons.lang.StringUtils;
import org.extremecomponents.table.bean.Column;
import org.extremecomponents.table.cell.AbstractCell;
import org.extremecomponents.table.core.TableModel;

/**
 * @author hopper
 *
 */
public class TitleCell extends AbstractCell {

	@Override
	protected String getCellValue(TableModel model, Column column) {
		String value = column.getPropertyValueAsString();
		column.setTitle(value);
		String ft = column.getFormat();
		if (StringUtils.isNotBlank(value) && StringUtils.isNumeric(ft)){
			value = value.substring(0, Integer.parseInt(ft))+"..";
		}
        return value;
	}

}
