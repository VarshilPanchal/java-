package com.pearson;
import com.math1.*;

public class PearsonCorellationCoefficient {
	
	public static void main(String[] args) {
		double valueOfX[] = {10,20,30,40,50};
		double valueOfY[] = {11,22,33,44,55};
		MathLibrary calc = new MathLibrary();
		System.out.println("r: "+calc.pearsonCorellationCoefficient(valueOfX,valueOfY));
	}

}
