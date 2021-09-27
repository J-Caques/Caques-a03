package baseline;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Solution37 {
    public static void main(String[] args) {
        //Coming up with a password that meets specific requirements is something your computer can do.
        // And it will give you practice using random number generators in conjunction with a list of known values
        //Create a program that generates a secure password.
        ArrayList<String> password = new ArrayList<String>();
        //Use lists to store characters to generate the passwords.
        String[] specialChar = new String[]{"!","#","$","%","&","'","(",")","*","+","-",".","/",":",";","<","=",">","?","@","[","]","^","_","`","{","|","}","~"};
        String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        //Prompt the user for the minimum mlength, the number of special characters, and the number of numbers.
        System.out.print("What's the minimum mlength?: ");
            Scanner input = new Scanner(System.in);
            int mlength = input.nextInt();
        System.out.print("How many special characters?: ");
            Scanner input2 = new Scanner(System.in);
            int special = input2.nextInt();
        System.out.print("How many numbers?: ");
            Scanner input3 = new Scanner(System.in);
            int numbers = input3.nextInt();
        //Then generate a password for the user using those inputs.
        Random random = new Random();
        int length = getRandomValue(mlength, 20);
            //Add random special chars
            for(int i = 0; i<special;i++){
                int x = random.nextInt(specialChar.length);
                String y = specialChar[x];
                password.add(y);
            }
            //Add random numbers from 0-9
            for( int j = 0;j<numbers;j++){
                int x = random.nextInt(10);
                String y = Integer.toString(x);
                password.add(y);
              }
            //Add random letters
            int letters = length - (numbers+special);
            for(int n = 0; n<letters;n++){
                int x = random.nextInt(alphabet.length);
                String y = alphabet[x];
                password.add(y);

            }
        //Randomize password
        Collections.shuffle(password);
        for(int i = 0; i< length; i++) {
            System.out.print(password.get(i));
        }


        //Ensure that the generated password is random.
        //Ensure that there are at least as many letters are there are special characters and number.
    }
    public static int getRandomValue(int Min, int Max)
    {

        // Get and return the random integer
        // within Min and Max
        return ThreadLocalRandom
                .current()
                .nextInt(Min, Max + 1);
    }
}
