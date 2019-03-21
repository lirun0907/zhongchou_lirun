package com.xian.userinfo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        Object userInfo=httpServletRequest.getSession().getAttribute("userInfo");
        String uri=httpServletRequest.getRequestURI();
        if(userInfo!=null){
            return true;
        }
        if(uri.indexOf("login.html")>0||uri.indexOf("checkLogin")>0||uri.indexOf("reg.html")>0){
            return true;
        }
        httpServletRequest.getRequestDispatcher("login.html").forward(httpServletRequest,httpServletResponse);
        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
