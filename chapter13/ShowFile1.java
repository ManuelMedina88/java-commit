/*Display a text file.
  To use this program, specify the name
  of the file that you want to see.
  For example, to see a file called test.txt,
  use the following command line.

  java chapter13/ShowFile chapter13/text.txt

  this variation wraps the code that opens and
  accesses the file within a single try block.
  The file is closed by the finally block.
  */

  import java.io.*;

  public class ShowFile {
    public static void main(String args[]){

      int i;
      FileInputStream file = null;

      // First, confirm that a filename has been specified.
      if(args.length != 1){
        System.out.println("Usage: ShowFile filename");
        return;
      }

      // The following code opens a file, reads characters until EOF
      // is encountered, and then close the file via a finally block.
      try {
        fin = new FileInputStream(args[0]);

        do {
          i = fin.read();
          if(i != -1) System.out.print((char) i);
        }while(i != -1);

      }catch(FileNotFoundException e){
        System.out.println("File Not Found.");
      }catch(IOException e){
        System.out.println("An I/O Error Occurred");
      } finally {
        // close file in all cases.
        try {
          if (fin != null) fin.close();
        } catch(IOException e) {
          System.out.println("Error Closing File");
        }
      }
    }
  }
