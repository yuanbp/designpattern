package com.commandpattern.impls;

import com.commandpattern.apis.Order;

public class SellStock implements Order {
   private Stock abcStock;

   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   @Override
   public void execute() {
      abcStock.sell();
   }
}