package org.apache.struts.register.interceptor;

import java.util.Date;

import org.apache.struts.register.action.Register;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
 
public class SimpleInterceptor extends AbstractInterceptor {
 
	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation invocation) throws Exception {
       Register action = (Register)invocation.getAction();
       action.setDate(new Date());
       return invocation.invoke();
    }
}
