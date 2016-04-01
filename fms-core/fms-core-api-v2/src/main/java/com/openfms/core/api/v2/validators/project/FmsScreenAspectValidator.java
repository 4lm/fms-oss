package com.openfms.core.api.v2.validators.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.openfms.core.api.v2.validators.AbstractValidator;
import com.openfms.core.api.v2.validators.project.common.CommonValidator;
import com.openfms.model.core.movie.FmsScreenAspect;
import com.openfms.model.exceptions.DatabaseException;

@Component
public class FmsScreenAspectValidator extends AbstractValidator<FmsScreenAspect> {

	@Autowired
	private CommonValidator commonValidator;
	
	public FmsScreenAspectValidator() {
		super(FmsScreenAspect.class);
		setNonEmpty("name");
	}

	@Override
	public void validateInternal(FmsScreenAspect target, Errors errors, Validator v) throws DatabaseException {
	}
	
}
