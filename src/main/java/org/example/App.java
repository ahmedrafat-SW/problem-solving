package org.example;


public class App {

    public static void main(String[] args) {

       String s1= "s1";
       String s2 = "s1";

       if (s1 == s2){
           System.out.println("s1 == s2");
       }
       if (s1.equals(s2))
           System.out.println("s1 is equal to s2");

       Employee e = new Employee();

       Employee.name= "ahmed";
       e.doWork();
        Test t = new Test();
        t.setTest("this is a static class");
        System.out.println("t.test = " + t.test);


    }

    static class Test {
        private String test ;

        public String getTest() {
            return test;
        }

        public void setTest(String test) {
            this.test = test;
        }
    }

}

