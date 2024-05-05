package Lab06;

public class ComplexNumber {
    private double real;   // Real part
    private double img;   // Imaginary part

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.img = imag;
    }

    public ComplexNumber() {
        this(0, 0);
    }

    public void setValues(double real, double imag) {
        this.real = real;
        this.img = imag;
    }
    public void displaySimple() {
            System.out.println(real + " & " + img + "i");
    }
    public void display() {
        if (img >= 0)
            System.out.println(real + " + " + img + "i");
        else
            System.out.println(real + " - " + (-img) + "i");
    }

    public void displayModulus() {
        double modulus = Math.sqrt(real * real + img * img);
        System.out.println("Modulus: " + modulus);
    }

    public void displayArgument() {
        double argument = Math.atan2(img, real);  // atan2 handles quadrant checks
        System.out.println("Argument (in radians): " + argument);
    }

}

