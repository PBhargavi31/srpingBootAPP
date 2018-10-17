<%@ taglib uri ="http://java.sun.com/jstl/core_rt"  prefix="c"%>

<html>
		<head>
				<title>My spring About Page</title>
		</head>
		<body>
				<h1>about us</h1>
				<p><strong>web master</strong><em>${webmaster }</em></p>
				
				<div>
				<p><strong>development team</strong><em>${devTeam }</em></p>
				<ol>	
				<c:forEach items = "${devTeam }" var="ele">
				<li>${ele }</li>
				</c:forEach>
				</ol>
				</div>
				
				
				<p><strong>Admin mail id</strong><em>${adminMail }</em></p>			
				
			
				
				
				<a href = "home">Home</a>
		</body>
</html>
<!-- whatever view the controller is sharing, we can access by here using $ USING THE KEY WE PROVIDED IN CONTROLLER -->
<!-- java expression language it is called -->