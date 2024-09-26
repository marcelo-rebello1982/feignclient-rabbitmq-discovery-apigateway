package br.com.cadastroit.security.config.security;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.util.matcher.RequestMatcher;

public class RestUrlAuthFilter extends AbstractRestAuthFilter{
    public RestUrlAuthFilter(RequestMatcher requiresAuthRequestMatcher) {
        super(requiresAuthRequestMatcher);
    }

    @Override
    protected String getPassword(HttpServletRequest request) {
        return request.getHeader("uuid");
    }

    @Override
    protected String getUsername(HttpServletRequest request) {
        return request.getParameter("key");
    }
}
