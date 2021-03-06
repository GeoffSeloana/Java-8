package Method_Reference_in_Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Parser{
    String parse(String str);
}

class StringParser{
    public static String convert(String s){
        if(s.length() <= 3)
            s = s.toUpperCase();
        else
            s = s.toLowerCase();
        return s;
    }
}

class MyPrinter{
    public void print(String s, Parser p){
        s = p.parse(s);
        System.out.println(s);
    }
}

public class FirstCode {


    public static void main(String[] args){

        List<String> names = Arrays.asList("Geoffrey", "Anne", "Nokuthula", "Mduduzi", "Siyabonga", "Depolelo");

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        //names.forEach(con);
        //names.forEach(s-> System.out.println(s));
        //names.forEach(System.out::println);

        String str = "inn";



        MyPrinter myPrinter = new MyPrinter();

        // 1.1

//        myPrinter.print(str, new Parser(){
//            public String parse(String s){
//                return StringParser.convert(s);
//            };
//        });

        // 1.2

        //myPrinter.print(str, (s->StringParser.convert(s)));

        // 1.3

        //myPrinter.print(str, StringParser::convert);

        // 1.4

       // StringParser sp = new StringParser();
        //myPrinter.print(str, ( sp::convert ));


    }

}
