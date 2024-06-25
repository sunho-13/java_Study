/*
package practice;

import java.util.Scanner;

import java.util.*;

public class olympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Data> data = new ArrayList<>();

        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char code = sc.next().charAt(0);
            int num = sc.nextInt();
            String name = sc.next();

            if (code == 'I') {
                data.add(new Data(num, name));
            } else if (code == 'D') {
                data.removeIf(d -> d.num == num);
            }
        }

        for (int i = 0; i < 5; i++) {
            positions.add(sc.nextInt());
        }

        Collections.sort(data, Comparator.comparingInt(d -> d.num));

        for (int pos : positions) {
            Data d = data.get(pos - 1);
            System.out.println(d.num + " " + d.name);
        }
    }

    static class Data {
        int num;
        String name;

        public Data(int num, String name) {
            this.num = num;
            this.name = name;
        }
    }
}
*/
