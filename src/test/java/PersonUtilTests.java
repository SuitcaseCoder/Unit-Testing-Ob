import org.junit.Assert;
import org.junit.Test;

public class PersonUtilTests {
    
    @Test
    public void getFullName_GivenValidNames_ReturnsFullNames(){
       // arrange - get all my pieces together (dependencies and stuff)
       
       
       // act - run the method or methods which you want to test and
        // assign any outputs to variables
       String output = PersonUtils.getFullName("Laura", "Ruiz");
       
       // assert - test whether the outputs meet your expectations
        // pass in what's expected, then a param for actual output
        Assert.assertEquals("Laura Ruiz", output);
    }
}
