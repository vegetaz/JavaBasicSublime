public class CheckPrime {
	public static boolean checkPrime(int number){
        if(number <= 0 ){
            return false;
        }
        if(number <= 2){
            return true;
        }

        for(int i = 2; i < Math.sqrt(number) ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}