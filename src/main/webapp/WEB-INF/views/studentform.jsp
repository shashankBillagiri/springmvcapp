<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<h2>Student Registration</h2>
<form onsubmit="event.preventDefault(); submitStudentForm();">
    First Name: <input type="text" id="firstName" /><br/>
    Last Name: <input type="text" id="lastName" /><br/>
    Gender: <input type="text" id="gender" /><br/>
    Email: <input type="email" id="email" /><br/>
    Contact Number: <input type="text" id="contactNumber" /><br/>
    Address Line1: <input type="text" id="addressLine1" /><br/>
    Address Line2: <input type="text" id="addressLine2" /><br/>
    Address Line3: <input type="text" id="addressLine3" /><br/>
    State: <input type="text" id="state" /><br/>
    Zipcode: <input type="text" id="zipcode" /><br/>
    Course: <input type="text" id="course" /><br/>
<%--    Date of Joining: <input type="datetime-local" id="dateOfJoining" /><br/>--%>
    Age: <input type="number" id="age" /><br/>
    <button type="submit">Submit</button>
</form>
<script src="<%= request.getContextPath() %>/js/student.js"></script>
</body>
</html>
