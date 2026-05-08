package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes.dex */
public final class iq1 {
    public static final hza a = new hza(16.0f, 8.0f, 16.0f, 8.0f);
    public static final float b = 64.0f;
    public static final float c = 36.0f;
    public static final hza d = new hza(8.0f, 8.0f, 8.0f, 8.0f);

    public static wl3 a(long j, long j2, b bVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = ((kb2) bVar.M(lb2.a)).d();
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = lb2.b(j3, bVar);
        }
        long j4 = j2;
        jte jteVar = lb2.a;
        long jX = pnb.x(da2.b(((kb2) bVar.M(jteVar)).c(), 0.12f), ((kb2) bVar.M(jteVar)).f());
        long jC = ((kb2) bVar.M(jteVar)).c();
        long j5 = ((da2) bVar.M(ps2.a)).a;
        if (((kb2) bVar.M(jteVar)).g()) {
            pnb.J(j5);
        } else {
            pnb.J(j5);
        }
        return new wl3(j3, j4, jX, da2.b(jC, 0.38f));
    }

    public static wl3 b(long j, long j2, b bVar, int i) {
        if ((i & 1) != 0) {
            j = ((kb2) bVar.M(lb2.a)).f();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = ((kb2) bVar.M(lb2.a)).d();
        }
        long j4 = j2;
        jte jteVar = lb2.a;
        long jC = ((kb2) bVar.M(jteVar)).c();
        long j5 = ((da2) bVar.M(ps2.a)).a;
        if (((kb2) bVar.M(jteVar)).g()) {
            pnb.J(j5);
        } else {
            pnb.J(j5);
        }
        return new wl3(j3, j4, j3, da2.b(jC, 0.38f));
    }

    public static wl3 c(long j, b bVar, int i) {
        long j2 = da2.h;
        if ((i & 2) != 0) {
            j = ((kb2) bVar.M(lb2.a)).d();
        }
        long j3 = j;
        jte jteVar = lb2.a;
        long jC = ((kb2) bVar.M(jteVar)).c();
        long j4 = ((da2) bVar.M(ps2.a)).a;
        if (((kb2) bVar.M(jteVar)).g()) {
            pnb.J(j4);
        } else {
            pnb.J(j4);
        }
        return new wl3(j2, j3, j2, da2.b(jC, 0.38f));
    }
}
