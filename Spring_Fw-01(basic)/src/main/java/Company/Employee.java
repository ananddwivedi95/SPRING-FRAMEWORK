package Company;

public class Employee {
private String ename;
private String eid;
Address add;
public Employee(String ename, String eid, Address add) {
	super();
	this.ename = ename;
	this.eid = eid;
	this.add = add;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", eid=" + eid + ", add=" + add + "]";
}

}
