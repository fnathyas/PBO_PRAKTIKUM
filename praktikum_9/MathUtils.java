// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
    public static int factorial(int n){
        if (n < 0){
            throw new IllegalArgumentException ("Untuk bilangan negatif faktorial tidak terdefinisi");
        }

        if (n > 16){
            throw new IllegalArgumentException("Bilangan terlalu besar, nilai maksimal bilangan adalah 16");
        }

        int fac = 1;
        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}