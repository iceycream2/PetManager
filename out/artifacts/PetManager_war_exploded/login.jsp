<%--
  Created by IntelliJ IDEA.
  User: 汪飞洋同学
  Date: 2023/8/23
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>宠物管理系统</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
</head>
<body>
<div class="header bg-main">
    <div class="logo margin-big-left fadein-top">
        <h1><img src="images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />宠物后台管理中心</h1>
    </div>
    <div class="head-l"><a class="button button-little bg-red" href="/index.jsp"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
    <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
    <h2><span class="icon-user"></span>基本设置</h2>
    <ul style="display: block">
        <li><a href="home.jsp" target="right"><span class="icon-caret-right"></span>网站首页</a></li>
        <li><a href="/petList" target="right"><span class="icon-caret-right"></span>宠物管理</a></li>
        <li><a href="/typeList" target="right"><span class="icon-caret-right"></span>种类管理</a></li>
    </ul>
</div>
<ul class="bread">
    <li><a href="home.jsp" target="right" class="icon-home"> 首页</a></li>
    <li><marquee>感谢您使用宠物管理系统！</marquee></li>
</ul>
<div class="admin">
    <iframe scrolling="auto" rameborder="0" src="home.jsp" name="right" width="100%" height="100%"></iframe>
</div>
</body>
</html>
