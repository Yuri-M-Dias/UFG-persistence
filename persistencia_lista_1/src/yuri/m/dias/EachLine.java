package yuri.m.dias;

/**
 * Simply holds a line length to a byte[]
 * Created by Yuri on 26-Apr-16.
 */
public class EachLine {

    private Integer size;

    private byte[] bytes;

    public EachLine(byte[] bytes) {
        this.bytes = bytes;
        this.size = this.bytes.length;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
