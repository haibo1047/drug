<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/pages/common/include.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>bill</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<link href='<c:url value="/css/common.css"/>' rel="stylesheet" type="text/css">
	<script type="text/javascript" src="<c:url value="/js/jquery-1.7.2.min.js"/>"></script>
  </head>
<script>
function deleteBill(billId){
	if(confirm("确认要删除此单据吗？") == true)
		location = "delete.do?billId="+billId;
}
function confirmBill(billId){
	if(confirm("确认此单据吗？") == true)
		location = "confirmBill.do?billId="+billId;
}
</script>
  <body>
  	<a href="add.do">新增</a>
  	<ec:table items="billList" var="bill" imagePath="${ctx}/images/table/*.gif" action="storage.do" filterable="false">
  		<ec:row>
			<ec:column property="id" alias="ID"/>
			<ec:column property="billNo" alias="单号"/>
			<ec:column property="extraInfo" alias="仓库" cell="com.ylsq.frame.sh.MapCell" parse="repositoryName"/>
			<ec:column property="createDate" alias="创建时间" cell="date" format="yyyy-MM-dd HH:mm:ss"/>
			<ec:column property="createUser" alias="创建人"/>
			<ec:column property="extraInfo" alias="是否生效" cell="com.ylsq.frame.sh.MapCell" parse="available"/>
			<ec:column alias="操作" sortable="false">
				<a href="editDetail.do?billId=${bill.id}">明细</a>
				<c:if test="${bill.available == '0'}">
					<a href="edit.do?billId=${bill.id}">编辑</a>
					<a href="#" onclick="deleteBill('${bill.id}')">删除</a>
					<a href="#" onclick="confirmBill('${bill.id}')">确认单据</a>
				</c:if>
			</ec:column>
		</ec:row>
  	</ec:table>
  </body>
</html>
