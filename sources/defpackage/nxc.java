package defpackage;

import android.content.res.Resources;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class nxc {
    public static final void a(final String str, final long j, final long j2, final long j3, Integer num, final gu5<j6g> gu5Var, final String str2, Integer num2, b bVar, final int i, final int i2) {
        Integer num3;
        int i3;
        Integer num4;
        int i4;
        c cVar;
        final Integer num5;
        final Integer num6;
        c cVarF = q6.f(-407775328, gu5Var, bVar, str);
        int i5 = i | (cVarF.K(str) ? 4 : 2) | (cVarF.e(j) ? 32 : 16) | (cVarF.e(j2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarF.e(j3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | 24576;
            num3 = num;
        } else {
            num3 = num;
            i3 = i5 | (cVarF.K(num3) ? 16384 : 8192);
        }
        int i7 = i3 | (cVarF.x(gu5Var) ? 131072 : 65536);
        int i8 = i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i8 != 0) {
            i4 = i7 | 12582912;
            num4 = num2;
        } else {
            num4 = num2;
            i4 = i7 | (cVarF.K(num4) ? 8388608 : 4194304);
        }
        int i9 = i4;
        if (cVarF.o(i9 & 1, (i4 & 4793491) != 4793490)) {
            if (i6 != 0) {
                num3 = null;
            }
            Integer num7 = i8 == 0 ? num4 : null;
            final o97 o97Var = (o97) cVarF.M(p97.a);
            float dimension = ((Resources) cVarF.M(AndroidCompositionLocals_androidKt.c)).getDimension(R.dimen.mtrl_btn_inset) / ((iy3) cVarF.M(um2.h)).getDensity();
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarI = f.i(eVarF, 16.0f, dimension, 16.0f, dimension);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarF.T);
            t8b t8bVarP = cVarF.P();
            e eVarC = androidx.compose.ui.c.c(cVarF, eVarI);
            gl2.j.getClass();
            final Integer num8 = num7;
            pm8.a aVar2 = gl2.a.b;
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            ygg.y(cVarF, ag9VarD, gl2.a.g);
            ygg.y(cVarF, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarF, iHashCode, c0251a);
            }
            ygg.y(cVarF, eVarC, gl2.a.d);
            e eVarB = g.b(g.f(androidx.compose.ui.platform.f.a(aVar, str2), 1.0f), 60.0f, 1);
            bj1 bj1VarF = ee3.f(j2, 1.0f);
            wl3 wl3VarA = iq1.a(j, 0L, cVarF, (i9 >> 3) & 14, 14);
            fgd fgdVarA = ggd.a(8.0f);
            boolean z = (i9 & 458752) == 131072;
            Object objV = cVarF.v();
            if (z || objV == b.a.a) {
                objV = new ec(8, gu5Var);
                cVarF.p(objV);
            }
            num5 = num3;
            sq1.b((gu5) objV, eVarB, fgdVarA, bj1VarF, wl3VarA, null, bh2.c(-783062616, new wu5() { // from class: hxc
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((fhd) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        e.a aVar3 = e.a.b;
                        e eVarJ = f.j(g.f(aVar3, 1.0f), 8.0f, 0.0f, 8.0f, 0.0f, 10);
                        ehd ehdVarA = chd.a(vs0.e, c20.a.k, bVar2, 54);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarJ);
                        gl2.j.getClass();
                        pm8.a aVar4 = gl2.a.b;
                        String strI = null;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar4);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ehdVarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a2 = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a2);
                        }
                        ygg.y(bVar2, eVarC2, gl2.a.d);
                        Integer num9 = num5;
                        if (num9 != null) {
                            bVar2.L(510604031);
                            e eVarN = g.n(f.j(aVar3, 0.0f, 0.0f, 16.0f, 0.0f, 11), 24.0f);
                            x2b x2bVarA = z2b.a(num9.intValue(), 0, bVar2);
                            Integer num10 = num8;
                            if (num10 == null) {
                                bVar2.L(510899894);
                            } else {
                                bVar2.L(510899895);
                                strI = ak2.I(num10.intValue(), bVar2);
                            }
                            bVar2.F();
                            f17.a(x2bVarA, strI, eVarN, null, ft2.a.b, 0.0f, null, bVar2, 24576, 104);
                        } else {
                            bVar2.L(496136982);
                        }
                        bVar2.F();
                        o97 o97Var2 = o97Var;
                        fif.b(str, null, j3, 0L, o97Var2.f.c, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, o97Var2.j.f, bVar2, 0, 0, 64986);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarF), cVarF, 805306368, 284);
            cVar = cVarF;
            cVar.U(true);
            num6 = num8;
        } else {
            cVar = cVarF;
            cVar.D();
            num5 = num3;
            num6 = num4;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            final Integer num9 = num5;
            iVarW.d = new Function2(str, j, j2, j3, num9, gu5Var, str2, num6, i, i2) { // from class: ixc
                public final /* synthetic */ String V;
                public final /* synthetic */ Integer W;
                public final /* synthetic */ int X;
                public final /* synthetic */ String a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ Integer e;
                public final /* synthetic */ gu5 f;

                {
                    this.X = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1572865);
                    nxc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL, this.X);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.e r31, final int r32, final defpackage.gu5<defpackage.j6g> r33, final java.lang.String r34, float r35, androidx.compose.runtime.b r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxc.b(androidx.compose.ui.e, int, gu5, java.lang.String, float, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.ya6 r39, final boolean r40, final defpackage.gu5 r41, defpackage.gu5 r42, final defpackage.gu5 r43, final defpackage.gu5 r44, defpackage.gu5 r45, defpackage.gu5 r46, defpackage.gu5 r47, defpackage.gu5 r48, defpackage.gu5 r49, final boolean r50, boolean r51, androidx.compose.runtime.b r52, final int r53) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxc.c(ya6, boolean, gu5, gu5, gu5, gu5, gu5, gu5, gu5, gu5, gu5, boolean, boolean, androidx.compose.runtime.b, int):void");
    }
}
