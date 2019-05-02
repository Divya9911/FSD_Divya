var arr : number[][];
arr = [[1,2,3],[4,5,6],[7,8,9]];
for(var i=0 ; i<3 ;i++){
    for(var j = 0; j<3; j++){
        if(i==0)
        {
            console.log(arr[i][j]);
        }
        if(i==1)
        {
            if(j<=1){
            console.log(arr[i][j]);
            }
        }
        if(i==2)
        {
            if(j<1){
            console.log(arr[i][j]);
            }
        }
    }}
