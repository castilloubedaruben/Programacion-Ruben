public class Main {
    public static void main(String[] args) {
        Electrodomestico elec1 = new Electrodomestico("asdf", "KGL-5");
        Lavadora lav1 = new Lavadora("bosh", "k-42", 8);
        Televisor tv1 = new Televisor("samsung", "LG59", 65);

        System.out.println(lav1);
        System.out.println(tv1);

    }
}
