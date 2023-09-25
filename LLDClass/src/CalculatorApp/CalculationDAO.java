package CalculatorApp;

import java.util.LinkedList;

public class CalculationDAO implements ISaveCalculation {
    
    private LinkedList<Object> calculations = new LinkedList<>();

    @Override
    public void save(Object obj) {
        if (obj instanceof IBinaryCalculation || obj instanceof IUnaryCalculation) {
            // Insert at the beginning of the list
            calculations.addFirst(obj);
        } else {
            // Handle unsupported calculation types or invalid input
            System.out.println("Unsupported calculation type or invalid input.");
        }
    }

    @Override
    public void show() {
        if (calculations.size() > 0) {
            System.out.println("------------------History----------------------");
            int counter = 1;
            for (Object calc : calculations) {
                if (calc instanceof IBinaryCalculation) {
                    IBinaryCalculation binaryCalc = (IBinaryCalculation) calc;
                    System.out.println("[ " + counter + ": " + binaryCalc.getFirstOperand() + " "
                            + binaryCalc.getOperator() + " " + binaryCalc.getSecondOperand()
                            + " = " + binaryCalc.getResult() + " ]");
                } else if (calc instanceof IUnaryCalculation) {
                    IUnaryCalculation unaryCalc = (IUnaryCalculation) calc;
                    System.out.println("[ " + counter + ": " + unaryCalc.getFirstOperand() + " "
                            + unaryCalc.getOperator() + " = " + unaryCalc.getResult() + " ]");
                }
                counter++;
            }
        } else {
            System.out.println("No calculations to show.");
        }
    }

    @Override
    public void delete() {
        calculations.clear();
        System.out.println("History Deleted");
    }
}
