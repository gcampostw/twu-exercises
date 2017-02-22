package exercises.fizzbuzz;

/**
 * Created by gcampos on 22/02/17.
 */
public class FizzBuzz {

    public void countFizzBuzz(){
        String result = "";
        for (int i = 1; i < 101; i++) {
            if(i % 3 == 0){
                result = "Fizz";
            }
            if(i % 5 == 0){
                result += "Buzz";
            }
            if(result.isEmpty()){
                result += i;
            }
            System.out.println(result);
            result = "";
        }
    }
}
