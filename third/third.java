// In this file: how are method parameters passed?
//               - a brief intermision from drawing trees.
//
//               java third.java


// Not declaring our own namespace
// but instead using the java default package
// is considered a bad practice.
//package jtut;


class Test
{
    private static void mutate( Container c )
    {
        c._i = 666;
    }


    private static void replace( Container c )
    {
        Container cnew = new Container();
        mutate( cnew );
        c = cnew;
    }


    private static void testMutate()
    {
        System.out.println( "If we pass an object as a parameter to a method, can the method change the object?" );

        Container c = new Container();
        System.out.println( "Fresh object: " + c._i );

        mutate( c );
        System.out.println( "After mutating it in an external method: " + c._i );
    }


    private static void testReassign()
    {
        System.out.println( "If we pass an object as parameter to a method, can the mothod replace the referred object?" );

        Container c = new Container();
        System.out.println( "Fresh object: " + c._i );

        replace( c );
        System.out.println( "After reassigned: " + c._i );

    }


    public static void main(String[] args)
    {
        testMutate();
        testReassign();
    }
}
