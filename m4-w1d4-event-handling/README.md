# JQuery Library Introduction Exercises

We have put together a basic HTML and CSS document that will allow you to practice your jQuery event handling capabilities.

In order to get started you will need to add a reference to the jQuery library and create a custom javascript file called `event.js`.

1. Add a click event handler to the "deepSkyBox" that displays an alert message: "Hey! You clicked me!" to the user. 

2. When any of the rainbow boxes are double clicked, show that they are selected by adding the "selected" class.

3. If any of the selected rainbow boxes are double clicked, unselect it by removing the "selected" class.     

4. When the "Hide Selected Boxes" button is clicked, hide any selected boxes from the page.

5. When the "Show All Boxes" button is clicked, show all boxes that are currently hidden.

6. When the "Refresh List" button is clicked, update the list items in the "selectedBoxList" with the names of each selected box (e.g. if Box 1 and 7 are selected then add two `<li>` items, one for each box).  

7. Add a border using the css-class `.selected-field` to the textboxes on the page when they receive focus. Remove the border when the textbox loses focus.

8. In the Form Address section, when the user indicates that they have a different billing address by checking the "My billing address is different box", display the fields in the "billingAddress" box. Hide those fields again if the user unchecks it.  

9. As text is typed into the repeating text box display it out to the paragraph tag (#txtFieldOutput) element below it.

10. Add an event that when the "Mark all as checked" checkbox is checked, all of the sub-checkboxes are also checked.  If the user unchecks it, all checkboxes below it are unchecked. 

11. **Challenge** Make the swap buttons work. If the boxes in the 2-4 position are swapped, switch places with the box immediately preceding it (i.e. 3 is clicked therefore 3 and 2 swap places). If boxes in positions 5-7 are clicked swap places with the box immediately following it. For box 1 switches places with the box immediately following, and box 8 switch places with the box immediately preceding.