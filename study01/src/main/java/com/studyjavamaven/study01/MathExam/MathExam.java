package com.studyjavamaven.study01.MathExam;

public class MathExam {
   public int exam120803(int n1, int n2) throws Exception {
        if( n1 < -50000 || n1 > 50000) {
            throw new Exception("num1 값은 -50000보다 크거나 50000보다 작아야 함.");
        }
        if( n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2 값은 -50000보다 크거나 50000보다 작아야 함.");
        }
        return n1 - n2;
    }

    public int exam120804(int n1, int n2) throws Exception {
        if( n1 < -1 || n1 > 100) {
            throw new Exception("num1 값은 -1보다 크거나 101보다 작아야 함.");
        }
        if( n2 < -1 || n2 > 100) {
            throw new RuntimeException("num2 값은 -1보다 크거나 101보다 작아야 함.");
        }
        return n1 * n2;
    }

    public int exam120805(int n1, int n2) throws Exception {
        if( n1 < 0 || n1 > 100) {
            throw new Exception("num1 값은 0보다 크거나 101보다 작아야 함.");
        }
        if( n2 < 0 || n2 > 100) {
            throw new RuntimeException("num2 값은 0보다 크거나 101보다 작아야 함.");
        }
        return n1 / n2;
    }

    public int exam120807(int n1, int n2) throws Exception {
        if( n1 < -1 || n1 > 10000) {
            throw new Exception("num1 값은 -1보다 크거나 10001보다 작아야 함.");
        }
        if( n2 < -1 || n2 > 10000) {
            throw new RuntimeException("num2 값은 -1보다 크거나 10001보다 작아야 함.");
        }

        if(n1 == n2){
            return 1;
        }else{
            return -1;
        }

    }

    public int exam120810(int n1, int n2) throws Exception {
        if( n1 < 0 || n1 > 101) {
            throw new Exception("num1 값은 0보다 크거나 101보다 작아야 함.");
        }
        if( n2 < 0 || n2 > 101) {
            throw new RuntimeException("num2 값은 0보다 크거나 101보다 작아야 함.");
        }
        return n1 % n2;
    }

    public double exam120817(int[] numbers) throws Exception {
       if ( numbers == null ){
           throw new Exception("numbers는 null이 아니어야 합니다.");
       }
       if ( numbers.length < 1 || numbers.length > 100 ){
           throw new Exception("numbers 배열 크기는 0보다 크거나 101보다 작아야 합니다.");
       }
       double sum = 0.0d;

       for( int i = 0; i<numbers.length; i++ ){
           if (numbers[i] < 0 || numbers[i] > 1000){
               throw new Exception(String.format("numbers[] 값은 -1보다 크고 1001보다 작아야 합니다."));
           }
           sum+=numbers[i];
       }
        double result = sum / numbers.length;
        return result;
    }

    public int exam120820(int age) throws Exception {

       if ( age < 1 || age > 120) {
           throw new Exception("나이는 1보다 작거나 120보다 커선 안 됩니다.");
       }

       int year = 2022;

       return year-age+1;
    }

    public int exam120829(int angle) throws Exception{

       if ( angle < 1 || angle > 181){
           throw new Exception("각도는 1보다 작거나 180보다 커선 안 됩니다.");
       }

       int result = 0;

       if ( angle < 90 ){
           result = 1;
       }else if ( angle == 90 ){
           result = 2;
       }else if ( angle < 180){
           result = 3;
       }else {
           result = 4;
       }

       return result;
    }

    public int exam120831(int n) throws Exception{

       if ( n < 1 || n >1000){
           throw new Exception("n의 값은 1보다 작거나 1000보다 커선 안 된다.");
       }

       int sum = 0;

       for(int i = 0; i <= n; i++) {
           if (i % 2 != 0) {
               continue;
           }
           sum += i;
       }

       return sum;
    }

    public int[] exam120813(int n) throws Exception{

       if(n<1 || n>100){
           throw new Exception("n의 값은 1보다 작거나 100보다 커선 안 된다.");
       }

       int length = (n +1) / 2;
       int[] result = new int[length];
       int index = 0;

       for(int i = 1; i <= n; i +=2){

           result[index++] = i;
       }
       /*
        int ord = 1;
        for (int i=0; i<length; i++){
            result[i] = ord;
            ord +=2;
        }*/


       return result;
    }

    public int[] exam1045(int a, int b) throws Exception{

       if(a<0){
           throw new Exception("a는 0보다 커야 합니다.");
       }
       if(b > 2147483647){
           throw new Exception("b는 2147483647보다 작야아 합니다.");
       }

       int sum=a+b;
       int sub=a-b;
       int multi=a*b;
       int divide=a/b;
       double remain=(double)a%b;


       return null;
    }

}

