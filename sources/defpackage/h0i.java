package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0i implements Serializable, Iterable<Byte> {
    public static final t1i a = new t1i(p5i.b);
    public static final i1i b;
    private int zziy = 0;

    static {
        b = xzh.a() ? new cr8(25) : new vfd();
    }

    public static t1i b(int i, byte[] bArr, int i2) {
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (i3 < i) {
                l5.s(uz.d(66, i, i3, "Beginning index larger than ending index: ", ", "));
            } else {
                l5.s(uz.d(37, i3, length, "End index: ", " >= "));
            }
        }
        return new t1i(b.a(i, bArr, i2));
    }

    public abstract int a(int i, int i2);

    public abstract String c(Charset charset);

    public abstract boolean d();

    public final int e() {
        return this.zziy;
    }

    public abstract byte f(int i);

    public abstract byte g(int i);

    public final int hashCode() {
        int iA = this.zziy;
        if (iA == 0) {
            int size = size();
            iA = a(size, size);
            if (iA == 0) {
                iA = 1;
            }
            this.zziy = iA;
        }
        return iA;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new a1i(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
