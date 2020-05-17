package com.gts.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cas",ignoreUnknownFields = false)
public class CasClientConfigurationProperties {
    private String serverUrlPrefix;

    private String serverLoginUrl;

    private String clientHostUrl;

    private String ignorePattern;

    private String ignoreUrlPatternType;

    public String getServerUrlPrefix() {
        return serverUrlPrefix;
    }

    public void setServerUrlPrefix(String serverUrlPrefix) {
        this.serverUrlPrefix = serverUrlPrefix;
    }

    public String getServerLoginUrl() {
        return serverLoginUrl;
    }

    public void setServerLoginUrl(String serverLoginUrl) {
        this.serverLoginUrl = serverLoginUrl;
    }

    public String getClientHostUrl() {
        return clientHostUrl;
    }

    public void setClientHostUrl(String clientHostUrl) {
        this.clientHostUrl = clientHostUrl;
    }

    public String getIgnorePattern() {
        return ignorePattern;
    }

    public void setIgnorePattern(String ignorePattern) {
        this.ignorePattern = ignorePattern;
    }

    public String getIgnoreUrlPatternType() {
        return ignoreUrlPatternType;
    }

    public void setIgnoreUrlPatternType(String ignoreUrlPatternType) {
        this.ignoreUrlPatternType = ignoreUrlPatternType;
    }
}
