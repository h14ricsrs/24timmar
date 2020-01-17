package java24h;

import java.util.Comparator;

public class BakelseSortering implements Comparator<Bakverk> {

    @Override

    public int compare(Bakverk bak1, Bakverk bak2) {
        int sortTal = 0;
        if (bak1 != null && bak2 != null) {
            sortTal = bak1.getMarke().compareTo(bak2.getMarke());
        }
        return sortTal;
    }
}
