<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Calorie Tracking App</h1>

    <form action="SaveDataServlet" method="post">
        <label for="foodName">Food Name:</label>
        <input type="text" id="foodName" name="foodName" required>

        <label for="calories">Calories:</label>
        <input type="number" id="calories" name="calories" required>

        <label for="protein">Protein (grams):</label>
        <input type="number" id="protein" name="protein" required>

        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" required>


		<label for="carbs">Carbs (grams):</label>
		<input type="number" id="carbs" name="carbs" required>
		
        <button type="submit">Save</button>
        
        
        
    </form>

</body>
</html>