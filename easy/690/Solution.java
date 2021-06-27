/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
	/*
	时间换空间
	
	执行用时：11 ms, 在所有 Java 提交中击败了15.14%的用户
	内存消耗：39.3 MB, 在所有 Java 提交中击败了99.27%的用户
	*/
    public int getImportance(List<Employee> employees, int id) {
        List<Integer> list = new LinkedList<>();
        list.add(id);
        int point=0;
        int sum=0;
        while(!list.isEmpty()){
            int ID = list.remove(0);
            for(point=0;point<employees.size();point++){
                if(employees.get(point).id==ID) break;
            }
            sum+=employees.get(point).importance;
            for(int i=0;i<employees.get(point).subordinates.size();i++){
                list.add(employees.get(point).subordinates.get(i));
            }
        }
        return sum;
    }
	/*
	用Map，多多少少还是省了一点时间开销，但是把employees从List转换成Map需要的时间比较长
	这里应该可以用类似树的前中后序遍历的思想来做，一会试试
	
	执行用时：10 ms, 在所有 Java 提交中击败了18.66%的用户
	内存消耗：39.7 MB, 在所有 Java 提交中击败了85.83%的用户
	*/
	public int getImportance(List<Employee> employees, int id) {
        Map<Integer,int[]> map = new HashMap<>();
        for(int i=0;i<employees.size();i++){
            int[] ll = new int[1+employees.get(i).subordinates.size()];
            ll[0]=employees.get(i).importance;
            for(int j=0;j<employees.get(i).subordinates.size();j++){
                ll[j+1]=employees.get(i).subordinates.get(j);
            }
            map.put(employees.get(i).id,ll);
        }
        List<Integer> list = new LinkedList<>();
        int sum=0;
        list.add(id);
        while(!list.isEmpty()){
            int ID = list.remove(0);
            sum+=map.get(ID)[0];
            for(int i=0;i<map.get(ID).length-1;i++) list.add(map.get(ID)[i+1]);
        }
        return sum;
    }
}