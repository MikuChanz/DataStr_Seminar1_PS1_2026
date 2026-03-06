package datastr;

public class MyArrayList {

//---------------------------------------------------mainigie-------------------------------------------------
	
	private char[] list;
	private final int DEFAULT_SIZE = 8;
	private int size = DEFAULT_SIZE;
	private int howManyElements = 0;

//---------------------------------------------------konstruktori-------------------------------------------------
	public MyArrayList() {
		list = new char[size];
	}
	
	public MyArrayList(int inputSize) {
		if(inputSize > 0) {
			size = inputSize;
		}
		
		list = new char[inputSize];
	}
//---------------------------------------------------pamatalgoritmu funkcijas-------------------------------------------------
	public boolean isEmpty() {
	/*	if(howManyElements == 0) {
			return true;
		}
		else
		{
			return false;
		}
		*/
		return(howManyElements == 0) ? true : false;
		/*int aa;
		if(howManyElements == 0) {
			aaa = 4*30;
		}
		else {
			aaa = 1000/4;
		}*/
		//aaa = (howManyElements == 0) ? 4 * 30 : 1000/4;
	}
	
	public boolean isFull() {
		return(howManyElements == size);
	}
	
	private void resize() {
		int largeSize = (howManyElements < 100)? size*2 : (int)(size * 1.5);
		
		char[] largeList = new char[largeSize];
		
		for(int i = 0; i < howManyElements; i++) {
			largeList[i] = list[i];
		}
		
		list = largeList;
		System.gc();//izdzesis no ram atminas mazo masivu jo tam vairs nav mainigais piesaistits
		size = largeSize;
	}
	
	public void add(char element) {
		if(isFull()) {
			resize();
		}
		
		list[howManyElements] = element;
		howManyElements++;
		
		//isaks pieraksts list[howManyElements++] = element;
		
		
	}
	
	public void add(char element, int index) throws Exception {
		if(index < 0) {
			throw (new Exception("Nevar pievienot elementu, jo index ir negativs"));
		}
	}
	//funkcijas definicija add(char element, int index)
	//parbaudit index vertibu, lai nav negativs
	//parbaudit index vertibu lai nav lielaks par howManyElements
	//abos gadijumos izmest iznemumu
	//parbaudit vai masivs nav pilns ja ir tad izsaukt resize
	//veikt elementu kopesanu no index sunas lidz beigam (no beigam lidz index sunai)
	//ielikt index suna jauno elementu
	//palielinat howManyelements par 1
}
