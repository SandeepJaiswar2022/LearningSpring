<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h2>Student Login</h2>
<form action="loginHandler" method="post">
    <label for="id">Student Id : </label>
    <input type="text" id="id" name="id" required><br><br>

    <label for="username">Username : </label>
    <input type="text" id="username" name="name" required><br><br>

    <label for="city">City : </label>
    <input type="text" id="city" name="city" required><br><br>

    <input type="submit" value="Login">
</form>
</body>
</html>
