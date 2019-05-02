import * as readline from 'readline'
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

valFromRuntime.question('Please enter a string',(answer) =>{
    var acount=0;
    var ecount=0;
    var icount=0;
    var ocount=0;
    var ucount=0;
    for(let i = 0;i < answer.length;i++){
        if(answer[i]=='a' || answer[i]=='A')
        {
            acount++;
        }
        if(answer[i]=='e' || answer[i]=='E')
        {
            ecount++;
        }
        if(answer[i]=='i' || answer[i]=='I')
        {
            icount++;
        }
        if(answer[i]=='o' || answer[i]=='O')
        {
            ocount++;
        }
        if(answer[i]=='u' || answer[i]=='U')
        {
            ucount++;
        }

    }
console.log(`Number of times a repeated is ${acount}
Number of times e repeated is ${ecount}
Number of times i repeated is ${icount}
Number of times o repeated is ${ocount}
Number of times u repeated is ${ucount}`);
    valFromRuntime.close();
})
