package com.company;
import java.security.*; import javax.crypto.Cipher;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64; import java.util.Scanner; import java.math.BigInteger;

public class test{

    private static KeyPair generateKeyPair(BigInteger p, BigInteger q) throws NoSuchAlgorithmException, InvalidKeySpecException {
        BigInteger n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        BigInteger e = BigInteger.valueOf(65537);
        BigInteger d = e.modInverse(phi);

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        return new KeyPair(
                keyFactory.generatePublic(new java.security.spec.RSAPublicKeySpec(n, e)),
                keyFactory.generatePrivate(new java.security.spec.RSAPrivateKeySpec(n, d))
        );
    }

    private static String encrypt(String message, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String encryptedMessage, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedMessage));
        return new String(decryptedBytes);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter prime number p: ");
            BigInteger p = scanner.nextBigInteger();
            System.out.print("Enter prime number q: ");
            BigInteger q = scanner.nextBigInteger();
            scanner.close();

            KeyPair keyPair = generateKeyPair(p, q);
            String originalMessage = "Hello, RSA Encryption!";

            String encryptedMessage = encrypt(originalMessage, keyPair.getPublic());
            System.out.println("Encrypted: " + encryptedMessage);

            String decryptedMessage = decrypt(encryptedMessage, keyPair.getPrivate());
            System.out.println("Decrypted: " + decryptedMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}