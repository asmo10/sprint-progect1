package repl.it;

public class _162_Methods_with_return_8_validate_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean validateTask(boolean notEmpty,int taskId,int currentId)
	  {
		if(notEmpty & taskId==currentId+1)
			return true;
		return false;
		
	  }
}
