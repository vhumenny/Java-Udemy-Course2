package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile {

    public static void main(String[] args) {
        try (java.io.RandomAccessFile file = new java.io.RandomAccessFile("test10.txt", "rw")) {

            int a = file.read();
            System.out.println((char) a);
            file.seek(30);
            String s1 = file.readLine();
            System.out.println(s1);

            long position = file.getFilePointer();
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("hi!");
            file.seek(file.length()-1);
            file.writeBytes("\n Author");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
