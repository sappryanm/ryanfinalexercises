

$(document).ready(function () {

    // Validate takes an object, not a function
    // Objects in javascript use { .. } notation and are the same as key / value pairs
    $("#authentication-form").validate({

        debug: true,
        rules: {

            username: {
					 required: true, 
                email: true,            //require this field to only accept email                
                //required: {
                //    depends: function (element) {
                //        return $("#chkEmail").is(":checked");
                //    }
                //},

            },
            password: {
                required: true,         //requires password field
                minlength: 8,           //requires at least 8 characters
             //   strongpassword: true    //uses custom validator for strong password
            },
            // verifyPassword: {
            //     equalTo: "#password"    //uses the CSS selector to match value of the field
            // },
            //This one looks funky because it renders the error label before the checkbox
            //The way to make this truly good is override the error placement for checkbox which is tedious
			//See something like this http://stackoverflow.com/questions/26498899/jquery-validate-custom-error-message-location

        },
        messages: {
            username: {
                required: "You must provide a username that is an email address"
            },
				password: {
					required: "Password can not be blank",
					minlength: "requires atleast 8 characters and one capital letter and one num"
				}
        
        },
        errorClass: "error",
        validClass: "valid"

    });

});


 


