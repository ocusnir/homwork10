package excersice2;
public class TelephoneDirectory {
    public static void main(String[] args) {
        TelephoneDirectory();
    }

    private static void TelephoneDirectory() {
        MainDirectory directory = new MainDirectory();

        directory.add("Owen", "+12029182132");
        directory.add("Dylan", "+12104706573");
        directory.add("Luke", "+12066871368");
        directory.add("Gabriel", "+15822621559");
        directory.add("Anthony", "+12287755054");
        directory.add("Isaac", "+15823339887");
        directory.add("Grayson", "+12172785600");
        directory.add("Jack", "+12028529359");
        directory.add("Julian", "+12202368784");

        System.out.println(directory.get("Owen"));
        System.out.println(directory.get("Dylan"));
        System.out.println(directory.get("Gabriel"));
        System.out.println(directory.get("Isaac"));
    }
}