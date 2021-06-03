package com.icoom;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
    	ArrayList<String> list = new ArrayList<String>();
        /* double a = 5.1231231;a
        float b = 6.23411431f;
        System.out.println(a);
        System.out.println(b);
        boolean c = false;
        boolean d = true;
        int num1 = 1;
        double num2 = num1;
        System.out.println(num2);
        String str1 = "5";
        String str2 = 3.5f + "";
        System.out.println(str2);
        System.out.println(3 + 4 + "Hello!");
        System.out.println("Hello!" + 3 + 4); */
       /*  String result = "";
        for( int i =0;i<6;i++){
            int intval = (int)(Math.random()*26 +97);
            result = result + (char)intval;
        }
        System.out.println(result);
        char a = 'a';
        int b = a;
        System.out.println(b);
        String str = "45";
        int value = Integer.parseInt(str);
        System.out.println(value); */
      /*   byte b =40;
        char c ='a';
        int i =23;
        double d =.314;
        double result=b+c+i*d;
        System.out.println(result); */
        /* byte a =5;
        a=(byte)(a+5);
        byte b= 5;
        b+=5;
        System.out.println(a+"\n"+b); */
        // int[] intArr;
        // intArr=new int[]{5,6,7,8};
        // System.out.println(intArr[1]);
        // String[] prices;
        // prices=new String[5];
        // prices[2]="疯狂Java讲义";
        // prices[1]="轻量级javaEE企业应用实践";
        // for(int i=1;i<prices.length;i++){
        //     System.out.println(prices[i]);
        // }
        // String[] arr={"疯狂Java讲义","轻量级JavaEE企业应用实战","疯狂android讲义"};
        // for(String arrItem:arr){
        //     System.out.println(arrItem);
        // }
        // int[] a={5,7,20};
        // int[] b=new int[5];
        // System.out.println(b.length);
        // b=a;
        // System.out.println(b.length);
        // Person[] Arr=new Person[2];
        // Person zhang=new Person();
        // zhang.age=15;
        // zhang.height=158;
        // Person lee=new Person();
        // lee.age=18;
        // lee.height=175;
        // Arr[0]=zhang;
        // Arr[1]=lee;
        // lee.info();
        // Arr[1].info();
//         int[] arr={1,2,3,4,52,24};
//         System.out.println(Arrays.toString(arr));
        // for(int i=1;i<=9;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum=i*j;
        //         if(i==j){
        //             System.out.println(i+"*"+j+"="+sum+"\n");
        //         }else{
        //             System.out.println(i+"*"+j+"="+sum+"\t");
        //         }
        //     }
        // }
        // ReturnThis instance= new ReturnThis();
        // instance.grow().grow().grow().grow();
        // System.out.println(instance.age);
        // Varrargs.test(5,"a","b","c","d");
        //     int a = AddLever.fn(10);
        //     System.out.println(AddLever.fn(10));
        //     Human man=new Human();
        //     Human man1=new Human();
        //     man.setAge(1000);
        //     man.setName("baxin");
        //     System.out.println(man.getName());
        //     System.out.println(man1.getName());
        //     Human.beauty=1;
        //     System.out.println(Human.beauty);
        //     Human.beauty=2;
        //     System.out.println(Human.beauty);
        // Text text =new Text("疯狂JavaScript讲义");
        // String c = text.getString();
        // System.out.println(c);
        // Integer intObj = 5;
        // Object boolObj = true;
        // int it = intObj;
        // if(boolObj instanceof Boolean){
        //     boolean b = (Boolean)boolObj;
        //     System.out.println(b);
        // }else{
        //     System.out.println("hello world!");
        //     System.out.println("1");
        // }
//        Huge one = new Huge("鹏鸟大王");
//        System.out.println(one);
//    	Varrargs.test(4,"1","2","2344");
//    	Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
//    	System.out.println(s);
    	Scanner s = new Scanner(System.in);
    	int a = s.nextInt();
    	System.out.println("������ǣ�" + a);
    }
}
class Huge{
    private String name;
    public Huge(String name){
        this.name = name;
    }
}
class Text{
    private String str;
    public Text(String str){
        this.str = str;
    }
    public String getString(){
        return this.str;
    }
    public void setString(String str){
        this.str = str;
    }
}
class Person{
    public int age;
    public double height;
    public void info(){
        System.out.println(this.age+"_"+this.height);
    }
}
class ReturnThis{
    public int age;
    public ReturnThis grow(){
        age++;
        return this;
    }
}
class Varrargs{
    public static void test(int a , String... books){
        for(String book:books){
            System.out.println(book);
        }
    }
}
class AddLever{
    public static int fn(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 4;
        }else{
            return 2*fn(n-1)+fn(n-2);
        }
    }
}
class Human{
    static int beauty;
    private String name;
    private int age;
    public void setName(String name){
        if(name.length()>6||name.length()<2){
            System.out.println("you set name is invaild!");
            return;
        }else{
            this.name=name;
        }
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        if(age>100||age<0){
            System.out.println("you set age is invaild!");
            return;
        }else{
            this.age=age;
        }
    }
    public int getage(){
        return this.age;
    }

}
class Salary extends Employee
{
   private double salary; //Annual salary
   public Salary(String name, String address, int number, double
      salary)
   {
       super(name, address, number);
       setSalary(salary);
   }
   public void mailCheck()
   {
       System.out.println("Within mailCheck of Salary class ");
       System.out.println("Mailing check to " + getName()
       + " with salary " + salary);
   }
   public double getSalary()
   {
       return salary;
   }
   public void setSalary(double newSalary)
   {
       if(newSalary >= 0.0)
       {
          salary = newSalary;
       }
   }
   public double computePay()
   {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}