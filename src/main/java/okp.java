
import encode.encode;
import util.filereader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class okp
{

    public static void main( String[] args ) throws IOException
    {

        filereader fc = new filereader();

        String path = fc.filePick();

        String input = filereader.readLineByLine( path );

        System.out.println( input );

        encode.encode( input );

    }
}
