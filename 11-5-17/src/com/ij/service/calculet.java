/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.service;

import org.springframework.stereotype.Component;

/**
 * @author :IRFAN
 *TIME:4:46:30 am
 * DATE:11-May-2017
 *PROJECTNAME:11-5-17
 */
@Component("target")
public class calculet {
	public Integer sum(Integer x ,Integer y)
	{
		return x+y;
	}
	public Integer sub(Integer x ,Integer y)
	{
		return x-y;
	}
	public Integer dev(Integer x ,Integer y)
	{
		return x/y;
	}
	public Integer mul(Integer x ,Integer y)
	{
		return x*y;
	}
	
}
