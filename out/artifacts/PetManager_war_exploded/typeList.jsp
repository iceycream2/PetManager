<%--
  Created by IntelliJ IDEA.
  User: 汪飞洋同学
  Date: 2023/8/25
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>宠物管理界面</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script>
        function deleteType(id){
            if(confirm("您确定要删除这条数据吗?")){
                location.href="/deleteType?id="+id;
            }else {
                return false;
            }
        }
    </script>
</head>
<body>
<form method="post" action="">
    <div class="panel admin-panel">
        <div class="panel-head">
            <strong class="icon-reorder"> 宠物种类管理</strong>
            <a><input type="button" onclick="location.href='addType.jsp'" value="新增" style="height:23px; width:40px; border:solid 1px #99cccc; font-size:12px; cursor: pointer;"></a>
        </div>
        <table class="table table-hover text-center">
            <tr>
                <th width="120">ID</th>
                <th>种类</th>
                <th>操作</th>
            </tr>
            <c:forEach var="type" items="${typeList}">
                <tr align="center">
                    <td>${type.t_id}</td>
                    <td>${type.t_name}</td>
                    <td>
                        <a><input type="button" onclick="deleteType('${type.t_id}')" value="删除" style="height:23px; width:40px; border:solid 1px #99cccc; font-size:12px; cursor: pointer;"></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</form>
</body>
</html>
