class Solution {
  public double average(int[] salary) {
    Arrays.sort(salary);
    double sum = 0.0;

    int i = salary.length - 2;
    while (i != 0) {
      sum += salary[i--];
    }

    return sum / (salary.length - 2);
  }
}