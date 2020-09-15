class quad
{
    public static void main (String args [])
    {
        int a=14,b=6,c=8,d=10;
        int tot=a+b+c+d;
        
        double s1=(a*360.0d)/tot;
        double s2=(b*360.0d)/tot;
        double s3=(c*360.0d)/tot;
        double s4=(d*360.0d)/tot;
        
        System.out.println("First angle ="+s1);
        System.out.println("second angle ="+s2);
        System.out.println("third angle ="+s3);
        System.out.println("fourth angle ="+s4);
    }
}