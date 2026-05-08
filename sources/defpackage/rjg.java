package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.avro.SystemLimitException;

/* JADX INFO: loaded from: classes3.dex */
public final class rjg implements Comparable<rjg>, CharSequence, Externalizable {
    public static final byte[] a = new byte[0];
    private byte[] bytes;
    private int hash;
    private int length;
    private String string;

    public rjg(rjg rjgVar) {
        this.length = rjgVar.length;
        this.bytes = Arrays.copyOf(rjgVar.bytes, rjgVar.length);
        this.string = rjgVar.string;
        this.hash = rjgVar.hash;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rjg rjgVar) {
        return of1.a(this.bytes, this.length, rjgVar.bytes, rjgVar.length);
    }

    public final int c() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return toString().charAt(i);
    }

    public final byte[] e() {
        return this.bytes;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rjg)) {
            return false;
        }
        rjg rjgVar = (rjg) obj;
        if (this.length != rjgVar.length) {
            return false;
        }
        byte[] bArr = rjgVar.bytes;
        for (int i = 0; i < this.length; i++) {
            if (this.bytes[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(rjg rjgVar) {
        int length = this.bytes.length;
        int i = rjgVar.length;
        if (length < i) {
            this.bytes = new byte[i];
        }
        this.length = i;
        System.arraycopy(rjgVar.bytes, 0, this.bytes, 0, i);
        this.string = rjgVar.string;
        this.hash = rjgVar.hash;
    }

    public final void h(int i) {
        SystemLimitException.e(i);
        byte[] bArr = this.bytes;
        if (bArr.length < i) {
            this.bytes = Arrays.copyOf(bArr, i);
        }
        this.length = i;
        this.string = null;
        this.hash = 0;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            byte[] bArr = this.bytes;
            int i2 = this.length;
            for (int i3 = 0; i3 < i2; i3++) {
                i = (i * 31) + bArr[i3];
            }
            this.hash = i;
        }
        return i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return toString().length();
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        h(objectInput.readInt());
        objectInput.readFully(this.bytes);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.length;
        if (i == 0) {
            return "";
        }
        if (this.string == null) {
            this.string = new String(this.bytes, 0, i, StandardCharsets.UTF_8);
        }
        return this.string;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.bytes.length);
        objectOutput.write(this.bytes);
    }

    public rjg(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        SystemLimitException.e(length);
        this.bytes = bytes;
        this.length = length;
        this.string = str;
    }

    public rjg() {
        this.bytes = a;
    }

    public rjg(byte[] bArr) {
        int length = bArr.length;
        SystemLimitException.e(length);
        this.bytes = bArr;
        this.length = length;
    }
}
