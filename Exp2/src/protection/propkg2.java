package protection;

public class propkg2 extends propkg {
    public void readStringextends() {
        System.out.println("Public String accessible within package: " + str1);
        System.out.println("Private String is not accessible within package.");
        System.out.println("Protected String accessible within package: " + st3);
    }
}