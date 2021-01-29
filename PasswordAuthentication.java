import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Arrays;

public class PasswordAuthentication
{

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
        //NativePRNG is preferred on Linux
        SecureRandom secureRandomGenerator = SecureRandom.getInstance("NativePRNG", "SUN");

        //Get 128 bytes
        byte[] randomBytes = new byte[128];
        secureRandomGenerator.nextBytes(randomBytes);

        //Get random integer
        int randomInt = secureRandomGenerator.nextInt();

        //Get random integer in range
        int randomIntRange = secureRandomGenerator.nextInt(999999);

        System.out.println("Random numbers = " + Arrays.toString(randomBytes));

        SecureRandom defaultRandom = new SecureRandom();
        System.out.println("defaultRandom algorithm = " + defaultRandom.getAlgorithm());

    }
}
