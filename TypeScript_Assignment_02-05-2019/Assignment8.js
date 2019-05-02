"use strict";
exports.__esModule = true;
var readline = require("readline");
var userinput = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
//converting a decimal number to hexadecimal.
userinput.question('enter a decimal number', function (decNum) {
    var n = parseInt(decNum);
    var rem;
    var hexVal;
    var hexdec = '';
    while (n != 0) {
        rem = Math.floor(n % 16);
        n = Math.floor(n / 16);
        if (rem >= 10) {
            switch (rem) {
                case 10:
                    hexVal = 'A';
                    break;
                case 11:
                    hexVal = 'B';
                    break;
                case 12:
                    hexVal = 'c';
                    break;
                case 13:
                    hexVal = 'D';
                    break;
                case 14:
                    hexVal = 'E';
                    break;
                case 15:
                    hexVal = 'F';
                    break;
            }
            hexdec = hexVal + hexdec;
        }
        else {
            hexdec = rem + hexdec;
        }
    }
    console.log(hexdec);
    userinput.close();
});
