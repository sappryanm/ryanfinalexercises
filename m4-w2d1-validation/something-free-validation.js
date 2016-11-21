

$(document).ready(function () {
	
	$("#allNewsletters").click(function() {
		var checked =$(this).prop("checked");
		$(".subcheck").prop("checked", checked);

	});

			    $("#somethingFreeForm").validate({

			        debug: true,
			        rules: {
		             email: {
		                	email: true,            //require this field to only accept email
		                	required: true,

		               },


			            password: {
			                required: true,         //requires password field
			                minlength: 8,           //requires at least 8 characters
			                strongpassword: true    //uses custom validator for strong password
			            },
			            confirm: {
			                equalTo: "#password"    //uses the CSS selector to match value of the field
			            },

			            company: {
								required: true           
			            },
			            website: {
								url: true         
			            },
			            industry: {
								required: true         
			            },
			            position: {
								required: true         
			            },
			            numberOfEmployees: {
								required: true         
			            }
			        },
			        messages: {
			            email: {
			                email: "You must provide a valid email"
			            },
			            confirm: {
			                required: "You must provide a the same password",

			            },
			            company: {
			                required: "You must provide a company",

			            },
			            website: {
			                url: "You must provide a valid website",

			            },
			            industry: {
			                required: "You must select an industry",

			            },
			            position: {
			                required: "You must select a position",

			            },
			            numberOfEmployees: {
			                required: "You must select number of Employees",

			            }
			        },
			        errorClass: "error",
			        validClass: "valid"

    });

});


$.validator.addMethod("strongpassword", function (value, index) {
    return value.match(/[A-Z]/) && value.match(/[a-z]/) && value.match(/\d/);  //check for one capital letter, one lower case letter, one num
},"Please enter a strong password (one capital, one lower case, and one number");

 

