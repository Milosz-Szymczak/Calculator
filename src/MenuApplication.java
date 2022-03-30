class MenuApplication {
    private final static String APPLICATION_NAME = "Calculator v0.1";

    public void printMenu() {
        Sout.printLine(APPLICATION_NAME);
        Sout.printLine("Witaj w beta testach kalkulatora!");
        Sout.printLine("Licz na nas!");
        Sout.printLine("----------------------------------");
        Sout.printLine("Wybierz opcje: ");
        Sout.printLine("1 - dodawanie");
        Sout.printLine("2 - odejmowanie");
        Sout.printLine("3 - mnożenie");
        Sout.printLine("4 - dzielenie");

    }
}
