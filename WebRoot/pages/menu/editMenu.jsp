<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/pages/common/include.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>editMenu..</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  
  <body>
  	<form:form action="save.do" modelAttribute="object" name="f1" method="post">
  		增加菜单
  		<div class="clum_title"></div>
  		<form:errors path="*"></form:errors>
		<table border="0" cellpadding="0" cellspacing="0" class="mainTable">
  			<form:hidden path="id"/>
			<tr>
				<td class="fm_left">路径：</td>
				<td>
					<form:input path="menuPath"/>
				</td>
				<td>
					<form:errors path="menuPath" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td class="fm_left">地址：</td>
				<td>
					<form:input path="menuUrl"/>
					<form:errors path="menuUrl" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td class="fm_left">排序号：</td>
				<td>
					<form:input path="menuOrder"/>
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
						<input type="button" value="返回" onclick="objectgoback()" class="r_btn"/>
					</span>
				</td>
			</tr>
		</table>    
  	</form:form>
  </body>
</html>
