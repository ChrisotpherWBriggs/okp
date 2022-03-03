package encode;

import util.filereader;

import javax.swing.JFileChooser;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
public class encode extends Component
{

    public static String encode( String input ) throws IOException {
        Logger log = LogManager.getLogger(encode.class);
        log.info("Input String is: " + input + "Length = " + input.length());
        //Change string into character array
        List<Character> output = convert.stringChange( input );
        log.info("String Converted to Character Array is: " + output + ", Size = " + output.size());

        //Convert character array to ascii code
        List<Integer> output2 = convert.stringToAscii( output );
        log.info("Character Array Converted to Integer Array is: " + output2 + ", Size = " + output2.size());

        //generate list of shift numbers
        List<Integer> output3 = convert.okp(output2);
        log.info("The Shift Numbers Are is: " + output3 + ", Size = " + output3.size());

        //shift original characters and encode
        List<Character> output4 = convert.encoder(output2, output3);
        log.info("The Shifted Text is: " + output4 + ", Size = " + output4.size());

        //create key

        List<Character> output5 = new ArrayList<>();
            for (int i = 0; i <= output3.size() - 1; i++){
        char x = convert.charChanger(output3.get(i));

        output5.add(x);


    }
        log.info("The Encoded Key is: " + output5 + ", Size = " + output5.size());
        //create final message

        List<Character> output6 = new ArrayList<>();

        char spacer = convert.charChanger( 161 );

            for( int i = 0; i <= output4.size() - 1; i++ ){
        output6.add( output4.get(i) );
    }
            output6.add(spacer);

            for( int i = 0; i <= output5.size() - 1; i++ ){
        output6.add( output5.get(i) );
    }
        log.info("final message as Character Array is: " + output6 + ", Size = " + output6.size());
        //checking Final Message

        List<Integer> output7 = convert.stringToAscii(output6);

            System.out.println(output7);

        //building string message

        StringBuilder str = new StringBuilder();

            for (int i = 0; i <= output6.size()-1; i ++){

        str.append( output6.get(i) );
    }

            System.out.println(str);

            filereader fc = new filereader();

            fc.fileSave( String.valueOf(str) );

            log.info("Encoded String of Text is: " + String.valueOf( str ) + ", length = " + String.valueOf( str ).length());

            return String.valueOf(str);


    }


}
