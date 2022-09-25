import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get the FizzBuzz of that number: ");
        int number = scanner.nextInt();

       FizzBuzz(number);
    }

    public static List<String> FizzBuzz(int n){

        List<String> list = new ArrayList<String>();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }else if(i % 3 == 0){
                list.add("Fizz");
            }else if(i % 5 == 0){
                list.add("Buzz");
            }else {
                list.add(String.valueOf(i));
            }
        }
        System.out.println(list);

        return list;
    }
}
