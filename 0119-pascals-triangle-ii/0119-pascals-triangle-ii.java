class Solution {
    public List<Integer> getRow(int rowIndex) {
       ArrayList<Integer> row=new ArrayList<>();
           long m=1;
              for(int j=0;j<=rowIndex;j++){
                    row.add((int)m);
                        m=m*(rowIndex-j)/(j+1);
                }
                              return row;
    }
}