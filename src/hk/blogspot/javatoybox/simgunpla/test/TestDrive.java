package hk.blogspot.javatoybox.simgunpla.test;

import hk.blogspot.javatoybox.simgunpla.Ew1_Left_Arm;
import hk.blogspot.javatoybox.simgunpla.Ew5_Left_Arm;
import hk.blogspot.javatoybox.simgunpla.GunplaArm;
import hk.blogspot.javatoybox.simgunpla.GunplaBody;
import hk.blogspot.javatoybox.simgunpla.junction.PC_C;

public class TestDrive {

	public static void main(String[] args) {
		
		//Object type "PC_C" interface 
		PC_C Ew5_arm = new Ew5_Left_Arm();
		GunplaBody testing1 = new GunplaBody();
		testing1.concatenate(Ew5_arm);
		
		//Object type "Ew1_Left_Arm" Super Class "GunplaArm"
		GunplaArm Ew1_arm = new Ew1_Left_Arm();
		GunplaBody testing2 = new GunplaBody();
		testing2.concatenate(Ew1_arm);
		
		//Object type "Ew1_Left_Arm" Class
		Ew1_Left_Arm Ew1_arm_2 = new Ew1_Left_Arm();
		GunplaBody testing3 = new GunplaBody();
		testing3.concatenate(Ew1_arm_2);
	}

}
