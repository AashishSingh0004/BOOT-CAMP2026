public class d {
    public static void main(String[] args) {
        int num;
        int c=0;
        for(num=1;num<=1000;num++){
            int t=num;
            int count =0;
            while(t>0){
                count++;
                t=t/10;
            }
            t=num;
            int sum=0;
            while(t>0)
            {
                int r=t%10;
                int p = 1;
                for (int i = 0; i < count; i++) {
                    p *= r;
                }
                sum += p;
                t=t/10;
            }
            if (num==sum){
                c++;
               
                System.out.println(num+" is an Armstrong number");
            }
        }
    
}
}
