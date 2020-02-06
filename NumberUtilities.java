


public class NumberUtilities {

    public static String getRange(int stop) {
        String stopRangeOut = "";
        for (int i = 0; i < stop; i++) {
            stopRangeOut += i;
        }
        
        return stopRangeOut;
    }

    public static String getRange(int start, int stop) {
        String startStopOut = "";
        startStopOut += start;
        for (int i = start+1; i < stop; i++) {
            
            startStopOut += i;
        }
        return startStopOut;
    }


    public static String getRange(int start, int stop, int step) {
        String startStopStep = "";
        
        for (int i = start; i < stop; i+=step) {
            startStopStep +=i;
        }
        
    
        return startStopStep;
    }

    public static String getEvenNumbers(int start, int stop) {
        String evenStartStop = "";
        
        
            if (start % 2 == 0) {
                for (int i = start; i < stop; i+=2) {
                    evenStartStop += i;
                }
                } else {
                    for (int i = start+1; i < stop; i+=2) {
                        evenStartStop += i;
                    }
                }
                return evenStartStop;
                
                
        }
        
    public static String getOddNumbers(int start, int stop) {
        String oddStartStop = "";
        if (start % 2 ==0) {
            for (int i = start; i < stop; i+=1) {
                oddStartStop += i;
            }
        } else {
            for (int i = start; i < stop; i+=2) {
                oddStartStop += i;
            }
        }
        
       
        return oddStartStop;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        /* revised after this comment
         * for (int i = start; i <= stop; i++){
            int expMachine = i;
            for (int j = 1; j < exponent ; j++){
                expMachine *= i;
            }
            expStartStop += expMachine;
            
        }
        return expStartStop;
         */
        String expStartStop = "";
        for (int i = start; i <= stop; i++){
            expStartStop += (int)Math.pow(i, exponent);
        }
        return expStartStop;
    }
}
