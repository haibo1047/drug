<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/pages/common/include.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>edit..</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link href='<c:url value="/css/common.css"/>' rel="stylesheet" type="text/css">
	<script type="text/javascript" src="<c:url value="/js/jquery-1.7.2.min.js"/>"></script>
  </head>
<script type="text/javascript">
function gotoback() {
	location = '<spring:url value="storage.do"/>';
}
</script>
	<body>
  	<form:form action="save.do" method="post" modelAttribute="bill" name="f1"><%--
  		增加${bill.billType.label}
  		--%><div class="clum_title"></div>
  		<form:hidden path="id"/>
  		<form:hidden path="billType"/>
		<table class="mainTable">
			<tr>
				<td>仓库:</td>
				<td>
					<form:select path="repositoryId" items="${repositoryList}" itemLabel="repositoryName" itemValue="id"></form:select>
				</td>
			</tr>
			<tr>
				<td>供应商名称:</td>
				<td>
					<form:select path="providerId" items="${providerList}" itemLabel="providerName" itemValue="id"></form:select>
				</td>
			</tr>
			<tr class="g_line"> <td colspan="2"></td></tr>
			<tr>
				<td class="fm_left"></td>
				<td>
					<span class="f_btn">
						<input type="button" value="确认" onclick="f1.submit()" class="r_btn"/>
					</span>
					<span class="f_btn">
						<input type="button" value="返回" onclick="goback()" class="r_btn"/>
					</span>
				</td>
			</tr>
		</table>
  	</form:form>
  </body>
</html>