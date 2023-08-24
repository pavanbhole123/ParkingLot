package Stratergy.BillGenrationStartergy;

public class BillGenerationFactory {
    public static BillGenrationStratergy getFees(){
        return new lowFeeesCalculationStratergy();
    }
}
