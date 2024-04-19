package co.com.mercadolibre.challenge.seguridad.infraestructura.seguridad.encrypt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CreditCardController {

    @Autowired
    private EncryptionService encryptionService;

    @PostMapping("/encrypt")
    public String encryptCardNumber(@RequestBody String cardNumber) throws Exception {
        return encryptionService.encrypt(cardNumber);
    }

    @PostMapping("/decrypt")
    public String decryptCardNumber(@RequestBody String encryptedCardNumber) throws Exception {
        return encryptionService.decrypt(encryptedCardNumber);
    }
}