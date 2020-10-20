package com.dlm.fmp.constant;

public enum EnumTest {
	ZHANGZI(1),CIZI(1){
		
	};
	
	private String name;
	private int value;
	 
    private EnumTest(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
    
    private EnumTest(int value) {
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
}
