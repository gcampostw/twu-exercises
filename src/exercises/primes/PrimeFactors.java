package exercises.primes;

/**
 * Created by gcampos on 22/02/17.
 */
public class PrimeFactors {

    public void generate(int n) {
        String result = "";
        for (int i = 2; i < n; i++) {
            if ((n % i == 0) && isPrime(i)){
                result += i + ",";
            }
        }
        System.out.println(result.substring(0, result.length()-1));
    }

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i < n; i += 2){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
