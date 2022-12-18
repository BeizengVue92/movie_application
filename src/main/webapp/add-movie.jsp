<%--
  Created by IntelliJ IDEA.
  User: Beiji
  Date: 12/14/2022
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Movie Application: Add New Movie</title>
    <%@include file="includes/header.jsp"%>
</head>
<body>
    <div class="container">
        <div class="title">
            <h1>Add New Movie</h1>
        </div>

        <%@include file="includes/navigation.jsp"%>

        <p>${message}</p>
        <div class="container">
            <form action="AddNewMovie" method="post">
                <label for="title">
                    <p>Title:</p>
                </label>
                <input type="text" name="title" id="title">
                <label for="director">
                    <p>Director:</p>
                </label>
                <input type="text" name="director" id="director">
                <label for="lengthInMinutes">
                    <p>Length In Minutes:</p>
                </label>
                <input type="text" name="lengthInMinutes" id="lengthInMinutes">
                <br>
                <input type="submit">
            </form>
        </div>

        <%@include file="includes/footer.jsp"%>
    </div>
</body>
</html>
