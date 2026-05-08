package okhttp3.internal.ws;

import defpackage.bg;
import defpackage.p6;
import defpackage.r6;
import defpackage.zn1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSocketProtocol {
    public static final WebSocketProtocol a = new WebSocketProtocol();

    private WebSocketProtocol() {
    }

    public static String a(int i) {
        if (i < 1000 || i >= 5000) {
            return p6.c(i, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return bg.d(i, "Code ", " is reserved and may not be used.");
    }

    public static void b(zn1.c cVar, byte[] bArr) {
        long j;
        cVar.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = cVar.e;
            int i2 = cVar.f;
            int i3 = cVar.V;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = cVar.d;
            zn1 zn1Var = cVar.a;
            zn1Var.getClass();
            if (j2 == zn1Var.b) {
                r6.g("no more bytes");
                return;
            }
            j = cVar.d;
        } while (cVar.h(j == -1 ? 0L : j + ((long) (cVar.V - cVar.f))) != -1);
    }
}
