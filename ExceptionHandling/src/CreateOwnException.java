//class lowbalance extends Exception{
//	   @override
//		public String toString() {
//			return "Your balnce is low you cannot Withdraw money.";
//					}
//		
//	}
//class Exp {
//
//	public void low() {
//		try {
//			throw new lowbalance();
//		}
//		catch (lowbalance e) {
//			System.out.println(e);
//			
//		}
//	}
//}

@SuppressWarnings("serial")
class LowBalanceException extends Exception
{
    public String toString()
    {
        return "Balance Should not be less than 5000";
    }
}

class CheckedUnchecked 
{
    static void fun1()
    {
        try
        {
            throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
    }
    
    static void fun2()
    {
        fun1();
    }
    
    void fun3()
    {
        fun2();
    }
    
  
}
public class CreateOwnException {
    public static void main(String[] args) 
    {
    	CheckedUnchecked obj = new CheckedUnchecked();
       obj.fun3();
    } 
	}


