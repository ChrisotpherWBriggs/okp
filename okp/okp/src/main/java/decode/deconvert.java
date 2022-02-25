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

    public static List<Integer> okp (List<Integer> input ){
        List<Integer> output = new ArrayList<>();
        List<Integer> conversion = new ArrayList<>();

        for ( int i = 0; i <= input.size() -1; i++){

            conversion.add(randomGen(input.get(i)));

        }

        return conversion;

    }

    public static List<Character> encoder (List<Integer> a, List<Integer> b){

        List<Integer> Input1 = new ArrayList();
        List<Character> Input2 = new ArrayList<>();

        for (int i = 0; i <= a.size() - 1; i++){
            int x = a.get(i) + b.get(i);

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

