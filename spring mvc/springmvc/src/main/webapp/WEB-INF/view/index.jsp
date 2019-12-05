
<%
String s=(String)request.getAttribute("msg");
%>

<html>
<body>
<h2>${msg}</h2>
<h2 style="color:blue;"><%=s%></h2>

<h3>${name}</h3>
<h3>${id}</h3>
</body>
</html>
