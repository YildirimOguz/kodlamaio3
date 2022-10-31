public class DatebaseLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Logged to database: " + message );
    }
}
