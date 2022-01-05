package jp.prototype.common.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ColorValidator implements ConstraintValidator<ColorValidation, String> {

  @Override
  public boolean isValid(String colorName, ConstraintValidatorContext cxt) {
    List<String> list = Arrays.asList(new String[] { "RED", "GREEN", "BLUE" });
    return list.contains(colorName);
  }

}
