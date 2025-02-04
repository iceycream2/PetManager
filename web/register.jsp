<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <meta charset="UTF-8">
        <title>大气后台登录html页面模板 - 代码库</title>
        <link rel="stylesheet" type="text/css" href="css/zui.css" media="all">
        <link rel="stylesheet" type="text/css" href="css/login.css" media="all">
        <link href="css/animate.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <style> body { background-image: url(images/dog.jpg);}</style>
        <script src="/js/login.js"></script>
    </head>
    <body>
    <div id="main-box"></div>
    <div id="main-content">
        <div class="login-body  animated fadeInLeft">
            <div class="login-main pr">
                <form action="/regdit" method="post" class="login-form" name="regdit">
                    <h3> 管理中心 </h3>
                    <h5 style="padding-bottom: 10px"> System Management Center </h5>
                    <!-- 账号登陆 -->
                    <div id="MobileBox" class="item-box"  >
                        <div class="input-group user-name"> <span class="input-group-addon"><i class="icon-user"></i></span>
                            <input type="text" name="username" class="form-control" placeholder="用户名/手机号">
                        </div>
                        <div class="input-group password"> <span class="input-group-addon"><i class="icon-lock"></i></span>
                            <input type="password" name="password" class="form-control" placeholder="密码">
                        </div>
                        <div class="login_btn_panel">
                            <input class=" btn btn-primary btn-block btn-lg" type="button" value="完成注册" onclick="checkRegdit()">
                            <div class="check-tips"></div>
                        </div>
                        <div class="login_btn_panel">
                            <a href="index.jsp"><input type="button" value="前往登录" class=" btn btn-primary btn-block btn-lg" data-ajax="post"  data-callback="success"></a>
                            <div class="check-tips"></div>
                        </div>
                </form>
            </div>
        </div>
    </div>
    </body>
</html>