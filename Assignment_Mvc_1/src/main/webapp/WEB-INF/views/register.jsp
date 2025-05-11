<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register Page</title>
    <style>
        body {
            background: linear-gradient(to right, #232526, #414345);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .register-container {
            background: #1e1e2f;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 15px 30px rgba(0, 0, 0, 0.4);
            width: 400px;
            color: white;
            transform: perspective(1000px) rotateX(2deg);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #00c3ff;
            text-shadow: 1px 1px 3px #000;
        }

        label {
            display: block;
            margin-top: 15px;
            font-weight: bold;
        }

        input, select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 8px;
            border: none;
            background: #2c2f48;
            color: #fff;
            box-shadow: inset 1px 1px 5px rgba(0,0,0,0.5);
        }

        input[type="submit"] {
            margin-top: 20px;
            background: linear-gradient(to right, #00c3ff, #007adf);
            color: white;
            font-weight: bold;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        input[type="submit"]:hover {
            transform: translateY(-2px);
            box-shadow: 0 4px 15px rgba(0, 195, 255, 0.5);
        }
    </style>
</head>
<body>
    <div class="register-container">
        <h2>Register</h2>
        <form action="registerUser" method="post">
            <label for="firstName">First Name:</label>
            <input type="text" name="firstName" required />

            <label for="lastName">Last Name:</label>
            <input type="text" name="lastName" required />

            <label for="gender">Gender:</label>
            <select name="gender" required>
                <option value="">Select</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select>

            <label for="age">Age:</label>
            <input type="number" name="age" min="1" required />

            <label for="qualification">Qualification:</label>
            <input type="text" name="qualification" required />

            <label for="marks">Marks (%):</label>
            <input type="number" name="marks" min="0" max="100" required />

            <label for="dob">Date of Birth:</label>
            <input type="date" name="dob" required />

            <input type="submit" value="Register" />
        </form>
    </div>
</body>
</html>
