package com.model.phone;
import com.model.specs.Specs;

public class Motorola_MotoZ extends Phone{
	private Specs specs;

	public Specs getSpecs() {
		return specs;
	}

	public void setSpecs(Specs specs) {
		this.specs = specs;
	}

	@Override
	public String viewBrand() {
		return "Motorola";
	}

	@Override
	public String viewModel() {
		return "Moto Z";
	}
	
	@Override
	public String viewDescription() {
		return "A high-end phone that has a long lasting battery life.";
	}
	
}
