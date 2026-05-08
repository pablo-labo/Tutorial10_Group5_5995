package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.material.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class bm1 {
    public static final void a(final ca caVar, gu5 gu5Var, b bVar, int i) {
        c cVar;
        int i2;
        gu5Var.getClass();
        c cVarH = bVar.h(136728852);
        int i3 = (cVarH.K(caVar) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new ul1(0, gu5Var);
                cVarH.p(objV);
            }
            final hw9 hw9VarC = a.c(iw9.a, (Function1) objV, cVarH, 6, 10);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                m74 m74Var = to4.a;
                objV2 = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV2;
            final o97 o97Var = (o97) cVarH.M(p97.a);
            Boolean bool = Boolean.TRUE;
            boolean zX = cVarH.x(e13Var) | cVarH.x(hw9VarC);
            Object objV3 = cVarH.v();
            if (zX || objV3 == c0020a) {
                objV3 = new zl1(true, e13Var, hw9VarC, null);
                cVarH.p(objV3);
            }
            to4.d(cVarH, bool, (Function2) objV3);
            float f = o97Var.h.c;
            fgd fgdVarB = ggd.b(f, f, 0.0f, 0.0f);
            long j = ((qa2) cVarH.M(sa2.a)).n;
            cVar = cVarH;
            i2 = 1;
            a.a(bh2.c(-798485438, new wu5() { // from class: vl1
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    pm8.a aVar;
                    gl2.a.C0251a c0251a;
                    tjf tjfVar;
                    ca caVar2;
                    o97.a.e eVar;
                    gl2.a.d dVar;
                    gl2.a.f fVar;
                    gl2.a.C0251a c0251a2;
                    gl2.a.e eVar2;
                    af1.a aVar2;
                    o97.c cVar2;
                    pm8.a aVar3;
                    float f2;
                    pm8.a aVar4;
                    gl2.a.C0251a c0251a3;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        e.a aVar5 = e.a.b;
                        e eVarF = g.f(aVar5, 1.0f);
                        vs0.k kVar = vs0.c;
                        af1.a aVar6 = c20.a.m;
                        ob2 ob2VarA = mb2.a(kVar, aVar6, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarF);
                        gl2.j.getClass();
                        pm8.a aVar7 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar7);
                        } else {
                            bVar2.n();
                        }
                        gl2.a.d dVar2 = gl2.a.g;
                        ygg.y(bVar2, ob2VarA, dVar2);
                        gl2.a.f fVar2 = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar2);
                        gl2.a.C0251a c0251a4 = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a4);
                        }
                        gl2.a.e eVar3 = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar3);
                        nx6.c(ak2.I(R.string.ad_transparency_title, bVar2), null, false, false, false, null, null, bh2.c(1239023524, new wl1(0, e13Var, hw9VarC), bVar2), null, null, bVar2, 12583296, 890);
                        a84.a(0.0f, 0, 7, 0L, bVar2, null);
                        b bVar3 = bVar2;
                        e eVarF2 = g.f(aVar5, 1.0f);
                        o97 o97Var2 = o97Var;
                        o97.a.e eVar4 = o97Var2.c.a;
                        o97.c cVar3 = o97Var2.f;
                        tjf tjfVar2 = o97Var2.j.g;
                        e eVarF3 = f.f(eVarF2, 16.0f);
                        ob2 ob2VarA2 = mb2.a(new vs0.i(16.0f, true, new us0(0)), aVar6, bVar3, 0);
                        int iHashCode2 = Long.hashCode(bVar3.k());
                        t8b t8bVarM2 = bVar3.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar3, eVarF3);
                        if (bVar3.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar3.B();
                        if (bVar3.f()) {
                            aVar = aVar7;
                            bVar3.y(aVar);
                        } else {
                            aVar = aVar7;
                            bVar3.n();
                        }
                        ygg.y(bVar3, ob2VarA2, dVar2);
                        ygg.y(bVar3, t8bVarM2, fVar2);
                        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                            c0251a = c0251a4;
                            uz.g(iHashCode2, bVar3, iHashCode2, c0251a);
                        } else {
                            c0251a = c0251a4;
                        }
                        ygg.y(bVar3, eVarC2, eVar3);
                        ca caVar3 = caVar;
                        String str = caVar3.a;
                        if (str == null) {
                            bVar3.L(387485235);
                            bVar3.F();
                            caVar2 = caVar3;
                            tjfVar = tjfVar2;
                            eVar = eVar4;
                            cVar2 = cVar3;
                            c0251a2 = c0251a;
                            fVar = fVar2;
                            aVar2 = aVar6;
                            eVar2 = eVar3;
                            aVar3 = aVar;
                            dVar = dVar2;
                            f2 = 1.0f;
                        } else {
                            bVar3.L(387485236);
                            e eVarF4 = g.f(aVar5, 1.0f);
                            tjfVar = tjfVar2;
                            caVar2 = caVar3;
                            ob2 ob2VarA3 = mb2.a(new vs0.i(4.0f, true, new us0(0)), aVar6, bVar3, 0);
                            int iHashCode3 = Long.hashCode(bVar3.k());
                            t8b t8bVarM3 = bVar3.m();
                            e eVarC3 = androidx.compose.ui.c.c(bVar3, eVarF4);
                            if (bVar3.j() == null) {
                                pg8.B();
                                throw null;
                            }
                            bVar3.B();
                            if (bVar3.f()) {
                                bVar3.y(aVar);
                            } else {
                                bVar3.n();
                            }
                            ygg.y(bVar3, ob2VarA3, dVar2);
                            ygg.y(bVar3, t8bVarM3, fVar2);
                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode3))) {
                                uz.g(iHashCode3, bVar3, iHashCode3, c0251a);
                            }
                            ygg.y(bVar3, eVarC3, eVar3);
                            eVar = eVar4;
                            dVar = dVar2;
                            fVar = fVar2;
                            c0251a2 = c0251a;
                            eVar2 = eVar3;
                            aVar2 = aVar6;
                            cVar2 = cVar3;
                            aVar3 = aVar;
                            f2 = 1.0f;
                            cif.b(ak2.I(R.string.sponsor, bVar3), null, eVar4.b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, 0L, 0L, cVar3.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar3, 0, 0, 65530);
                            cif.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tjfVar, bVar3, 0, 3120, 55294);
                            bVar3 = bVar3;
                            bVar3.q();
                            j6g j6gVar = j6g.a;
                            bVar3.F();
                        }
                        e eVarF5 = g.f(aVar5, f2);
                        af1.a aVar8 = aVar2;
                        ob2 ob2VarA4 = mb2.a(new vs0.i(4.0f, true, new us0(0)), aVar8, bVar3, 0);
                        int iHashCode4 = Long.hashCode(bVar3.k());
                        t8b t8bVarM4 = bVar3.m();
                        e eVarC4 = androidx.compose.ui.c.c(bVar3, eVarF5);
                        if (bVar3.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar3.B();
                        if (bVar3.f()) {
                            aVar4 = aVar3;
                            bVar3.y(aVar4);
                        } else {
                            aVar4 = aVar3;
                            bVar3.n();
                        }
                        gl2.a.d dVar3 = dVar;
                        ygg.y(bVar3, ob2VarA4, dVar3);
                        gl2.a.f fVar3 = fVar;
                        ygg.y(bVar3, t8bVarM4, fVar3);
                        if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode4))) {
                            c0251a3 = c0251a2;
                            uz.g(iHashCode4, bVar3, iHashCode4, c0251a3);
                        } else {
                            c0251a3 = c0251a2;
                        }
                        gl2.a.e eVar5 = eVar2;
                        ygg.y(bVar3, eVarC4, eVar5);
                        o97.c cVar4 = cVar2;
                        gl2.a.C0251a c0251a5 = c0251a3;
                        pm8.a aVar9 = aVar4;
                        b bVar4 = bVar3;
                        o97.a.e eVar6 = eVar;
                        cif.b(ak2.I(R.string.beneficiary, bVar3), null, eVar.b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, 0L, 0L, cVar4.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar4, 0, 0, 65530);
                        ca caVar4 = caVar2;
                        cif.b(caVar2.b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tjfVar, bVar4, 0, 3120, 55294);
                        bVar4.q();
                        e eVarF6 = g.f(aVar5, f2);
                        ob2 ob2VarA5 = mb2.a(new vs0.i(4.0f, true, new us0(0)), aVar8, bVar4, 0);
                        int iHashCode5 = Long.hashCode(bVar4.k());
                        t8b t8bVarM5 = bVar4.m();
                        e eVarC5 = androidx.compose.ui.c.c(bVar4, eVarF6);
                        if (bVar4.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar4.B();
                        if (bVar4.f()) {
                            bVar4.y(aVar9);
                        } else {
                            bVar4.n();
                        }
                        ygg.y(bVar4, ob2VarA5, dVar3);
                        ygg.y(bVar4, t8bVarM5, fVar3);
                        if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode5))) {
                            uz.g(iHashCode5, bVar4, iHashCode5, c0251a5);
                        }
                        ygg.y(bVar4, eVarC5, eVar5);
                        cif.b(ak2.I(R.string.targeting_criteria, bVar4), null, eVar6.b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, 0L, 0L, cVar4.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar4, 0, 0, 65530);
                        cif.b(caVar4.c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tjfVar, bVar4, 0, 3120, 55294);
                        bVar4.q();
                        bVar4.q();
                        jh2.f(bVar4, g.h(aVar5, 16.0f));
                        bVar4.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), null, hw9VarC, false, fgdVarB, 0.0f, j, 0L, 0L, h4.c, cVar, 805306886, 426);
        } else {
            cVar = cVarH;
            i2 = 1;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new qg(caVar, i, i2, gu5Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.s9 r22, defpackage.gu5<defpackage.j6g> r23, androidx.compose.runtime.b r24, int r25) {
        /*
            r0 = r22
            r1 = r23
            r0.getClass()
            java.lang.String r2 = r0.c
            r1.getClass()
            r3 = -1190385971(0xffffffffb90c26cd, float:-1.3365895E-4)
            r4 = r24
            androidx.compose.runtime.c r3 = r4.h(r3)
            boolean r4 = r3.x(r0)
            r5 = 2
            if (r4 == 0) goto L1e
            r4 = 4
            goto L1f
        L1e:
            r4 = r5
        L1f:
            r4 = r25 | r4
            boolean r6 = r3.x(r1)
            if (r6 == 0) goto L2a
            r6 = 32
            goto L2c
        L2a:
            r6 = 16
        L2c:
            r4 = r4 | r6
            r6 = r4 & 19
            r7 = 18
            r8 = 0
            r9 = 1
            if (r6 == r7) goto L37
            r6 = r9
            goto L38
        L37:
            r6 = r8
        L38:
            r7 = r4 & 1
            boolean r6 = r3.o(r7, r6)
            if (r6 == 0) goto L92
            java.lang.String r6 = r0.j
            if (r6 == 0) goto L4e
            boolean r7 = defpackage.zve.U(r6)
            if (r7 != 0) goto L4b
            goto L4c
        L4b:
            r6 = 0
        L4c:
            if (r6 != 0) goto L4f
        L4e:
            r6 = r2
        L4f:
            java.lang.String r7 = r0.k
            ca r10 = new ca
            r10.<init>(r6, r2, r7)
            r2 = 6
            hee r2 = defpackage.hv9.f(r9, r3, r2, r5)
            long r6 = defpackage.da2.i
            r5 = 0
            fgd r5 = defpackage.ggd.a(r5)
            xl1 r9 = new xl1
            r9.<init>(r8, r10, r1)
            r10 = -1804520624(0xffffffff94713350, float:-1.217751E-26)
            ah2 r16 = defpackage.bh2.c(r10, r9, r3)
            int r4 = r4 >> 3
            r4 = r4 & 14
            r9 = 805502976(0x30030000, float:4.765752E-10)
            r18 = r4 | r9
            r19 = 384(0x180, float:5.38E-43)
            r20 = 3530(0xdca, float:4.947E-42)
            r17 = r3
            r3 = r2
            r2 = 0
            r4 = 0
            r10 = r8
            r8 = 0
            r11 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r21 = r15
            r15 = 0
            defpackage.hv9.a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L97
        L92:
            r17 = r3
            r17.D()
        L97:
            androidx.compose.runtime.i r2 = r17.W()
            if (r2 == 0) goto La7
            yl1 r3 = new yl1
            r4 = r25
            r13 = 0
            r3.<init>(r0, r4, r13, r1)
            r2.d = r3
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm1.b(s9, gu5, androidx.compose.runtime.b, int):void");
    }
}
