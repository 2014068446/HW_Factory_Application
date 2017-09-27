package com.model.phone;
import com.model.specs.Specs;

public class SamsungGalaxy_S8 extends Phone {
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
		return "Galaxy S8";
	}
	
	@Override
	public String viewDescription() {
		return "A high-end phone that has the future innovation of smartphone..";
	}

}
