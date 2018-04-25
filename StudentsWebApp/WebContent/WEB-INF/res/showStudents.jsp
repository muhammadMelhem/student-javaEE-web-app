<!DOCTYPE html>
<html lang="en">
<head>
<%@ page import="java.util.List"%>
<%@ page import="school.models.Student"%>

<LINK href="/WEB-INF/res/steelBlueCols.css" rel="stylesheet" type="text/css">

<title>Student List</title>

</head>
<body>


	<table class="steelBlueCols">
		<thead>
			<tr>
				<th class="column1">ID</th>
				<th class="column2">First Name</th>
				<th class="column3">Last Name</th>
				<th class="column4">Date of Birth</th>
				<th class="column5">Gender</th>
				<th class="column6">Class</th>
			</tr>
		</thead>
		<tbody>
			<%
				List<Student> sl = (List<Student>) request.getAttribute("studentList");

				for (int x = 0; x < sl.size(); x++) {
			%>
			<tr>


				<td class="column1"><%=sl.get(x).getId()%></td>
				<td class="column2"><%=sl.get(x).getFirstName()%></td>
				<td class="column3"><%=sl.get(x).getLastName()%></td>
				<td class="column4"><%=sl.get(x).getDob()%></td>
				<td class="column5"><%=sl.get(x).getGender()%></td>
				<td class="column6"><%=sl.get(x).getStudentClass()%></td>
			</tr>

			<%
				}
			%>

		</tbody>
	</table>

</body>
</html>