class eight
{
    public static void main (String args[])
    {
        int cp = 32500;
        float p =(27/100.0f)*cp;
        float sp =cp+p;       
        double vat =(12.7/100.0)* cp;
        double sc = (3.87/100.0)* cp;
        double tsp =sp+vat+sc;
        
        System.out.println("cost price =" +cp);
        System.out.println("profit =" +p);
        System.out.println("selling price ="+sp);
        System.out.println("vat @ 12.7%="+vat);
        System.out.println("service charge @ 3.87%"+sc);
        System.out.println("total selling price"+tsp);
    }
}