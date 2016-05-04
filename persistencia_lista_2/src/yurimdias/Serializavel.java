package yurimdias;

import java.io.Serializable;

/**
 * Created by Yuri on 03-May-16.
 */
public class Serializavel implements Serializable {

    private NaoSerializavel naoSerializavel;

    private Integer otherThing;

        public NaoSerializavel getNaoSerializavel() {
            return naoSerializavel;
    }

    public void setNaoSerializavel(NaoSerializavel naoSerializavel) {
        this.naoSerializavel = naoSerializavel;
    }

    public Integer getOtherThing() {
        return otherThing;
    }

    public void setOtherThing(Integer otherThing) {
        this.otherThing = otherThing;
    }
}
