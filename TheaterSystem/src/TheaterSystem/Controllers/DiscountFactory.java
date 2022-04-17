package TheaterSystem.Controllers;

import TheaterSystem.Models.Discount;

public class DiscountFactory {
    private Discount[] discountList;

    public String getDiscount(String name){
        for (Discount discount : discountList) {
            if(discount.getName() == name){
                return discount.getName();
            }
        }

        return "No Discounts Exist";
    }


}
