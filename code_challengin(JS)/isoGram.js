function isIsogram(str){
    /*let obj = {}
    let memory

    str.toLowerCase().split("").forEach((ltr) => {
        obj[ltr.toLowerCase()] = (obj[ltr.toLowerCase()] ?? 0) + 1        
    })

    memory = Object.values(obj).includes(2) ? false : true

    return memory*/

    //VERSÃO BEM MAIS ENXUTA, MELHORADA E FACIL DE LER
    return new Set(str.toUpperCase()).size == str.length;
}

console.log(isIsogram("ester"))