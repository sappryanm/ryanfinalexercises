$(document).ready(function () {


        var user = $("#results").val();
		  var items = [];
		  var currentQuestion = 0;
		  var correctAnswers = 0;
		  var quizOver = false;
		  // var opentsdb = require( 'opentsdb' );

		 // var datum = opentsdb.datum();
		  $.ajax({
		    url: 'https://robwu.nl/cors-anywhere.htmlhttps://www.opentdb.com/api.php?amount=3&type=multiple',
		    dataType: 'json',
			 type: "GET",
		    success: function(data) {
		      console.log(data);
				//("#category").append(data.results[0].category);
				var questionBox = $("#questionBox");
				var theQuestion = $("<td>").text(data.results[0].question);
				var wrongAnswer = $("<td>").text(data.results[0].incorrect_answers);
				var rightAnswer = $("<td>").text(data.results[0].correct_answer);
				//("#quizQuestions").append(data.results[1].question);
				questionBox.append(theQuestion);
				
				incorrectAnswer.append(wrongAnswer);
			//	$("#refreshButton").on("click", function () {
				  	answer.append(rightAnswer);
			  // });
				
				//("h2").prop(data.results[0].correct_answer);
		    }
		  });
	     // Display the first question
	     displayCurrentQuestion();
	     $(this).find(".quizMessage").hide();

	     // On clicking next, display the next question
	     $(this).find(".nextButton").on("click", function () {
	         if (!quizOver) {

	             value = $("input[type='radio']:checked").val();

	             if (value == undefined) {
	                 $(document).find(".quizMessage").text("Please select an answer");
	                 $(document).find(".quizMessage").show();
	             } else {
	                 // TODO: Remove any message -> not sure if this is efficient to call this each time....
	                 $(document).find(".quizMessage").hide();

	                 if (value == questions[currentQuestion].correctAnswer) {
	                     correctAnswers++;
	                 }

	                 currentQuestion++; // Since we have already displayed the first question on DOM ready
	                 if (currentQuestion < questions.length) {
	                     displayCurrentQuestion();
	                 } else {
	                     displayScore();
	                     //                    $(document).find(".nextButton").toggle();
	                     //                    $(document).find(".playAgainButton").toggle();
	                     // Change the text in the next button to ask if user wants to play again
	                     $(document).find(".nextButton").text("Play Again?");
	                     quizOver = true;
	                 }
	             }
	         } else { // quiz is over and clicked the next button (which now displays 'Play Again?'
	             quizOver = false;
	             $(document).find(".nextButton").text("Next Question");
	             resetQuiz();
	             displayCurrentQuestion();
	             hideScore();
	         }
	     });

	 });
});
	 // This displays the current question AND the choices
	 function displayCurrentQuestion() {

	     console.log("In display current Question");

	     var question = questions[currentQuestion].question;
	     var questionClass = $(document).find(".quizContainer > .question");
	     var choiceList = $(document).find(".quizContainer > .choiceList");
	     var numChoices = questions[currentQuestion].choices.length;

	     // Set the questionClass text to the current question
	     $(questionClass).text(question);

	     // Remove all current <li> elements (if any)
	     $(choiceList).find("li").remove();

	     var choice;
	     for (i = 0; i < numChoices; i++) {
	         choice = questions[currentQuestion].choices[i];
	         $('<li><input type="radio" value=' + i + ' name="dynradio" />' + choice + '</li>').appendTo(choiceList);
	     }
	 }

	 function resetQuiz() {
	     currentQuestion = 0;
	     correctAnswers = 0;
	     hideScore();
	 }

	 function displayScore() {
	     $(document).find(".quizContainer > .result").text("You scored: " + correctAnswers + " out of: " + questions.length);
	     $(document).find(".quizContainer > .result").show();
	 }

	 function hideScore() {
	     $(document).find(".result").hide();
	  }


