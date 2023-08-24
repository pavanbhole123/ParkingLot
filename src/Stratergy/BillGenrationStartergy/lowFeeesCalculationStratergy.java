package Stratergy.BillGenrationStartergy;

import Models.Ticket;
import Models.vehicleType;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class lowFeeesCalculationStratergy implements BillGenrationStratergy{
    private static final int RATE_2_WHEERLAR_PER_MIN=2;
    private static final int RATE_4_WHEERLAR_PER_MIN=4;
    @Override
    public long getFees(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntry_time();
        LocalDateTime exitTime = LocalDateTime.now();
        long numberOfMiniutes = ChronoUnit.MINUTES.between(exitTime,entryTime);
        if(ticket.getVehicle().getType().equals(vehicleType.TwoWheeler)){
            return numberOfMiniutes*RATE_2_WHEERLAR_PER_MIN;
        }
        else {
                return numberOfMiniutes*RATE_4_WHEERLAR_PER_MIN;

        }
        //return 0;
    }
}
