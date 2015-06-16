package it.romatre.gamestore.utility;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	/*Metodo che a partire da una password genera il rispettivo codice MD5.
	 * Nel DB non vengono salvate le password in chiaro, ma quelle generate dall'algoritmo di
	 * codifica MD5.
	 */
	public String toMD5 (String originale) {
		String generatedPassword = null;
		try {
			// Create MessageDigest instance for MD5
			MessageDigest md = MessageDigest.getInstance("MD5");
			//Add password bytes to digest
			md.update(originale.getBytes());
			//Get the hash's bytes
			byte[] bytes = md.digest();
			//This bytes[] has bytes in decimal format;
			//Convert it to hexadecimal format
			StringBuilder sb = new StringBuilder();
			for(int i=0; i< bytes.length ;i++)
			{
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			//Get complete hashed password in hex format
			generatedPassword = sb.toString();
		}
		catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		return generatedPassword;
	}
}
