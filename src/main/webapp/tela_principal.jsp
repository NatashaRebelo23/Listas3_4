<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bem vindo ao sistema simplificado</title>
</head>
<body>
<%
String nome = (String) request.getAttribute("nome");
out.println("Olá " + nome + "!");
%>
</body>
</html>