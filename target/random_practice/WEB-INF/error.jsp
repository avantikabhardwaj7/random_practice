<%@page isErrorPage="true" %>
<% response.setHeader("Server", "Server"); %>
Generic error has occured. <br>
HTTP status code: <%=response.getStatus()%> 
<%=javax.ws.rs.core.Response.Status.fromStatusCode(response.getStatus()).toString()%> 
<%  if (exception != null) {
		exception.printStackTrace(); 
	}
%>