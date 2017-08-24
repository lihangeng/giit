package filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.apache.shiro.web.util.WebUtils;

public class FormLoginFilter extends PathMatchingFilter{
	
	private static final String LOGIN_URL = "/login";
//	private static final String SUCCESS_URL = "/";
	private static final String POST = "post";
	
	/**
	 * 
	 */
	@Override
	protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {

		//判断是否登录
		if(SecurityUtils.getSubject().isAuthenticated()) {
			return true;
		}
		
		HttpServletRequest rep = (HttpServletRequest)request;
//		HttpServletResponse resp = (HttpServletResponse)response;
		if(isLoginRequest(rep)) {
			if((rep.getMethod()).equalsIgnoreCase(POST)) {
				boolean loginflag = login(rep);
				if(loginflag) {
					return true;
				}
			}
		}	
		return true;
	}
	
//	private boolean redirectToSuccessUrl(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        WebUtils.redirectToSavedRequest(req, resp, SUCCESS_URL);
//        return false;
//    }

//    private void saveRequestAndRedirectToLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        WebUtils.saveRequest(req);
//        WebUtils.issueRedirect(req, resp, LOGIN_URL);
//    }
    /**
     * 判断登录状态
     * @param rep
     * @return
     */
	public boolean login(HttpServletRequest rep) {
		String username = rep.getParameter("username");
		String password = rep.getParameter("password");
		try {
			SecurityUtils.getSubject().login(new UsernamePasswordToken(username, password));
		}catch(Exception e) {
			rep.setAttribute("shiroLoginFailure", e.getClass().getName());
			return false;
		}
		
		return true;
	}
	/**
	 * 判断是否是登录的url
	 * @param rep
	 * @return
	 */
	public boolean isLoginRequest(HttpServletRequest rep) {
		return pathsMatch(LOGIN_URL,WebUtils.getPathWithinApplication(rep));
	}
	

}
