package com.runtime;

public class SampleRun extends Runtime {



    void run(){
        System.out.println("Run2");
    }



    public static void main(String args[])
    {
      Runtime r = new SampleRun();
      r.run();
    }
}
