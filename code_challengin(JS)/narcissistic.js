function narcissistic(value){
    const vect = value.toString()

    let digits = vect.length
    let total = 0

    vect.split("").forEach(el => {
        total += Math.pow(el, digits)
    });

    return parseInt(total) == parseInt(value)
}

console.log(narcissistic(234))