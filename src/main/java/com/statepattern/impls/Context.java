package com.statepattern.impls;

import com.statepattern.apis.State;

public class Context {
   private State state;

   public Context(){
      state = null;
   }

   public void setState(State state){
      this.state = state;        
   }

   public State getState(){
      return state;
   }
}