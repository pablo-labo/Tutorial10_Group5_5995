package defpackage;

import com.google.android.gms.internal.measurement.zzev;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fvh implements Serializable, Iterable<Byte> {
    public static final yvh a = new yvh(mzh.b);
    public static final ovh b;
    private int zzc = 0;

    static {
        b = duh.a() ? new msb() : new mvh();
    }

    public static yvh f(int i, byte[] bArr, int i2) {
        j(i, i + i2, bArr.length);
        return new yvh(b.b(i, bArr, i2));
    }

    public static int j(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i >= 0) {
            if (i2 < i) {
                l5.s(uz.d(66, i, i2, "Beginning index larger than ending index: ", ", "));
                return 0;
            }
            l5.s(uz.d(37, i2, i3, "End index: ", " >= "));
            return 0;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Beginning index: ");
        sb.append(i);
        sb.append(" < 0");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract int c(int i, int i2);

    public abstract String d(Charset charset);

    public abstract yvh e();

    public abstract void g(zzev.a aVar);

    public final int hashCode() {
        int iC = this.zzc;
        if (iC == 0) {
            int iB = b();
            iC = c(iB, iB);
            if (iC == 0) {
                iC = 1;
            }
            this.zzc = iC;
        }
        return iC;
    }

    public abstract byte i(int i);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new arh(this);
    }

    public final int k() {
        return this.zzc;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return l6.i(w40.h(b(), "<ByteString@", hexString, " size=", " contents=\""), b() <= 50 ? qqh.a(this) : qqh.a(e()).concat("..."), "\">");
    }

    public abstract boolean zzc();
}
