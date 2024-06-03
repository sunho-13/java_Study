package com.studyjavamaven.study01.MathExam;

public class MathExam {
   public int subTest001(int n1, int n2) throws Exception {
        if( n1 < -50000 || n1 > 50000) {
            throw new Exception("num1 값은 -50000보다 크거나 50000보다 작아야 함.");
        }
        if( n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2 값은 -50000보다 크거나 50000보다 작아야 함.");
        }
        return n1 - n2;
    }

    public int mathTest002(int n1, int n2) throws Exception {
        if( n1 < -1 || n1 > 100) {
            throw new Exception("num1 값은 -1보다 크거나 101보다 작아야 함.");
        }
        if( n2 < -1 || n2 > 100) {
            throw new RuntimeException("num2 값은 -1보다 크거나 101보다 작아야 함.");
        }
        return n1 * n2;
    }

    public int mathTest003(int n1, int n2) throws Exception {
        if( n1 < 0 || n1 > 100) {
            throw new Exception("num1 값은 0보다 크거나 101보다 작아야 함.");
        }
        if( n2 < 0 || n2 > 100) {
            throw new RuntimeException("num2 값은 0보다 크거나 101보다 작아야 함.");
        }
        return n1 / n2;
    }

    public int mathTest004(int n1, int n2) throws Exception {
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

    public int mathTest005(int n1, int n2) throws Exception {
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

}

