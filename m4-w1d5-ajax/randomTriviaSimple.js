$(document).ready(function () {


        var user = $("#results").val();
		  var items = [];
		  var currentQuestion = 0;
		  var correctAnswers = 0;
		  var quizOver = false;
		  // var opentsdb = require( 'opentsdb' );

		 // var datum = opentsdb.datum();
		  $.ajax({
		    url: 'https://crossorigin.me/https://www.opentdb.com/api.php?amount=3&type=multiple',
		    dataType: 'json',

		    success: function(data) {
		      console.log(data);
				//("#category").append(data.results[0].category);
				var questionBox = $("#questionBox");
				var theQuestion = $("<td>").html(data.results[0].question);
				var wrongAnswer = $("<li>").text(data.results[0].incorrect_answers);
				var rightAnswer = $("<li>").text(data.results[0].correct_answer);
				var allAnswers = wrongAnswer + rightAnswer;
				//("#quizQuestions").append(data.results[1].question);
				questionBox.append(theQuestion);
				questionBox.append(rightAnswer);
				questionBox.append(wrongAnswer);
				questionBox.append(allAnswers);
			//	$("#refreshButton").on("click", function () {
				  	
			  // });

				//("h2").prop(data.results[0].correct_answer);
		    }
		  });
		  var shuffle = function(array) {
		     temp = [];
		     for (var i = 0; i < array.length ; i++) {
		       temp.push(array.splice(Math.floor(Math.random()*array.length),1));
		     }
		     return temp;
		  };
 });