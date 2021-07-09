// PowerCalc.java
// demonstrates Power by recursion
// to run this program: C>java PowerCalc
//--------------------------------------------------------------
class PowerCalc
{
  public static long power(long base, long pow)
  {
    if(pow == 2)
    {
    return base*base;
    }//end if
    
    else if(pow%2 != 0)
    {
    return base*power(base*base, pow/2);
    }//end else if
    
    else
    {
    return power(base*base, pow/2);
    }//end else
  }//end long() function
  //---------------------------------------------------------------------------------------------
  public static void main(String[] args)
  {
    //----------Case1-----------//
    long base1 = 5;
    int pow1 = 2;
    
    long p1 = power(base1, pow1);
    System.out.println(base1 + " raised to the power of " + pow1 + " = " + p1);//Result for case 1.
    //----------Case2-----------//
    long base2 = 2;
    int pow2 = 5;
    
    long p2 = power(base2, pow2);
    System.out.println(base2 + " raised to the power of " + pow2 + " = " + p2);//Result for case 2
    //----------Case3-----------//
    long base = 3;
    int pow = 4;
    
    long p = power(base, pow);
    System.out.println(base + " raised to the power of " + pow + " = " + p);//Result for case 3.
  }//end main() function
}//end PowerCalc class
