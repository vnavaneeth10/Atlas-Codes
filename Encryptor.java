//program to convert a word in to a form readable only by some persons who knows the logic
//eg , abc === cde (a+3, b+3, c+3)


public class Encryptor {

    public static String  change (String str, int key) {
        int newKey = key % 26;
        char[] charArray = new char[str.length()]; // assign new array with string length

        for (int i=0; i<str.length(); i++){
             int letterPosition = str.charAt(i) + newKey; //charAt() is a method in java to choose the position of that i value in the string 
             if(letterPosition <= 122) {
                 charArray[i] = (char) letterPosition;
             } else {
                 charArray[i] = (char) (96+letterPosition%122);
             }
             
        } return new String(charArray);

        

    }
    public static void main(String[] args) {
        String value = "hello";
        System.out.println(change(value, 2));

    }
    
}
