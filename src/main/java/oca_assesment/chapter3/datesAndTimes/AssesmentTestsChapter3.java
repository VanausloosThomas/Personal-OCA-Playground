package main.java.oca_assesment.chapter3.datesAndTimes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssesmentTestsChapter3 {

    public static void main(String[] args) {
        AssesmentTestsChapter3 assesmentTestsChapter3 = new AssesmentTestsChapter3();
        assesmentTestsChapter3.q8substring();
        assesmentTestsChapter3.q12StringbuilderDelete();
        assesmentTestsChapter3.q16arrays();
        assesmentTestsChapter3.q17arrayList();
        assesmentTestsChapter3.q21();
        assesmentTestsChapter3.q22binairySearch();
        assesmentTestsChapter3.q24ArraysSort();
    }

    private void q24ArraysSort() {
        List<String> hex = Arrays.asList("30", "8","3A","FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex,"8");
        int y = Collections.binarySearch(hex,"3A");
        int z = Collections.binarySearch(hex,"4F");

        for (String s : hex) {
            System.out.println(s);
        }
        System.out.println(x + ":" + y + ":" + z);
    }

    private void q22binairySearch() {
        int[] random ={6, -4, 12, 0, -10};
        int x = 12;
        int y = Arrays.binarySearch(random,x);
        System.out.println("printing an unsorted array...");
        System.out.println(y + "\n");
        System.out.println("this compiles and runs, however for a MEANINGFULL result we should sort the array first!");

    }

    private void q21() {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);
        for (Integer value : values) {
            System.out.print(value);
            System.out.println("The set() method on ArrayList will replaye the element at the given index by the provided element");
        }
    }

    private void q17arrayList() {
        List<String> lijst = new ArrayList<>();
        lijst.size();
        System.out.println("arraylists define a METHOD called size()!");
    }

    private void q16arrays() {
        int [] array = new int[4];
        int length = array.length;
        System.out.println("arrays define a PROPERTY length => not a method!");
    }

    private void q12StringbuilderDelete() {
        StringBuilder sb = new StringBuilder("0123456789");
        System.out.println(sb.delete(1,  3));
    }

    private void q8substring() {
        String example = "0123456789";
        // starts with index 1 and stops before index 5
        String substringMethode1 = example.substring(1,5);
        // starts with index 5
        String substringMethode2 = example.substring(5);
        System.out.println(substringMethode1);
        System.out.println(substringMethode2);

    }

    public void q11() {
        int testInt = 0;
        testInt += new StringBuilder("balljflsjlsjf").substring(1,2).length();
    }
}
