package org.example.problemsolving.ibm.interview;

public class PasswordExtractor {
    public static void main(String[] args) {
        String asciiReversedPassword = "796115110113721110141108";
        String password = getPasswordChars(asciiReversedPassword);

        System.out.println("asciiReversedPassword = " + asciiReversedPassword);
        System.out.println("password = " + password);

    }

    static String reversAsciiPassword(String pass) {
        StringBuilder asciiPassword = new StringBuilder();
        for (int i = pass.length()-1; i >= 0 ; i--) {
            asciiPassword.append(pass.charAt(i));
        }
        return asciiPassword.toString();
    }


    static String getPasswordChars(String asciiReversedPassword){
        String asciiPassword = reversAsciiPassword(asciiReversedPassword);
        System.out.println("asciiPassword = " + asciiPassword);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < asciiPassword.length(); i+=2) {
            int charIntVal = Integer.parseInt(asciiPassword.substring(i, i+2));
            System.out.println("charIntVal = " + charIntVal);
            if ( charIntVal >= 65 && charIntVal <= 90){
                result.append((char) charIntVal);
            }
            else if (i+3 < asciiPassword.length()){
                charIntVal = Integer.parseInt(asciiPassword.substring(i, i+3));
                System.out.println("charIntVal = " + charIntVal);
                if ( charIntVal >= 97 && charIntVal<= 122){
                    result.append((char) charIntVal);
                    i++;
                }
            }

        }
        return result.toString();
    }

}
