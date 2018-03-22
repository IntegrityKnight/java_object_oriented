package hk.blogspot.javatoybox.simgunpla.test;

import hk.blogspot.javatoybox.simgunpla.Ew1_Left_Arm;
import hk.blogspot.javatoybox.simgunpla.Ew5_Left_Arm;
import hk.blogspot.javatoybox.simgunpla.GunplaArm;
import hk.blogspot.javatoybox.simgunpla.GunplaBody;
import hk.blogspot.javatoybox.simgunpla.junction.PC_C;

public class TestDrive {

	public static void main(String[] args) {
		
		GunplaBody testing = new GunplaBody();
		
		//Instance "Ew5_Left_Arm" assign to Object type "PC_C" interface 
		PC_C Ew5_arm = new Ew5_Left_Arm();
		testing.concatenate(Ew5_arm);
		
		//Instance Super Class "GunplaArm" 
		GunplaArm Ew1_arm_1 =  new GunplaArm();
		testing.concatenate(Ew1_arm_1);
		
		//Instance Sub Class "Ew1_Left_Arm"
		Ew1_Left_Arm Ew1_arm = new Ew1_Left_Arm();
		testing.concatenate(Ew1_arm);
				
		//Object "Ew1_Left_Arm" assign to Super Class "GunplaArm"
		GunplaArm Ew1_arm_2= Ew1_arm;
		testing.concatenate(Ew1_arm_2);
		
		
		
		
	}

}
