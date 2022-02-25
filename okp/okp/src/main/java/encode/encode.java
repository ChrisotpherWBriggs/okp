package encode;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
public class encode
{

    public static List<Character> flipper (List<Character> input){
        List<Character> output = new ArrayList<>();

        for(int i = input.size()-1; i >= 0; i--){

            output.add(input.get(i));
        }


        return output;
    }

}
