import junit.framework.Test;

public class AppTest
    extends TestCase
{

    public AppTest( String testname )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
}
