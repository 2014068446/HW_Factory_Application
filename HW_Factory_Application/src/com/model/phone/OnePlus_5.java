package com.model.phone;
import com.model.specs.Specs;

public class OnePlus_5 extends Phone{
	private Specs specs;
	
	public Specs getSpecs() {
		return specs;
	}

	public void setSpecs(Specs specs) {
		this.specs = specs;
	}

	@Override
	public String viewBrand() {
		return "Oneplus";
	}

	@Override
	public String viewModel() {
		return "5";
	}

	@Override
	public String viewDescription() {
		return "Phone for people who know their shit";
	}
}
