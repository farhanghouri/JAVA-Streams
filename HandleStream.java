
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.io.InputStream;
class HandleStream{
	public void copyFileToFile(String src,String dest){
		try{ 
    		FileInputStream fis = new FileInputStream(src); 
    		FileOutputStream fos = new FileOutputStream(dest);
    		byte[]buf = new byte[1024]; 
            int n=0; 
            while((n = fis.read(buf, 0, buf.length)) != -1){ 
                fos.write(buf,0,n);  
                System.out.println("no of bytes_read:"+n);
            }
            fis.close();
            fos.close();
        } catch(Exception ex){
            System.out.print(ex);
        }

	}
	public void copyUrlToFile(String src_url,String dest){
        try{
            URL url = new URL(src_url);
            InputStream is = url.openStream();
            FileOutputStream fos = new FileOutputStream(dest);
            byte[]buf = new byte[1024];
            int n=0;
            while ((n = is.read(buf, 0, buf.length)) != -1) {
                fos.write(buf,0,n); 
                System.out.println("no of bytes_read:"+n);
            } 
            is.close();
            fos.close();
       } catch(Exception ex){
            System.out.print(ex);
        }
	}
}