import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.io.InputStream;
class MySingleTon{
	public static MySingleTon obj; 

	public static MySingleTon getInstance(){
        	   if(obj == null)
               synchronized (MySingleTon.class) {  
	               if(obj == null)                       
	               		obj = new MySingleTon();
    		   }  
               return obj;
	}

	private MySingleTon(){

	}

	public void copyFileToFile(String src,String dest){
		try(FileInputStream fis = new FileInputStream(src);FileOutputStream fos = new FileOutputStream(dest)){ 
    		byte[]buf = new byte[1024]; 
            int n=0; 
            while((n = fis.read(buf, 0, buf.length)) != -1){ 
                fos.write(buf,0,n);  
                System.out.println("no of bytes_read:"+n);
            } 
        } catch(Exception ex){
            System.out.print(ex);
        }

	}
	public void copyUrlToFile(String src_url,String dest){ 
        try(InputStream is = new URL(src_url).openStream();FileOutputStream fos = new FileOutputStream(dest)){           
            byte[]buf = new byte[1024];
            int n=0;
            while ((n = is.read(buf, 0, buf.length)) != -1) {
                fos.write(buf,0,n); 
                System.out.println("no of bytes_read:"+n);
            }  
       } catch(Exception ex){
            System.out.print(ex);
        }
	}
}