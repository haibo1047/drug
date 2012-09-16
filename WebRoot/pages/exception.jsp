<%@ page contentType="text/html;charset=UTF-8"%>
<html> 
<head><title>Exception!</title></head> 
<body> 
<% java.lang.Exception ex = (java.lang.Exception)request.getAttribute("exception"); %> 
<H2>异常信息:--<%= ex==null?"未能捕获到异常":ex.getMessage()%></H2>
<P/>
<div class="bct fc05 fc11 nbw-blog ztag js-fs2">
<p style="text-align: left;" align="left">
<span style="font-size: 10pt; font-family: &quot;Courier New&quot;; color: black;" lang="EN-US">
<% if(ex!=null)ex.printStackTrace(new java.io.PrintWriter(out)); %>
</span>
</p>
</div>
</body> 
</html> 