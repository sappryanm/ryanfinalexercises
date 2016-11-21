

$(document).ready(function () {

    // Validate takes an object, not a function
    // Objects in javascript use { .. } notation and are the same as key / value pairs
    $("#registrationForm").validate({

        debug: true,
        rules: {

            firstName: {
                required: true,         //makes first name required
            },
            lastName: {
                required: true,         //makes last name required
                minlength: 2,           //requires min length of 2 characters
                lettersonly: true       //using an additional jquery validation method
            },
            email: {
                email: true,            //require this field to only accept email                

            },
            password: {
                required: true,         //requires password field
                minlength: 8,           //requires at least 8 characters
                strongpassword: true    //uses custom validator for strong password
            },
            verifyPassword: {
                equalTo: "#password"    //uses the CSS selector to match value of the field
            },
            //This one looks funky because it renders the error label before the checkbox
            //The way to make this truly good is override the error placement for checkbox which is tedious
			//See something like this http://stackoverflow.com/questions/26498899/jquery-validate-custom-error-message-location
            homePhone: {
                required: true,
					phoneUS: true, 
					minlength: 9,
            },
            officePhone: {
                required: true,
					phoneUS: true, 
					minlength: 9,           
            },
            cellPhone: {
                required: true,
					phoneUS: true, 
					minlength: 9,           
            }
        },
        messages: {
            firstName: {
                required: "You must provide a first name"
            },
            lastName: {
                required: "You must provide a last name",
                minlength: "Last name can't be less than 2 characters"
            },
            email: {
                email: "You must provide a valid email"
            },
            confirm: {
                required: "You must provide a the same password",

            },
            homePhone: {
                required: "You must provide a home phone",

            },
            officePhone: {
                required: "You must select an office home",

            },
            cellPhone: {
                required: "You must select a Cell PHone",

            }
  
        },
        errorClass: "error",
        validClass: "valid"

    });

});

//Create a custom validation rule that only permits email addresses that end with @techelevator.com
//https://jqueryvalidation.org/jQuery.validator.addMethod


$.validator.addMethod("strongpassword", function (value, index) {
    return value.match(/[A-Z]/) && value.match(/[a-z]/) && value.match(/\d/);  //check for one capital letter, one lower case letter, one num
}, "Please enter a strong password (one capital, one lower case, and one number");

 


