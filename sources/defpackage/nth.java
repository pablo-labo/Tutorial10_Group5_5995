package defpackage;

import com.google.android.gms.internal.fido.zzdq;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nth implements Comparable {
    public static int e(byte b) {
        return (b >> 5) & 7;
    }

    public static void f(String str) {
        new hth(str);
    }

    public static nth h(byte... bArr) {
        bArr.getClass();
        wth wthVar = new wth(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return qth.a(wthVar);
        } finally {
            try {
                wthVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final nth c(Class cls) throws zzdq {
        if (cls.isInstance(this)) {
            return (nth) cls.cast(this);
        }
        throw new zzdq(t40.l("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}
