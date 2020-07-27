// Inthis file: utility methods for drawing a Christmas tree.


//package jtut;


class StringUtils
{
    public StringUtils()
    {
        System.out.println( "StringUtils created;" );
    }


    public static String spaces( int num )
    {
        StringBuilder sb = new StringBuilder();
        for( int spaces = 0; spaces < num; ++spaces )
        {
            sb.append( " " );
        }
        return sb.toString();
    }


    public static void nonmain(String[] args){}

}
