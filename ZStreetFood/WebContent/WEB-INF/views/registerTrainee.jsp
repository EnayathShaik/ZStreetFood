<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>trainee Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a trainee
</h1>

<c:url var="addAction" value="/trainee/trainee/add" ></c:url>

<form:form action="${addAction}" commandName="trainee">
<table>
	<c:if test="${!empty trainee.name}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="name" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="emp_code">
				<spring:message text="Emp Code"/>
			</form:label>
		</td>
		<td>
			<form:input path="emp_code" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="email">
				<spring:message text="Email"/>
			</form:label>
		</td>
		<td>
			<form:input path="email" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="emp_code">
				<spring:message text="Emp Code"/>
			</form:label>
		</td>
		<td>
			<form:input path="emp_code" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="contactNo">
				<spring:message text="Mobile No"/>
			</form:label>
		</td>
		<td>
			<form:input path="contactNo" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="address">
				<spring:message text="Address"/>
			</form:label>
		</td>
		<td>
			<form:input path="address" />
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<c:if test="${!empty trainee.name}">
				<input type="submit"
					value="<spring:message text="Edit trainee"/>" />
			</c:if>
			<c:if test="${empty trainee.name}">
				<input type="submit"
					value="<spring:message text="Add trainee"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Trainees List</h3>
<c:if test="${!empty listTrainees}">
	<table class="tg">
	<tr>
		<th width="80">trainee ID</th>
		<th width="120">Name</th>
		<th width="120">Emp Code</th>
		<th width="120">Email</th>
		<th width="120">Mobile No</th>
		<th width="120">Address</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listTrainees}" var="trainee">
	
	
		<tr>
			<td>${trainee.id}</td>
			<td>${trainee.name}</td>
			<td>${trainee.emp_code}</td>
			<td>${trainee.email}</td>
			<td>${trainee.contactNo}</td>
			<td>${trainee.address}</td>
			<td><a href="<c:url value='/trainee/trainee/edit/${trainee.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/trainee/trainee/remove/${trainee.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
