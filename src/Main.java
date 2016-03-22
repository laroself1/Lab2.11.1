/**
 * Created by LaroSelf on 22.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Myphonebook mfb = new Myphonebook();
        mfb.addphonenumber("Pacanchik", "0501231223");
        mfb.addphonenumber("Tipchik", "0937863548");
        mfb.addphonenumber("Andrey","06783479845");
        mfb.addphonenumber("Maxim", "0937863657");
        mfb.addphonenumber("Yegor", "0981214552");
        mfb.printPhoneBook();
    }
}
