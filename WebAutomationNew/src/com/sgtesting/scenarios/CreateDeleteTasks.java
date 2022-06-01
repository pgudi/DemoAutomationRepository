package com.sgtesting.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDeleteTasks 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createCustomer();
		createProject();
		createTask();
		//deleteTask();
		deleteProject();
		deleteCustomer();
		logout();
		close();

	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","G:\\CurrentWorkSpace\\DemoAutomationRepository\\WebAutomationNew\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(" //*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeflyoutwindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Customer1 ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(1000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void createTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='item createNewTask ellipsis']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[5]/div/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create Tasks']")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[2]/tbody/tr/td[1]/div/div[1]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[@class='deleteButton']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("deleteTaskPopup_deleteConfirm_submitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void close()
	{
		try 
		{
			oBrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}





