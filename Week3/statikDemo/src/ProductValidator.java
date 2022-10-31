public class ProductValidator {
    public static boolean isValid(Product product){    //Product sınıfından gelen ürünü kontrol etmek gibi düşünebiliriz.
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
