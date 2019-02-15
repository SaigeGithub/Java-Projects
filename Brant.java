public class Brant{
    public static void main(String[] args) {
        if(args.length>0){
            int number= Integer.parseInt(args[0]);
            int[] intArray =new int[number*(number-1)/2];
            int count=0;
            try {
                for(int i=0; i<number-1;i++){
                    
                    for (int j=i+1; j< number;j++){
                        
                        int temp=Integer.parseInt(args[i+1])+Integer.parseInt(args[j+1]);
                    
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
}



