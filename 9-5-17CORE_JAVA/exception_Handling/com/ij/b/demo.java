/**
 * 
 */
package com.ij.b;

import com.ij.exceptions.invalidammount;

/**
 * @author shaikh irfan
 *
 */
public class demo {
public void ammount(int amm)throws invalidammount{
	if(amm<200){
		throw new invalidammount("ammount shuld be more than 500"+amm);
	}
	
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		try {
			d.ammount(3);
		} catch (invalidammount e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(d);

	}

}
