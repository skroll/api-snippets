<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once '/path/to/vendor/autoload.php'; // Loads the library
use Twilio\Rest\Client;

// Your Account Sid and Auth Token from twilio.com/user/account
$sid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
$token = "your_auth_token";
$client = new Client($sid, $token);

$conferences = $client->conferences->read(
    array("status" => "in-progress", "friendlyName" => "MyRoom")
);
// Loop over the list of conferences and echo a property for each one
foreach ($conferences as $conference) {
    echo $conference->status;
}
