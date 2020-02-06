 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String stars = "";
        for (int i = 0; i < numberOfStars; i++){
            stars += "*";
        }
        return stars;
    }
    
    public static String getTriangle(int numberOfRows) {
        String stars = "";
        for (int base = 1; base <= numberOfRows; base++){
            for (int height = 1; height <= base; height++){
            stars += "*";
        }
        stars += "\n";
    }
            
        
            
            
                
        return stars;
    }


    public static String getSmallTriangle() {
        int numberOfRows = 4;
        String stars = "";
        for (int base = 1; base <= numberOfRows; base++){
            for (int height = 1; height <= base; height++){
            stars += "*";
        }
        stars += "\n";
    }
            
        
            
            
                
        return stars;
    }

    public static String getLargeTriangle() {
        int numberOfRows = 9;
        String stars = "";
        for (int base = 1; base <= numberOfRows; base++){
            for (int height = 1; height <= base; height++){
            stars += "*";
        }
        stars += "\n";
    }
            
        
            
            
                
        return stars;
    }
}
