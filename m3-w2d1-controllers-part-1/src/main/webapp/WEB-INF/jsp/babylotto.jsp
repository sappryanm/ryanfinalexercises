<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>FizzBuss Revisted</title>
	</head>
<body>
		<c:url var="formResult" value="/babylottoResult" />
		<form action="${formResult}" method="GET">
		<p> Enter three comma delimited number for each ticket</p>
		<table>
			<tr>
				<td>
					<label for="ticketBox1" style="color: black">Ticket 1:</label>
				</td>
				<td>
					<input type="text" name="ticket" id="ticket"/>
				</td>
			</tr>
			<tr>
				<td>
					<label for="ticketBox2" style="color: black">Ticket 2:</label>
				</td>
				<td>
					<input type="text" name="ticket" id="ticket"/>
				</td>
			</tr>
			<tr>
				<td>
					<label for="ticketBox3" style="color: black">Ticket 3</label>
				</td>
				<td>
					<input type="text" name="ticket" id="ticket"/>
				</td>
			</tr>
			<tr>
				<td>
					<label for="ticketBox4" style="color: black">Ticket 4:</label>
				</td>
				<td>
					<input type="text" name="ticket" id="ticket"/>
				</td>
			</tr>
			<tr>
				<td>
					<label for="ticketBox5" style="color: black">Ticket 5:</label>
				</td>
				<td>
					<input type="text" name="ticket" id="ticket"/>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Submit">
				</td>
			</tr>
			</table>
		</form>
</body>