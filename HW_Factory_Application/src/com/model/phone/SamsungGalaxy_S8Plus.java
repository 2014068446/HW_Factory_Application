package com.model.phone;
import com.model.specs.Specs;

public class SamsungGalaxy_S8Plus extends Phone {
	private Specs specs;
	
	public Specs getSpecs() {
		return specs;
	}

	public void setSpecs(Specs specs) {
		this.specs = specs;
	}

	@Override
	public String viewBrand() {
		return "Samsung";
	}

	@Override
	public String viewModel() {
		return "Galaxy S8 Plus";
	}

	@Override
	public String viewDescription() {
		return "Young money";
	}


}
