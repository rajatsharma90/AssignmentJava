package sharma_hwk5;

/**
 *
 * @author rajatsharma
 */
public class Sharma_HWK5 {

    public static void main(String[] args) {

        Vehicle[] vehicle = new Vehicle[4];
        Car jeep = new Car("Jeep", 14.5, 7, 35000);
        Car cadillac = new Car("Cadillac", 24.5, 5, 42000);
        Convertible mustang = new Convertible("Mustang", 17.2, 4, 48000, 3.6);
        Convertible BMW = new Convertible("BMW", 15.7, 2, 45000, 5.2);
        vehicle[0] = jeep;
        vehicle[1] = mustang;
        vehicle[2] = cadillac;
        vehicle[3] = BMW;

        for (int i = 0; i < vehicle.length; i++) {
            System.out.println("Class: " + vehicle[i].getClass().getSimpleName());
            System.out.println(vehicle[i].toString());
            System.out.println("");

        }

        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i].getClass().getSimpleName().equalsIgnoreCase("Car")) {
                System.out.println("THE Selling price of the " + vehicle[i].getName() + " is " + ((Car) vehicle[i]).CalcSellingPrice());
                //System.out.print("is"+((Car)vehicle[i]).CalcSellingPrice());
            } else {
                System.out.println("The top speed of the " + vehicle[i].getName() + " is " + ((Convertible) vehicle[i]).TopSpeed()+"mph");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("Printing SuperClass of every Class");

        for (int i = 0; i < vehicle.length; i++) {
            System.out.println("The superClass of " + vehicle[i].getClass().getSimpleName() + " is " + vehicle[i].getClass().getSuperclass().getSimpleName());
        }

    }

}
