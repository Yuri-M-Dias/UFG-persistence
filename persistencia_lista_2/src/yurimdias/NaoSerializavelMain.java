package yurimdias;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NaoSerializavelMain {

    public static void main(String[] args) throws IOException {
        Serializavel fakeSerializavel = new Serializavel();
        fakeSerializavel.setOtherThing(56);
        NaoSerializavel naoSerializavel = new NaoSerializavel();
        naoSerializavel.setNothing(null);
        naoSerializavel.setSomething(56);
        fakeSerializavel.setNaoSerializavel(naoSerializavel);
        System.out.println(TamanhoEmBytes(fakeSerializavel));
    }

    public static int TamanhoEmBytes(Serializable s) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(s);
        oos.close();
        return baos.toByteArray().length;
    }

}

