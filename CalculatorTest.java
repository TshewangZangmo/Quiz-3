package Quiz.week3.Calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

/**
 * Created by zumo on 8/18/2020.
 */
public class CalculatorTest {
    private static Scanner scan=new Scanner(System.in);
    public static void main(String args[]) {
        evaluate();
    }
    public static void evaluate() {
        System.out.println("Enter the Expression to evaluate: ");
        String expr=scan.nextLine();
        if (expr != null && !expr.isEmpty()) {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            try {
                System.out.println("Result: " + engine.eval(expr));
                evaluate();
            } catch (ScriptException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Please give an expression");
            evaluate();
        }
    }
}

