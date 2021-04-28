package com.zoli.week04.day02.CharSequence;

public class Gnirts implements CharSequence{

  protected String toBeReversed;



  public Gnirts(String toBeReversed) {
    this.toBeReversed =toBeReversed;
    StringBuilder sb = new StringBuilder();
    sb.append(toBeReversed);
    this.toBeReversed = String.valueOf(sb.reverse());

  }

  @Override
  public int length() {
    return toBeReversed.length();
  }

  @Override
  public char charAt(int index) {
    return toBeReversed.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return toBeReversed.subSequence(start, end);
  }

}
