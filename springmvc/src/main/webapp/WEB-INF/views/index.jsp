<%-- <%@page session="false" %> --%>
<html>
<body>
<h1>${msg}</h1>
<h1>****</h1>
<h1><%= request.getAttribute("msg") %></h1>
<%=request.getAttribute("emp") %>
</body>
</html>
