package number;
public class largrstPrimeFactor {
    private static long n;
    public static long largestPrimeFactor(long n){
    int i= 2;
    while(i !=n){
        if(n%i == 0) {
          n = n;
          n = n/i;
        } else
        i++;
        
    } 
    return n;
}
  public static void main(String[] args) {
    System.out.println(largestPrimeFactor(n));
  }