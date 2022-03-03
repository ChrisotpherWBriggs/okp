package decode;

import java.util.*;

public class deconvert {

    public static int asciiChanger(char x){

        char input = x;

        int output = (int) input;

        return output;
    }

    public static char charChanger(int x){
        int input = x;

        char output = (char) input;

        return output;
    }

    public static List<Character> stringChange(String input){
        List<Character> chars = new ArrayList<>();

        for( char ch : input.toCharArray()){
            chars.add(ch);
        }

        return chars;
    }

    public static List<Integer> stringToAscii( List<Character> input )
    {
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i <= input.size() - 1; i++)
        {

            int x = asciiChanger( input.get( i ));

            output.add(x);

        }


        return output;
    }

    public static List<List<Integer>> okp (List<Integer> input ){

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        List<Integer> k = new ArrayList<>();

        int con = (int)((input.size() / 2));

        for (int i = 0; i <= con -1; i ++){

            t.add(input.get(i));

        }

        for (int i = con + 1; i <= input.size() - 1; i ++){

            k.add(input.get(i));

        }

        output.add(t);
        output.add(k);
        System.out.println(con);
        System.out.println("Text Size is: " + t.size());
        System.out.println("Key Size is: " + k.size());
        return output;

    }

    public static List<Character> decoder (List<Integer> a, List<Integer> b){

        List<Integer> Input1 = new ArrayList();
        List<Character> Input2 = new ArrayList<>();

        for (int i = 0; i <= a.size() - 1; i++){
            int x = a.get(i) - b.get(i);

            Input1.add(x);
        }

        for (int x = 0; x <= Input1.size() - 1; x++){
            char y = charChanger(Input1.get(x));

            Input2.add(y);
        }
        System.out.println(Input1);

        return Input2;
    }

    public static int randomGen(int x ){
        Random rand = new Random();

        int max = 255 - x;
        int min = 162 - x;

        return rand.nextInt(max - min) + min;
    }


}

