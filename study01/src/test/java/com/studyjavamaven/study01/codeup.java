package com.studyjavamaven.study01;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.*;

public class codeup {
    @Test
    public void exam120803() throws Exception {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.nextLine();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int score = Integer.parseInt(input[1]);
            students.add(new Student(name, score));
        }

        Collections.sort(students, (s1, s2) -> s2.getScore() != s1.getScore() ? s2.getScore() - s1.getScore() : students.indexOf(s1) - students.indexOf(s2));

        for (int i = 0; i < Math.min(m, students.size()); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}