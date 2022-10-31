public class CustomerManager {
    BaseDatabaseManager databaseManager;
    public void getCustomers(){
    //    OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager(); Eğer bunu dersek buna bağımlı kalırız.
    databaseManager.getData();
    }
}
