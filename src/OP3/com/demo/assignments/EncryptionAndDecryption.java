package OP3.com.demo.assignments;

import java.nio.charset.StandardCharsets;

public class EncryptionAndDecryption {
	
	public static void main(String[] args) {
		String pass= "pass@123";
		
		byte[] enpass= pass.getBytes(java.nio.charset.StandardCharsets.UTF_8);
		String enCoder= java.util.Base64.getEncoder().encodeToString(enpass);
		System.out.println("Encrypted String: "+enCoder);
		
		byte[] depass=java.util.Base64.getDecoder().decode(enCoder);
		System.out.println("Decrypted String: "+new String(depass,StandardCharsets.UTF_8));
		
		
	}

}
