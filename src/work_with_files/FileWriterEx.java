package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        String rubai= "Много лет я размышлял над жизнью земной.\n" +
                "Непонятного нет у меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда, открытая мной.\n";
        String s = "privet!";

        try (FileWriter writer= new FileWriter("test2.txt", true)){
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
