package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args){

        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("kitchen");
        stringJoiner.add("food");
        System.out.println(stringJoiner);

        StringJoiner stringJoiner1 = new StringJoiner(",","{","}");
        stringJoiner1.add("Bag");
        stringJoiner1.add("Clothes");
        System.out.println(stringJoiner1);

        StringJoiner stringJoiner2 = new StringJoiner(",","{","}");
        stringJoiner2.add("Sun");
        stringJoiner2.add("Moon");

        StringJoiner stringJoiner3 = new StringJoiner(",","{","}");
        stringJoiner3.add("Fruit");
        stringJoiner3.add("Juice");

        // StringJoiner merge

        StringJoiner stringJoiner4 = stringJoiner1.merge(stringJoiner2);
        System.out.println(stringJoiner4);

        // StringJoiner length

        System.out.println(stringJoiner4.length());

    }

}
