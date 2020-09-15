class alloy
{
    public static void main (String args)
    {
        int c=13,z=7,n=5;
        int sum=c+z+n;
        
        float pc=(c*100.0f)/sum;
        float pz=(z*100.0f)/sum;
        float pn=(n*100.0f)/sum;
        
        System.out.println("percentage of copper in the alloy="+pc);
        System.out.println("percentage of zinc in the aloy ="+pz);
        System.out.println("percentage of nickel in the alloy = "+pn);
    }
}
        
/*

veriable listing : -

Name    |    Data Type      |   Description    |

c       |   int             | Taking variable as a c 
z       |   int             | Taking variable as a z
n       |   int             | Taking variable as a n
sum     |   int             | Taking variable as a sum for receiving the total of c, z, n into the variable
pc      |   float           | Taking variable as a pc for reciving the percentage of variable c
pz      |   float           | Taking variable as a pc for reciving the percentage of variable z
pn      |   float           | Taking variable as a pc for reciving the percentage of variable n

*/