<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Feedback Submitted</title>
</head>
<body>
<h2>Thank you, ${userName}!</h2>
<p>Your feedback:</p>
<blockquote>${userComments}</blockquote>
</body>
</html>
