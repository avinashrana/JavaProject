package Program;

//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;

import org.apache.commons.codec.binary;
import org.apache.commons.codec.binary.BaseNCodec;

//import java.util.Base64;
//Base64.getDecoder().decode(...);
//Base64.getEncoder().encodeToString(...);

public final class StringEncrypt {
private StringEncrypt(){
		
	}

	/********************************************************************
	 * 
	 * encryptXOR(String message, String key)
	 * 
	 * 		Uses provided key to encrypt provided message using simple XOR
	 * 
	 *********************************************************************/
	
//	public static String encryptXOR(String message, String key){
//		
//		try {
//			if (message==null || key==null ) return null;
//		
//		    char[] keys=key.toCharArray();
//		    char[] mesg=message.toCharArray();
//		    
//		    int ml=mesg.length;
//		    int kl=keys.length;
//		    char[] newmsg=new char[ml];
//		    
//		    for (int i=0; i<ml; i++){
//		        newmsg[i]=(char)(mesg[i]^keys[i%kl]);
//		    }
//		    mesg=null; 
//		    keys=null;
//		    return new String(new BASE64Encoder().encodeBuffer(new String(newmsg).getBytes()));
//		    
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//				
//	}	
//	
//	
//	/********************************************************************
//	 * 
//	 * decryptXOR(String message, String key)
//	 * 
//	 * 		Uses provided key to decrypt provided message encrypted using the same key
//	 * 
//	 *********************************************************************/
//	
//	public static String decryptXOR(String message, String key){
//		try {
//	      if (message==null || key==null ) return null;
//	      BASE64Decoder decoder = new BASE64Decoder();
//	      char[] keys=key.toCharArray();
//	      char[] mesg=new String(decoder.decodeBuffer(message)).toCharArray();
//
//	      int ml=mesg.length;
//	      int kl=keys.length;
//	      char[] newmsg=new char[ml];
//
//	      for (int i=0; i<ml; i++){
//	        newmsg[i]=(char)(mesg[i]^keys[i%kl]);
//	      }
//	      mesg=null; keys=null;
//	      return new String(newmsg);
//	    }
//	    catch ( Exception e ) {
//	      return null;
//    }  
//  }

public static String encryptXOR(String message){
	
	try {
		if (message==null) return null;
	
	    
	    char[] mesg=message.toCharArray();
	    
	    int ml=mesg.length;
	   
	    char[] newmsg=new char[ml];
	    
	    for (int i=0; i<ml; i++){
	        newmsg[i]=(char)(mesg[i]);
	    }
	    mesg=null; 
	    return new String(new BASE64Encoder().encodeBuffer(new String(newmsg).getBytes()));
	    
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
			
}	


/********************************************************************
 * 
 * decryptXOR(String message, String key)
 * 
 * 		Uses provided key to decrypt provided message encrypted using the same key
 * 
 *********************************************************************/

public static String decryptXOR(String message){
	try {
      if (message==null) return null;
      BASE64Decoder decoder = new BASE64Decoder();
   
      char[] mesg=new String(decoder.decodeBuffer(message)).toCharArray();

      int ml=mesg.length;
      
      char[] newmsg=new char[ml];

      for (int i=0; i<ml; i++){
        newmsg[i]=(char)(mesg[i]);
      }
      mesg=null; 
      return new String(newmsg);
    }
    catch ( Exception e ) {
      return null;
}  
}


}
