package com.springin28mins.springBoot.web_app_01.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello, sup today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page - Changed </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML Page - Changed");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
//	@ResponseBody
	public String sayHelloJsp() {
		return "sayHello";
	}
}
