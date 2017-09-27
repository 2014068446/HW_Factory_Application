package com.model.phone;
import com.model.specs.Specs;

public class HTC_U11 extends Phone{
	private Specs specs;

	public Specs getSpecs() {
		return specs;
	}

	public void setSpecs(Specs specs) {
		this.specs = specs;
	}

	@Override
	public String viewBrand() {
		return "HTC";
	}

	@Override
	public String viewModel() {
		return "U11";
	}

	@Override
	public String viewDescription() {
		return "A phone that suits your selfie and using experience.";
	}
	
	
}
