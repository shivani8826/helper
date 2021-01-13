<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="./web-resources/style.css">
    <title>User Onboard</title>
</head>
<body>


<div class="container">
    <h1 style="text-align: center;">Student OnBoard Registration<br><br></h1>
    <form action="/user/onboard" method="post">
        <div class="input-group">
            <label for="email"><b>Email</b></label>
            <input type="text" placeholder="Enter Email" id="email" class="input-type" name="email"required>

            <label for="first"><b>First Name</b></label>
            <input type="text" placeholder="Enter First Name" id="first" class="input-type" name="first" required>


            <label for="last"><b>Last Name</b></label>
            <input type="text" placeholder="Enter Last Name" id="last" class="input-type" name="last">


            <label for="psswd"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" id="psswd" class="input-type" name="password" required>

            <button type="submit" class="registerbtn">REGISTER</button>
            <div class="signin">
                <p>Already have an account? <a href="WEB-INF/jsp/login.jsp">Sign in</a>.</p>
            </div>

        </div>

    </form>
</div>
</body>
</html>
