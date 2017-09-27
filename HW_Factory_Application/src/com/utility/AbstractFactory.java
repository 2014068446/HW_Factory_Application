package com.utility;
import com.model.phone.*;
import com.model.specs.*;

public interface AbstractFactory {
	Phone getPhone(String phone);
	Specs getSpecification(String specs);
}
