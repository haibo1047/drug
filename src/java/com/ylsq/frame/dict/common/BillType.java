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
	STORAGE(1,"入库单","rk","storage",WarehouseType.IN),
	RETAIL(2,"零售单","ls","retail",WarehouseType.OUT);
	
	BillType(int v,String l,String p,String bill,WarehouseType wt){
		value = v;
		label = l;
		prefix = p;
		billPrefix = bill;
		warehouseType = wt;
	}
	public static BillType convert(int v){
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
	private WarehouseType warehouseType;
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
	public WarehouseType getWarehouseType() {
		return warehouseType;
	}
	public void setWarehouseType(WarehouseType warehouseType) {
		this.warehouseType = warehouseType;
	}
}
