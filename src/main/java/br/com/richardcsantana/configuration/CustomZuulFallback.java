package br.com.richardcsantana.configuration;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.client.ClientHttpResponse;

/**
 * @author richard.santana
 */
public class CustomZullFallback implements ZuulFallbackProvider {

    @Override
    public String getRoute() {
        return null;
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        return null;
    }
}
