package org.someone;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App
{
    static String  hostname = "unknown";
    static String  username = "";
    static String  password = "";


    public static void main(String[] args) throws IOException {

        hostname = System.getProperty("user.name");
        /*username = "your_username";
        password = "your_password";*/
        List<String> l = myFileUtil.readFileInList("C:\\Users\\" + hostname + "\\Documents\\mylittlepony\\data.txt");
        if(!l.get(0).equals("flag = 1")) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Please submit your username and password to login");
            System.out.print("Username: ");
            username = keyboard.nextLine();

            System.out.print("Password: ");
            password = keyboard.nextLine();

            myFileUtil.writeToFile(hostname);
        }
        else {
            username = l.get(1);
            password = l.get(2);
        }

        try {
            ytuScript.automatedLectureAttender();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
