package com.statepattern.impls;

import com.statepattern.apis.State;

public class StopState implements State {

   @Override
   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this);    
   }

   @Override
   public String toString(){
      return "Stop State";
   }
}