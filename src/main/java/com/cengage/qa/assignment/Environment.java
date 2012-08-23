package com.cengage.qa.assignment;

public interface Environment {

	public static long DEFAULT_WAIT_TIME = EnvironmentPropertyUtil.getInstance().getDefaultWaitTime();
	public static String PRODUCT_URL = EnvironmentPropertyUtil.getInstance().getUrl();
}
