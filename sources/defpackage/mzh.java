package defpackage;

import com.google.android.gms.internal.measurement.zzfw;
import defpackage.dzh;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class mzh {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw zzfw.b();
            }
            if (length > Integer.MAX_VALUE) {
                throw zzfw.a();
            }
        } catch (zzfw e) {
            b0.s(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static dzh b(Object obj, Object obj2) {
        dzh.a aVarF = ((l3i) obj).f();
        l3i l3iVar = (l3i) obj2;
        if (aVarF.a.getClass().isInstance(l3iVar)) {
            aVarF.h((dzh) ((zth) l3iVar));
            return aVarF.l();
        }
        l5.q("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
