package design_patterns;

public class SingletonDemo {

    static class Logger {
        private static Logger instance;
        private Logger() { System.out.println("Logger created"); }
        public static Logger getInstance() {
            if (instance == null) instance = new Logger();
            return instance;
        }
        public void log(String msg) { System.out.println("[LOG] " + msg); }
    }

    public static void main(String[] args) {
        Logger first = Logger.getInstance();
        Logger second = Logger.getInstance();
        first.log("First message");
        second.log("Second message");
        System.out.println(first == second);
    }
}
