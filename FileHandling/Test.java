import java.io.*;
public class Test {
    public static void main(String args[]) throws IOException {
        String path = "E:\\1GITHUB\\java-Beta\\FileHandling\\data.txt";
        FileWriter file = new FileWriter(path, true);

        file.append("\n");
        file.append("hello");
        file.close();
    }
}
