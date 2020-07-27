// In this file: this demo illustrates working with multi-file programs.
//               This time we'll need to compile each file separately
//               and then execute the main class.
//
//               javac second.java
//               javac string_utils.java
//               java ChristmasTree


//package jtut;


import java.util.Scanner; 


class ChristmasTree
{
    private static String properly( int rows )
    {
        StringBuilder sb = new StringBuilder();
        for( int row = 0; row < rows; ++row )
        {
            for( int spaces = rows - row; spaces > 0; --spaces )
            {
                sb.append( " " );
            }

            for( int stars = 0; stars < 2 * row + 1; ++stars )
            {
                sb.append( "*" );
            }
            sb.append( "\n" );

        }
        sb.append( StringUtils.spaces( rows ) );
        sb.append( "|" );
        sb.append( "\n" );
        sb.append( StringUtils.spaces( rows ) );
        sb.append( "_" );

        return sb.toString();
    }


    public static void main(String[] args)
    {
        System.out.println( properly( 16 ) );

        // TODO: read the height from the command line.
        // TODO: follow https://codereview.stackexchange.com/questions/245954/print-a-christmas-tree 
        // TODO: look into packages
    }
}
