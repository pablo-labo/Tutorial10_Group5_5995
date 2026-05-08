package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class uub {
    public static final void a(final gu5 gu5Var, boolean z, String str, String str2, gu5 gu5Var2, final ah2 ah2Var, b bVar, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        String str3;
        int i5;
        String str4;
        int i6;
        gu5 gu5Var3;
        int i7;
        final boolean z3;
        final String str5;
        final String str6;
        final gu5 gu5Var4;
        final gu5 gu5Var5;
        e eVarA;
        gu5Var.getClass();
        c cVarH = bVar.h(-1040159397);
        if ((i & 6) == 0) {
            i3 = i | (cVarH.x(gu5Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i4 = i3 | 48;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (cVarH.a(z2) ? 32 : 16);
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i5 = i4 | 384;
            str3 = str;
        } else {
            str3 = str;
            i5 = i4 | (cVarH.K(str3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i6 = i5 | 3072;
            str4 = str2;
        } else {
            str4 = str2;
            i6 = i5 | (cVarH.K(str4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i7 = i6 | 24576;
            gu5Var3 = gu5Var2;
        } else {
            gu5Var3 = gu5Var2;
            i7 = i6 | (cVarH.x(gu5Var3) ? 16384 : 8192);
        }
        if (cVarH.o(i7 & 1, (74899 & i7) != 74898)) {
            final boolean z4 = i8 != 0 ? false : z2;
            final String str7 = i9 != 0 ? "" : str3;
            final String str8 = i10 != 0 ? "" : str4;
            b.a.C0020a c0020a = b.a.a;
            if (i11 != 0) {
                Object objV = cVarH.v();
                if (objV == c0020a) {
                    objV = new jr(20);
                    cVarH.p(objV);
                }
                gu5Var5 = (gu5) objV;
            } else {
                gu5Var5 = gu5Var3;
            }
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            if (z4) {
                eVarA = ti1.a(aVar, 2.0f, o97Var.c.a.h.e.a, ggd.a(o97Var.h.c));
            } else {
                Map<String, String> map = v1c.a;
                eVarA = a.a(aVar, new r1c(0.0f, true));
            }
            e eVarF = g.f(aVar, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarO = f.j(eVarF, 0.0f, 8.0f, 0.0f, 0.0f, 13).o(eVarA);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarO);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            boolean z5 = (i7 & 14) == 4;
            Object objV2 = cVarH.v();
            if (z5 || objV2 == c0020a) {
                objV2 = new yw0(5, gu5Var);
                cVarH.p(objV2);
            }
            v1c.a((gu5) objV2, null, false, ytc.a, 0L, null, null, null, null, bh2.c(-1962679517, new wu5() { // from class: sub
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((fhd) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        ob2 ob2VarA2 = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, e.a.b);
                        gl2.j.getClass();
                        pm8.a aVar3 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar3);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA2, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a2 = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a2);
                        }
                        ygg.y(bVar2, eVarC2, gl2.a.d);
                        if (z4) {
                            bVar2.L(-766164218);
                            hu9.a(str7, str8, gu5Var5, null, bVar2, 0);
                        } else {
                            bVar2.L(-771887531);
                        }
                        bVar2.F();
                        ah2Var.invoke(bVar2, 0);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 3072, 1014);
            cVarH.U(true);
            z3 = z4;
            str5 = str7;
            str6 = str8;
            gu5Var4 = gu5Var5;
        } else {
            cVarH.D();
            z3 = z2;
            str5 = str3;
            str6 = str4;
            gu5Var4 = gu5Var3;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: tub
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uub.a(gu5Var, z3, str5, str6, gu5Var4, ah2Var, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r66, java.lang.String r67, final defpackage.gu5 r68, defpackage.gu5 r69, boolean r70, final boolean r71, boolean r72, defpackage.ah2 r73, androidx.compose.runtime.b r74, final int r75, final int r76) {
        /*
            Method dump skipped, instruction units count: 1063
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uub.b(java.lang.String, java.lang.String, gu5, gu5, boolean, boolean, boolean, ah2, androidx.compose.runtime.b, int, int):void");
    }
}
