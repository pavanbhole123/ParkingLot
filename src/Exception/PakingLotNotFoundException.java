package Exception;

public class PakingLotNotFoundException extends RuntimeException{
    public PakingLotNotFoundException(String message) {
        super(message);
    }
}
