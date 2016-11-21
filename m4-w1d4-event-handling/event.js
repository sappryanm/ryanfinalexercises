$(document).ready(function () {
	//1
	$("#deepSkyBox").click(function (event) {
	    alert("Hey! You clicked on me!");
	});

	//2 & 3
	$("#box-rainbow").children().dblclick(function() {
	    if($(this).hasClass("selected")) {
	        $(this).removeClass("selected");
	    } else {
	        $(this).addClass("selected");
	    }
	});

	//4
	$("#hideSelectedBoxes").click(function(event) {
	    if($("#box-rainbow").children().hasClass("selected")) {
	        $(".selected").hide();
	    }
	});

	//5
	$("#showAllBoxes").click(function(event) {
	    $(".selected").show();
	});

	//6
	// When the "Refresh List" button is clicked

	$("#refreshSelectedBoxList").click(function(event) {
	    $("#selectedBoxList").empty();
	    $(".selected p").each(function() {
	        $("#selectedBoxList").append("<li>" + $(this).text() + "</li>");
	    });
	});
	//7
	// Add a border using the css-class .selected-field 
	$("input[type=text]").focusin(function(event) {
	$(this).addClass("selected-field");
	});
	$("input[type=text]").focusout(function(event) {
	$(this).removeClass("selected-field");
	});
	// 8
	
	$("#differentBillingAddress").change(function(event) {
	if(this.checked) {
	$("#billingAddress").show();
	} else {
	$("#billingAddress").hide();
	}
	});

	//9
	
	$("#txtField").keyup(function(event) {
	$("#txtFieldOutput").html($(this).val());
	})

	//10

	$("#checkAll").change(function(event) {
	$(".subcheck").not(this).prop("checked", this.checked);

	})


	});
});