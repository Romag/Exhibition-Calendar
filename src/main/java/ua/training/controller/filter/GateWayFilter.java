package ua.training.controller.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(urlPatterns= {"/*"})
public class GateWayFilter implements Filter{
	String code;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		code = filterConfig.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String requestCode = request.getCharacterEncoding();
		if(code != null) {
			request.setCharacterEncoding(code);
			response.setCharacterEncoding(code);
		}
		
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		
	}




}
