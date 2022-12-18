<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Movie Application: Search Title</title>
  <%@ include file="includes/header.jsp"%>
</head>
<body>
<div class="container">
  <div class="title">
    <h1>Search By Title</h1>
  </div>

  <%@include file="includes/navigation.jsp"%>

  <div class="container">
    <form action="SearchTitle" method="get">
      <label for="title">
        <p>
          Search by title:
        </p>
      </label>
      <input type="text" name="title" id="title">
      <br>
      <input type="submit">
    </form>
  </div>

  <%@include file="includes/footer.jsp"%>
</div>
</body>
</html>