package practice;

public class PrinterExample2 {
    public static void main(String[] args){
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }

    public static class Printer {
        public static void println(int x){
            System.out.println(x);
        }

        public static void println(boolean x){
            System.out.println(x);
        }

        public static void println(double x){
            System.out.println(x);
        }

        public static void println(String x){
            System.out.println(x);
        }
    }
}
