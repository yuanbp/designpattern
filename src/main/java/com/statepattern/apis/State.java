package com.statepattern.apis;

import com.statepattern.impls.Context;

public interface State {
   public void doAction(Context context);
}