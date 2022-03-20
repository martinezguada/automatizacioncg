import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
    	
    	//Inicializa ChromeDriver y JsExecutor para realizar scroll
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.consultoriaglobal.com.ar/");
		System.out.println("Ingresa a la página de Consultoría Global");
		
		WebElement contacto = driver.findElement(By.xpath("//*[@id='menu-item-1364']/a"));
		contacto.click();
		System.out.println("Selecciona Contacto");
		
		WebElement nombre = driver.findElement(By.xpath("//*[@id='wpcf7-f1297-p370-o1']/form/p[1]/span/input"));
		WebElement mail = driver.findElement(By.xpath("//*[@id='wpcf7-f1297-p370-o1']/form/p[2]/span/input"));
		WebElement asunto = driver.findElement(By.xpath("//*[@id='wpcf7-f1297-p370-o1']/form/p[3]/span/input"));
		WebElement mensaje = driver.findElement(By.xpath("//*[@id='wpcf7-f1297-p370-o1']/form/p[4]/span/textarea"));
		
		nombre.sendKeys("Guadalupe Martinez");
		mail.sendKeys("ERROR");
		asunto.sendKeys("Prueba");
		mensaje.sendKeys("Prueba para automatizar");
		System.out.println("Completa inputs");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id='wpcf7-f1297-p370-o1']/form/p[7]/input"));
		submit.click();
		System.out.println("Clickea enviar");
		
	
	}

}
