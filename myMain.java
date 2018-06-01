
class myMain{
	public static void main(String []args){
		
		HandleStream hs = new HandleStream();
		hs.copyFileToFile("abc.txt","new.txt");
		hs.copyUrlToFile("https://fthmb.tqn.com/223HGgffTmtjGC3c5t9RLVTJmZY=/768x0/filters:no_upscale():max_bytes(150000):strip_icc()/shutterstock_260012552-403-forbidden-5a2eecaa22fa3a0037adc0d2.png"
			,"download.png");

		/*****
			using singleton pattern
		*/
	   // MySingleTon obj =  MySingleTon.getInstance(); 
	    //obj.copyFileToFile("abc.txt","new.txt");
	  //  obj.copyUrlToFile("https://fthmb.tqn.com/223HGgffTmtjGC3c5t9RLVTJmZY=/768x0/filters:no_upscale():max_bytes(150000):strip_icc()/shutterstock_260012552-403-forbidden-5a2eecaa22fa3a0037adc0d2.png"
		//	,"download.png");
 
	}

	 
}