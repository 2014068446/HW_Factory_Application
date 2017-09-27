package com.model.phone;
import com.model.specs.*;

public abstract class Phone {
	public abstract void setSpecs(Specs specs);
	public abstract Specs getSpecs();
	public abstract String viewBrand();
	public abstract String viewModel();
	public abstract String viewDescription();
}
