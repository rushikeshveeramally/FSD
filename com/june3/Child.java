package com.june3;

public class Child extends Parent {
    public String cvar;

    public Child(String cvar,String pavr){
        this.cvar = cvar;
        this.pvar = pavr;

        System.out.println(cvar+ "\n" +pvar);
    }

    public Child(String cvar){
        this.cvar=cvar;
        System.out.println(cvar);
    }

    public static void main(String[] args) {
        Child child = new Child("rushikesh","rk");

        System.out.println("\n");
        Child child1 = new Child("rk");
        System.out.println("\n");
     }

}
