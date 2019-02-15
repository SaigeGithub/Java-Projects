import java.util.Scanner;

public class Brant{
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter your user input ");

        
        int number= reader.nextInt();
        int[] intInput =new int[number];
        for(int u=0; u<number;u++){
            intInput[u]=reader.nextInt();
        }
        int[] intArray =new int[number*(number-1)/2];
        int count=0;
        try {
            for(int i=0; i<number;i++){
                
                for (int j=i+1; j< number;j++){
                    //System.out.println(intInput[i]+"\n"+intInput[j]);
                    int temp=intInput[i]+intInput[j];
                
                    intArray[count]=temp;
                    count++;
                }
            }
            
        } catch (Exception e) {
            System.err.println("Invalid Input");
        }
        
    
        int maxnumber=0;
        int maxpair=0;
    
        
        for (int k=0;k<intArray.length; k++) {
            
            int temp=1;
            for(int g=k+1;g<intArray.length;g++){
                if(intArray[k]==intArray[g]){
                    temp++;
                }
            }
            if (temp>maxnumber){
                maxnumber=temp;
                maxpair=1;
            
            }
            else if (temp==maxnumber){
                maxpair++;
            }
            
        }
        System.out.println(maxnumber+"\n"+maxpair);
        
    }
}



