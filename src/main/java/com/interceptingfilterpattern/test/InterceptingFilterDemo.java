package com.interceptingfilterpattern.test;

import com.interceptingfilterpattern.impls.AuthenticationFilter;
import com.interceptingfilterpattern.impls.Client;
import com.interceptingfilterpattern.impls.DebugFilter;
import com.interceptingfilterpattern.impls.FilterManager;
import com.interceptingfilterpattern.impls.Target;

public class InterceptingFilterDemo {
   public static void main(String[] args) {
      FilterManager filterManager = new FilterManager(new Target());
      filterManager.setFilter(new AuthenticationFilter());
      filterManager.setFilter(new DebugFilter());

      Client client = new Client();
      client.setFilterManager(filterManager);
      client.sendRequest("HOME");
   }
}