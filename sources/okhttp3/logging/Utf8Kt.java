package okhttp3.logging;

import defpackage.zn1;
import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
public final class Utf8Kt {
    public static final boolean a(zn1 zn1Var) {
        zn1 zn1Var2;
        int i;
        zn1Var.getClass();
        try {
            zn1Var2 = new zn1();
            long j = zn1Var.b;
            long j2 = 64;
            if (j <= 64) {
                j2 = j;
            }
            zn1Var.G(zn1Var2, 0L, j2);
        } catch (EOFException unused) {
        }
        for (i = 0; i < 16; i++) {
            if (zn1Var2.W0()) {
                return true;
            }
            int iJ0 = zn1Var2.j0();
            if (Character.isISOControl(iJ0) && !Character.isWhitespace(iJ0)) {
                return false;
            }
        }
        return true;
    }
}
