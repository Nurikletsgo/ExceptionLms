import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cylinder {
    private double height;
    private double radius;

    public Cylinder() {
    }
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        boolean choose = true;
        while (choose) {
            try {
                double height = new Scanner(System.in).nextDouble();
                if (height < 0) {
                    throw new MyException("number must more than 0");
                } else {
                    this.height = height;
                    choose = false;
                }
            } catch (InputMismatchException e) {
                System.err.println("write number");
            } catch (MyException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        boolean choose = true;
        while (choose) {
            try {
                double radius = new Scanner(System.in).nextDouble();
                if (radius < 0) {
                    throw new MyException("number must more than 0");
                } else {
                    this.radius = radius;
                    choose = false;
                }
            } catch (InputMismatchException e) {
                System.err.println("write number");
            } catch (MyException e) {
                System.err.println(e.getMessage());
            }
        }
    }



    public double getArea() {
        return (2 * Math.PI * radius * (height + radius));
    }

    public double getVolume() {
        return (Math.PI * radius * radius * height);
    }

    public void getCylinder() {
        boolean chose = true;
            System.out.println("write cylinder height");
            setHeight();
            System.out.println("write cylinder radius");
            setRadius();
            while (chose) {
                System.out.println("""
                        1. get area cylinder
                        2. get volume cylinder
                        3. exit""");
                try {
                    switch (new Scanner(System.in).nextInt()) {
                        case 1:
                            System.out.println("cylinder area is : " +(int)getArea());
                            break;
                        case 2:
                            System.out.println("cylinder volume is : " + (int)getVolume());
                            break;
                        case 3:
                            chose = false;
                            break;
                        default:
                            System.out.println("choose only 1,2 or 3");
                    }

            } catch(InputMismatchException e){
                System.err.println(" write number");
            }
        }
    }


    @Override
    public  String toString() {
        return "Cylinder {" +
                " height = " + height +
                ", radius = " + radius +
                ", area = "+(int)getArea()+
                ", volume = "+(int)getVolume()+
                "}";
    }
}
