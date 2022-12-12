import java.util.*;

public class showData {

    public static void main(String[] args) {
        AddDataToArrayList adta = new AddDataToArrayList();

        ArrayList<Book> myBookList = adta.bookdetails();

        for(Book showValue: myBookList){
            System.out.println(showValue.getNumber() + " " + showValue.getName() + " " + showValue.getCategory() + " " + showValue.getAuthor());
        }

    }
}
