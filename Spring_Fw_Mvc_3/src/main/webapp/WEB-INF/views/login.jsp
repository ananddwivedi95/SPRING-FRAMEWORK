<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
        body {
            background-color: #1e1e2f;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .login-box {
            background: linear-gradient(145deg, #2a2a3d, #1b1b2a);
            box-shadow: 10px 10px 30px #131322, -10px -10px 30px #292945;
            padding: 40px;
            border-radius: 15px;
            color: white;
            width: 350px;
        }

        .login-box h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #00c3ff;
        }

        .login-box label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }

        .login-box input[type="text"],
        .login-box input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: none;
            border-radius: 10px;
            background-color: #2c2c3e;
            color: white;
            box-shadow: inset 2px 2px 5px #121221, inset -2px -2px 5px #303050;
        }

        .login-box input[type="submit"] {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 10px;
            background: linear-gradient(145deg, #00c3ff, #0078ff);
            color: white;
            font-size: 16px;
            cursor: pointer;
            transition: transform 0.2s;
        }

        .login-box input[type="submit"]:hover {
            transform: scale(1.05);
        }
    </style>
</head>
<body>
    <div class="login-box">
        <h2>Login Form</h2>
        <form:form action="loginCheck" method="post">
            <label for="name">User Name:</label>
            <input type="text" name="name" id="name" required />

            <label for="pwd">Password:</label>
            <input type="password" name="pwd" id="pwd" required />

            <input type="submit" value="Login" />
        </form:form>
    </div>
</body>
</html>
