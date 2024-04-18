package JavaIO;
/*
* Java IO or input output is used to process file inputs and outputs from java with code.
* java uses the concept of stream to make IO operation faster.
* we can perform IO operations using Java I/O API
*
* Stream:-
* A stream is a sequence of data. In java, a stream is compared of bytes.
* System.Out standard output stream
* System.in standard input stream
* System.err standard error stream
*
* Output Stream VS Input Stream
*
* Output Stream:-
* Java application uses an output stream to write data to a given destination. it may be a file, an array, a device, or a socket.
*
* Input Stream:-
* java application uses an input stream to read data from a given destination/source. It may be a file, an array, a device,
* or a socket.
*
* Output Stream Hierarchy
*
*                                               Output Stream
*                                                      |
*       file OutputStream  ByteArrayOutputStream  FilterOutputStream  PipedOutStream  ObjectOutputStream
*                                                      |
*                             DataOutputStream  BufferedOutputStream  PrintStream
*
 */

import java.io.*;


import static java.nio.file.Files.write;

public class JavaFileInput {
    public static void main(String[] args){
        read();


    }
    public static void read(){
        String MacPath = "/Users/mariumfiles/Desktop/myFile.txt";

        try{
            FileReader fileReader = new FileReader(MacPath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("File read error " + e.getMessage());
        }
    }
}

class JavaFileOutput{
    public static void main(String[] args){
        write();

    }

    public static void write(){
        String MacPath = "/Users/mariumfiles/Desktop/myFile.txt";

        try{
            FileWriter fileWriter = new FileWriter(MacPath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Write content to file
            bufferedWriter.write("this is text in the file we created. \n");
            bufferedWriter.write("it contains some simple text. \n");
            bufferedWriter.close();

            System.out.println("File " + MacPath + "has been created successfully");

        }catch (IOException e){
            System.out.println("An error occured- " + e.getMessage());

        }
    }
}