/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.78
 * Generated at: 2022-05-30 00:35:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.na.user.member.model.vo.Member;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.na.user.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
 	String contextPath = request.getContextPath();
	Member loginUser = (Member)session.getAttribute("loginUser");
	String alertMsg = (String)session.getAttribute("alertMsg");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <!--부트스트랩-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Pacifico&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <title>뉴올 메인페이지</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        *{\r\n");
      out.write("            font-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("        #header_3{\r\n");
      out.write("        	padding : 0px;\r\n");
      out.write("        	width: 1500px;\r\n");
      out.write("        	height : 50px;\r\n");
      out.write("        	margin : auto;\r\n");
      out.write("        }\r\n");
      out.write("		\r\n");
      out.write("		 /*오른쪽에 장바구니, 로그인 아이콘*/\r\n");
      out.write("       #icon1, #icon2{\r\n");
      out.write("           width: 1.5%;\r\n");
      out.write("           height: 1.5%;\r\n");
      out.write("           display: inline-block;\r\n");
      out.write("           float : right;\r\n");
      out.write("       }\r\n");
      out.write("       #icon1{\r\n");
      out.write("       	margin-right : 10px;\r\n");
      out.write("       }\r\n");
      out.write("       #icon2{\r\n");
      out.write("       	margin-right : 40px;\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("       #cart_icon>img, #login_icon>img{\r\n");
      out.write("           width: 40px;\r\n");
      out.write("           height: 40px;\r\n");
      out.write("           float: right;\r\n");
      out.write("           margin-right : 33px;\r\n");
      out.write("       }\r\n");
      out.write("    \r\n");
      out.write("       #icon2>ul{\r\n");
      out.write("		  list-style: none;\r\n");
      out.write("		  margin : 0px;\r\n");
      out.write("		  padding : 0px;\r\n");
      out.write("		  width: 100px;\r\n");
      out.write("		  display : none;\r\n");
      out.write("	   }\r\n");
      out.write("       #icon2 li{\r\n");
      out.write("       	  float : left;\r\n");
      out.write("       	  width : 100px;\r\n");
      out.write("       }\r\n");
      out.write("       #icon2>ul>li>a{\r\n");
      out.write("       	  text-align: center;\r\n");
      out.write("       	  display : inline-block;\r\n");
      out.write("       	  text-decoration: none;\r\n");
      out.write("       	  width : 90%;\r\n");
      out.write("       	  border : 4px solid white;\r\n");
      out.write("       	  font-size : 15px; \r\n");
      out.write("       	  padding : 0px;\r\n");
      out.write("       	  background-color : rgba(24,189,234, 0.5);\r\n");
      out.write("       	  line-height: 25px;\r\n");
      out.write("          font-weight: 5px;\r\n");
      out.write("          color: white;\r\n");
      out.write("          border-radius: 10px;\r\n");
      out.write("       }\r\n");
      out.write("       	\r\n");
      out.write("       #icon2>#login_icon:hover+#login_ul{\r\n");
      out.write("           display: block;\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("       #icon2>ul:hover{\r\n");
      out.write("           display: block;\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("       #icon2>ul>li>a:hover{\r\n");
      out.write("           background-color : rgba(24,189,234, 0.9);\r\n");
      out.write("           color : navy;\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("       .fakeimg {\r\n");
      out.write("          height: 200px;\r\n");
      out.write("          background: #aaa;\r\n");
      out.write("        }\r\n");
      out.write("        #title{\r\n");
      out.write("            background-color: white;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar-brand{\r\n");
      out.write("            color: white;\r\n");
      out.write("            float: none;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            font-weight: bolder;\r\n");
      out.write("        }\r\n");
      out.write("        /* Bootstrap Navigation Overriding by Readiz */\r\n");
      out.write("        .navbar-default { \r\n");
      out.write("            background-color: rgba(24,189,234, 0.5);\r\n");
      out.write("            width: 1500px;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            height : 50px;\r\n");
      out.write("            line-height : 35px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("       	\r\n");
      out.write("        #l1{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            margin-left: 400px;\r\n");
      out.write("            margin-right: 60px;\r\n");
      out.write("        }\r\n");
      out.write("        #l2, #l3, #l4{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            margin-left: 60px;\r\n");
      out.write("            margin-right: 60px;\r\n");
      out.write("        } \r\n");
      out.write("        .fakeimg>#p1, .fakeimg>#p2, .fakeimg>#p3{\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            width: 150px;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        #p1>a{\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #p2>a{\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 70px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #p3>a{\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 120px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #p1 img, #p2 img, #p3 img{\r\n");
      out.write("            width: 250px;\r\n");
      out.write("            height: 200px;\r\n");
      out.write("        }\r\n");
      out.write("        #m1{\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 80px;\r\n");
      out.write("            margin: 0px;\r\n");
      out.write("            padding: 0px;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("        #m2{\r\n");
      out.write("            width: 530px;\r\n");
      out.write("            height: 120px;\r\n");
      out.write("            margin: 0px;\r\n");
      out.write("            padding: 0px;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("        #m3{\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            height : 200px;\r\n");
      out.write("        }\r\n");
      out.write("	      #footer>table{\r\n");
      out.write("		     width:1500px;\r\n");
      out.write("		     margin: auto;\r\n");
      out.write("		     margin-top: 100px;\r\n");
      out.write("		     height : 100px;\r\n");
      out.write("		  }\r\n");
      out.write("	      #ft1 {\r\n");
      out.write("	          float: left;\r\n");
      out.write("	          margin-right: 320px;\r\n");
      out.write("	      }\r\n");
      out.write("	      #ft1>a{\r\n");
      out.write("	        padding: 0px;\r\n");
      out.write("	        margin: 0px;\r\n");
      out.write("	      }\r\n");
      out.write("	      #ft2 {\r\n");
      out.write("	        float: right; \r\n");
      out.write("	      }\r\n");
      out.write("	      #ft3 {\r\n");
      out.write("	          font-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("	          float: left;\r\n");
      out.write("	          margin-left : 25px;\r\n");
      out.write("	          font-size: 15px;\r\n");
      out.write("	          text-align : left;\r\n");
      out.write("	      }\r\n");
      out.write("	      #ft4 {\r\n");
      out.write("	         font-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("	          font-size: 15px;\r\n");
      out.write("	          text-align: right;\r\n");
      out.write("	          float: right; \r\n");
      out.write("	          margin-left: auto;\r\n");
      out.write("	          margin-right : 25px;\r\n");
      out.write("	      }\r\n");
      out.write("	      #ft1>a, #ft2>a {\r\n");
      out.write("	        font-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("	          text-decoration: none;\r\n");
      out.write("	          color: black;\r\n");
      out.write("	          font-size: 150%;\r\n");
      out.write("	          font-weight: 600;\r\n");
      out.write("	          margin-top : 15px;\r\n");
      out.write("	    	  margin-right : 25px;\r\n");
      out.write("	    	  margin-left : 25px;\r\n");
      out.write("	          vertical-align: middle; \r\n");
      out.write("	      }\r\n");
      out.write("	\r\n");
      out.write("	      #ft5{\r\n");
      out.write("	        font-size: 13px;\r\n");
      out.write("	        font-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("	        color: rgba(73, 71, 71, 0.5);\r\n");
      out.write("	      	padding-right : 25px;\r\n");
      out.write("	        text-align: right;\r\n");
      out.write("	      }\r\n");
      out.write("	      \r\n");
      out.write("	      .a:hover {\r\n");
      out.write("	        cursor : pointer;\r\n");
      out.write("	        background-color: rgba(24,189,234, 0.5);\r\n");
      out.write("	        color: white;\r\n");
      out.write("	        text-decoration:none; \r\n");
      out.write("	      }\r\n");
      out.write("	      .b:hover{\r\n");
      out.write("	        cursor : pointer;\r\n");
      out.write("\r\n");
      out.write("	        color: white;\r\n");
      out.write("	        text-decoration:none; \r\n");
      out.write("	      \r\n");
      out.write("	      }\r\n");
      out.write("		  \r\n");
      out.write("		  \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		var msg = \"");
      out.print(alertMsg);
      out.write("\"; // \"성공적으로 로그인이 되었습니다.\" / \"null\"\r\n");
      out.write("		if(msg != \"null\") {\r\n");
      out.write("			alert(msg);\r\n");
      out.write("			// 알림창 띄우며 해당 세션의 해당 키-밸류를 지워줘야 연속해서 안뜬다.\r\n");
      out.write("			");
 session.removeAttribute("alertMsg"); 
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("    <div class=\"jumbotron text-center\" style=\"margin-bottom:0;\" id=\"title\">\r\n");
      out.write("     <div id=\"header_3\">\r\n");
      out.write("               <div id=\"icon1\">\r\n");
      out.write("                    <a id=\"cart_icon\" href=\"");
      out.print(contextPath );
      out.write("/mainMycart.my\" target=\"\" title=\"장바구니\">\r\n");
      out.write("                      <img src=\"/na/resources/image/장바구니.png\">\r\n");
      out.write("                     </a>\r\n");
      out.write("                   </div>        \r\n");
      out.write("                <div id=\"icon2\" style=\"width : 100px; \">\r\n");
      out.write("             \r\n");
      out.write("                ");
 if (loginUser == null ){ 
      out.write(" <!-- 로그인 전 -->\r\n");
      out.write("                    <a id=\"login_icon\" href=\"/na/beforeLog.me\" title=\"로그인\">\r\n");
      out.write("                    	<img src=\"/na/resources/image/로그인.png\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                   \r\n");
      out.write("                   ");
 } else  {
      out.write(" \r\n");
      out.write("                    <span id=\"login_icon\" href=\"\" title=\"로그인\"> \r\n");
      out.write("                    	<img src=\"/na/resources/image/로그인.png\">\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <ul id=\"login_ul\">\r\n");
      out.write("                    	<li><a href=\"/na/beforinfo.my\" id=\"mypage\">마이페이지</a></li>\r\n");
      out.write("                    	<li><a href=\"/na/logout.me\" id=\"logout\">로그아웃</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("               <div id=\"icon3\"></div>\r\n");
      out.write("           </div>\r\n");
      out.write("           <br clear=\"both\">\r\n");
      out.write("        <a href=\"\" target=\"_self\">\r\n");
      out.write("            <img src=\"/na/resources/image/상호이미지.png\" id=\"logo\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <em style=\"display : block; font-family: 'Pacifico', cursive; color: rgba(24,189,234, 0.7); font-size: 20px;\" >\r\n");
      out.write("            Your, Your healthy, with Nutrients Almighty\r\n");
      out.write("        </em>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <nav class=\"navbar-default\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"");
      out.print(contextPath);
      out.write("/proList.pr?currentPage=1\" id=\"l1\">제품보기</a>\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"");
      out.print(contextPath);
      out.write("/list.mg?currentPage=1\" id=\"l2\">건강매거진</a>\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"");
      out.print(contextPath);
      out.write("/reviewlist.re?currentPage=1\" id=\"l3\">고객후기</a>\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"");
      out.print(contextPath);
      out.write("/noticeList.no?currentPage=1\" id=\"l4\">고객센터\r\n");
      out.write("        </a>\r\n");
      out.write("      </nav>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"container\" style=\"margin-top:30px;\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-sm-8\" style=\"margin-top : 50px\">\r\n");
      out.write("            <h2></h2>\r\n");
      out.write("            <h2 style=\"text-align: center; color :rgba(18, 137, 170, 0.9);font-weight: bold;\">이달의 BEST3 영양제</h2><br>\r\n");
      out.write("            <div class=\"fakeimg\" style=\"background-color: rgba(236, 250, 250, 0.0); border-radius: 10px;\">\r\n");
      out.write("                <div id=\"p1\">\r\n");
      out.write("                    <a href=\"/na/proDetail.pr?pno=8\"><img src=\"/na/resources/image/오메가1.png\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"p2\">\r\n");
      out.write("                    <a href=\"/na/proDetail.pr?pno=10\"><img src=\"/na/resources/image/유산균1.png\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"p3\">\r\n");
      out.write("                    <a href=\"/na/proDetail.pr?pno=2\"><img src=\"/na/resources/image/비타민1.png\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p style=\"padding : 0px; margin : 0px; text-align: center; display: inline-block; float: left; margin-left: 90px; font-weight: bold;\">Best1.<br> 혈행개선/눈 건강<br>[뉴올 오메가3]</ps>\r\n");
      out.write("                <p style=\"padding : 0px; margin : 0px; text-align: center; display: inline-block; float: left; margin-left: 80px; font-weight: bold;\">Best2.<br> 장과 원활한 배변활동<br>[뉴올 프로바이오틱스]</p>\r\n");
      out.write("                <p style=\"padding : 0px; margin : 0px; text-align: center; display: inline-block; float: left; margin-left: 80px; font-weight: bold;\">Best3.<br> 에너지 충전을 위한<br>[뉴올 비타민B]</p>\r\n");
      out.write("            <br clear=\"both\"><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <h2 style=\"text-align: center; color :rgba(18, 137, 170, 0.9); font-weight: bold;\">건강 Magazine</h2><br>\r\n");
      out.write("            <div class=\"fakeimg\" style=\"margin-top: 30px; background-color: rgba(220, 219, 219, 0.2); border-radius: 10px;\" >\r\n");
      out.write("                <div id=\"m1\">\r\n");
      out.write("                    <h5 style=\"width: 90%; height: 50%; padding: 0px; margin: 0px; text-align: left; margin-top: 20px; margin-left : 10px\">[여름이면 찾아오는 장건강 지킴이]</h5>\r\n");
      out.write("                    <p style=\"width : 90%; height : 20%; text-align: left; margin-left : 10px\">\r\n");
      out.write("                        <a href=\"\" style=\"text-decoration: none; color: black; \">제2의 뇌 ‘장’이 건강하지 않다는 신호는?</a>\r\n");
      out.write("                   </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"m2\" style=\" font-size: 14px; text-align: left; margin-left : 10px\">\r\n");
      out.write("                    <a href=\"/na/detail.mg?mno=115\" style=\"text-decoration: none; color: black;\">\r\n");
      out.write("                        <p>장과 뇌는 연결돼 있다는 점에서 정신 건강도 영향을 받는다. \r\n");
      out.write("                        	뇌와 심장은 뇌간에서 복부로 이어지는 미주신경에 의해 연결돼 있고 이 신경이 뇌와 장 사이에 신호를 보내는 역할을 한다. <br><br>\r\n");
      out.write("                        	그렇다면 장 건강이 안 좋을 땐 어떤 신호들이 나타날까?\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"m3\">\r\n");
      out.write("                    <a href=\"/na/detail.mg?mno=115\"><img src=\"/na/resources/image/ma1.JPG\" style=\"width : 180px; height : 160px; border-radius: 10px; margin-top:20px;\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"wrap\" style=\"float:right;text-align:center;\">\r\n");
      out.write("            <h3 style=\"text-align: center; color :rgba(3, 50, 63, 0.7); font-weight: bold;\">뉴올 Best 후기3</h3>\r\n");
      out.write("            <p style=\"text-align: center;\">뉴올 회원의 생생한 후기를 확인해보세요.</p>\r\n");
      out.write("            <ul class=\"nav nav-pills flex-column\">\r\n");
      out.write("            <li class=\"a active\" style=\"height : 60px; padding-top : 20px;\">\r\n");
      out.write("                <a class=\"b\" href=\"");
      out.print( contextPath);
      out.write("/reviewDetail.re?rno=324\" style=\"margin:auto; font-size:17px; padding-top:20px\"> NO15. 오메가3를 먹은 이후로  </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"a\" style=\"height : 60px;  padding-top : 20px;\">\r\n");
      out.write("                <a class=\"b\" href=\"");
      out.print( contextPath);
      out.write("/reviewDetail.re?rno=346\" style=\"margin:auto; font-size:17px;\"> NO37. 쾌변엔 프로바이오틱스!! </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"a\" style=\"height : 60px; padding-top : 20px;\">\r\n");
      out.write("                <a class=\"b\" href=\"");
      out.print( contextPath);
      out.write("/reviewDetail.re?rno=330\" style=\"margin:auto; font-size:17px;\"> NO21. 비타민B 먹고 천리안 됐어요  </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <h5 style=\"text-align: center; color :rgba(3, 50, 63, 0.7); font-weight: bold;\">뉴올 영양제 FAQ</h3>\r\n");
      out.write("            <div class=\"fakeimg\">\r\n");
      out.write("                <a href=\"/na/detail.fa?fno=6\"><img class=\"slide1\" src=\"/na/resources/image/main_img1.jpg\" style=\"width : 100%; height : 100%;\"></a>\r\n");
      out.write("                <a href=\"/na/detail.fa?fno=7\"><img class=\"slide1\" src=\"/na/resources/image/main_img2.jpg\" style=\"width : 100%; height : 100%;\"></a>\r\n");
      out.write("                <a href=\"/na/detail.fa?fno=8\"><img class=\"slide1\" src=\"/na/resources/image/main_img3.jpg\" style=\"width : 100%; height : 100%;\"></a>\r\n");
      out.write("                <a href=\"/na/detail.fa?fno=9\"><img class=\"slide1\" src=\"/na/resources/image/main_img4.jpg\" style=\"wid	th : 100%; height : 100%;\"></a>\r\n");
      out.write("                <a href=\"/na/detail.fa?fno=10\"><img class=\"slide1\" src=\"/na/resources/image/main_img5.jpg\" style=\"width : 100%; height : 100%;\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("            <h5 style=\"text-align: center; margin-bottom: 30px; color :rgba(3, 50, 63, 0.7); font-weight: bold;\">뉴올과 함께하는 영양학</h5>\r\n");
      out.write("            <div class=\"fakeimg\" style=\"display: inline-block; float : left;\">\r\n");
      out.write("                <iframe width=\"350\" height=\"250\" src=\"https://www.youtube.com/embed/Nir0jXIABoQ\" title=\"YouTube video player\" frameborder=\"0\" \r\n");
      out.write("                allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <br clear=\"both\">\r\n");
      out.write("            <hr class=\"d-sm-none\">\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("		\r\n");
      out.write("		  <div id=\"footer\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><hr style=\"border: solid 0.5px rgba(195, 197, 198, 0.7); width : 97%\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td id=\"ft1\">\r\n");
      out.write("                   <a href=\"/na/contract.in\" >이용약관</a>  |\r\n");
      out.write("                   <a href=\"/na/contract.in\" >개인정보취급방침</a>  \r\n");
      out.write("                </td>\r\n");
      out.write("                <td id=\"ft2\">\r\n");
      out.write("                   <a href=\"/na/noticeList.no?currentPage=1\">고객센터</a>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("           <tr>\r\n");
      out.write("               <td>&nbsp;</td>\r\n");
      out.write("           </tr>\r\n");
      out.write("           <tr>\r\n");
      out.write("               <td id=\"ft3\">\r\n");
      out.write("                   (주)건강이내게5조 <br>\r\n");
      out.write("                   	사업자번호: 768-34-333445 <br>대표 : 한세인  <br>\r\n");
      out.write("                   	주소 : 서울특별시 영등포구 당산동 <br>\r\n");
      out.write("                  	 유통판매신고 : 제 2333-330000 <br>\r\n");
      out.write("               </td>\r\n");
      out.write("               <td id=\"ft4\">\r\n");
      out.write("                  	고객센터: sein151@naver.com <br>\r\n");
      out.write("                  	전화 : 02-1588-3333 <br>\r\n");
      out.write("                  	상담시간 : 평일 10:00 ~18:00 (점심시간 : 12:00~13:00) <br>\r\n");
      out.write("                  	비지니스 문의 : sein151@naver.com\r\n");
      out.write("               </td>\r\n");
      out.write("           </tr>\r\n");
      out.write("           <tr>\r\n");
      out.write("               <td id=\"ft5\">\r\n");
      out.write("                    @content by all right\r\n");
      out.write("               </td>\r\n");
      out.write("           </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <br><br>\r\n");
      out.write("       </div>\r\n");
      out.write("      \r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("    var index = 0;   //이미지에 접근하는 인덱스\r\n");
      out.write("    window.onload = function(){\r\n");
      out.write("        slideShow();\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function slideShow() {\r\n");
      out.write("    var i;\r\n");
      out.write("    var x = document.getElementsByClassName(\"slide1\");  //slide1에 대한 dom 참조\r\n");
      out.write("    for (i = 0; i < x.length; i++) {\r\n");
      out.write("       x[i].style.display = \"none\";   //처음에 전부 display를 none으로 한다.\r\n");
      out.write("    }\r\n");
      out.write("    index++;\r\n");
      out.write("    if (index > x.length) {\r\n");
      out.write("        index = 1;  //인덱스가 초과되면 1로 변경\r\n");
      out.write("    }   \r\n");
      out.write("    x[index-1].style.display = \"block\";  //해당 인덱스는 block으로\r\n");
      out.write("    setTimeout(slideShow, 5000);   //함수를 4초마다 호출\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
      out.write("<br><br><br><br><br>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
}
