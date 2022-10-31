public class Main {
    public static void main(String[] args) {
        //Arada inheritence olması lazım
        //New lerken dikkatli olmalıyız
//       BaseLogger[] loggers = new BaseLogger[]{new DatebaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};
//       for (BaseLogger logger : loggers){
//            logger.Log("Log mesajı");
//       }
        CustomerManager customerManager = new CustomerManager(new DatebaseLogger());
        customerManager.add();
    }
}
