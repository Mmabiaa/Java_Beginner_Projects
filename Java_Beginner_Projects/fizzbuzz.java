public class fizzbuzz {
    public  void main(String[] args){
        Display();

    }

    public void Display(){
        System.err.println("Welcome to the FizzBuzz: \t");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                 System.err.println("FizzBuzz");
            }
            else if (i % 5 == 0){
                System.err.println("Fizz");
            }
            else if(i % 3 == 0){
                System.err.println("Buzz");
            }
            else{
                System.err.println(i);
            }
        }
    }
}
