
	function onSuccess(data) {
	console.log(data);
	console.log(data.status);
	console.log(data.statusText);
	$('#quizQuestions').empty();

	for(var diva = 0; diva < 10; diva++) {
	    $('#quizQuestions').append('<div class="' + diva + ' jumbotron center-block col-centered col-md-12">');
    
	    $('.' + diva).html("<h3 class='text-center'>" + data.results[diva].question + "</h3><br/>");
	    var shuffledArray = randomizeAnswers(data, diva);
	    for(var j = 0; j < 4; j++) {
	        $('.' + diva).append(shuffledArray[j]);
	    }
	    $('#quizQuestions').append('</div>');
	}

	$('.correct').click(correctAnswer);
	$('.wrong').click(wrongAnswer);
	}

	function randomizeAnswers(data, diva) {
	var allAnswers = ['<p><button type="button" class="correct btn btn-default">' + data.results[diva].correct_answer + '</button></p>',
	'<p><button type="button" class="wrong btn btn-default">' + data.results[diva].incorrect_answers[0] + '</button></p>',
	'<p><button type="button" class="wrong btn btn-default">' + data.results[diva].incorrect_answers[1] + '</button></p>',
	'<p><button type="button" class="wrong btn btn-default">' + data.results[diva].incorrect_answers[2] + '</button></p>'];

	var currentIndex = allAnswers.length, temporaryValue, randomIndex;
	// While there remain elements to shuffle...
	while (0 !== currentIndex) {

	// Pick a remaining element...
	randomIndex = Math.floor(Math.random() * currentIndex);
	currentIndex -= 1;

	// And swap it with the current element.
	temporaryValue = allAnswers[currentIndex];
	allAnswers[currentIndex] = allAnswers[randomIndex];
	allAnswers[randomIndex] = temporaryValue;
	}

	return allAnswers;
	}

	function refresh() {
	$.ajax({
	url: 'https://crossorigin.me/https://www.opentdb.com/api.php?amount=10&category=9&difficulty=hard&type=multiple',
	dataType: 'json',
	crossDomain: true})//ajax

	.done(onSuccess)//Done function

	.fail(onFailure);//Fail function
	}

	function onFailure(xhr, status, error) {
	console.log(error);
	}

	function correctAnswer() {
	console.log('That is correct');
	$(this).parent().parent().css('background-color', 'green');
	var score = Number($('#score').text());
	$('#score').text(score + 1);
	$(this).prop("disabled", "disabled");
	$(this).parent().siblings().children().prop("disabled","disabled");
	
	}

	function wrongAnswer() {
	console.log('That is wrong');
	$(this).parent().parent().css('background-color', 'red');
	var wrongScore = Number($('#wrongScore').text());
	$('#wrongScore').text(wrongScore + 1);
	
	(this).attr("disabled", "disabled");
	(this).parent().siblings().children().prop("disabled","disabled");
	
	}
	// $('#myForm').one('submit', function() {
	//     $(this).find('input[type="submit"]').attr('disabled','disabled');
	// });

	$(document).ready(function() {
	refresh();
	$('#refreshButton').on('click', refresh);

	});