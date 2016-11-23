$(document).ready(function () {


        var user = $("#results").val();
		  var items = [];
        $.ajax({
            url: "https://randomuser.me/api/?results=10",
            type: "GET",
            dataType: "json"
        }).done(function (data) {
            console.log(data);
				
            $("img").attr("src",data.results[0].picture.medium);
				$("#fullName").append(data.results[0].name.first);
				$("#fullName").append(", ");
				$("#fullName").append(data.results[0].name.last);
				$("#dob").append(data.results[0].dob);
				$("#joined").append(data.results[0].registered);
				$("#phone").append(data.results[0].phone);
				$("#address").append(data.results[0].location.street + "   " + data.results[0].location.city + ", " + data.results[0].location.state + " " + 
				data.results[0].location.postcode);
				$("#email").append(data.results[0].email);
				$("#username").append(data.results[0].login.username);
				$("#password").append(data.results[0].login.password);
				
				$("#rotherUsers").empty();	
            for (var i = 1; i < 10; i++) {
					//var smallImage = $("img").attr("src",data.results[i].picture.thumbnail);
               var tableRow = $("<tr>");
					var pictureCell = $('<td>').prepend($('<img>',{id:'theImg',src: data.results[i].picture.thumbnail}))

					var nameCellFirst = $("<td>").text( data.results[i].name.first);
					var emailCell = $("<td>").text(data.results[i].email);
					var phoneCell = $("<td>").text(data.results[i].phone);
			 		
                tableRow.append(pictureCell);
                tableRow.append(nameCellFirst);
					 tableRow.append(emailCell);
					 tableRow.append(phoneCell);
                

                $("#otherUsers").append(tableRow);
            }            
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
	$("#refreshButton").on("click", function () {
	  	location.reload();
   });

});