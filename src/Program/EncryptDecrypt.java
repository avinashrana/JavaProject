package Program;


public class EncryptDecrypt {

	public static void main(String[] args) {
//		String strToEncode = "excellentPassword";
//        String key = "lockUnlock";
//        String strEncryptedString = StringEncrypt.encryptXOR(strToEncode, key);
//        System.out.println("Encrypted string: " + strEncryptedString);
//        String decodedPwd = StringEncrypt.decryptXOR(strEncryptedString, key);
//        System.out.println("Decrypted string: " + decodedPwd);
		
		/*  This code is working without "Key" */
		
		String strToEncode = "Avinash";
        
        String strEncryptedString = StringEncrypt.encryptXOR(strToEncode);
        System.out.println("Encrypted string: " + strEncryptedString);
        String decodedPwd = StringEncrypt.decryptXOR(strEncryptedString);
        System.out.println("Decrypted string: " + decodedPwd);
	}
	

}
