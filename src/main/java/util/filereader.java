package util;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
public class filereader extends Component
{

    public String filePick()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setPreferredSize( new Dimension(800,600));
        fileChooser.setCurrentDirectory( new File( System.getProperty( "user.home" ) ) );
        int result = fileChooser.showOpenDialog( this );
        File selectedFile = null;
        if( result == JFileChooser.APPROVE_OPTION )
        {
            selectedFile = fileChooser.getSelectedFile();

        }
        return selectedFile.getAbsolutePath();
    }

    public static String readLineByLine( String filePath )
    {
        {
            String content = "";

            try
            {
                content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
            }
            catch ( IOException e)
            {
                e.printStackTrace();
            }

            return content;
        }

    }

    public void fileSave(String input) throws IOException
    {
        String str = input;
       try
       {
           BufferedWriter writer = new BufferedWriter( new FileWriter( filesaver()));

           writer.write( str );

           writer.close();
       } catch (Exception e){

       }
    }

    public String filesaver()
    {
        JFrame parentFrame = new JFrame();

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setPreferredSize( new Dimension(800,600));
        fileChooser.setDialogTitle( "Specify a file to save" );

        int userSelection = fileChooser.showSaveDialog( parentFrame );

        File fileToSave = null;
        if( userSelection == JFileChooser.APPROVE_OPTION )
        {
            fileToSave = fileChooser.getSelectedFile();

        }

        return fileToSave.getAbsolutePath();
    }
}

