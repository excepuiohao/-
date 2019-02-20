package six.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * 过滤器设置编码格式
 * 解决乱码问题
 */
@WebFilter(
        urlPatterns = "/*",
        filterName = "CharFilter",
        initParams = @WebInitParam(
                name = "encoding",
                value = "UTF-8"
        ))
public class CharFilter implements Filter {
    //初始化编码格式
    private String encoding = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //获取编码格式
        this.encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        if(encoding != null){
            //为请求，响应设置编码格式
            req.setCharacterEncoding(encoding);
            resp.setContentType("text/html;charset="+encoding);
        }
        filterChain.doFilter(req,resp);
    }

    @Override
    public void destroy() {
        encoding = null;
    }
}
