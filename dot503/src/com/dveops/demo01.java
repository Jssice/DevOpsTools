package com.dveops;

public class demo01 {
	public String sum(String d, int ... arg) {
		int s = Integer.parseInt(d);
		int sum = 0; 
		for(int i=0; i<arg.length; i++) {
			sum=sum+arg[i];
		}
		return sum+""+s;
	}

	public static void main(String[] args) {
		demo01 junit = new demo01();
		String sum=junit.sum("5",2,4,6);
		System.out.println("result:" + sum);
	}

}