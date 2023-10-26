package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if(n == 0) {
			return 0; 
		}
			// FIXME compute the geometric sum for the first n terms recursively
		double sum = Math.pow(1/2,n) + geometricSum(n-1); 
		return sum;
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
		int[] reverse = new int [array.length]; 
		if (array.length == 0) {
			return array; 
		}
		
		return helper(array, 0, reverse);
		
	}

	public static int[] helper(int[] array, int index, int[] reverse) { 
		int middle = array.length/2; 
		if(index > middle) {
			 return reverse; 
		}
		else { 
			reverse[index] = array[array.length-index-1]; 
			reverse[array.length-index-1] = array[index]; 
			return helper(array, index+1, reverse);
		}

	}
	
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			
			double radiusMinimumDrawingThreshold) {
		
		if(radius >= radiusMinimumDrawingThreshold) {
			StdDraw.circle(xCenter, yCenter, radius); 
			double topCenter = yCenter + radius; 
			double bottomCenter = yCenter - radius; 
			double rightCenter = xCenter + radius; 
			double leftCenter = xCenter - radius; 
			double newRadius = radius/3.0; 
			circlesUponCircles(xCenter, topCenter, newRadius, radiusMinimumDrawingThreshold); 
			circlesUponCircles(xCenter, bottomCenter, newRadius, radiusMinimumDrawingThreshold); 
			circlesUponCircles(rightCenter, yCenter, newRadius, radiusMinimumDrawingThreshold); 
			circlesUponCircles(leftCenter, yCenter, newRadius, radiusMinimumDrawingThreshold); 
		}
		// FIXME 
	}

}
