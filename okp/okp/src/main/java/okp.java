import encode.convert;

import java.util.*;

public class okp {

    public static void main(String[] args){

        String input = "May those who love us, love us; And for those who don't love us, May God turn their hearts; And if He doesn't turn their hearts, May He turn their ankles, So we will know them by their limping.";

        //Change string into character array
        List<Character> output = convert.stringChange( input );

        System.out.println(output + " , " + output.size());


        //reverse character list
        List<Character> rev = encode.encode.flipper( output );

        System.out.println(rev);

        //Convert character array to ascii code
        List<Integer> output2 = convert.stringToAscii( output );

        System.out.println(output2 + " , " + output2.size());

        //generate list of shift numbers
        List<Integer> output3 = convert.okp(output2);

        System.out.println(output3 + " , " + output3.size());

        //shift original characters and encode
        List<Character> output4 = convert.encoder(output2, output3);

        System.out.println(output4);

        //create key

        List<Character> output5 = new ArrayList<>();
        for (int i = 0; i < output3.size() - 1; i++){
            char x = convert.charChanger(output3.get(i));

            output5.add(x);
        }

        System.out.println(output5);

        //create final message

        List<Character> output6 = new ArrayList<>();

        char spacer = convert.charChanger( 161 );

        for( int i = 0; i < output4.size() - 1; i++ ){
            output6.add( output4.get(i) );
        }
        output6.add(spacer);

        for( int i = 0; i < output5.size() - 1; i++ ){
            output6.add( output5.get(i) );
        }

        System.out.println(output6);

        //checking Final Message

        List<Integer> output7 = convert.stringToAscii(output6);

        System.out.println(output7);

        //building string message

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < output6.size()-1; i ++){

            str.append( output6.get(i) );
        }

        System.out.println(str);
    }

}
