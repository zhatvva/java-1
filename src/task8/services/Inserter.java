package task8.services;

import java.util.ArrayList;
import java.util.Scanner;

public class Inserter {
    public void insert(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        for (int j = 0; j < a.size(); j++) {
            if(i < b.size() && b.get(i) <= a.get(j)) {
                System.out.print(j + " ");
                int lastElement = a.get(a.size()-1);
                a.add(lastElement);
                for (int k = a.size()-2; k > j; k--) {
                    a.set(k, a.get(k-1));
                }
                a.set(j, b.get(i));
                i++;
            }
        }
        System.out.println(a);
    }
}
