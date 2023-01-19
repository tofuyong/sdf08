package sdf;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public final class App {
   
    public static void main(String[] args) throws IOException {

        String dirPath = "data";
        String fileName = "data.txt";
        
        // Create a new directory
        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if (isDirCreated)
            System.out.println("New directory " + dirPath + " created");
        else
            System.out.println("Directory " + dirPath + " already exists");

        
        // Create a file in the directory created above
        File newFile = new File(dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if (isFileCreated)
            System.out.println("New file " + fileName + " created");
        else
            System.out.println("File " + fileName + " already exists");


        // List files under a directory
        File fileList[] = newDir.listFiles();
        for (File f : fileList) {
            System.out.println("File " + f.getCanonicalFile() + ":" + f.getCanonicalFile());
        }

        //Use file output stream to write to the file, append true to add to file rather than overwrite it
        FileOutputStream fos = new FileOutputStream(newFile, true);
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        for (int i = 0; i < 10; i++){
            char str[] = Integer.toString(i).toCharArray();
            fos.write(str[0]);
            fos.write('\n');
        }

        //What if we try to write a string to file - Convert string to byte[] array using getBytes()
        String welcomeMessage = "Welcome to ISS TFIP";
        byte[] outPutData = welcomeMessage.getBytes();

        //Writing string in byte array one character at a time to the file
        fos.write(outPutData);

        //Clear the output string
        fos.flush();
        fos.close();

    
        // ArraySortExample as = new ArraySortExample();
        // as.example();

        // CollectionSortExample cs = new CollectionSortExample();
        // cs.example01();
        // cs.example02();
        // cs.example03();

        // HashMapExample hme = new HashMapExample();
        // hme.example();

        // ConcurrentHashMapExample chme = new ConcurrentHashMapExample();
        // chme.example();

        // LinkedListExample lle = new LinkedListExample();
        // lle.example();

        // StackExample se = new StackExample();
        // se.example();
    }
}
