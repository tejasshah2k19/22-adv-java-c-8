package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {
	public static int userCounter = 0;

	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		userCounter++;
		System.out.println("in => " + userCounter);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		userCounter--;
		System.out.println("out => " + userCounter);
	}
}
