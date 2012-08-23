package com.cengage.qa.assignment;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

public class EnvironmentPropertyUtil {

	private static EnvironmentPropertyUtil singleton = new EnvironmentPropertyUtil();

	private String environment;
	private String url;
	private String defaultPageWaitTime;
	
	public EnvironmentPropertyUtil() {
		determineEnvironment();
		getPropertySettings();
	}

	private void getPropertySettings() {
		String propertyFile = String.format("/%s-environment.properties", environment);
		InputStream inputStream = EnvironmentPropertyUtil.class.getResourceAsStream(propertyFile);
		Properties props = new Properties();
		try {
			props.load(inputStream);
			readPropertyFile(props);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private void readPropertyFile(Properties props) {
		url = props.getProperty("app.url");
		defaultPageWaitTime = props.getProperty("default.page.wait.time.ms");
	}
	
	private void determineEnvironment() {
		System.setProperty("env","dev");
		String setting = System.getProperty("env");
		environment = StringUtils.isEmpty(setting) ? "dev" : setting;
	}
	
	
	public String getUrl() {
		return url;
	}
	
	public long getDefaultWaitTime() {
		return Long.parseLong(defaultPageWaitTime);
	}
	
	public static EnvironmentPropertyUtil getInstance() {
		return singleton;
	}


}
