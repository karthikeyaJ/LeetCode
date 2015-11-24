package StrToInt;

 class ListNode {
	 
	     int val;
	     ListNode next;
	     ListNode(int x)
	     { 
	    	 val = x;
	     }
	     int getValue(ListNode n1)
	     {
	    	 return n1.val;
	     }
	     
	     ListNode addNode(ListNode old_,ListNode new_){
	    	 ListNode temp=old_;
	    	 while(old_.next!=null)
	    		 old_=old_.next;
	    	 old_.next=new_;
	    	 new_.next=null;
	    	 return temp;
	     }
	  
	     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode res = null;
		int borrow=0;
		while(l1!=null)
		{
			int sum=l1.getValue(l1)+l2.getValue(l2);
		
		if(sum+borrow>=10)
				{
					int value=0+borrow;
					if(res==null)
					{
						res=new ListNode(value);
						res.next=null;
						borrow=1;
						l1=l1.next;
						l2=l2.next;
						
					}
					else
					{
						ListNode res2=new ListNode(value);
						res=res2.addNode(res,res2);
						borrow=1;
						l1=l1.next;
						l2=l2.next;
						
					}
				}
		else
		{
			if(res==null)
			{
				res=new ListNode(sum+borrow);
				res.next=null;
				borrow=0;
				l1=l1.next;
				l2=l2.next;
				
			}
			else
			{
				ListNode res2=new ListNode(sum+borrow);
				res=res2.addNode(res,res2);
				borrow=0;
				l1=l1.next;
				l2=l2.next;
				
			}
		}
		}	
		if(borrow!=0)
		{
		ListNode res3=new ListNode(borrow);
		res3.next=null;
		res=res3.addNode(res, res3);
		}	 
	    return res;

	     }
	     
	     
	     public ListNode reverse(ListNode l1)
	     {
			return l1;
	         
	         
	     }
}
 
 public class ListNodeTest{
 public static void main(String[] args)
 {
//	 ListNode ln11=new ListNode(2);
//	 ln11.next=null;
//	 ListNode ln12=new ListNode(4);
//	 ln11.next=ln12;
//	 ListNode ln13=new ListNode(3);
//	 ln12.next=ln13;
//	 
//	 
//	 ListNode ln21=new ListNode(5);
//	 ListNode ln22=new ListNode(6);
//	 ListNode ln23=new ListNode(4);
//	 ln21.next=ln22;
//	 ln22.next=ln23;
//	 ln23.next=null;
	 
	 ListNode ln11=new ListNode(0);
	 ListNode ln21=new ListNode(0);


	 ListNode result=ln11.addTwoNumbers(ln11, ln21);
	 
	 while(result!=null)
	 {
     System.out.println(result.getValue(result));
	 if(result.next!=null)
	 result=result.next;
	 else
		 break;
	 }
 }
}