package protection;

public class propkg {
    public String str1 = "I am Public";
    private String str2 = "I am Private";
    protected String st3 = "I am Protected";

    public void readString() {
        System.out.println("Public: " + str1);
        System.out.println("Private: " + str2);
        System.out.println("Protected: " + st3);
    }
}