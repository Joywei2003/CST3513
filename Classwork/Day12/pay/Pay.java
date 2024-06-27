package Day12.pay;  //  03/11/2024
import java.math.BigDecimal;

public class Pay
{
    public static double weeklyPay(int hours, double payRate)
    {
        return hours * payRate;
    }
    public static double weeklyPay(double salary)
    {
        return salary / 52;
    }
}
