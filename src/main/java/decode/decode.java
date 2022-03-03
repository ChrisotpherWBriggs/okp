package decode;

import encode.convert;
import util.filereader;

import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
public class decode extends Component
{

    public static String encode( String input ) throws IOException
    {
        //convert String to Char Array

        List<Character> input2 = new ArrayList<>();
        input2 = deconvert.stringChange( input );

        System.out.println(input2 + "," + input2.size());

        //convert char array to int array

        List<Integer> output = new ArrayList<>();

        output = deconvert.stringToAscii( input2 );

        System.out.println(output);

        //split into text and key

        List<List<Integer>> output2 = deconvert.okp( output );

        System.out.println(output2);

        //produce unshifted text

        List<Character> output3 = new ArrayList<>();

        output3 = deconvert.decoder( output2.get( 0 ), output2.get(1) );

        System.out.println(output3);

        //Convert Char Array to String

        StringBuilder str = new StringBuilder();

        for (int i = 0; i <= output3.size()-1; i ++){

            str.append( output3.get(i) );
        }

        System.out.println(String.valueOf( str ));


        filereader fc = new filereader();

        fc.fileSave( String.valueOf(str) );

        return String.valueOf(str);
    }


}