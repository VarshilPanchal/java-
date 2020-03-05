package com.testing.tdd_example;
import com.math1.MathLibrary;
import junit.framework.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class MathLibraryTest 
{
	double x=400,y=10;
	double valueOfX[] = {10,20,30,40,50};
	double valueOfY[] = {10,20,40,60,70};
	MathLibrary mb = new MathLibrary();
	
	@Test
	public void findSumOf() {
		double sum = mb.getSumOf(valueOfX);
		Assert.assertEquals("error in getSumOf method ",150.0, sum);	
	}
	
	@Test
	public void findMeanOf() {
		double mean = mb.getMeanOf(valueOfX);
		Assert.assertEquals("error in getMeanOf method ",30.0, mean);	
	}
	@Test
	public void findDeviationOf() {
		double[] expectedDeviation = {-20.000,-10.000,0.000,10.000,20.000};
		double[] deviation = mb.getDeviationOf(valueOfX);
		assertArrayEquals("error in getDeviationOf method ",expectedDeviation, deviation, 0);
	}
	@Test
	public void findProductOfArray() {
		double[] expectedProductArray = {100,400,1200,2400,3500};
		double[] productArray = mb.getproductOfEachElementInArray(valueOfX,valueOfY);
		assertArrayEquals("error in getproductOfEachElementInArray method",expectedProductArray, productArray, 0);
	}
	@Test
	public void findDivisionOf() {
		
		double division = mb.getDivisionOf(x,y);
		Assert.assertEquals("error in divisonOf mehtod",40.0,division);
	}
	@Test
	public void findSquarRootOf() {
		double squareRoot = mb.getSquareRootOf(x);
		
		Assert.assertEquals("error in getSquareRootOf mehtod",20.0,squareRoot );
	}
	@Test
	public void findProductOf() {
		double product = mb.getproductOf(x, y);
		Assert.assertEquals("error in getProductOf method ",4000.0, product);
	}
}
