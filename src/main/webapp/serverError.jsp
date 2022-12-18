<%--
  Created by IntelliJ IDEA.
  User: Beiji
  Date: 11/17/2022
  Time: 8:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Internal Server Error</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
    <div class="container">
        <div>
            <h1>Server Error!</h1>
        </div>

        <%@include file="includes/navigation.jsp"%>

        <div class="container">
            <h1>Houston, we've had a problem.</h1>
            <h2>Error Details:</h2>
            <p>Type: ${pageContext.exception["class"]}</p>
        </div>

        <%@include file="includes/footer.jsp"%>

    </div>

</body>
</html>
