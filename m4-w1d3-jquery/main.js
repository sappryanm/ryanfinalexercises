$(document).ready(function () {
	//1.
	var reciepeChildren = $("#recipes").children();
	console.log(reciepeChildren);
	//2.
	var reciepeBeefChildren = $(".beef").children().has("h3");
	console.log(reciepeBeefChildren);
	//3
	var blackendCatfish = $("#blackened-catfish").children();
	console.log(blackendCatfish);
	//4
	var winterSalad = $("#winter-fruit-salad").parent();
	console.log(winterSalad);
	//5
	var curriedTilapia = $("#curried-tilapia").parent();
	console.log(curriedTilapia);
	//6
	var chili = $("#tailgate-chili").siblings().slice("made-it");
	console.log(chili);
	//7
	var veggie = $(".vegetarian").siblings();
	console.log(veggie);
	//8
   var evenNumberedBoxes = $("#table-of-contents").filter(":even");
   console.log(evenNumberedBoxes);
	//9
   var blackBean = $("#black-bean-burrito").children().not("made-it");
   console.log(blackBean);
	//10
   var h3contents = $("h3.title").contents()
    // .filter(function() {
   //    return this.nodeType === 3;
   //  })
   //    .wrap( "<p></p>" )
   //    .end()
   //  .filter( "br" )
   //  .remove();
   console.log(h3contents);
	//11
	//$("#cabbage-pie > h3").text("Homemade Cabbage Pie -- Yum");
   //12
	 $("#cabbage-pie > h3").html("Homemade Cabbage Pie<br/>Yum!");
   //13
	 $("#cabbage-pie > h3").text("Homemade Cabbage Pie<br/>Yum!");
 	//14
    $("h3").append("<p id='new'>Delicious recipe description and instructions go here</p>");
    //1516
    //var inputTypeValue = $("#remarks").val();
    //console.log(inputTypeValue);
	 marker = $('<span />').insertBefore('#remarks');
	 $('#remarks').detach().attr('type', 'text').insertAfter(marker);
	 marker.remove();
	// //var type = node.nodeType;
	//  $( "input[type="hidden" i]" ).removeProp( "type, hidden");
	//   $( "input.remarks" ).prop( "type = text");
	//   $("#remarks").val("Your remarks go here");
		//17
	     //$("#remarks").val("");  
	   // });
		// para = $( "input.remarks" );
		// para
		//   .prop( "type", 1234 )
		//   .append( "The secret luggage code is: ", String( para.prop( "luggageCode" ) ), ". " )
		//   .removeProp( "luggageCode" )
		//   .append( "Now the secret luggage code is: ", String( para.prop( "luggageCode" ) ), ". " );
	     
});