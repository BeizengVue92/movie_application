<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Movie Application: Search Director</title>
  <%@ include file="includes/header.jsp"%>
</head>
<body>
<div class="container">
  <div class="title">
    <h1>Search By Director</h1>
  </div>

  <%@include file="includes/navigation.jsp"%>

  <div class="container">
    <form action="SearchDirector" method="get">
      <label for="director">
        <p>
          Search by title:
        </p>
      </label>
      <input type="text" name="director" id="director">
      <br>
      <input type="submit">
    </form>
  </div>

  <%@include file="includes/footer.jsp"%>
</div>
</body>
</html>