package src;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectoutputStream extends ObjectOutputStream{
    MyObjectoutputStream() throws IOException{
        super();
    }
    MyObjectoutputStream(OutputStream o) throws IOException{
        super(o);
    }

    public void writeStreamHeader(){
        
    }
}
