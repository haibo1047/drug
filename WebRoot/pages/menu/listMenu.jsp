<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/pages/common/include.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>-</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
<script>
function deleteRecord(id){
	if(confirm("确认要删除此记录吗？") == true)
		location = "delete.do?id="+id;
}
</script>
  <body>
	<a href="add.do">新增菜单</a>
	<ec:table items="objectList" var="menu" imagePath="${ctx}/images/table/*.gif" action="list.do" filterable="false">
		<ec:row>
			<ec:column property="id"></ec:column>
			<ec:column property="menuName" alias="菜单名称"></ec:column>
			<ec:column property="menuPath" alias="菜单路径"></ec:column>
			<ec:column property="menuUrl" alias="菜单地址"></ec:column>
			<ec:column property="menuOrder" alias="排序号"></ec:column>
			<ec:column alias="操作" sortable="false">
				<a href="edit.do?id=${menu.id}">编辑</a>
				<a href="#" onclick="deleteRecord('${menu.id}')">删除</a>
			</ec:column>
		</ec:row>
	</ec:table>
  </body>
</html>
