import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public class FileHandler{
    private FileWriter writer;
    private Scanner reader;



    public void write(String fileName, String data){
        try{
            writer = new FileWriter(new File(fileName), true);
            writer.write(data + ",");
            writer.flush();
            writer.close();
        }
        catch(IOException e){
            System.out.println("Cannot write.");
        }

    }

    public String[] read(String fileName) throws IOException{
        String data;
        String[] dataArray;
        String[] temp = {""};

            reader = new Scanner(new File(fileName));
            data = reader.nextLine();
            dataArray = data.split(",");
            reader.close();
            return dataArray;

    }






}
