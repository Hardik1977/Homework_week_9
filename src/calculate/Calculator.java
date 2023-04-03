package calculate;

/**
 * 1. Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter
 */
public class Calculator {
int a,b, answer;
char symbol;
    public void addition (int a, int b){    // addition method declaration
        int answer = a+b;
        System.out.println("The addition of " + a + " and " + b + " is :  " + answer);
    }

    public void substraction (int a, int b) {   // subtraction method declaration
        int answer = a-b;
        System.out.println("The subtraction of " + a + " and " + b + " is : " + answer);
    }

    public void division (int a, int b){  // division method declaration
        int answer = a/b;
        System.out.println("The division of " + a + " and " + b + " is : " + answer);
    }

    public void multiplication (int a, int b){      // multiplication method declaration
        int answer = a*b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + answer);
    }

    public void calculateResult(int a, int b, char symbol){
    if (symbol == '+'){
        addition(a,b);
    }else if(symbol == '-'){
        substraction(a,b);
    }else if(symbol == '*') {
        multiplication(a, b);
    }else if(symbol == '/') {
        division(a, b);
    }

    }

}