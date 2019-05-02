import * as readline from 'readline'
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

valFromRuntime.question('Please enter a number',(answer) =>{
    var n = parseInt(answer);//converting string into integer
    var fact = 1;
    for( var i=1; i <= n; i++){
        fact = fact * i;
    }
    console.log("factorial of n is:" + fact);
    valFromRuntime.close();
})
