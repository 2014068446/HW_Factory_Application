package com.utility;

import com.model.phone.Phone;
import com.model.specs.*;

public class SpecFactory implements AbstractFactory{
	public Specs getSpecs(String insert) {
		Specs xspecs = null;
		
		if (insert.equalsIgnoreCase("htc11")) {
			xspecs = new HTC_U11_Specs();
		}
		else if (insert.equalsIgnoreCase("motoz")) {
			xspecs = new Motorola_MotoZ_Specs();
		}
		else if (insert.equalsIgnoreCase("op5")) {
			xspecs = new OnePlus_5_Specs();
		}
		else if (insert.equalsIgnoreCase("s8")) {
			xspecs = new SamsungGalaxy_S8_Specs();
		}
		else if (insert.equalsIgnoreCase("s8plus")) {
			xspecs = new SamsungGalaxy_S8Plus_Specs();
		}
		else if (insert.equalsIgnoreCase("xperia")) {
			xspecs = new SonyXperia_XZPremium_Specs();
		}
		return xspecs;
	}

	@Override
	public Phone getPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Specs getSpecification(String specs) {
		// TODO Auto-generated method stub
		return null;
	}

}
