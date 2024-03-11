import java.util.InputMismatchException;
import java.util.Scanner;

public class Parallelepiped {
    private double length;
    private double width;
    private double height;

    public Parallelepiped() {
    }

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength() {
        boolean choose = true;
        while (choose) {
            try {
                double length = new Scanner(System.in).nextDouble();
                if (length < 0) {
                    throw new MyException("number must more than 0");
                } else {
                    this.length = length;
                    choose = false;
                }
            } catch (InputMismatchException e) {
                System.err.println("write number");
            } catch (MyException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth() {
        boolean choose = true;
        while (choose) {
            try {
                double width = new Scanner(System.in).nextDouble();
                if (width < 0) {
                    throw new MyException("number must more than 0");
                } else {
                    this.width = width;
                    choose = false;
                }
            } catch (InputMismatchException e) {
                System.err.println("write number");
            } catch (MyException e) {
                System.err.println(e.getMessage());
            }
        }
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


    public double getArea() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public double getVolume() {
        return (length * width * height);
    }

    public void getParallelepiped() throws Exception {
        boolean chose = true;
        System.out.println("write parallelepiped length");
        setLength();
        System.out.println("write parallelepiped width");
        setWidth();
        System.out.println("write parallelepiped height");
        setHeight();
        while (chose) {
            System.out.println("""
                    1. get parallelepiped area
                    2. get parallelepiped volume
                    3. exit""");
            try {
                switch (new Scanner(System.in).nextInt()) {
                    case 1:
                        System.out.println("parallelepiped area is : " + (int) getArea());
                        break;
                    case 2:
                        System.out.println("parallelepiped volume is : " + (int) getVolume());
                        break;
                    case 3:
                        chose = false;
                        break;
                    default:
                        System.out.println("write again");
                }
            } catch (InputMismatchException e) {
                System.err.println("write number");
            }

        }
    }


    @Override
    public String toString() {
        return "Parallelepiped {" +
                " length = " + length +
                ", width = " + width +
                ", height = " + height +
                ", area = "+(int)getVolume()+
                ", volume = "+(int)getVolume()+
                "}";
    }
}
