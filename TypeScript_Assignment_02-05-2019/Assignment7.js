"use strict";
exports.__esModule = true;
var readline = require("readline");
var valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
valFromRuntime.question('Please enter a string', function (answer) {
    var acount = 0;
    var ecount = 0;
    var icount = 0;
    var ocount = 0;
    var ucount = 0;
    for (var i = 0; i < answer.length; i++) {
        if (answer[i] == 'a' || answer[i] == 'A') {
            acount++;
        }
        if (answer[i] == 'e' || answer[i] == 'E') {
            ecount++;
        }
        if (answer[i] == 'i' || answer[i] == 'I') {
            icount++;
        }
        if (answer[i] == 'o' || answer[i] == 'O') {
            ocount++;
        }
        if (answer[i] == 'u' || answer[i] == 'U') {
            ucount++;
        }
    }
    console.log("Number of times a repeated is " + acount + "\nNumber of times e repeated is " + ecount + "\nNumber of times i repeated is " + icount + "\nNumber of times o repeated is " + ocount + "\nNumber of times u repeated is " + ucount);
    valFromRuntime.close();
});
