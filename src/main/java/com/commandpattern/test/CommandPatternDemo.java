package com.commandpattern.test;

import com.commandpattern.impls.Broker;
import com.commandpattern.impls.BuyStock;
import com.commandpattern.impls.SellStock;
import com.commandpattern.impls.Stock;

public class CommandPatternDemo {
   public static void main(String[] args) {
      Stock abcStock = new Stock();

      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);

      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      broker.placeOrders();
   }
}