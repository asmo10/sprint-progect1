package repl.it;

public class _163_Methods_with_return_9_simple_room_booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
		 if(isAvailable & year==2018) {
			   if(month==7 & day>1 & day <8) return false;
			   return true;
		   }
		   return false;
	  }
}
