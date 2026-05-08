package defpackage;

import com.google.android.gms.internal.firebase_remote_config.zzhq;
import defpackage.a5i;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class p5i {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new h2i(bArr, 0).d(0);
        } catch (zzhq e) {
            b0.s(e);
        }
    }

    public static a5i a(Object obj, Object obj2) {
        a5i.b bVarF = ((x8i) obj).f();
        x8i x8iVar = (x8i) obj2;
        if (bVarF.a.getClass().isInstance(x8iVar)) {
            bVarF.g((a5i) ((lzh) x8iVar));
            return bVarF.h();
        }
        l5.q("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
