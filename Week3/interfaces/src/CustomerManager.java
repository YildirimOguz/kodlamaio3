public class CustomerManager {
    private ICustomerDai customerDal;
    public CustomerManager(ICustomerDai customerDal){
        this.customerDal=customerDal;
    }
    public void add(){
        //iş kodları
    customerDal.add();
    }
}
