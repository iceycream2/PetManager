<%--
  Created by IntelliJ IDEA.
  User: 汪飞洋同学
  Date: 2023/8/24
  Time: 11:18
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
        function deletePet(id){
            if(confirm("您确定要删除这条数据吗?")){
                location.href="/deletePet?id="+id;
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
            <strong class="icon-reorder"> 宠物管理</strong>
            <a><input type="button" onclick="location.href='addPet.jsp'" value="新增" style="height:23px; width:40px; border:solid 1px #99cccc; font-size:12px; color:42870a; cursor: pointer;"></a>
        </div>
        <table class="table table-hover text-center">
            <tr>
                <th width="120">ID</th>
                <th>宠物名称</th>
                <th>主人姓名</th>
                <th>联系方式</th>
                <th>住址</th>
                <th>宠物种类</th>
                <th>操作</th>
            </tr>
            <c:forEach var="pet" items="${petList}">
            <tr align="center">
                <td>${pet.p_id}</td>
                <td>${pet.p_name}</td>
                <td>${pet.p_m_name}</td>
                <td>${pet.p_m_phone}</td>
                <td>${pet.p_m_address}</td>
                <td>${pet.p_type}</td>
                <td>
                <a><input type="button" onclick="location.href='/updatePetPre?id=${pet.p_id}'" value="修改" style="height:23px; width:40px; border:solid 1px #99cccc; font-size:12px; cursor: pointer;"></a>
                <a><input type="button" onclick="deletePet('${pet.p_id}')" value="删除" style="height:23px; width:40px; border:solid 1px #99cccc; font-size:12px; cursor: pointer;"></a>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</form>
</body>
</html>
