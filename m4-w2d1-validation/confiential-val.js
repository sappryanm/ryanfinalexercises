

$(document).ready(function () {
   $.validator.addMethod('empty', function(value, element) {
       return (value === '');
   }, "This field must remain empty if no address is submitted!");
	// $.validator.addMethod("birth", function (value, element) {
	//         var year = value.split('/');
	//         if ( value.match(/^\d\d?\/\d\d?\/\d\d\d\d$/)
	//             return true;
	//     });	
    $("#confidentialForm").validate({

        debug: true,
        rules: {

            birthday: {
                required: true,
				  	date: true,
					// birth: true,		//makes first name required
            },
            ssn: {
                required: true,         //makes last name required
                minlength: 11,           //requires min length of 2 characters

            },
				address2: {
               empty: {
                   depends: function (element) {
                       return $("#address1").is(":blank");
                   }
               }
				},	
            city: {
                required: true,         

            },
            state: {
                required: true,   
            },
            gender: {
                required: true,   
            },
            zip: {
					required: true,
            	zipcode: true,
            }
        },
        messages: {
            birth: {
                required: "You must provide a birthday",
					date: "YOu must provide a date"
					// birth: "Must be in format mm/dd/yyyy and above 2002"
            },
            ssn: {
                required: "You must provide a SSN",
                minlength: "Last name can't be less than 11 characters including hypehns"
            },
            city: {
                required: "You must provide a city",
            },   
            state: {
                required: "You must provide a State",

            },
            gender: {
                required: "You must provide a gender",

            },
            zip: {
                required: "You must provide a zip",
					 

            }
				
        },
        errorClass: "error",
        validClass: "valid"

    });

});

//Create a custom validation rule that only permits email addresses that end with @techelevator.com
//https://jqueryvalidation.org/jQuery.validator.addMethod
jQuery.validator.addMethod("zipcode", function(value, element) {
  return this.optional(element) || /^\d{5}(?:-\d{4})?$/.test(value);
}, "Please provide a valid zipcode.");

 // $("#address2").on('input', function() {
 // 	 	var input=$(this);
 // 	 	var is_name=input.val();
 // 	 	if(is_name){input.removeClass("invalid").addClass("valid");}
 // 	 	else{input.removeClass("valid").addClass("invalid");}
 // 	 });
