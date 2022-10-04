import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Weapon newWeapon = new Weapon();

        System.out.println("\nGive information about your weapon\n");

        System.out.print("Brand:");
        String brand=sc.nextLine();
        newWeapon.setBrand(brand);

        System.out.print("Model:");
        String model=sc.nextLine();
        newWeapon.setModel(model);

        System.out.print("Caliber:");
        int caliber=sc.nextInt();
        newWeapon.setCaliber(caliber);

        System.out.println("Your weapon is "+ newWeapon.getBrand()+" "+newWeapon.getModel()+" caliber "+newWeapon.getCaliber());

    }
}