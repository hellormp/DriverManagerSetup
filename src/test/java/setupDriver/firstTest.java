package setupDriver;

import org.testng.annotations.Test;

public class firstTest extends startDownTest{

    /*1.
    Check if the user can open the link, after navigation to link > compare the Title(url) with ER
    *
    * */
    @Test
    public void CheckTheLink(){
        driver.get("https://bonigarcia.dev/webdrivermanager/");
        String getTitle = driver.getTitle();
        if (getTitle == driver.getTitle()){
            System.out.println("ER");
        };



    }
    /*2.
    Check if the Title
    * */
    @Test
    public void getTitle(){
        System.out.println("lol");
    }


}
