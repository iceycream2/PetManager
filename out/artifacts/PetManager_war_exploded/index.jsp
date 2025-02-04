<%--
  Created by IntelliJ IDEA.
  User: 汪飞洋同学
  Date: 2023/8/20
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta charset="UTF-8">
    <title>宠物管理平台</title>
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
        <form action="/login" method="post" class="login-form">
          <h3> 宠物管理系统 </h3>
          <h5 style="padding-bottom: 10px"> Welcome To Pet Management System </h5>
          <!-- 账号登陆 -->
          <div id="MobileBox" class="item-box"  >
            <div class="input-group user-name"> <span class="input-group-addon"><i class="icon-user"></i></span>
              <input type="text" name="username" class="form-control" placeholder="用户名">
            </div>
            <div class="input-group password"> <span class="input-group-addon"><i class="icon-lock"></i></span>
              <input type="password" name="password" class="form-control" placeholder="密码">
            </div>
            <div class="login_btn_panel">
              <a href="register.jsp"><input type="button" value="注册" class=" btn btn-primary btn-block btn-lg" data-ajax="post"  data-callback="success"></a>
              <div class="check-tips"></div>
            </div>
            <div class="login_btn_panel">
              <button class=" btn btn-primary btn-block btn-lg" data-ajax="post" type="submit" data-callback="success" onclick="checkLogin()">登录</button>
              <div class="check-tips"></div>
            </div>
        </form>
      </div>
    </div>
  </div>
  </body>
</html>
