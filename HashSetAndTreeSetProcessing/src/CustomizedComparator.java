import java.util.*;
public class CustomizedComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        //to sorts elements in reversing order, use o2.compareTO(o1)
        //to sort in natural order, use o1.compareTo(o2)
       return o2.compareTo(o1);
    }
}
