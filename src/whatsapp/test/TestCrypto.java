package whatsapp.test;

import whatsapp.control.Crypto;

public class TestCrypto {

	 public static void main(String[] args){    
	        Crypto c = new Crypto("C:\\msgstore.db.crypt5", "D:\\WhatsappDb");
	        System.out.println("Decrypting Done");
	    }

}
