int sumTwoSmallestNumbers(List<int> nums) {
  nums.sort();
  
  int n1 = nums[0];
  int n2 = nums[1];
  
 return (n1 + n2);
}