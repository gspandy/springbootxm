package com.itopener.tools.zuul.route.admin.config.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="spring.zuul.route.admin.redis")
public class ZuulRouteRedisProperties {

	private String namespace = "zuul_route_config";

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}
	
}
