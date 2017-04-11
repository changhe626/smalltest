package com.string;

public class ByteDemo {

	public static void main(String[] args) {
		/*
		 * byte b=3; short s=4; //s=s+b;
		 */

		/*
		 * float f1=3.14f; float f2=3.5f; f2=f2+f1; System.out.println(f2);
		 */

		/*
		 * float f1=3.22f; double d=4.33d; // f1=f1+d; //Type mismatch: cannot
		 * convert from double to float d=f1+d; System.out.println(d);
		 */

		/*
		 * String s; System.out.println(s);
		 */
		int i = 0;
		double e = Math.E;
		for (float f = 16384; f < 16384 + 1; f += 1e-3f) {
			i++;
		}
		System.out.print("i=" + i);

	}

}
