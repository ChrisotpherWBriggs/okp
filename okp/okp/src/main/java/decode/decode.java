package decode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
public class decode
{

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

    public static List<Character> asciiToString( List<Integer> input )
    {
        List<Character> output = new ArrayList<>();
        for(int i = 0; i <= input.size() - 1; i++)
        {

            char x = charChanger( input.get( i ));

            output.add(x);

        }


        return output;
    }

    public static List<Integer> okp (List<Integer> input ){
        List<Integer> output = new ArrayList<>();
        List<Integer> conversion = new ArrayList<>();

        for ( int i = 0; i <= input.size() -1; i++){

            conversion.add(randomGen());

        }

        return conversion;

    }

    public static int randomGen(){
        Random rand = new Random();

        return rand.nextInt(140 - 1) + 1;
    }

}
