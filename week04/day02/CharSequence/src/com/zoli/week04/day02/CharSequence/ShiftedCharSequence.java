package com.zoli.week04.day02.CharSequence;

public class ShiftedCharSequence implements CharSequence{
  String toBeShifted;
  int toShift;
  String shiftWord;

  public ShiftedCharSequence(String toBeShifted, int toShift) {
    this.toShift = toShift;
    this.toBeShifted = toBeShifted;
    shiftWord = toBeShifted.substring(toShift);
  }

  @Override
  public int length() {
    return shiftWord.length();
  }

  @Override
  public char charAt(int index) {
    return shiftWord.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return shiftWord.subSequence(start, end);
  }
}
