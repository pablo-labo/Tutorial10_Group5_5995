package defpackage;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iqh {
    public static final aqh a;

    static {
        new eqh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new eqh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new fqh("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new fqh("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        a = new aqh(new yph("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract void a(StringBuilder sb, byte[] bArr, int i);

    public final String b(int i, byte[] bArr) {
        zih.b(0, i, bArr.length);
        yph yphVar = ((fqh) this).b;
        int i2 = yphVar.e;
        int i3 = yphVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(oqh.a(i, i3) * i2);
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            g7.l(e);
            return null;
        }
    }
}
