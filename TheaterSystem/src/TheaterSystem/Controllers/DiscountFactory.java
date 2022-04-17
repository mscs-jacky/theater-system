package TheaterSystem.Controllers;

import TheaterSystem.Models.Attendant;
import TheaterSystem.Models.Employee;
import TheaterSystem.Models.Discount;
import java.util.Scanner;

public class DiscountFactory {
    private Discount[] discountList;

    public void getDiscount(string name){
        for discount in discountList{
            if(discount.getName() == name){
                return discount.getName();
            }
        }

        return "No Discounts Exist";
    }


}
