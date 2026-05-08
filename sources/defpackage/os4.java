package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import defpackage.o97;

/* JADX INFO: loaded from: classes3.dex */
public final class os4 {
    /* JADX WARN: Removed duplicated region for block: B:103:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.ks4 r40, boolean r41, boolean r42, androidx.compose.runtime.b r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os4.a(ks4, boolean, boolean, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void b(ks4 ks4Var, b bVar, int i) {
        int i2;
        ?? r2;
        boolean z;
        String str = ks4Var.g;
        c cVarH = bVar.h(-1491002043);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(ks4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            if (str != null) {
                cVarH.L(110078133);
                boolean z2 = ks4Var.i;
                int i3 = 3;
                b.a.C0020a c0020a = b.a.a;
                if (z2) {
                    cVarH.L(110111954);
                    boolean zX = cVarH.x(ks4Var);
                    Object objV = cVarH.v();
                    if (zX || objV == c0020a) {
                        objV = new le(ks4Var, i3);
                        cVarH.p(objV);
                    }
                    ck7.a(0, (gu5) objV, cVarH, str);
                    cVarH.U(false);
                    z = false;
                } else {
                    cVarH.L(110267264);
                    String str2 = ks4Var.g;
                    o97.g gVar = o97Var.i;
                    e eVarE = f.e(e.a.b, f.b(13.0f, 4.0f, 0.0f, 4.0f, 4));
                    fv6 fv6Var = fv6.q0;
                    boolean zX2 = cVarH.x(ks4Var);
                    Object objV2 = cVarH.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new qr(ks4Var, 3);
                        cVarH.p(objV2);
                    }
                    z = false;
                    gt6.h(str2, (gu5) objV2, eVarE, null, false, false, null, fv6Var, null, cVarH, 12582912, 376);
                    cVarH.U(false);
                }
            } else {
                z = false;
                cVarH.L(104854013);
            }
            cVarH.U(z);
            r2 = z;
        } else {
            r2 = 0;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ns4(ks4Var, i, r2);
        }
    }
}
