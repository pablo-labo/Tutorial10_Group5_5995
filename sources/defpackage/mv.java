package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mv {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b A[PHI: r11
  0x006b: PHI (r11v29 int) = (r11v0 int), (r11v5 int), (r11v6 int) binds: [B:40:0x0069, B:50:0x0081, B:49:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r18, final defpackage.gu5<defpackage.j6g> r19, boolean r20, int r21, defpackage.gza r22, androidx.compose.ui.e r23, defpackage.fv6 r24, androidx.compose.runtime.b r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv.a(java.lang.String, gu5, boolean, int, gza, androidx.compose.ui.e, fv6, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r19, final defpackage.gu5 r20, androidx.compose.ui.e r21, int r22, final boolean r23, final boolean r24, boolean r25, final defpackage.ah2 r26, androidx.compose.runtime.b r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv.b(java.lang.String, gu5, androidx.compose.ui.e, int, boolean, boolean, boolean, ah2, androidx.compose.runtime.b, int, int):void");
    }

    public static final void c(final String str, final gu5<j6g> gu5Var, final Integer num, final boolean z, fv6 fv6Var, final wu5<? super ml1, ? super b, ? super Integer, j6g> wu5Var, b bVar, final int i, final int i2) {
        int i3;
        final fv6 fv6Var2;
        x2b x2bVarA;
        boolean z2;
        c cVarF = q6.f(294043825, gu5Var, bVar, str);
        if ((i & 6) == 0) {
            i3 = (cVarF.K(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarF.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cVarF.K(num) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i3 |= cVarF.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= cVarF.d(fv6Var == null ? -1 : fv6Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cVarF.x(wu5Var) ? 131072 : 65536;
        }
        if (cVarF.o(i3 & 1, (74899 & i3) != 74898)) {
            fv6 fv6Var3 = i4 != 0 ? null : fv6Var;
            o97 o97Var = (o97) cVarF.M(p97.a);
            af1.b bVar2 = c20.a.j;
            af1.b bVar3 = z ? bVar2 : c20.a.k;
            vs0.j jVar = vs0.a;
            ehd ehdVarA = chd.a(jVar, bVar2, cVarF, 0);
            af1.b bVar4 = bVar3;
            int iHashCode = Long.hashCode(cVarF.T);
            t8b t8bVarP = cVarF.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarF, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarF, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarF, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            int i5 = i3;
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarF, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarF, eVarC, eVar);
            e eVarA = g.a(aVar, 1.0f, 1.0f);
            ehd ehdVarA2 = chd.a(jVar, bVar4, cVarF, 0);
            int iHashCode2 = Long.hashCode(cVarF.T);
            t8b t8bVarP2 = cVarF.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarF, eVarA);
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            ygg.y(cVarF, ehdVarA2, dVar);
            ygg.y(cVarF, t8bVarP2, fVar);
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarF, iHashCode2, c0251a);
            }
            ygg.y(cVarF, eVarC2, eVar);
            if (num == null) {
                cVarF.L(782469332);
                cVarF.U(false);
                x2bVarA = null;
            } else {
                cVarF.L(782469333);
                x2bVarA = z2b.a(num.intValue(), 0, cVarF);
                cVarF.U(false);
            }
            fv6 fv6Var4 = fv6Var3 == null ? fv6.Y6 : fv6Var3;
            o97.g gVar = o97Var.i;
            mwe.a(f.j(aVar, 0.0f, 0.0f, 16.0f, 0.0f, 11), fv6Var4, null, x2bVarA, null, new da2(o97Var.c.a.a), cVarF, 0, 20);
            cVarF = cVarF;
            if (!z || wu5Var == null) {
                cVarF.L(782883710);
                z2 = true;
                a(str, gu5Var, true, 0, null, null, null, cVarF, (i5 & 14) | 384 | (i5 & 112), 120);
                cVarF.U(false);
            } else {
                cVarF.L(782812379);
                int i6 = (i5 >> 6) & 7168;
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iHashCode3 = Long.hashCode(cVarF.T);
                t8b t8bVarP3 = cVarF.P();
                e eVarC3 = androidx.compose.ui.c.c(cVarF, aVar);
                cVarF.B();
                if (cVarF.S) {
                    cVarF.y(aVar2);
                } else {
                    cVarF.n();
                }
                ygg.y(cVarF, ag9VarD, dVar);
                ygg.y(cVarF, t8bVarP3, fVar);
                if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode3))) {
                    ja.h(iHashCode3, cVarF, iHashCode3, c0251a);
                }
                ygg.y(cVarF, eVarC3, eVar);
                wu5Var.q(androidx.compose.foundation.layout.b.a, cVarF, Integer.valueOf(((i6 >> 6) & 112) | 6));
                cVarF.U(true);
                cVarF.U(false);
                z2 = true;
            }
            cVarF.U(z2);
            cVarF.U(z2);
            fv6Var2 = fv6Var3;
        } else {
            cVarF.D();
            fv6Var2 = fv6Var;
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: jv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mv.c(str, gu5Var, num, z, fv6Var2, wu5Var, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }
}
