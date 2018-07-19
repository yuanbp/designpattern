package com.strategypattern.test;

import com.strategypattern.impls.Context;
import com.strategypattern.impls.OperationAdd;
import com.strategypattern.impls.OperationMultiply;
import com.strategypattern.impls.OperationSubstract;

public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}