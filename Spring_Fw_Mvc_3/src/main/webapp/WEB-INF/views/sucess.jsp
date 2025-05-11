<%@ page contentType="text/html"%>
<!DOCTYPE html>
<html>
<head>
    <title>Success Page</title>
    <style>
        body {
            background-color: #1e1e2f;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: white;
        }

        .message-box {
            background: linear-gradient(145deg, #2a2a3d, #1b1b2a);
            box-shadow: 10px 10px 30px #131322, -10px -10px 30px #292945;
            padding: 40px;
            border-radius: 15px;
            width: 400px;
            text-align: center;
        }

        .message-box h1 {
            color: #00c3ff;
            margin-bottom: 20px;
        }

        .message-box h3 {
            font-size: 20px;
            color: #ffffff;
            background-color: #2c2c3e;
            padding: 15px;
            border-radius: 10px;
            box-shadow: inset 2px 2px 5px #121221, inset -2px -2px 5px #303050;
        }
    </style>
</head>
<body>
    <div class="message-box">
        <h1>Welcome to Spring</h1>
        <h3>${validationMessage}</h3>
    </div>
</body>
</html>
