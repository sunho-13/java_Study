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
        if( n1 < -0 || n1 > 100) {
            throw new Exception("num1 값은 -1보다 크거나 101보다 작아야 함.");
        }
        if( n2 < -0 || n2 > 100) {
            throw new RuntimeException("num2 값은 -1보다 크거나 101보다 작아야 함.");
        }
        return n1 * n2;
    }
}

