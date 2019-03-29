<%@ page import="java.util.Calendar"%>
<%@ taglib uri="http://www.adehermawan.com/dateFormatter" prefix="tag" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<header class="mdl-layout_header">
<div class="mdl_layout_header-row">
<!-- Title -->
<span class="mdl-layout-title">Personal Stuff Management System</span>
<!-- Add spacer, to align navigation to the right -->
<div class="mdl-layout--spacer"></div>
<!-- Navigation. we hide it in small screens. -->
<tag:formatDate date="<%=Calendar.getInstance().getTime() %>" format="dd-MM-YYYY hh:mm"></tag:formatDate>
 <nav class="mdl-navigation mdl-layout--large-screen-only">
 <a class="mdl-navigation_link" href="/PSMS1/new">Add new Stuff</a>
 <a class="mdl-navigation_link" href="/PSMS1/list">List all Stuff</a>
 </nav>
</div>
</header>
<div class="mdl-layout_drawer">
<span class="mdl-layout-title">PSMS1</span>
<nav class="mdl-navigation">
<a class="mdl-navigation_link" href="/PSMS1/new">Add new Stuff</a>
 <a class="mdl-navigation_link" href="/PSMS1/list">List all Stuff</a>
</nav>
</div>
    