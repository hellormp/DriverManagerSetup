package setupDriver;

import org.testng.annotations.Test;

public class firstTest extends startDownTest{


    @Test
    public void someThings(){
        driver.get("https://bonigarcia.dev/webdrivermanager/");
    }
}
