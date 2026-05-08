package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tv6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f7  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.jhf r33, final int r34, final java.lang.String r35, final java.lang.String r36, final java.lang.String r37, final defpackage.gu5 r38, final defpackage.ah2 r39, final kotlin.jvm.functions.Function1 r40, androidx.compose.ui.e r41, java.lang.String r42, final java.lang.String r43, androidx.compose.runtime.b r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.a(jhf, int, java.lang.String, java.lang.String, java.lang.String, gu5, ah2, kotlin.jvm.functions.Function1, androidx.compose.ui.e, java.lang.String, java.lang.String, androidx.compose.runtime.b, int):void");
    }

    public static final void b(final e eVar, final int i, final gu5 gu5Var, final String str, final ah2 ah2Var, b bVar, final int i2) {
        int i3;
        c cVarH = bVar.h(70734523);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cVarH.a(false) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i2 & 24576) == 0) {
            i3 |= cVarH.K(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= cVarH.x(ah2Var) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && cVarH.i()) {
            cVarH.D();
        } else {
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            vs0.i iVar = new vs0.i(8.0f, true, new us0(0));
            e eVarC = g.c(eVar, 1.0f);
            cVarH.L(5004770);
            boolean z = (i3 & 57344) == 16384;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new ap6(str, 1);
                cVarH.p(objV);
            }
            cVarH.U(false);
            e eVarB = b5e.b(eVarC, false, (Function1) objV);
            cVarH.L(5004770);
            boolean z2 = (i3 & 896) == 256;
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new zb(4, gu5Var);
                cVarH.p(objV2);
            }
            cVarH.U(false);
            e eVarF = f.f(androidx.compose.foundation.b.d(eVarB, true, null, null, (gu5) objV2, 14), 12.0f);
            ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC2, gl2.a.d);
            ah2Var.q(ghd.a, cVarH, Integer.valueOf(((i3 >> 12) & 112) | 6));
            cif.b("+" + i, null, o97Var.c.a.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777215), cVarH, 0, 0, 65530);
            cVarH = cVarH;
            ev6.b(fv6.E1, null, null, null, 0L, null, cVarH, 6, 62);
            cVarH.U(true);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: mv6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tv6.b(eVar, i, gu5Var, str, ah2Var, (b) obj, ka2.L(i2 | 1));
                    return j6g.a;
                }
            };
        }
    }
}
