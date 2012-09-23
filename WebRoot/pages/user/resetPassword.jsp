<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/pages/common/include.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>重置密码</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link href='<c:url value="/css/common.css"/>' rel="stylesheet" type="text/css">
	<script type="text/javascript" src="<c:url value="/js/jquery-1.7.2.min.js"/>"></script>
  </head>
<script>
function savePwd(){
	var userId = "<c:out value='${user.id}'/>";
	var pwd1 =  $("#pwdId1").val();
	if(pwd1 != $("#pwdId2").val()){
		alert("两次录入的密码不一致，请重新录入");
		$("#pwdId1").val("");
		$("#pwdId2").val("");
		return;
	}
	$.ajax({
		type:"POST",
		url:"savePassword.do",
		data:{"userId":userId,"pwd":pwd1},
		dataType:"text",
		success:function(text){
			if(text == "1"){
				alert("操作成功！");
			}
			else{
				alert("操作失败！");
			}
		}
	})
}
</script>
  <body>
  		修改用户密码
  		<div class="clum_title"></div>
		<table class="mainTable">
			<tr>
				<td>密码:</td>
				<td>
					<input type="password" id="pwdId1">
				</td>
			</tr>
			<tr>
				<td>确认密码:</td>
				<td>
					<input type="password" id="pwdId2">
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
