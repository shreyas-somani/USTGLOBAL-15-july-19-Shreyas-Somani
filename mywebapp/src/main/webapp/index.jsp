<%@page import="java.util.Date"%>
<%!


public void jspInt(){
	System.out.println("init");
	
}
public void jspDestroy(){
	System.out.println("Destroy");
}


%>



<% int count=0; %>
<%Date date=new Date(); %>
<html>
<body>
<h2>Hello World!</h2>
<div>div tag</div>
<h1>Count Value=<%=count %></h1>
<h2><%=date %></h2>
</body>
</html>



	