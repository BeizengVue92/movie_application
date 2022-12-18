<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Movie Application: Populate DB</title>
    <%@ include file="includes/header.jsp"%>
</head>
<body>
<div class="container">
    <div class="title">
        <h1>Populate the Database</h1>
    </div>

    <%@include file="includes/navigation.jsp"%>
    <p>WARNING: This action will over-write the existing database.</p>
    <div class="container">
        <form action="Populate" method="post">
            <input type="submit" value="Populate DB">
        </form>
    </div>
    <p>${message}</p>
    <%@include file="includes/footer.jsp"%>
</div>
</body>
</html>