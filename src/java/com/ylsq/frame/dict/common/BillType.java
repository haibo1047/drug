/**
 * 
 */
package com.ylsq.frame.dict.common;

import com.ylsq.frame.sh.LabelAndValue;

/**
 * @author hopper
 *
 */
public enum BillType implements LabelAndValue {
	STORAGE(1,"入库单","rk","storage");
	
	BillType(int v,String l,String p,String bill){
		value = v;
		label = l;
		prefix = p;
		billPrefix = bill;
	}
	public BillType convert(int v){
		for(BillType e : values()){
			if(e.getValue()==v){
				return e;
			}
		}
		return null;
	}
	
	private Integer value;
	private String label;
	private String prefix;
	private String billPrefix;
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getBillPrefix() {
		return billPrefix;
	}
	public void setBillPrefix(String billPrefix) {
		this.billPrefix = billPrefix;
	}
}
