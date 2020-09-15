class nine
{
    public static void main(String args[])
    {
        int cp = 1200;
        int r = 250;
        int c = 350;
        int a =500;
        int p = 1500;
        int tcp = cp+r+c+a;
        int sp = tcp+p;
        double pp = (p*100.0d)/tcp;
        
        System.out.println("total cost price = "+tcp);
        System.out.println("selling price = "+sp);
        System.out.println("profit % = "+pp);
    }
}