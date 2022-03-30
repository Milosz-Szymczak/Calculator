class CalculatorApp {

    public static void main(String[] args) {

        MenuApplication logic = new MenuApplication();
        logic.printMenu();
        Calcservice cs = new Calcservice();
        cs.logicCalc();
    }
}