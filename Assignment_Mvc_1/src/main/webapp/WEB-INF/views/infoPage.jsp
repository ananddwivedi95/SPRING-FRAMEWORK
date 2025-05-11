<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Info</title>
    <style>
        body {
            background: linear-gradient(to right, #1f4037, #99f2c8);
            font-family: 'Segoe UI', sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .info-box {
            background-color: white;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
            width: 400px;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        p {
            font-size: 16px;
            margin: 10px 0;
        }
        span {
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="info-box">
    <h2>Submitted User Info</h2>
    <p><span>First Name:</span> ${firstName}</p>
    <p><span>Last Name:</span> ${lastName}</p>
    <p><span>Gender:</span> ${gender}</p>
    <p><span>Age:</span> ${age}</p>
    <p><span>Qualification:</span> ${qualification}</p>
    <p><span>Marks:</span> ${marks}</p>
    <p><span>Date of Birth:</span> ${dob}</p>
</div>
</body>
</html>
