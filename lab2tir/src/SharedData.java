import java.util.ArrayList;

/**
 * @author reema
 *This class represents shared data between multiple threads in a solution.
  *It contains an ArrayList of Integers, a boolean array, a boolean flag, and an integer b.
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	

	/**
	 * @param array2 ArrayList of Integers to be stored in the SharedData object
	 * @param b integer to be stored in the SharedData object
	 */
	public SharedData(ArrayList<Integer> array2, int b) {
		
		this.array = array2;
		this.b = b;
	}
	
	/**
	 * Getter method for the winArray attribute.
	   @return boolean array representing winning information.

	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Setter method for the winArray attribute.
     * @param winArray boolean array representing winning information to be set.
	 */
	
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}


	/** Getter method for the array attribute.
	*@return ArrayList of Integers containing the stored data
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	
	/**
	 *Getter method for the b attribute.
	 * @return integer b stored in the SharedData object
	 */
	public int getB() 
	{
		return b;
	}


	/** Getter method for the flag attribute.
	 *@return boolean flag indicating if a thread has finished
	 */
	public boolean getFlag() 
	{
		return flag;
	}
	

	/**
	 * Setter method for the flag attribute.
	 *@param flag boolean indicating if a thread has finished to be set.
	 */
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
