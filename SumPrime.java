public class SumPrime {
	public static void sumPrime(){
        int sum = 0;
        for(int i = 0;i<=100;i++){
            if(checkPrime(i)){
                tong += i;
            }
        }
        System.out.println(sum);
    }
}