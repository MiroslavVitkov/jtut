// In this file: a Java absolute beginner demo.
//               It draws a christmas tree in 3 different ways,
//               introducing more Java concepts each time.
//               Written by an absolute beginner.
//
// Run on a linux machine simply by `java first.java`


import java.util.Scanner; 


class ChristmasTree
{
    private static void byHand()
    {
        System.out.println( "Chritsmas tree, yey." );
        System.out.println( "     *" );
        System.out.println( "    ***" );
        System.out.println( "   *****" );
        System.out.println( "  *******" );
        System.out.println( " ********" );
        System.out.println( "**********" );
        System.out.println( "    |" );
        System.out.println( "    _" );
    }


    private static void withLoops()
    {
        int rows = 6;
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

        for( int spaces = 0; spaces < rows; ++spaces )
        {
            sb.append( " " );
        }
        sb.append( "|" );
        sb.append( "\n" );
        for( int spaces = 0; spaces < rows; ++spaces )
        {
            sb.append( " " );
        }
        sb.append( "_" );
        System.out.println( sb.toString() );
    }


    private static String spaces( int num )
    {
        StringBuilder sb = new StringBuilder();
        for( int spaces = 0; spaces < num; ++spaces )
        {
            sb.append( " " );
        }
        return sb.toString();
    }

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
        sb.append( spaces( rows ) );
        sb.append( "|" );
        sb.append( "\n" );
        sb.append( spaces( rows ) );
        sb.append( "_" );

        return sb.toString();
    }


    public static void main(String[] args)
    {
        byHand();

        withLoops();

        // What is the tree needs to be 100 lines high?
        // We arrive at the concept of `scalability`.
        System.out.println( properly( 16 ) );
    }
}


// Next:
// TODO: read the height from the command line.
// TODO: follow https://codereview.stackexchange.com/questions/245954/print-a-christmas-tree 
// TODO: look into packages
