package co.com.mercadolibre.challenge.seguridad.dominio.servicio.seguridad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * @author Eliana Katherine Guerrero Guerrero - elikateh@gmail.com
 * @since 19/04/2024
 */
@Service
public class ServicioEncriptacion {

    @Value("${app.secret.key}")
    private String secretKey;
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";

    public String encriptarValor(String valor) {
        try {
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), ALGORITHM);
            IvParameterSpec ivSpec = new IvParameterSpec(new byte[16]);

            cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

            byte[] encryptedBytes = cipher.doFinal(valor.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException |
                 IllegalBlockSizeException | BadPaddingException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String desencriptarValor(String valorEncriptado) {
        try {
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), ALGORITHM);
            IvParameterSpec ivSpec = new IvParameterSpec(new byte[16]);

            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

            byte[] encryptedBytes = Base64.getDecoder().decode(valorEncriptado);
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        } catch (NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException |
                 IllegalBlockSizeException | BadPaddingException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}