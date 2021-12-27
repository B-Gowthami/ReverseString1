
import org.junit.Test;
import org.junit.Assert;

public class ReverseStringTest {

    @Test
    public <String> void StringReverse() {
        if (ReverseString.method("").isEmpty()) {
            System.out.println("Empty");
        }
    }
    @Test
    public <String> void special() {
        if (ReverseString.method(" ").endsWith(" ")) {
            System.out.println("Empty");
        }
        System.out.println("running");
    }
    @Test
    public <String> void StringReverse1() {
        if (ReverseString.method("9").matches("[0-9]")) {
            System.out.println("Empty");
        }
    }
}
