import io.qameta.allure.*;
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Epic 1")
public class MainTest {

    @Test
    @Story("User Story 1")
    @Description("Description created to testAdd test")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Tag1")
    @Link("https://example.org")
    public void testAdd(){
        Main main = createCalc();

        Assertions.assertEquals(5, main.Add(2, 3));
    }

    private Main createCalc(){
        return new Main();
    }
    @Test
    @Story("User Story 2")
    @Description("Description created to testAddWithNegative test")
    @Severity(SeverityLevel.BLOCKER)
    @Tag("Tag2")
    public void testAddWithNegative(){
        Main main = new Main();

        Assertions.assertEquals(-6, main.Add(-2, -3));
    }
}
