package com.studyjavamaven.study01.MathExam;

public class codeup3015 {
    public int codeup3015(int n, int m)throws Exception{

        if( n < 3 || n > 100) {
            throw new Exception("n은 3보다 크고 100보다 작아야 함 ");
        }
        if( m < 1 || m >= n ) {
            throw new RuntimeException("m은 1보다 크고 n보다 작거나 같아야 함");
        }




        return 0;
    }
}
