package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class vj1 {
    public static final void a(final e eVar, final List list, final xj1 xj1Var, final Function1 function1, final boolean z, b bVar, int i) {
        eVar.getClass();
        list.getClass();
        function1.getClass();
        c cVarH = bVar.h(13292150);
        int i2 = i | (cVarH.K(eVar) ? 4 : 2) | (cVarH.x(list) ? 32 : 16) | (cVarH.d(xj1Var == null ? -1 : xj1Var.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            final boolean z2 = ((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).orientation == 1;
            l0f.a(g.f(e.a.b, 1.0f), null, o97Var.c.b.a, 0L, 0.0f, 16.0f, null, bh2.c(-1216947887, new Function2() { // from class: lj1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    final o97 o97Var2 = o97Var;
                    o97.a aVar = o97Var2.c;
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e.a aVar2 = e.a.b;
                        e eVarF = g.f(aVar2, 1.0f);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarF);
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
                        gl2.a.d dVar = gl2.a.g;
                        ygg.y(bVar2, ob2VarA, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        gl2.a.e eVar2 = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar2);
                        jh2.f(bVar2, a.b(g.h(g.f(aVar2, 1.0f), 0.5f), aVar.b.c, ytc.a));
                        e eVarH = f.h(eVar, 12.0f, 0.0f, 2);
                        ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar2, 0);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarH);
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
                        ygg.y(bVar2, ehdVarA, dVar);
                        ygg.y(bVar2, t8bVarM2, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                        }
                        ygg.y(bVar2, eVarC2, eVar2);
                        bVar2.L(190619977);
                        for (wj1 wj1Var : list) {
                            boolean z3 = wj1Var.b == xj1Var;
                            o97.a.C0340a c0340a = aVar.b;
                            final boolean z4 = z3;
                            b bVar3 = bVar2;
                            final ese eseVarA = vhe.a(z3 ? c0340a.f.a : c0340a.h.d, zd0.c(10000.0f, null, 4), "ColorTransition", bVar3, 432, 8);
                            boolean zK = bVar3.K(eseVarA) | bVar3.a(z4) | bVar3.x(o97Var2);
                            Object objV3 = bVar3.v();
                            b.a.C0020a c0020a2 = b.a.a;
                            if (zK || objV3 == c0020a2) {
                                objV3 = new Function1(z4, o97Var2, eseVarA) { // from class: rj1
                                    public final /* synthetic */ boolean a;
                                    public final /* synthetic */ ese b;

                                    {
                                        this.b = eseVarA;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        gb4 gb4Var = (gb4) obj3;
                                        gb4Var.getClass();
                                        long j = ((da2) this.b.getValue()).a;
                                        boolean z5 = this.a;
                                        gb4Var.W(j, (((long) Float.floatToRawIntBits(z5 ? Float.intBitsToFloat((int) (gb4Var.c() >> 32)) * 0.25f : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(z5 ? Float.intBitsToFloat((int) (gb4Var.c() >> 32)) * 0.75f : 0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f))), z5 ? gb4Var.t1(4.0f) : gb4Var.t1(0.0f), (496 & 16) != 0 ? 0 : 1);
                                        return j6g.a;
                                    }
                                };
                                bVar3.p(objV3);
                            }
                            e eVarA = androidx.compose.ui.draw.a.a(aVar2, (Function1) objV3);
                            boolean z5 = z2;
                            boolean z6 = z;
                            Function1 function12 = function1;
                            if (z5) {
                                bVar3.L(1615463814);
                                o97 o97Var3 = o97Var2;
                                o97.a aVar4 = aVar;
                                if (1.0f <= 0.0d) {
                                    yd7.a("invalid weight; must be greater than zero");
                                }
                                e eVarO = eVarA.o(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                                long j = ((da2) eseVarA.getValue()).a;
                                g4a g4aVar3 = g4aVar;
                                boolean z7 = ((Boolean) g4aVar3.getValue()).booleanValue() || z6;
                                boolean zK2 = bVar3.K(function12) | bVar3.K(wj1Var);
                                Object objV4 = bVar3.v();
                                if (zK2 || objV4 == c0020a2) {
                                    objV4 = new ry(2, function12, wj1Var);
                                    bVar3.p(objV4);
                                }
                                gu5 gu5Var = (gu5) objV4;
                                Object objV5 = bVar3.v();
                                if (objV5 == c0020a2) {
                                    objV5 = new uc1(1, g4aVar3);
                                    bVar3.p(objV5);
                                }
                                bVar2 = bVar3;
                                vj1.c(eVarO, wj1Var, j, gu5Var, (gu5) objV5, z7, z4, bVar2, 24576);
                                bVar2.F();
                                aVar2 = aVar2;
                                o97Var2 = o97Var3;
                                aVar = aVar4;
                            } else {
                                o97 o97Var4 = o97Var2;
                                o97.a aVar5 = aVar;
                                e.a aVar6 = aVar2;
                                bVar3.L(1616112892);
                                if (1.0f <= 0.0d) {
                                    yd7.a("invalid weight; must be greater than zero");
                                }
                                e eVarH2 = f.h(eVarA.o(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 12.0f, 0.0f, 2);
                                long j2 = ((da2) eseVarA.getValue()).a;
                                g4a g4aVar4 = g4aVar2;
                                boolean z8 = ((Boolean) g4aVar4.getValue()).booleanValue() || z6;
                                boolean zK3 = bVar3.K(function12) | bVar3.K(wj1Var);
                                Object objV6 = bVar3.v();
                                if (zK3 || objV6 == c0020a2) {
                                    objV6 = new gx(2, function12, wj1Var);
                                    bVar3.p(objV6);
                                }
                                gu5 gu5Var2 = (gu5) objV6;
                                Object objV7 = bVar3.v();
                                if (objV7 == c0020a2) {
                                    objV7 = new pg0(1, g4aVar4);
                                    bVar3.p(objV7);
                                }
                                bVar2 = bVar3;
                                vj1.b(eVarH2, wj1Var, j2, gu5Var2, (gu5) objV7, z8, z4, bVar2, 24576);
                                bVar2.F();
                                o97Var2 = o97Var4;
                                aVar2 = aVar6;
                                aVar = aVar5;
                            }
                        }
                        b bVar4 = bVar2;
                        bVar4.F();
                        bVar4.q();
                        bVar4.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 12582918, 90);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new qj1(eVar, list, xj1Var, function1, z, i);
        }
    }

    public static final void b(final e eVar, final wj1 wj1Var, final long j, final gu5 gu5Var, final gu5 gu5Var2, final boolean z, final boolean z2, b bVar, final int i) {
        float f;
        eVar.getClass();
        xj1 xj1Var = wj1Var.b;
        c cVarH = bVar.h(242830782);
        int i2 = i | (cVarH.K(eVar) ? 4 : 2) | (cVarH.K(wj1Var) ? 32 : 16) | (cVarH.e(j) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.a(z) ? 131072 : 65536) | (cVarH.a(z2) ? 1048576 : 524288);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            final String strI = ak2.I(wj1Var.a, cVarH);
            boolean zK = ((i2 & 3670016) == 1048576) | cVarH.K(strI) | ((i2 & 112) == 32);
            Object objV = cVarH.v();
            if (zK || objV == b.a.a) {
                objV = new Function1() { // from class: sj1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        s5e s5eVar = (s5e) obj;
                        s5eVar.getClass();
                        o5e.i(s5eVar, 4);
                        o5e.j(s5eVar, z2);
                        o5e.f(s5eVar, strI);
                        if (wj1Var.b == xj1.V) {
                            p5e.a(s5eVar);
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(objV);
            }
            e eVarH = f.h(androidx.compose.ui.platform.f.a(androidx.compose.foundation.b.d(b5e.b(eVar, false, (Function1) objV), false, null, null, gu5Var, 15), xj1Var.name()), 0.0f, 10.0f, 1);
            ehd ehdVarA = chd.a(vs0.e, c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarH);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e.a aVar2 = e.a.b;
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            cs6.b(androidx.compose.foundation.layout.b.a.h(aVar2, c20.a.c), ((Number) ((gme) wj1Var.c).getValue()).intValue(), 0L, xj1Var.name(), bh2.c(-242005574, new wu5() { // from class: tj1
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ml1) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        xj1 xj1Var2 = wj1Var.b;
                        xj1 xj1Var3 = xj1.W;
                        zq6 zq6Var = zq6.Md;
                        boolean z3 = z2;
                        long j2 = j;
                        if (xj1Var2 == xj1Var3) {
                            bVar2.L(1662123767);
                            x2b x2bVarA = z2b.a(z3 ? R.drawable.ic_ai_logo : R.drawable.ic_ai_logo_stroke, 0, bVar2);
                            if (z3) {
                                j2 = da2.i;
                            }
                            vq6.b(x2bVarA, null, androidx.compose.ui.platform.f.a(g.n(e.a.b, zq6Var.a()), xj1Var2.name() + "-Icon"), j2, bVar2, 48, 0);
                            bVar2.F();
                        } else {
                            bVar2.L(1662803504);
                            ev6.b(vj1.e(xj1Var2), null, z3 ? ar6.Filled : ar6.Stroke, zq6Var, j2, t40.k(xj1Var2.name(), "-Icon"), bVar2, 3072, 2);
                            bVar2.F();
                        }
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 24576, 4);
            cVarH = cVarH;
            cVarH.U(true);
            if (z) {
                f = 0.0f;
            } else {
                o97.g gVar = o97Var.i;
                f = 4.0f;
            }
            d(wj1Var, j, f.h(aVar2, f, 0.0f, 2), gu5Var2, z, z2, cVarH, (i2 >> 3) & 523390);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(wj1Var, j, gu5Var, gu5Var2, z, z2, i) { // from class: uj1
                public final /* synthetic */ boolean V;
                public final /* synthetic */ wj1 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(24577);
                    vj1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.ui.e r30, final defpackage.wj1 r31, final long r32, final defpackage.gu5 r34, final defpackage.gu5 r35, final boolean r36, final boolean r37, androidx.compose.runtime.b r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj1.c(androidx.compose.ui.e, wj1, long, gu5, gu5, boolean, boolean, androidx.compose.runtime.b, int):void");
    }

    public static final void d(final wj1 wj1Var, final long j, final e eVar, final gu5 gu5Var, final boolean z, final boolean z2, b bVar, final int i) {
        int i2;
        c cVar;
        String strI;
        int i3;
        c cVarH = bVar.h(-451701007);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(wj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.a(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.a(z2) ? 131072 : 65536;
        }
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarA = androidx.compose.ui.platform.f.a(eVar, wj1Var.b.name() + "-Text");
            if (z) {
                cVarH.L(-491816883);
                cVarH.U(false);
                strI = "";
            } else {
                cVarH.L(-292959436);
                strI = ak2.I(wj1Var.a, cVarH);
                cVarH.U(false);
            }
            tjf tjfVar = o97Var.j.h;
            o97.c cVar2 = o97Var.f;
            to5 to5Var = z2 ? cVar2.c : cVar2.a;
            dcf dcfVar = new dcf(3);
            boolean z3 = (i2 & 7168) == 2048;
            Object objV = cVarH.v();
            if (z3 || objV == b.a.a) {
                i3 = 3;
                objV = new na(gu5Var, 3);
                cVarH.p(objV);
            } else {
                i3 = 3;
            }
            cVar = cVarH;
            cif.b(strI, eVarA, j, 0L, null, to5Var, null, 0L, null, dcfVar, 0L, 0, false, 0, 0, (Function1) objV, tjfVar, cVar, (i2 << i3) & 896, 0, 32216);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: pj1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vj1.d(wj1Var, j, eVar, gu5Var, z, z2, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final fv6 e(xj1 xj1Var) {
        switch (xj1Var.ordinal()) {
            case 0:
                return fv6.i4;
            case 1:
                return fv6.c1;
            case 2:
                return fv6.y1;
            case 3:
                return fv6.o7;
            case 4:
                return fv6.s6;
            case 5:
                return fv6.C8;
            case 6:
                return fv6.Z;
            case 7:
                dd4 dd4Var = dd4.a;
                return dd4.e() ? fv6.i4 : fv6.C8;
            case 8:
                return fv6.S2;
            case DatadogLogGenerator.CRASH /* 9 */:
                return fv6.c1;
            case 10:
                return fv6.S5;
            case 11:
                return fv6.y1;
            default:
                return fv6.i4;
        }
    }
}
