<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Feedback Form</title>
</head>
<body>
<h2>Feedback Form</h2>
<form action="submitFeedback" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required /><br><br>

    <label for="comments">Comments:</label><br>
    <textarea id="comments" name="comments" rows="5" cols="40"></textarea><br><br>

    <input type="submit" value="Submit Feedback" />
</form>
</body>
</html>
