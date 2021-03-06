<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/pages/common/include.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>用户列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link href='<c:url value="/css/common.css"/>' rel="stylesheet" type="text/css">
  </head>
<script>
function resetPwd(id){
	window.open("resetPassword.do?id="+id);
}
function deleteRecord(id){
	if(confirm("确认要删除此记录吗？") == true)
		location = "delete.do?id="+id;
}
</script>
  <body>
	<a href="add.do">新增用户</a>
    <ec:table items="objectList" var="user" action="list.do" imagePath="${ctx}/images/table/*.gif" filterable="false">
    	<ec:row>
    		<ec:column property="id"></ec:column>
    		<ec:column property="username" alias="登录名"></ec:column>
    		<ec:column property="realName" alias="姓名"></ec:column>
    		<ec:column  alias="操作" sortable="false">
    			<security:authorize ifAnyGranted="RESETPASSWORD">
					<a href="#" onclick="resetPwd('${user.id}')">重置密码</a>
    			</security:authorize>
				<a href="edit.do?id=${user.id}">编辑</a>
				<a href="#" onclick="deleteRecord('${user.id}')">删除</a>
    		</ec:column>
    	</ec:row>
    </ec:table>
  </body>
</html>
