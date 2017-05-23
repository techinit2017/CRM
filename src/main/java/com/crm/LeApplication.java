package com.crm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeApplication {

	private String str;

	public void setStr(String str) {

		this.str = str;
		System.out.println(this.str);
	}

	public static void main(String[] args) {
		SpringApplication.run(LeApplication.class, args);

	}
}
