package problem;

public class ValidateIPAddress {
    public boolean isValid(String ip){

        String rangs[] = ip.split("\\.");

        for(String rang : rangs){
            Integer decimalVal = Integer.parseInt(rang);

            if(!(decimalVal>=0 && decimalVal<=255))
                return false;
        }
        return true;

    }
}
