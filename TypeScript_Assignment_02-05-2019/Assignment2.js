import * as readline from 'readline'
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

valFromRuntime.question('Please enter a number',(answer) =>{
    var n = parseInt(answer);//converting string into integer
    var sum = 0;
    for(var i=n ;i<n+100 ;i++){
    sum = sum + i;
    }
    console.log(sum);
    valFromRuntime.close();
});
