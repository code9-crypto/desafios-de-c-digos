int duplicateCount(String text){
  text = text.toLowerCase();
  Map<String, int> letterMap = {};
  text.split("").forEach((letter){
    if(letterMap[letter] == null)
       letterMap[letter] = 1;
    else
       letterMap[letter]+=1;
  });
  return letterMap.values.where((value)=>value>1).length;
}