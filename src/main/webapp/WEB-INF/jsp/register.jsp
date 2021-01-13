<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../resources/web-resources/style.css">
    <title>Course Register</title>
<style>
    .container {
        margin: 0;
        padding: 0;
        width: 610px;
        height: 600px;
        position: relative;
        margin: 6% auto;
        background: violet;
        padding: 5px;
    }
</style>

</head>
<body>
<h1>Show Checkboxes</h1>

<div class="container">
<form action="CourseOptions.jsp">
    <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">
    <label for="vehicle1"> I have a bike</label><br>
    <input type="checkbox" id="vehicle2" name="vehicle2" value="Car">
    <label for="vehicle2"> I have a car</label><br>
    <input type="checkbox" id="vehicle3" name="vehicle3" value="Boat">
    <label for="vehicle3"> I have a boat</label><br><br>
    <input type="submit" value="Submit">
</form>
</div>

</body>
</html>