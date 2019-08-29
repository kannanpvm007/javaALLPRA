<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    keep the page open for 20 seconds<br> it will automatically redirect
    
    if (session != null) {
        if (session.getAttribute("user") != null) {
            String name = (String) session.getAttribute("user");
            out.print("Hello, " + name + "  Welcome to ur Profile");
        } else {
            response.sendRedirect("login.html");
        }
    }
    <form action="Logout" method="post">
            <input type="submit" value="Logout">
        </form>
</body>
</html>