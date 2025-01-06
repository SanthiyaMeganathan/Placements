public class Palindrome {
    public static void main(String[] args) {
        String name = "malayalam";

        int length = name.length();

        StringBuilder reversed_name = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed_name.append(name.charAt(i));
        }
        if((reversed_name.toString()).equals(name) ){
            System.out.println("This is palindrome");

        } else {
            System.out.println("this is not palindrome");
        }
    }
    
}


if(a==b){
    
}