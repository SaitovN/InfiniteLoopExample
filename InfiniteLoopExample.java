package academy.devonline.java.basic.section01_setup.section05_setup;

import java.util.Scanner;

public class InfiniteLoopExample {
    public static void main(String[] args) {
        while (true){
            var number = new Scanner(System.in).nextInt();
            var result = number*number;
            if (number == 0){
                break;
            }
            System.out.println(result);
        }
        System.out.println("Ошыбка");
    }
}
