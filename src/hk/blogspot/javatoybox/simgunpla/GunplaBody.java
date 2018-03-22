package hk.blogspot.javatoybox.simgunpla;

import hk.blogspot.javatoybox.simgunpla.junction.PC_C;

public class GunplaBody {

	public void concatenate(PC_C leftArm) {
		System.out.println(leftArm.toString() + " by PC_C interface reference");
	}

	public void concatenate(GunplaArm leftArm) {
		System.out.println(leftArm.toString() + " by GunplaArm Super Class reference");
	}
}