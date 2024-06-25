/*
package com.studyjavamaven.study01;

import com.studyjavamaven.study01.MathExam.MathExam;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Exam001JavaTest {
    @Test
    public void exam120803() throws Exception {
        // given    테스트하기 위한 준비 동작
        MathExam math = new MathExam();
        */
/*int num1 = 2;
        int num2 = 3;
        int expected = -1;*//*


        // when     테스트를 실시
      */
/*  int actual = subTest001(num1, num2);*//*


        // then     실제값과 기대값을 비교해서 테스트
        assertThat(math.exam120803(2, 3)).isEqualTo(-1);
        assertThat(math.exam120803(100, 2)).isEqualTo(98);
        assertThat(math.exam120803(10, 7)).isEqualTo(3);
        assertThat(math.exam120803(100, 70)).isNotEqualTo(10);
        assertThat(math.exam120803(100, 70)).isLessThan(31);
        assertThat(math.exam120803(1000, 700)).isGreaterThan(299);


        //Exception 예외가 발생해야지만 정상 동작으로 인식
        assertThatThrownBy(() -> math.exam120803(70000, 7))
                .isInstanceOf(Exception.class);
        // RuntimeException 예외가 발생해야지만 정상 동작으로 인식
        Throwable exception = assertThrows(RuntimeException.class, ()-> {
            math.exam120803(2330,50002);
        });
        System.out.println(exception.toString());
    }

    @Test
    public void exam120804() throws Exception {
        // given
        MathExam math = new MathExam();
        // when

        // then

        assertThat(math.exam120804(3, 4)).isEqualTo(12);
        assertThat(math.exam120804(27, 19)).isEqualTo(513);
        assertThatThrownBy(() -> math.exam120804(-2, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.exam120804(10, 101))
                .isInstanceOf(Exception.class);

    }

    @Test
    public void exam120805() throws Exception {
        // given
        MathExam math = new MathExam();

        // when

        // then

        assertThat(math.exam120805(10, 5)).isEqualTo(2);
        assertThat(math.exam120805(7, 2)).isEqualTo(3);
        assertThatThrownBy(() -> math.exam120805(-3, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(()  -> math.exam120805(5, 130))
                .isInstanceOf(Exception.class);

    }

    @Test
    public void exam120807() throws Exception {
        //  given
        MathExam math = new MathExam();

        //  when

        //  then

        assertThat(math.exam120807(2, 3)).isEqualTo(-1);
        assertThat(math.exam120807(11, 11)).isEqualTo(1);
        assertThat(math.exam120807(7, 99)).isEqualTo(-1);
        assertThatThrownBy(()  -> math.exam120807(-5, 300))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(()  -> math.exam120807(13, 10500))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120810() throws Exception {
        //  given
        MathExam math = new MathExam();

        //  when

        //  then

        assertThat(math.exam120810(3, 2)).isEqualTo(1);
        assertThat(math.exam120810(10, 5)).isEqualTo(0);
        assertThatThrownBy(()  -> math.exam120810(-1, 50))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(()  -> math.exam120810(78, 180))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120817() throws Exception {
        MathExam math = new MathExam();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertThat(math.exam120817(numbers)).isEqualTo(5.5);
        assertThat(math.exam120817(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})).isEqualTo(94.0);
        assertThatThrownBy(() -> math.exam120817(new int[] {0, 1000, 2000}))
                .isInstanceOf(Exception.class);
        //assertThatThrownBy(() -> math.exam120817(new int[] {}))
        //        .isInstanceOf(Exception.class);

        Throwable exception = assertThrows(Exception.class, () -> {
            math.exam120817(new int[] {0, 1000, 2000});
        });
        System.out.println(exception.toString());

        exception = assertThrows(Exception.class, ()-> math.exam120817(new int[] {}));
        System.out.println(exception.toString());

    }

    @Test
    public void exam120820() throws Exception{
        System.out.println("exam120820");
        MathExam math = new MathExam();

        assertThat(math.exam120820(40)).isEqualTo(1983);
        assertThat(math.exam120820(23)).isEqualTo(2000);

        Throwable ex = assertThrows(Exception.class, () -> math.exam120820(0));
        System.out.println(ex.toString());

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120820(123));
        System.out.println(ex1.toString());
        assertThat(math.exam120820(40)).isEqualTo(1983);
    }

    @Test
    public void exam120829() throws Exception {
        System.out.println("exam1208209");
        MathExam math = new MathExam();

        assertThat(math.exam120829(70)).isEqualTo(1);
        assertThat(math.exam120829(91)).isEqualTo(3);
        assertThat(math.exam120829(180)).isEqualTo(4);

        Throwable ex = assertThrows(Exception.class, () -> math.exam120829(0));
        System.out.println(ex.toString());

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120829(183));
        System.out.println(ex1.toString());

    }

    @Test
    public void exam120831() throws Exception {
        System.out.println("exam120831");
        MathExam math = new MathExam();

        assertThat(math.exam120831(10)).isEqualTo(30);
        assertThat(math.exam120831(4)).isEqualTo(6);

        Throwable ex = assertThrows(Exception.class, () -> math.exam120831(0));
        System.out.println(ex.toString());

        Throwable ex1 = assertThrows(Exception.class, () -> math.exam120831(1100));
        System.out.println(ex1.toString());

    }

    @Test
    public void exam120813() throws Exception{
        System.out.println("exam120813");
        MathExam math = new MathExam();

        assertThat(math.exam120813(10)).isEqualTo(new int[] {1, 3, 5, 7, 9});
        assertThat(math.exam120813(15)).isEqualTo(new int[] {1, 3, 5, 7, 9, 11, 13, 15});

        Throwable ex = assertThrows(Exception.class, () -> math.exam120831(0));
        System.out.println(ex.toString());
    }

    @Test
    public void numberPrint() throws Exception {
        int x = 0b1011;
        int y = 0206;
        int z = 0x2A0F;
        char a = 'A', b = 'B', c = 'C';
        long l = 0L;



        System.out.println(String.format("10진수 : x=%d, y=%d, z=%d", x, y, z));
        System.out.println(String.format("8진수 : x=%o, y=%o, z=%o", x, y, z));
        System.out.println(String.format("16진수 : x=%X, y=%X, z=%X", x, y, z));
        System.out.println(String.format("Char : x=%c, y=%c, z=%c", x, y, z));

        System.out.println(String.format("10진수 : a=%d, b=%d, c=%d", (int)a, (int)b, (int)c ));
        System.out.println(String.format("8진수 : a=%o, b=%o, c=%o", (int)a, (int)b, (int)c ));
        System.out.println(String.format("16진수 : a=%X, b=%X, c=%X", (int)a, (int)b, (int)c ));
        System.out.println(String.format("Char : a=%c, b=%c, c=%c", a, b, c ));
    }

   */
