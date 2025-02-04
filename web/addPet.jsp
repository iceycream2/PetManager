<%--
  Created by IntelliJ IDEA.
  User: 汪飞洋同学
  Date: 2023/8/24
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head"><strong>修改宠物信息</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="/addPet">
            <div class="form-group">
                <div class="label">
                    宠物名称：
                </div>
                <div class="field">
                    <input type="text" class="input" name="p_name">
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    主人姓名：
                </div>
                <div class="field">
                    <input type="text" class="input" name="p_m_name">
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    联系方式：
                </div>
                <div class="field">
                    <input type="text" class="input" name="p_m_phone">
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    地址：
                </div>
                <div class="field">
                    <input type="text" class="input" name="p_m_address">
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    宠物种类：
                </div>
                <div class="field">
                    <input type="text" class="input" name="p_type">
                </div>
            </div>
            <div class="form-group">
                <div class="field" align="center">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
