
<!DOCTYPE html>
<html>
<head>
<LINK href="/WEB-INF/res/dark-matter.css" rel="stylesheet"
	type="text/css">
<title>Insert title here</title>
</head>
<body>
	<form action="AddStudent" method="post" class="dark-matter">
		<h1>Add new student</h1>
		<div>
			<span>First Name</span> <input type="text" name="first-name">

		</div>

		<div>
			Last Name <input type="text" name="last-name">
		</div>

		<div>
			Date of Birth <input type="text" name="dob">
		</div>

		<div>

			<div>
				Gender <select name="gender">
					<option>Male</option>
					<option>Female</option>

				</select>
			</div>

		</div>

		<div>

			<div>
				Student class <select name="student-class">
					<option>First_Class</option>
					<option>Second_Class</option>
					<option>Third_Class</option>

				</select>
			</div>

		</div>


		<input value="submit" type="submit">

	</form>
</body>
</html>