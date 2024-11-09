import java.util.Scanner;
public class TheTriangle09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (int i = numInput; i > 0; i--) {  
            String row = "";
            for (int j = 0; j < i; j++) {  
                row += " *";   
            }
            System.out.println(row);           
        }
    }
}
