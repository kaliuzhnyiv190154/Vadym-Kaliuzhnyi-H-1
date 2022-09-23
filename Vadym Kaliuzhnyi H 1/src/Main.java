import java.util.ArrayList;

public class Main implements PrimeSieve{

    int max;
    ArrayList<Integer> primes = new ArrayList<>();

    public Main(int max) {
        this.max = max;
    }


    public static void main(String[] args) {
        Main main = new Main(100 );
        main.addPrimes();
        main.printPrimes();
    }

    public void addPrimes(){
        for (int i = 0; i < max; i++) {
            if (isPrime(i) == true){
                primes.add(i);
            }
        }
    }


    @Override
    public boolean isPrime(int p) {
        if (p == 0 || p == 1){
            return false;
        }

        if (p == 2 || p == 3 || p == 5){
            return true;
        }

        if (p % 2 == 0){
            return false;
        }

        if (p % 3 == 0){
            return false;
        }

        if (p % 5 == 0){
            return false;
        }

        return true;
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < primes.size(); i++) {
            System.out.println(primes.get(i));
        }
    }
}