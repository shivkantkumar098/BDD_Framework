//package com.javaAT.driver;
//
//interface Browser{
//    void create();
//}
//class Chrome implements Browser{
//    public void create(){
//        System.out.println("Chrome Browser");
//    }
//}
//class Edge implements Browser{
//    public void create(){
//        System.out.println("Edge Browser");
//    }
//}
//class  Firefox implements Browser{
//    public void create(){
//        System.out.println("FireFox Browser");
//    }
//}
//class  Factory{
//    public static Browser callBrowser(String name){
//        if(name.equalsIgnoreCase("chrome")){
//            return  new Chrome();
//        }
//        else if(name.equalsIgnoreCase("Edge")){
//            return new Edge();
//        } else {
//            return new Firefox();
//        }
//
//    }
//}
//public class FactoryDesignPattern {
//    public static void main(String[] args) {
//        Browser obj=Factory.callBrowser("b");
//        obj.create();
//    }
//}
