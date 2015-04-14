package org.anaguma;

import org.anaguma.controller.IndexController;
import org.springframework.boot.SpringApplication;

/**
 * Application end point
 */
public class App
{
	public static void main(String[] arguments) {
		SpringApplication.run(IndexController.class, arguments);
	}
}
