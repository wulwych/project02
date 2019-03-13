package com.wxy.java;

import com.wxy.bean.Customer;

/**
 * @author shkstart
 * @create 2019-03-13 15:34
 */
public class TemplatesTest {

    //prsf   生成   private static final
    private static final Customer cus=new Customer();
    public static final int i=1;
    public static final String  str="2sd";
    //模板：psvm
    public static  void main(String[] args){

        //模板二：sout
        System.out.println("hello");
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        String[] arra=new String[]{"sf","lwy"};
        for (int i = 0; i < arra.length; i++) {
            System.out.println(arra[i]);
        }
        //itar模板
        for (int i = 0; i < arra.length; i++) {
            String s = arra[i];

          //ifn
            if (s == null) {

            }
            //list.fot


            
        }
    }


}
