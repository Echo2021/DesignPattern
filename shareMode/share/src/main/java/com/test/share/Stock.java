package com.test.share;

public class Stock {

	private int total;
	
	private int used;
	
	public Stock(int total,int used) {
		
		this.total = total;
		
		this.used = used;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}

}
