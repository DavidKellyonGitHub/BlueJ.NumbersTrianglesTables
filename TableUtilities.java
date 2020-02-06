 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int tableSize = 5;
        String newLine = "";
        String newTable = "";
        for (int rowSlot = 1; rowSlot <= tableSize; rowSlot++){
            for (int columnSlot = 1; columnSlot <= tableSize; columnSlot++){
                if (rowSlot * columnSlot >= 10 && rowSlot * columnSlot < 100){
                    newLine += " " + (rowSlot * columnSlot) + " |";
                } else if (rowSlot * columnSlot >=100){
                    newLine += rowSlot * columnSlot + " |";
                } else {
                    newLine += "  " + rowSlot * columnSlot + " |";
                }
            }
            newLine += "\n";
            newTable += newLine;
            newLine = "";
            
        
        }
        return newTable;
          
        
    }

    public static String getLargeMultiplicationTable() {
        int tableSize = 10;
        String newLine = "";
        String newTable = "";
        for (int rowSlot = 1; rowSlot <= tableSize; rowSlot++){
            for (int columnSlot = 1; columnSlot <= tableSize; columnSlot++){
                if (rowSlot * columnSlot >= 10 && rowSlot * columnSlot < 100){
                    newLine += " " + (rowSlot * columnSlot) + " |";
                } else if (rowSlot * columnSlot >=100){
                    newLine += rowSlot * columnSlot + " |";
                } else {
                    newLine += "  " + rowSlot * columnSlot + " |";
                }
            }
            newLine += "\n";
            newTable += newLine;
            newLine = "";
            
        
        }
        return newTable;
    }

    public static String getMultiplicationTable(int tableSize) {
        String newLine = "";
        String newTable = "";
        for (int rowSlot = 1; rowSlot <= tableSize; rowSlot++){
            for (int columnSlot = 1; columnSlot <= tableSize; columnSlot++){
                if (rowSlot * columnSlot >= 10 && rowSlot * columnSlot < 100){
                    newLine += " " + (rowSlot * columnSlot) + " |";
                } else if (rowSlot * columnSlot >=100){
                    newLine += rowSlot * columnSlot + " |";
                } else {
                    newLine += "  " + rowSlot * columnSlot + " |";
                }
            }
            newLine += "\n";
            newTable += newLine;
            newLine = "";
            
        
        }
        return newTable;
    }
}
