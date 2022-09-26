public class BuddyInfo {

//BomaIyaye 101197410
    private String name;
    private String address;
    private int phoneNum;
    public String getName() {
        return name;
    }

    public BuddyInfo(String name, String address, int phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    public BuddyInfo() {
        this.name = "Kevin Debruyne";
        this.address = "31 Library Road";
        this.phoneNum = 911;
    }

    public static void main(String[] args) {
      System.out.println("Hello world!" );
      BuddyInfo J= new BuddyInfo();
      System.out.println("Hello "+J.getName() );
    }}
