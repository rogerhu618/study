package com.lenovo;

import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.*;

//输出一个helloworld
public class HelloWorld {
   public void test() {
      System.out.println("hell0");
   }

    public static void main(String[] args) throws ScriptException {
       int i = 5*3 + 3*20 + 78/3;
       System.out.println("i==========" + i);
       int[][] array = {{1,2},{2,3},{3,4,5}};
       System.out.println(array.length);
       System.out.println(array[2].length);
//       for (int i = 0; i < array.length; i++) {
//
//       }
       HelloWorld hello = new HelloWorld();
       hello.test();
       Scanner sc = new Scanner(System.in);
       while(sc.hasNextLine()) {
          ScriptEngineManager mgr = new ScriptEngineManager();
          ScriptEngine engine = mgr.getEngineByName("JavaScript");
          System.out.println(engine.eval(sc.nextLine()));
       }
    }
}
