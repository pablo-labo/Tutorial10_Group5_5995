package defpackage;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r42 {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public static final class a {
        public static r42 a(String str) {
            str.getClass();
            List listK0 = zve.k0(str, new String[]{";"});
            if (listK0.size() != 3) {
                h5.k(ja.f('`', "Failed to split encrypted text `", str));
                return null;
            }
            byte[] bArrDecode = Base64.decode((String) listK0.get(0), 2);
            bArrDecode.getClass();
            byte[] bArrDecode2 = Base64.decode((String) listK0.get(1), 2);
            bArrDecode2.getClass();
            byte[] bArrDecode3 = Base64.decode((String) listK0.get(2), 2);
            bArrDecode3.getClass();
            return new r42(bArrDecode, bArrDecode2, bArrDecode3);
        }
    }

    public r42(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
    }
}
