package com.zoli.weak03.day03;

public class Counter {

//- Create `Counter` class
//  - which has a `counter` (integer) field
//  - at creation it should have a default value `0` or can be specified
//  by a parameter
//  - we can add another whole number to this counter: `add(number)`
//      - we can just increase the counter's value by one: `add()` (no parameters)
//      - we can `get()` the current counter value
//  - and we can `reset()` the counter to the initial value
//- Check if everything works fine with the proper tests:
//      - Download [`CounterTest.java`](../tests/CounterTest.java) and place it next
//  to your solution
//  - If you are unsure about how to get this running, you can
//    [watch a video tutorial](https://www.youtube.com/watch?v=sk9fe5FNvz8)
//      - Other hints for running:
//      - If something gets red:
//      - Windows, Linux:
//      - press `ALT+Enter` and add JUnit5 to classpath
//      (**5 aka JUnit FIVE not 4 or 3**)
//      - OSX:
//      - press `⌥⏎` and add JUnit5 to classpath
//      (**5 aka JUnit FIVE not 4 or 3**)
//    - Run the tests one by one with the green play button before the
//  method name (or run all of by pressing the button before the classname)

  private int counter;
  private int defaultcounter;



  Counter(int number){
    this.counter = number;
    this.defaultcounter = number;
  }

  public Counter() {

  }

  public void add(int number){
    this.counter += number;
  }

  public void add(){
    this.counter++;
  }
  public int get(){
    return this.counter;
  }
  public void reset(){
    this.counter = this.defaultcounter;
  }
}
