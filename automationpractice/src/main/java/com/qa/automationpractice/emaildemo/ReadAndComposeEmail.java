package com.qa.automationpractice.emaildemo;

import java.util.List;

import org.testng.annotations.Test;

import com.automationpractice.framework.TestBase;
import com.rkreja.Gmail;

public class ReadAndComposeEmail extends TestBase{
	
	
	
	
	@Test
	public void login() {
		ui.openURL("http://www.timeandtraining.net");
		
		Gmail gmail = new Gmail("timentrainingstudent@gmail.com", "time&training");
//		boolean result=gmail.check_todays_email_in_inbox("timentrainingstudent@gmail.com", "Hello", "Test");
//		System.out.println(result);
//		String emailMg=gmail.get_most_recent_email();
//		System.out.println(emailMg);
		gmail.ComposeEmail("timentrainingstudent@gmail.com", "Hello2", "my test message");
		List<String> urls=gmail.get_link_from_email("timentrainingstudent@gmail.com");
		ui.openURL(urls.get(0));
		
//		EmailClient emailClient  =new EmailClient(emailAddress, uid, password, incomingServer, outgoingServer, outgoingPort);

		
		
		
	}
	
	

}
