package Dashboard.UserAuth;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public class passwordsUtil {
    SecureRandom sr= new SecureRandom();
    byte[] salt= new byte[16];
    sr.nextBytes(salt);

}
