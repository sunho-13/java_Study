package com.studyjavamaven.study01;

import com.studyjavamaven.study01.MathExam.MathExam;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Exam001JavaTest {
    @Test
    public void subtract001() throws Exception {
        // given    테스트하기 위한 준비 동작
        MathExam math = new MathExam();
        /*int num1 = 2;
        int num2 = 3;
        int expected = -1;*/

        // when     테스트를 실시
      /*  int actual = subTest001(num1, num2);*/

        // then     실제값과 기대값을 비교해서 테스트
        assertThat(-1).isEqualTo(math.subTest001(2, 3));
        assertThat(98).isEqualTo(math.subTest001(100, 2));
        assertThat(3).isEqualTo(math.subTest001(10, 7));
        assertThat(10).isNotEqualTo(math.subTest001(100, 70));
        assertThat(29).isLessThan(math.subTest001(100, 70));
        assertThat(301).isGreaterThan(math.subTest001(1000, 700));


        //Exception 예외가 발생해야지만 정상 동작으로 인식
        assertThatThrownBy(() -> math.subTest001(70000, 7))
                .isInstanceOf(Exception.class);
        // RuntimeException 예외가 발생해야지만 정상 동작으로 인식
        Throwable exception = assertThrows(RuntimeException.class, ()-> {
            math.subTest001(2330,50002);
        });
        System.out.println(exception.toString());
    }

    @Test
    public void multiply001() throws Exception {
        // given
        MathExam math = new MathExam();
        // when

        // then

        assertThat(12).isEqualTo(math.mathTest002(3, 4));
        assertThat(513).isEqualTo(math.mathTest002(27, 19));
        assertThatThrownBy(() -> math.mathTest002(-2, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.mathTest002(10, 101))
                .isInstanceOf(Exception.class);

    }

    @Test
    public void divide() throws Exception {
        // given
        MathExam math = new MathExam();

        // when

        // then

        assertThat(2).isEqualTo(math.mathTest003(10, 5));
        assertThat(3).isEqualTo(math.mathTest003(7, 2));
        assertThatThrownBy(() -> math.mathTest003(-3, 10))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(()  -> math.mathTest003(5, 130))
                .isInstanceOf(Exception.class);

    }

    @Test
    public void compare() throws Exception {
        //  given
        MathExam math = new MathExam();

        //  when

        //  then

        assertThat(-1).isEqualTo(math.mathTest004(2, 3));
        assertThat(1).isEqualTo(math.mathTest004(11, 11));
        assertThat(-1).isEqualTo(math.mathTest004(7, 99));
        assertThatThrownBy(()  -> math.mathTest004(-5, 300))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(()  -> math.mathTest004(13, 10500))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void remain() throws Exception {
        //  given
        MathExam math = new MathExam();

        //  when

        //  then

        assertThat(1).isEqualTo(math.mathTest005(3, 2));
        assertThat(0).isEqualTo(math.mathTest005(10, 5));
        assertThatThrownBy(()  -> math.mathTest005(-1, 50))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(()  -> math.mathTest005(78, 180))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120817() throws Exception {
        MathExam math = new MathExam();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertThat(5.5).isEqualTo((math.exam120817(numbers)));
        assertThat(94.0).isEqualTo((math.exam120817(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})));
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
}
