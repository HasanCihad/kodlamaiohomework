package core_logging;

public class DataabaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}
