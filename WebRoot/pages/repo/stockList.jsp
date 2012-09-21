<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/pages/common/include.jsp"%>

<html>
<head>
	<title>库存查询</title>
	<link href='<c:url value="/css/common.css"/>' rel="stylesheet" type="text/css">
	<script type="text/javascript" src="<c:url value="/js/jquery-1.7.2.min.js"/>"></script>
	<script>
	</script>
</head>
<body>
	
	<ec:table items="stockList" action="stock.do" imagePath="${ctx}/images/table/*.gif" filterable="false">
    	<ec:row>
    		<ec:column property="extraInfo" alias="药品"  cell="com.ylsq.frame.sh.MapCell" parse="drugName"/>
    		<ec:column property="extraInfo" alias="仓库"  cell="com.ylsq.frame.sh.MapCell" parse="repositoryName"/>
    		<ec:column property="drugPrice" alias="入库价"></ec:column>
    		<ec:column property="drugNumber" alias="数量"></ec:column>
    		<ec:column property="produceDate" alias="生产日期" cell="date" format="yyyy-MM-dd"></ec:column>
    	</ec:row>
    </ec:table>

</body>
</html>
