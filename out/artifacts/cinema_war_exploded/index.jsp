<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="<%=request.getContextPath()%>/view" method="get">
        <td>Rows</td>
        <td>Columns</td>
        <%--@elvariable id="halls" type="java.util.List"--%>
        <c:forEach items="${halls}" var="hall">
            <c:out value="${hall.rows}"/>
            <c:out value="${hall.columns}"/>
        </c:forEach>

    <ul>
        <li><a href="<%=request.getContextPath()%>/add">Add new Columns and Rows</a></li>
    </ul>
</form>
</body>
</html>
