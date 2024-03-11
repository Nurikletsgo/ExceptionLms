import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {



        Cylinder cylinder = new Cylinder();
        Parallelepiped parallelepiped = new Parallelepiped();


        while (true) {
            try {
                System.out.println("""
                        1. Cylinder
                        2. Parralelepiped
                        3. get all information
                        """);
                switch (new Scanner(System.in).nextInt()) {
                    case 1:
                        cylinder.getCylinder();
                        break;
                    case 2:
                        parallelepiped.getParallelepiped();
                        break;
                    case 3:
                        System.out.println(cylinder + "\n"+parallelepiped);
                        break;
                        default:
                        System.out.println(" choose 1,2 or 3");
                }
            } catch (InputMismatchException e) {
                System.err.println("write number");
            }
        }
    }
}