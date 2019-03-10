package chapter13;

/*Copy a file.
To use this program, specify the name
of the source file and the destination file.
For example, to copy a file called First.txt
to a file called Second.txt, the following
command line.

java chapter13/CopyFile First.txt Second.txt
*/

import java.io.*;

public class CopyFile {
  public static void main(String args[]) throws IOException{

    int i;
    FileInputStream fin = null;
    FileOutputStream fout = null;

    // First, comfirm that both files have been specified.
    if(args.length != 2) {
      System.out.println("Usage: CopyFile from to");
    }

    // Copy a File.
    try {
      // attempt to open the files.
      fin = new FileInputStream(args[0]);
      fout = new FileOutputStream(args[1]);

      do {
        i = fin.read();
        if (i != -1) fout.write(i);
      }while(i != -1);
    }catch(IOException e){
      System.out.println("I/O Error: " + e);
    } finally {
      try {
        if(fin != null) fin.close();
      }catch(IOException e2){
        System.out.println("Error Closing Input File");
      }
      try {
        if(fout != null) fout.close();
      }catch(IOException e2){
        System.out.println("Error Closing Output File");
      }
    }
  }
}
