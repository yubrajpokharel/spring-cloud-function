package com.inception.awslambda.beans;

import java.util.function.Function;

public class AgeFunction implements Function<Integer, String> {

  @Override
  public String apply(Integer age) {
    if (age >= 0 && age <= 12)
      return "hi your are still the child";
    if (age >= 13 && age <= 19)
      return "hi your are in teenage";
    if (age >= 20)
      return "now life will start to suck :D";

    return "Sorry wrong input";
  }
}
