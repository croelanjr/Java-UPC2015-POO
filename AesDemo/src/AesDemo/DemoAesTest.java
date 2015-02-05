package AesDemo;

import java.io.*;

public class DemoAesTest {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
 
        DemoAes d = new DemoAes();
             
        System.out.println("Cadena Encrypitada:" + d.encrypt("Hello"));           
        String encryptedText = d.encrypt("Hello");
        System.out.println("Cadena Dencrypitada:" + d.decrypt(encryptedText));         
 
    }
    
}
