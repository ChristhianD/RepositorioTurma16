package Metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Metodos {
WebDriver driver ;

public void abrirnavegador(String  url) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver = new ChromeDriver() ;
	driver.get(url);
	driver.manage().window().maximize();
}
public void clicar(By elemento) {
	driver.findElement(elemento).click();
}

public void preencher(By elemento, String string ) {
	driver.findElement(elemento).sendKeys(string);
}

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

public void print(String pritname) throws IOException {
	TakesScreenshot srcshot = ((TakesScreenshot)driver);
	File SrcFile = srcshot.getScreenshotAs(OutputType.FILE);
	File desFile = new File(pritname);
	FileUtils.copyFile(SrcFile, desFile);
	
}
public void validartexto(By elemento, String textoesperado) {
	String texto = driver.findElement(elemento).getText();
	System.out.println(texto);
	assertEquals(textoesperado, texto);

}
private void assertEquals(String textoesperado, String texto) {
	// TODO Auto-generated method stub
	
}

public void quit() {
	if (driver != null) {
		driver.quit();
	}
}
	
}








