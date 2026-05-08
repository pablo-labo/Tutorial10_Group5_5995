package okhttp3.internal.sse;

import defpackage.b0;
import defpackage.pva;
import defpackage.to1;
import defpackage.vr1;
import defpackage.zn1;
import java.io.EOFException;
import kotlin.Metadata;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/sse/ServerSentEventReader;", "", "Callback", "Companion", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ServerSentEventReader {
    public static final Companion d = new Companion(0);
    public static final pva e;
    public static final vr1 f;
    public final to1 a;
    public final RealEventSource b;
    public String c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/sse/ServerSentEventReader$Callback;", "", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
    }

    static {
        vr1 vr1Var = vr1.c;
        e = pva.a.b(vr1.a.c("\r\n"), vr1.a.c("\r"), vr1.a.c("\n"), vr1.a.c("data: "), vr1.a.c("data:"), vr1.a.c("data\r\n"), vr1.a.c("data\r"), vr1.a.c("data\n"), vr1.a.c("id: "), vr1.a.c("id:"), vr1.a.c("id\r\n"), vr1.a.c("id\r"), vr1.a.c("id\n"), vr1.a.c("event: "), vr1.a.c("event:"), vr1.a.c("event\r\n"), vr1.a.c("event\r"), vr1.a.c("event\n"), vr1.a.c("retry: "), vr1.a.c("retry:"));
        f = vr1.a.c("\r\n");
    }

    public ServerSentEventReader(to1 to1Var, RealEventSource realEventSource) {
        to1Var.getClass();
        this.a = to1Var;
        this.b = realEventSource;
    }

    public final boolean a() throws EOFException {
        String strI0 = this.c;
        zn1 zn1Var = new zn1();
        while (true) {
            String strI02 = null;
            while (true) {
                to1 to1Var = this.a;
                pva pvaVar = e;
                int iE0 = to1Var.E0(pvaVar);
                if (iE0 >= 0 && iE0 < 3) {
                    if (zn1Var.b == 0) {
                        return true;
                    }
                    this.c = strI0;
                    zn1Var.skip(1L);
                    String strZ1 = zn1Var.z1();
                    RealEventSource realEventSource = this.b;
                    realEventSource.a.b(realEventSource, strI02, strZ1);
                    return true;
                }
                vr1 vr1Var = f;
                Companion companion = d;
                if (3 <= iE0 && iE0 < 5) {
                    companion.getClass();
                    zn1Var.r0(10);
                    to1Var.C0(zn1Var, to1Var.Z(vr1Var));
                    to1Var.E0(pvaVar);
                } else if (5 <= iE0 && iE0 < 8) {
                    zn1Var.r0(10);
                } else if (8 <= iE0 && iE0 < 10) {
                    strI0 = to1Var.i0();
                    if (strI0.length() <= 0) {
                        strI0 = null;
                    }
                } else if (10 <= iE0 && iE0 < 13) {
                    strI0 = null;
                } else if (13 <= iE0 && iE0 < 15) {
                    strI02 = to1Var.i0();
                    if (strI02.length() > 0) {
                    }
                } else if (15 > iE0 || iE0 >= 18) {
                    if (18 <= iE0 && iE0 < 20) {
                        companion.getClass();
                        String strI03 = to1Var.i0();
                        byte[] bArr = Util.a;
                        try {
                            Long.parseLong(strI03);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        if (iE0 != -1) {
                            b0.t();
                            return false;
                        }
                        long jZ = to1Var.Z(vr1Var);
                        if (jZ == -1) {
                            return false;
                        }
                        to1Var.skip(jZ);
                        to1Var.E0(pvaVar);
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/sse/ServerSentEventReader$Companion;", "", "<init>", "()V", "Lvr1;", "CRLF", "Lvr1;", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
