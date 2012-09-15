<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/pages/common/include.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'listUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link href='<c:url value="/css/common.css"/>' rel="stylesheet" type="text/css">
	<script type="text/javascript" src="<c:url value="/js/jquery-1.7.2.min.js"/>"></script>
  </head>
<script>
function savePwd(){
	alert('ajax');
$.ajax({
	  url: "savePassword.do?id=${object.id}&pwd=11";
	}).done(function( r ) {
	  alert(r);
	});
}
</script>
  <body>
  		修改用户密码
  		<div class="clum_title"></div>
		<table class="mainTable">
			<tr>
				<td>登录名:</td>
				<td>
					<input type="password" id="pwdId">
				</td>
			</tr>
			<tr class="g_line"> <td colspan="2"></td></tr>
			<tr>
				<td class="fm_left"></td>
				<td>
					<span class="f_btn">
						<input type="button" value="确认" onclick="savePwd()" class="r_btn"/>
					</span>
					<span class="f_btn">
						<input type="button" value="关闭" onclick="window.close()" class="r_btn"/>
					</span>
				</td>
			</tr>
		</table>
  	
  </body>
</html>
