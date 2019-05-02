import * as readline from 'readline'
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

valFromRuntime.question('Please enter a number',(answer) =>{
    var n = parseInt(answer);//converting string into integer
    var i;
    var sum : number =0;
    var temp :number = n;
    while(temp > 0){
        var d = temp%10;
        sum = sum + d;
        temp = temp/10;
        
    }
    sum = Math.floor(sum);
    console.log(`Sum of digits of number is :  ${sum}`);
    valFromRuntime.close();
})