/* @Test
    public void exam1045() throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 2개를 입력하세요(띄어쓰기 구분) : ");
        String input = sc.nextLine();

        String[] inputs = input.split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        if(a<0){
            throw new Exception("a는 0보다 커야 합니다.");
        }
        if(b == 0){
            throw new Exception("b는 0이 아니어야 합니다.");
        }

        int sum=a+b;
        int sub=a-b;
        int multi=a*b;
        int divide=a/b;
        int remain=a%b;
        double result=(double)a/b;

        String Rresult = String.format("%.2f", result);

        System.out.println("합: " + sum);
        System.out.println("차: " + sub);
        System.out.println("곱: " + multi);
        System.out.println("몫: " + divide);
        System.out.println("나머지: "+remain);
        System.out.println("나눈 값: " + Rresult);

        sc.close();

    }*//*


*/
/*    @Test
    public void exam1046() throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 3개 입력(띄어쓰기 구분) : ");
        String input = sc.nextLine();

        String[] inputs = input.split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);

        int sum=a+b+c;
        double avr=(double)sum/inputs.length;

        String result=String.format("%.1f",avr);


        System.out.println("합 : " + sum);
        System.out.println("평균 : " + result);


        sc.close();

    }*//*


*/
/*    @Test
    public void exam1085() {

        Scanner sc = new Scanner(System.in);

        System.out.print("");
        String input = sc.nextLine();

        String[] inputs = input.split(" ");

        int h = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int s = Integer.parseInt(inputs[3]);

        long byteSize = (long)h*b*c*s/8;
        double KB = (double)byteSize/1024;
        double MB = KB/1024;

        String result = String.format("%.1f", MB);

        System.out.println(result+" MB");

        sc.close();

    }*//*






}
*/
