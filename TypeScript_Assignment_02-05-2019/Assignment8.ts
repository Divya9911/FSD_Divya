import * as readline from 'readline';

let userinput = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

//converting a decimal number to hexadecimal.
userinput.question('enter a decimal number', (decNum) => {
    let n = parseInt(decNum);
    let rem:number;
    let hexVal: string;
    let hexdec:string='';
    while(n!=0){
        rem = Math.floor( n % 16);
        n = Math.floor( n / 16 );
        if(rem >= 10){
            switch(rem){
                case 10: hexVal = 'A'; break;
                case 11: hexVal = 'B'; break;
                case 12: hexVal = 'c'; break;
                case 13: hexVal = 'D'; break;
                case 14: hexVal = 'E'; break;
                case 15: hexVal = 'F'; break;
            }
            hexdec = hexVal + hexdec;
        }
        else{
            hexdec = rem + hexdec; 
        }
    }
    console.log(hexdec);
    userinput.close();
});
