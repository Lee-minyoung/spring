/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.41
 * Generated at: 2025-05-29 06:19:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1748312834425L));
    _jspx_dependants.put("jar:file:/C:/eGovFrameDev-4.3.0-64bit/workspace-egov/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springTemplate/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c-1_2.tld", Long.valueOf(1664421078000L));
    _jspx_dependants.put("/WEB-INF/views/includes/footer.jsp", Long.valueOf(1748482473904L));
    _jspx_dependants.put("jar:file:/C:/eGovFrameDev-4.3.0-64bit/workspace-egov/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springTemplate/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/fmt-1_1.tld", Long.valueOf(1664421078000L));
    _jspx_dependants.put("/WEB-INF/views/includes/header.jsp", Long.valueOf(1748482394660L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.1.js\"\r\n");
      out.write("	integrity=\"sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\r\n");
      out.write("			<div class=\"container-fluid\">\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n");
      out.write("				<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("					data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("					aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("					aria-label=\"Toggle navigation\">\r\n");
      out.write("					<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("				<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("					<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("							aria-current=\"page\" href=\"#\">Home</a></li>\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Link</a></li>\r\n");
      out.write("						<li class=\"nav-item dropdown\"><a\r\n");
      out.write("							class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\"\r\n");
      out.write("							data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Dropdown </a>\r\n");
      out.write("							<ul class=\"dropdown-menu\">\r\n");
      out.write("								<li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n");
      out.write("								<li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("								<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("								<li><a class=\"dropdown-item\" href=\"#\">Something else\r\n");
      out.write("										here</a></li>\r\n");
      out.write("							</ul></li>\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link disabled\"\r\n");
      out.write("							aria-disabled=\"true\">Disabled</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("					<form class=\"d-flex\" role=\"search\">\r\n");
      out.write("						<input class=\"form-control me-2\" type=\"search\"\r\n");
      out.write("							placeholder=\"Search\" aria-label=\"Search\" />\r\n");
      out.write("						<button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("  <div class=\"col-lg-12\">\r\n");
      out.write("    <h1 class=\"page-header\">Board Modify</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.col-lg-12 -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("  <div class=\"col-lg-12\">\r\n");
      out.write("    <div class=\"panel panel-default\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"panel-heading\">Board Modify</div>\r\n");
      out.write("      <!-- /.panel-heading -->\r\n");
      out.write("      <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("      <form role=\"form\" action='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("' method=\"post\">\r\n");
      out.write("      <input type=\"hidden\" name=\"bno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label>Title</label> \r\n");
      out.write("  <input class=\"form-control\" name='title' \r\n");
      out.write("    value='");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("' >\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label>Text area</label>\r\n");
      out.write("  <textarea class=\"form-control\" rows=\"3\" name='content' >");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("</textarea>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label>Writer</label> \r\n");
      out.write("  <input class=\"form-control\" name='writer'\r\n");
      out.write("    value='");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("' readonly=\"readonly\">            \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label>RegDate</label> \r\n");
      out.write("  <input class=\"form-control\" name='regDate'\r\n");
      out.write("    value='");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("'  readonly=\"readonly\">            \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("  <label>Update Date</label> \r\n");
      out.write("  <input class=\"form-control\" name='updateDate'\r\n");
      out.write("    value='");
      if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_page_context))
        return;
      out.write("'  readonly=\"readonly\">            \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("  <button type=\"submit\" class=\"btn btn-default\">Modify</button>\r\n");
      out.write("  <button type=\"reset\" class=\"btn btn-danger\">Reset</button>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--  end panel-body -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--  end panel-body -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- end panel -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	  var formObj = $(\"form\");\r\n");
      out.write("\r\n");
      out.write("	  $('button').on(\"click\", function(e){\r\n");
      out.write("	    \r\n");
      out.write("	    e.preventDefault(); \r\n");
      out.write("	    \r\n");
      out.write("	    var operation = $(this).data(\"oper\");\r\n");
      out.write("	    \r\n");
      out.write("	    console.log(operation);\r\n");
      out.write("	    \r\n");
      out.write("	    if(operation === 'remove'){\r\n");
      out.write("	      formObj.attr(\"action\", \"/board/remove\");\r\n");
      out.write("	      \r\n");
      out.write("	    }else if(operation === 'list'){\r\n");
      out.write("	      //move to list\r\n");
      out.write("	      formObj.attr(\"action\", \"/board/list\").attr(\"method\",\"get\");\r\n");
      out.write("	      \r\n");
      out.write("	      var pageNumTag = $(\"input[name='pageNum']\").clone();\r\n");
      out.write("	      var amountTag = $(\"input[name='amount']\").clone();\r\n");
      out.write("	      var keywordTag = $(\"input[name='keyword']\").clone();\r\n");
      out.write("	      var typeTag = $(\"input[name='type']\").clone();      \r\n");
      out.write("	      \r\n");
      out.write("	      formObj.empty();\r\n");
      out.write("	      \r\n");
      out.write("	      formObj.append(pageNumTag);\r\n");
      out.write("	      formObj.append(amountTag);\r\n");
      out.write("	      formObj.append(keywordTag);\r\n");
      out.write("	      formObj.append(typeTag);	       \r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    formObj.submit();\r\n");
      out.write("	  });\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("<script	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/board/modify.jsp(23,32) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/board/modify");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/views/board/modify.jsp(29,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.title }", java.lang.Object.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent(null);
    // /WEB-INF/views/board/modify.jsp(34,58) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.content}", java.lang.Object.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent(null);
    // /WEB-INF/views/board/modify.jsp(40,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.writer}", java.lang.Object.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    // /WEB-INF/views/board/modify.jsp(46,11) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy/MM/dd");
    // /WEB-INF/views/board/modify.jsp(46,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.regdate}", java.util.Date.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent(null);
    // /WEB-INF/views/board/modify.jsp(52,11) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setPattern("yyyy/MM/dd");
    // /WEB-INF/views/board/modify.jsp(52,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.updateDate}", java.util.Date.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
    return false;
  }
}
