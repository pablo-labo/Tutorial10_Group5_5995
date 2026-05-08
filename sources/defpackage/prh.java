package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class prh implements Iterable, Serializable {
    public static final krh a = new krh(osh.a);
    private int zzc = 0;

    static {
        int i = zqh.a;
    }

    public static int g(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            l5.s(bg.d(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            l5.s(k20.l("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        l5.s(k20.l("End index: ", i2, i3, " >= "));
        return 0;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int c();

    public abstract void d(int i, byte[] bArr);

    public abstract int e(int i, int i2);

    public abstract krh f(int i, int i2);

    public final int hashCode() {
        int iE = this.zzc;
        if (iE == 0) {
            int iC = c();
            iE = e(iC, iC);
            if (iE == 0) {
                iE = 1;
            }
            this.zzc = iE;
        }
        return iE;
    }

    public final int i() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new crh(this);
    }

    public final byte[] j() {
        int iC = c();
        if (iC == 0) {
            return osh.a;
        }
        byte[] bArr = new byte[iC];
        d(iC, bArr);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return l6.i(w40.h(c(), "<ByteString@", hexString, " size=", " contents=\""), c() <= 50 ? zte.i(this) : zte.i(f(0, 47)).concat("..."), "\">");
    }
}
