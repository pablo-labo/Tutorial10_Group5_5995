package defpackage;

import com.google.android.gms.internal.play_billing.a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ivh implements Iterable, Serializable {
    public static final gvh a = new gvh(ezh.b);
    private int zza = 0;

    static {
        int i = yth.a;
    }

    public static int g(int i, int i2) {
        if (((i2 - i) | i) >= 0) {
            return i;
        }
        if (i < 0) {
            l5.s(p6.c(i, "Beginning index larger than ending index: 0, "));
            return 0;
        }
        l5.s(k20.l("End index: ", i, i2, " >= "));
        return 0;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int c();

    public abstract int d(int i, int i2);

    public abstract gvh e();

    public abstract void f(a aVar);

    public final int hashCode() {
        int iD = this.zza;
        if (iD == 0) {
            int iC = c();
            iD = d(iC, iC);
            if (iD == 0) {
                iD = 1;
            }
            this.zza = iD;
        }
        return iD;
    }

    public final int i() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new xuh(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return l6.i(w40.h(c(), "<ByteString@", hexString, " size=", " contents=\""), c() <= 50 ? wuf.k(this) : wuf.k(e()).concat("..."), "\">");
    }
}
