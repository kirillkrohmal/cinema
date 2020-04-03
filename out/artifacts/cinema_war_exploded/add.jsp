<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.servletContext.contextPath}/add" method="post">
    Rows : <label>
    <input type="text" name="rows">
</label><br/>
    Columns : <label>
    <input type="text" name="columns">
</label><br/>
    <input type="submit">
</form>
<br/>


</body>
</html>
