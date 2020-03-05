package com.math1;

public class MathLibrary 
{
	double[] valueOfX,valueOfY;
	
	public double getSumOf(double[] valueOfX) {
		double sum = 0;
        for (double element : valueOfX) {
        	sum = sum + element;
        }
		return sum ;
	}

	public double getMeanOf(double[] valueOfX) {
		 double mean = (getSumOf(valueOfX)) / valueOfX.length;
	     return mean;
	}

	public double[] getDeviationOf(double[] valueOfX) {
		
		double temporaryArray[] = new double[valueOfX.length];
		int count = 0;
        for (double  elementOfArray: valueOfX) {
        	temporaryArray[count] = valueOfX[count] - getMeanOf(valueOfX);
        	count++;
		}
        return temporaryArray;

	}
	public double[] getproductOfEachElementInArray(double[] valueOfX,double[] valueOfY) {
		double temporaryArray[] = new double[valueOfX.length];
		int count = 0;
	for (double elementOfArray : valueOfX)
	{
		temporaryArray[count] = valueOfX[count]*valueOfY[count];
		count++;
	}return temporaryArray;
	
	}

	public double getDivisionOf(double numerator, double denominator) {
		return numerator / denominator;
	}

	public double getSquareRootOf(double number) {
		return Math.sqrt(number);
	}
	
	public double getproductOf(double x, double y) {
		return x*y;
	}
	
	 public double pearsonCorellationCoefficient(double[] valueOfX, double[] valueOfY) {
	        double numerator = getSumOf(getproductOfEachElementInArray(getDeviationOf(valueOfX), getDeviationOf(valueOfY)));
	        double denominator = getSquareRootOf(getproductOf(getSumOf(getproductOfEachElementInArray(getDeviationOf(valueOfX),getDeviationOf(valueOfX))) , getSumOf(getproductOfEachElementInArray(getDeviationOf(valueOfY),getDeviationOf(valueOfY)))));
	        double corelationCoefficient = getDivisionOf(numerator, denominator);
	        return corelationCoefficient;
	    }


}
