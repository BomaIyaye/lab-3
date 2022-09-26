import java.util.ArrayList;
//Boma

public class AddressBook {
    public final ArrayList<BuddyInfo> addBook;

    public AddressBook() {
        addBook = new ArrayList<>();
    }

    public void addBuddy(String name, String address, int phoneNum){
        addBook.add(new BuddyInfo(name,address,phoneNum));
    }


    public void removeBuddy(String name, String address, int phoneNum){
        addBook.remove(new BuddyInfo(name,address,phoneNum));
    }

    public void newMethod() {

    }
    public static void main(String[] args) {
        AddressBook book=new AddressBook();
        book.addBuddy("halland","manchester city england",818);
        book.removeBuddy("halland","manchester city england",818);
        System.out.println("AddressBook");

    }


}
