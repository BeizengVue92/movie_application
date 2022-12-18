<ul class="nav nav-tabs">
    <li><a href="index.jsp">Home</a></li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">View All<b class="caret"></b></a>
        <ul class="dropdown-menu">
            <li><a href="ViewAll">Unsorted Movies</a></li>
            <li><a href="ViewAll?sortType=title">By Title</a></li>
            <li><a href="ViewAll?sortType=director">By Director</a></li>
            <li><a href="ViewAll?sortType=lengthInMinutes">By Length In Minutes</a></li>
        </ul>
    </li>
    <li><a href="populate.jsp">Populate DB</a> </li>
    <li><a href="add-movie.jsp">Add New Movie</a> </li>
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Search<b class="caret"></b></a>
        <ul class="dropdown-menu">
            <li><a href="search-title.jsp">By Title</a> </li>
            <li><a href="search-director.jsp">By Director</a> </li>
        </ul>
    </li>
</ul>