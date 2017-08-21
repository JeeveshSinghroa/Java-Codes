package com.yyy;
public class Rect
{
	double l,b,h;
	public Rect(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;	
	}
	public double vol()
	{
		return l*b*h;
	}
}