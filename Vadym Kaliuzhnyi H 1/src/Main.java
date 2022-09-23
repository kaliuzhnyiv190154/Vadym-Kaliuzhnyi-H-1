import java.util.ArrayList;

public class Main implements PrimeSieve{

    int limit;
    ArrayList<Integer> primes = new ArrayList<>();

    public Main(int limit) {
        this.limit = limit;
    }


    public static void main(String[] args) {
        Main main = new Main(100 );
        main.addPrimes();
        main.printPrimes();
    }

    public void addPrimes(){
        for (int i = 0; i < limit; i++) {
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