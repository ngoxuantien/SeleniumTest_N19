import io.github.bonigarcia.seljup.SeleniumExtension;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import static org.hamcrest.MatcherAssert.assertThat;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
@ExtendWith(SeleniumJupiter.class)



public class TestLogin {

    @TestFactory

/// test đăng nhập
    @Test
    public  void testLoginSuccess(ChromeDriver chomeDriver){
        chomeDriver.get("http://localhost:8080/login");
        WebElement tendangnhap=chomeDriver.findElement(By.id("iduser"));
        tendangnhap.sendKeys("thupq");

        WebElement matkhau= chomeDriver.findElement(By.id("password"));
        matkhau.sendKeys("123456");
        WebElement nhan= chomeDriver.findElement(By.id("nhan"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nhan.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public  void testLoginError(ChromeDriver chomeDriver){
        chomeDriver.get("http://localhost:8080/login");
        WebElement tendangnhap=chomeDriver.findElement(By.id("iduser"));
        tendangnhap.sendKeys("thupq");

        WebElement matkhau= chomeDriver.findElement(By.id("password"));
        matkhau.sendKeys("1234");
        WebElement nhan= chomeDriver.findElement(By.id("nhan"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nhan.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /// Test Xem lịch học
    @Test
    public void TestTimKiemLichHocToanHocKy(ChromeDriver chromeDriver){
        chromeDriver.get("http://localhost:8080/lenlich");
        WebElement hocky= chromeDriver.findElement(By.id("semester"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hocky.sendKeys("Học kỳ 1 năm học 2020-2021");
        WebElement timkiem=chromeDriver.findElement(By.id("timkiem"));
        timkiem.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void TestTimKiemLichHocTheoTenMonHoc(ChromeDriver chromeDriver){
        chromeDriver.get("http://localhost:8080/lenlich");
        WebElement hocky= chromeDriver.findElement(By.id("semester"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hocky.sendKeys("Học kỳ 1 năm học 2020-2021");
        WebElement tenmonhoc= chromeDriver.findElement(By.id("tenmonhoc"));
        tenmonhoc.sendKeys("toan");
        WebElement timkiem=chromeDriver.findElement(By.id("timkiem"));
        timkiem.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void TestXoaLichHoc(ChromeDriver chromeDriver){
        chromeDriver.get("http://localhost:8080/lenlich");
        WebElement hocky= chromeDriver.findElement(By.id("semester"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hocky.sendKeys("Học kỳ 1 năm học 2020-2021");
        WebElement tenmonhoc= chromeDriver.findElement(By.id("tenmonhoc"));
        tenmonhoc.sendKeys("toan");
        WebElement timkiem=chromeDriver.findElement(By.id("timkiem"));
        timkiem.click();
        WebElement xoa = chromeDriver.findElement(By.id("xoa"));
        xoa.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       WebElement xoa2= chromeDriver.findElement(By.id("delid"));
       xoa2.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
