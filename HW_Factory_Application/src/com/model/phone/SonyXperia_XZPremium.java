package com.model.phone;
import com.model.specs.Specs;

public class SonyXperia_XZPremium extends Phone{
	private Specs specs;

	public Specs getSpecs() {
		return specs;
	}

	public void setSpecs(Specs specs) {
		this.specs = specs;
	}

	@Override
	public String viewBrand() {
		return "Sony";
	}

	@Override
	public String viewModel() {
		return "Xperia XZ Premium";
	}

	@Override
	public String viewDescription() {
		return "A high-end phone that suits the lives of photo-holic people.";
	}
	
}
