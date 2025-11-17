function binCount(num){

    return num.toString(2).split("").filter(x => x == 1).length

}

console.log(binCount(1234))