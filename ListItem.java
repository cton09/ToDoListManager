
public class ListItem implements Comparable<ListItem>{

	// fields
	private int priority;
	private String item;
	
	public ListItem(int x, String item) {
		this.setPriority(x);
		this.setItem(item);
	}
	
	@Override
	public int compareTo(ListItem itm) {
		int retVal = this.priority - itm.priority;
		// retVal is > 0 -- caller is Lower
		return retVal;
	}
	
	public String toString() {
		return priority + item;
	}
	

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
