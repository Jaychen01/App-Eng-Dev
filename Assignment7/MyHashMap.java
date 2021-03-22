package Assignment7;

public class MyHashMap {

	class ListNode{
		
		int key, value;
		ListNode next;
		
		ListNode(int key,int value){
			this.key = key;
			this.value = value;
		}
	}
	
	private ListNode[] listNode;
	
	public MyHashMap() {
		listNode = new ListNode[7*13];
	}

	public void put(int key, int value) {
		
		int po = key % listNode.length;
		ListNode pre = listNode[po];
		if (pre == null) {
			listNode[po] = new ListNode(key, value);
			return;
		}
		if (pre.key == key) {
			pre.value = value;
			return;
		}
		while (pre.next != null && pre.next.key != key) {
			pre = pre.next;
		}
		
		if (pre.next == null) {
			pre.next = new ListNode(key, value);
		}else {
			pre.next.value = value;
		}
	}

	public int get(int key) {
		
		ListNode pre = listNode[key % listNode.length];
		if(pre == null) {
			return -1;
		}
		if(pre.key == key) {
			return pre.value;
		}
		while (pre.next != null && pre.next.key != key) {
			pre = pre.next;
		}
		
		if(pre.next == null) {
			return -1;
		}else {
			return pre.next.value;
		}
		
	}

	public void remove(int key) {
		
		ListNode pre = listNode[key % listNode.length];
		if(pre == null) {
			return;
		}
		if(pre.key == key) {
			listNode[key % listNode.length] = pre.next;
			return;
		}
		while (pre.next != null && pre.next.key != key) {
			pre = pre.next;
		}
		if (pre.next != null) {
			pre.next = pre.next.next;
		}
	}
	
	public static void main(String[] args) {
		
		MyHashMap hashMap = new MyHashMap();
		hashMap.put(1, 1);
		hashMap.put(2, 2);
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(3));
		hashMap.put(2, 1);
		System.out.println(hashMap.get(2));
		hashMap.remove(2);
		System.out.println(hashMap.get(2));

	}
}
