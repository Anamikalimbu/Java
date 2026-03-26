
public class Classroom
{
    public static void main(String [] args){
        //datatype [][] identifier
        String [][] seats = {{"Anamika","Prajuna","Alishma"},{"Rebika","Jharna","Gaurav"}};
        // seats = new String[2][3];
        
        // seats[0][0] = "Anamika";
        // seats[0][1] = "Prajuna";
        // seats[0][2] = "Alishma";
        // seats[1][0] = "Rebika";
        // seats[1][1] = "Jharna";
        // seats[1][2] = "Gaurav";
        
        for ( int i=0; i<seats.length; i++){
            for ( int j=0; j<seats[i].length; j++){
                System.out.println(seats[i][j]);
            } 
        }
        
        
    }
}
