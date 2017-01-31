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
	<c:if test="${!empty trainee.userID}">
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
			<form:label path="userID">
				<spring:message text="User ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="userID" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="userType">
				<spring:message text="User Type"/>
			</form:label>
		</td>
		<td>
			<form:input path="userType" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="title">
				<spring:message text="Title"/>
			</form:label>
		</td>
		<td>
			<form:input path="title" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="aadharNo">
				<spring:message text="Aadhar No"/>
			</form:label>
		</td>
		<td>
			<form:input path="aadharNo" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="fName">
				<spring:message text="First Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="fName" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="mName">
				<spring:message text="Middle Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="mName" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="lName">
				<spring:message text="Last Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="lName" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="empID">
				<spring:message text="Emp ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="empID" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="dob">
				<spring:message text="DOB"/>
			</form:label>
		</td>
		<td>
			<form:input path="dob" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="fatherName">
				<spring:message text="Father Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="fatherName" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="gender">
				<spring:message text="Gender"/>
			</form:label>
		</td>
		<td>
			<form:input path="gender" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="cAddress1">
				<spring:message text="Correspondence Address Line 1"/>
			</form:label>
		</td>
		<td>
			<form:input path="cAddress1" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="cAddress2">
				<spring:message text="Correspondence Address Line 2"/>
			</form:label>
		</td>
		<td>
			<form:input path="cAddress2" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="cState">
				<spring:message text="State"/>
			</form:label>
		</td>
		<td>
			<form:input path="cState" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="cDistrict">
				<spring:message text="District"/>
			</form:label>
		</td>
		<td>
			<form:input path="cDistrict" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="cCity">
				<spring:message text="City"/>
			</form:label>
		</td>
		<td>
			<form:input path="cCity" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="cPincode">
				<spring:message text="Pincode"/>
			</form:label>
		</td>
		<td>
			<form:input path="cPincode" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="cMobile">
				<spring:message text="Mobile"/>
			</form:label>
		</td>
		<td>
			<form:input path="cMobile" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="cEmail">
				<spring:message text="Email"/>
			</form:label>
		</td>
		<td>
			<form:input path="cEmail" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="pAddress1">
				<spring:message text="Permanent Address Line 1"/>
			</form:label>
		</td>
		<td>
			<form:input path="pAddress1" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="pAddress2">
				<spring:message text="Permanent Address Line 2"/>
			</form:label>
		</td>
		<td>
			<form:input path="pAddress2" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="pState">
				<spring:message text="State"/>
			</form:label>
		</td>
		<td>
			<form:input path="pState" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="pDistrict">
				<spring:message text="District"/>
			</form:label>
		</td>
		<td>
			<form:input path="pDistrict" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="pCity">
				<spring:message text="City"/>
			</form:label>
		</td>
		<td>
			<form:input path="pCity" />
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="pPincode">
				<spring:message text="Pincode"/>
			</form:label>
		</td>
		<td>
			<form:input path="pPincode" />
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<c:if test="${!empty trainee.userID}">
				<input type="submit"
					value="<spring:message text="Edit trainee"/>" />
			</c:if>
			<c:if test="${empty trainee.userID}">
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
			<td>${trainee.userID}</td>
			<td>${trainee.userType}</td>
			<td>${trainee.title}</td>
			<td>${trainee.aadharNo}</td>
			<td>${trainee.fName}</td>
			<td><a href="<c:url value='/trainee/trainee/edit/${trainee.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/trainee/trainee/remove/${trainee.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
