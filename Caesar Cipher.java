public class Main
{
	public static void main(String[] args) 
	{  // Start of main method
		
// Basic implementaion of the Caesar Cipher
		//1. Variables
		int key=10;
		int plaintextInt = 0, ciphertextInt;
		
		// Variables
		char plaintextChar = 'a';
		char ciphertextChar;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		// 2. Encrypt plaintextInt using the formula: p+k % 26
		ciphertextInt = plaintextInt+key % 26;
		ciphertextChar = alphabet.charAt(ciphertextInt);
		
		// 3. Display result of Encryption
		System.out.println("Plaintext (int value): "+plaintextInt);
		System.out.println("Ciphertext (int value): "+ciphertextInt);
		
		// Display plaintext and ciphertext characters 
		System.out.println("Plaintext Character: "+plaintextChar);
		System.out.println("Ciphertext Character: "+ciphertextChar);
		
	}
}
	// end of main method

