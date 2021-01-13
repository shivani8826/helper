<%--
  Created by IntelliJ IDEA.
  User: shivani
  Date: 02/01/21
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Course Registration.</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        .regis{
            padding: 0;
            width: 610px;
            height: 600px;
            position: relative;
            margin: 6% auto;
            background: violet;
            padding: 5px;
        }
        .buttons{
            background-color: #4CAF50;
            color: white;
            width: 100%;
            height: 8%;
            padding: 20px;
            margin-top: 20px;
            margin-bottom: 20px;
            align-content: center;
        }
    </style>
</head>
<body>

    <div class="regis">
        <h1 style="text-align: center;padding: 10px 10px 10px 10px">Welcome to University </h1>

            <form action="/user/course/register">
            <button type="button" class="buttons">Courses Register</button>
            </form>


            <button type="button" class="buttons">View your selected courses</button>


           <form action="#">
           <button type="submit" class="buttons">View all Courses</button>
           </form>

           </div>
</form>


</div>
</body>
</html>
