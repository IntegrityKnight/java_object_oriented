package hk.blogspot.javatoybox.simgunpla;

import hk.blogspot.javatoybox.simgunpla.junction.PC_C;

public class GunplaArm implements PC_C{

	private String code_name;
	private String gundam_name;

	public GunplaArm() {
		super();
	}

	public String getCode_name() {
		return code_name;
	}

	public void setCode_name(String code_name) {
		this.code_name = code_name;
	}

	public String getGundam_name() {
		return gundam_name;
	}

	public void setGundam_name(String gundam_name) {
		this.gundam_name = gundam_name;
	}

}