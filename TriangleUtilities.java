 import java.lang.StringBuilder;

public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String stars="";
        for (int i=1; i<=numberOfStars; i++){
            stars += "*";
            
    }
    //System.out.println(stars);
    return stars;
    
    }
    
    public static String getTriangle(int numberOfRows) {
       
            
    return null;
    
    }


    public static String getSmallTriangle(int numberOfRows) {
        StringBuilder stars = new StringBuilder();
        for(int i=1; i<=numberOfRows;i++){
            for (int j=1;j<=i;j++)
            {
                //stars=stars+j;
                stars.append("*\n");
            }
        }
                
                
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
