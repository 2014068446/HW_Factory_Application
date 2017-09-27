package com.utility;

import com.model.phone.*;
import com.model.specs.*;

public class PhoneFactory implements AbstractFactory {
	public Phone getPhone (String input) {
		Phone xphone = null;
		
		switch(input) {
		case "s8"     : xphone = new SamsungGalaxy_S8();     break;
		case "op5"    : xphone = new OnePlus_5();            break;
		case "s8plus" : xphone = new SamsungGalaxy_S8Plus(); break;
		case "motoz"  : xphone = new Motorola_MotoZ();       break;
		case "xperia" : xphone = new SonyXperia_XZPremium(); break;
		case "htc11"  : xphone = new HTC_U11();              break;
		}
		return xphone;
	}

	@Override
	public Specs getSpecification(String specs) {
		// TODO Auto-generated method stub
		return null;
	}
}
