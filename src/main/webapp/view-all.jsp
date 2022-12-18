<%--
  Created by IntelliJ IDEA.
  User: Beiji
  Date: 11/16/2022
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Movie Application</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
    <div class="container">
        <div>
            <h1>Movie List</h1>
        </div>

        <%@include file="includes/navigation.jsp"%>

        <div class="container">
            <c:choose>
                <c:when test="${empty movie}">
                    <p>Sorry, the list Movie was empty</p>
                </c:when>
                <c:otherwise>
                    <c:forEach var="movie" items="${movie}">
                        <h2>${movie.title}</h2>
                        <p>${movie.title} directed by ${movie.director} is ${movie.lengthInMinutes} minutes long</p>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </div>

        <%@include file="includes/footer.jsp"%>
    </div>

</body>
</html>
