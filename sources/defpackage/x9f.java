package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import defpackage.ytc;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class x9f {
    public static final void a(int i, gu5 gu5Var, b bVar, String str, boolean z) {
        String str2;
        c cVarH = bVar.h(-551455893);
        int i2 = i | (cVarH.a(z) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            str2 = str;
            String strM = z3.m(str2, ": ", z ? "ON" : "OFF");
            e.a aVar = e.a.b;
            gt6.h(strM, gu5Var, g.f(aVar, 1.0f), vt6.Lg, false, false, null, null, null, cVarH, 3504, 496);
            o97.g gVar = o97Var.i;
            jh2.f(cVarH, g.h(aVar, 8.0f));
        } else {
            str2 = str;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pzb(str2, z, gu5Var, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(d4g d4gVar, gu5 gu5Var, b bVar, int i) {
        c cVar;
        Object w9fVar;
        c cVar2;
        Object[] objArr;
        g4a g4aVar;
        g4a g4aVar2;
        g4a g4aVar3;
        g4a g4aVar4;
        g4a g4aVar5;
        final o97 o97Var;
        c cVarH = bVar.h(1412356028);
        int i2 = i | (cVarH.x(d4gVar) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var2 = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f("Demo Title");
                cVarH.p(objV);
            }
            final g4a g4aVar6 = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            final g4a g4aVar7 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(Boolean.TRUE);
                cVarH.p(objV3);
            }
            g4a g4aVar8 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f(Boolean.FALSE);
                cVarH.p(objV4);
            }
            final g4a g4aVar9 = (g4a) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = r.f(Boolean.FALSE);
                cVarH.p(objV5);
            }
            g4a g4aVar10 = (g4a) objV5;
            Object objV6 = cVarH.v();
            if (objV6 == c0020a) {
                objV6 = r.f(Boolean.FALSE);
                cVarH.p(objV6);
            }
            final g4a g4aVar11 = (g4a) objV6;
            Object objV7 = cVarH.v();
            if (objV7 == c0020a) {
                objV7 = r.f(Boolean.FALSE);
                cVarH.p(objV7);
            }
            g4a g4aVar12 = (g4a) objV7;
            Object objV8 = cVarH.v();
            if (objV8 == c0020a) {
                objV8 = r.f(Boolean.FALSE);
                cVarH.p(objV8);
            }
            g4a g4aVar13 = (g4a) objV8;
            Object objV9 = cVarH.v();
            if (objV9 == c0020a) {
                objV9 = r.f(Boolean.FALSE);
                cVarH.p(objV9);
            }
            final g4a g4aVar14 = (g4a) objV9;
            Object objV10 = cVarH.v();
            if (objV10 == c0020a) {
                objV10 = r.f(Boolean.FALSE);
                cVarH.p(objV10);
            }
            g4a g4aVar15 = (g4a) objV10;
            Object objV11 = cVarH.v();
            if (objV11 == c0020a) {
                objV11 = r.f(Boolean.FALSE);
                cVarH.p(objV11);
            }
            final g4a g4aVar16 = (g4a) objV11;
            String str = (String) g4aVar6.getValue();
            Boolean bool = (Boolean) g4aVar7.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) g4aVar8.getValue();
            bool2.getClass();
            Boolean bool3 = (Boolean) g4aVar9.getValue();
            bool3.getClass();
            Boolean bool4 = (Boolean) g4aVar10.getValue();
            bool4.getClass();
            Boolean bool5 = (Boolean) g4aVar11.getValue();
            bool5.getClass();
            Boolean bool6 = (Boolean) g4aVar12.getValue();
            bool6.getClass();
            Boolean bool7 = (Boolean) g4aVar13.getValue();
            bool7.getClass();
            Object[] objArr2 = {str, bool, bool2, bool3, bool4, bool5, bool6, bool7, Boolean.valueOf(c(g4aVar14)), Boolean.valueOf(d(g4aVar15)), Boolean.valueOf(e(g4aVar16))};
            boolean zX = ((i2 & 112) == 32) | ((i2 & 14) == 4 || cVarH.x(d4gVar)) | cVarH.x(o97Var2);
            Object objV12 = cVarH.v();
            if (zX || objV12 == c0020a) {
                cVar2 = cVarH;
                objArr = objArr2;
                g4aVar = g4aVar8;
                g4aVar2 = g4aVar10;
                g4aVar3 = g4aVar12;
                g4aVar4 = g4aVar13;
                g4aVar5 = g4aVar15;
                w9fVar = new w9f(d4gVar, o97Var2, gu5Var, g4aVar, g4aVar2, g4aVar3, g4aVar14, g4aVar5, g4aVar4, g4aVar9, g4aVar6, g4aVar16, g4aVar7, null);
                o97Var = o97Var2;
                cVar2.p(w9fVar);
            } else {
                cVar2 = cVarH;
                w9fVar = objV12;
                o97Var = o97Var2;
                objArr = objArr2;
                g4aVar = g4aVar8;
                g4aVar2 = g4aVar10;
                g4aVar3 = g4aVar12;
                g4aVar4 = g4aVar13;
                g4aVar5 = g4aVar15;
            }
            to4.g(objArr, (Function2) w9fVar, cVar2);
            g4a g4aVarA = r.a(d4gVar.c, cVar2);
            e eVarD = g.d(e.a.b, 1.0f);
            ah2 ah2VarC = bh2.c(2101043576, new rq(g4aVarA, 13), cVar2);
            final g4a g4aVar17 = g4aVar;
            final g4a g4aVar18 = g4aVar2;
            final g4a g4aVar19 = g4aVar3;
            final g4a g4aVar20 = g4aVar5;
            final g4a g4aVar21 = g4aVar4;
            ah2 ah2VarC2 = bh2.c(413672589, new wu5() { // from class: r9f
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    int i3;
                    final g4a g4aVar22;
                    final g4a g4aVar23;
                    final g4a g4aVar24;
                    gza gzaVar = (gza) obj;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    gzaVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= bVar2.K(gzaVar) ? 4 : 2;
                    }
                    if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                        e.a aVar = e.a.b;
                        e eVarE = f.e(g.d(aVar, 1.0f), gzaVar);
                        vs0.k kVar = vs0.c;
                        af1.a aVar2 = c20.a.m;
                        ob2 ob2VarA = mb2.a(kVar, aVar2, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarE);
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
                        gl2.a.e eVar = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar);
                        e eVarO = g.f(aVar, 1.0f).o(new LayoutWeightElement(1.0f, true));
                        o97 o97Var3 = o97Var;
                        o97.a.C0340a c0340a = o97Var3.c.b;
                        long j = c0340a.c;
                        ytc.a aVar4 = ytc.a;
                        e eVarB = a.b(eVarO, j, aVar4);
                        ag9 ag9VarD = hl1.d(c20.a.e, false);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarB);
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
                        ygg.y(bVar2, ag9VarD, dVar);
                        ygg.y(bVar2, t8bVarM2, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                        }
                        ygg.y(bVar2, eVarC2, eVar);
                        cif.b("Screen Content Area", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var3.j.g, bVar2, 6, 0, 65534);
                        bVar2.q();
                        a84.b(2.0f, 48, 1, c0340a.d, bVar2, null);
                        e eVarF = f.f(pnb.M(a.b(g.c(g.f(aVar, 1.0f), 0.8f), c0340a.a, aVar4), pnb.L(0, 1, bVar2), true), 16.0f);
                        ob2 ob2VarA2 = mb2.a(kVar, aVar2, bVar2, 0);
                        int iHashCode3 = Long.hashCode(bVar2.k());
                        t8b t8bVarM3 = bVar2.m();
                        e eVarC3 = androidx.compose.ui.c.c(bVar2, eVarF);
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
                        ygg.y(bVar2, ob2VarA2, dVar);
                        ygg.y(bVar2, t8bVarM3, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode3))) {
                            uz.g(iHashCode3, bVar2, iHashCode3, c0251a);
                        }
                        ygg.y(bVar2, eVarC3, eVar);
                        x9f.f(6, bVar2);
                        jh2.f(bVar2, g.h(aVar, 16.0f));
                        nof.d("Title Text", bVar2, 6);
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        g4a g4aVar25 = g4aVar6;
                        String str2 = (String) g4aVar25.getValue();
                        Object objV13 = bVar2.v();
                        b.a.C0020a c0020a2 = b.a.a;
                        if (objV13 == c0020a2) {
                            objV13 = new mb(8, g4aVar25);
                            bVar2.p(objV13);
                        }
                        Function1 function1 = (Function1) objV13;
                        Object objV14 = bVar2.v();
                        if (objV14 == c0020a2) {
                            objV14 = new nf(27);
                            bVar2.p(objV14);
                        }
                        dz6.b(str2, function1, "Enter title text", "Clear title text", (Function1) objV14, g.f(aVar, 1.0f), null, null, null, null, null, null, null, null, null, null, bVar2, 224688, 0, 1048512);
                        jh2.f(bVar2, g.h(aVar, 16.0f));
                        a84.b(0.0f, 0, 7, 0L, bVar2, null);
                        nof.d("Background Color Control", bVar2, 6);
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        g4a g4aVar26 = g4aVar7;
                        String str3 = ((Boolean) g4aVar26.getValue()).booleanValue() ? "Switch to Blue Background" : "Switch to White Background";
                        e eVarF2 = g.f(aVar, 1.0f);
                        Object objV15 = bVar2.v();
                        if (objV15 == c0020a2) {
                            objV15 = new vg4(4, g4aVar26);
                            bVar2.p(objV15);
                        }
                        vt6 vt6Var = vt6.Lg;
                        gt6.h(str3, (gu5) objV15, eVarF2, vt6Var, false, false, null, null, null, bVar2, 3504, 496);
                        jh2.f(bVar2, g.h(aVar, 16.0f));
                        a84.b(0.0f, 0, 7, 0L, bVar2, null);
                        nof.d("Title Alignment", bVar2, 6);
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        g4a g4aVar27 = g4aVar16;
                        String str4 = ((Boolean) g4aVar27.getValue()).booleanValue() ? "Switch to Leading" : "Switch to Centered";
                        e eVarF3 = g.f(aVar, 1.0f);
                        Object objV16 = bVar2.v();
                        if (objV16 == c0020a2) {
                            objV16 = new wl4(5, g4aVar27);
                            bVar2.p(objV16);
                        }
                        final g4a g4aVar28 = g4aVar27;
                        gt6.h(str4, (gu5) objV16, eVarF3, vt6Var, false, false, null, null, null, bVar2, 3504, 496);
                        jh2.f(bVar2, g.h(aVar, 16.0f));
                        a84.b(0.0f, 0, 7, 0L, bVar2, null);
                        jh2.f(bVar2, g.h(aVar, 16.0f));
                        nof.d("Leading Buttons", bVar2, 6);
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        g4a g4aVar29 = g4aVar17;
                        boolean zBooleanValue = ((Boolean) g4aVar29.getValue()).booleanValue();
                        Object objV17 = bVar2.v();
                        if (objV17 == c0020a2) {
                            i3 = 2;
                            objV17 = new pk4(2, g4aVar29);
                            bVar2.p(objV17);
                        } else {
                            i3 = 2;
                        }
                        x9f.a(390, (gu5) objV17, bVar2, "Back Button", zBooleanValue);
                        final g4a g4aVar30 = g4aVar18;
                        boolean zBooleanValue2 = ((Boolean) g4aVar30.getValue()).booleanValue();
                        Object objV18 = bVar2.v();
                        if (objV18 == c0020a2) {
                            objV18 = new op0(5, g4aVar30);
                            bVar2.p(objV18);
                        }
                        x9f.a(390, (gu5) objV18, bVar2, "Logo Button", zBooleanValue2);
                        final g4a g4aVar31 = g4aVar9;
                        boolean zBooleanValue3 = ((Boolean) g4aVar31.getValue()).booleanValue();
                        Object objV19 = bVar2.v();
                        if (objV19 == c0020a2) {
                            objV19 = new rr2(8, g4aVar31);
                            bVar2.p(objV19);
                        }
                        x9f.a(390, (gu5) objV19, bVar2, "Profile Button", zBooleanValue3);
                        final g4a g4aVar32 = g4aVar19;
                        boolean zBooleanValue4 = ((Boolean) g4aVar32.getValue()).booleanValue();
                        Object objV20 = bVar2.v();
                        if (objV20 == c0020a2) {
                            objV20 = new rk4(3, g4aVar32);
                            bVar2.p(objV20);
                        }
                        x9f.a(390, (gu5) objV20, bVar2, "Sign In Button", zBooleanValue4);
                        final g4a g4aVar33 = g4aVar21;
                        boolean zBooleanValue5 = ((Boolean) g4aVar33.getValue()).booleanValue();
                        Object objV21 = bVar2.v();
                        if (objV21 == c0020a2) {
                            objV21 = new vf4(1, g4aVar33);
                            bVar2.p(objV21);
                        }
                        x9f.a(390, (gu5) objV21, bVar2, "Search Button", zBooleanValue5);
                        g4a g4aVar34 = g4aVar14;
                        boolean zBooleanValue6 = ((Boolean) g4aVar34.getValue()).booleanValue();
                        Object objV22 = bVar2.v();
                        if (objV22 == c0020a2) {
                            objV22 = new zm4(i3, g4aVar34);
                            bVar2.p(objV22);
                        }
                        x9f.a(390, (gu5) objV22, bVar2, "Custom Button", zBooleanValue6);
                        jh2.f(bVar2, g.h(aVar, 16.0f));
                        a84.b(0.0f, 0, 7, 0L, bVar2, null);
                        jh2.f(bVar2, g.h(aVar, 16.0f));
                        nof.d("Button Badges", bVar2, 6);
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        final g4a g4aVar35 = g4aVar20;
                        boolean zBooleanValue7 = ((Boolean) g4aVar35.getValue()).booleanValue();
                        Object objV23 = bVar2.v();
                        if (objV23 == c0020a2) {
                            objV23 = new bw(5, g4aVar35);
                            bVar2.p(objV23);
                        }
                        x9f.a(390, (gu5) objV23, bVar2, "Show Badges", zBooleanValue7);
                        jh2.f(bVar2, g.h(aVar, 16.0f));
                        a84.b(0.0f, 0, 7, 0L, bVar2, null);
                        jh2.f(bVar2, g.h(aVar, 16.0f));
                        nof.d("Preset Configurations", bVar2, 6);
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        e eVarF4 = g.f(aVar, 1.0f);
                        Object objV24 = bVar2.v();
                        g4a g4aVar36 = g4aVar11;
                        if (objV24 == c0020a2) {
                            g4aVar22 = g4aVar36;
                            g4aVar23 = g4aVar29;
                            g4aVar24 = g4aVar34;
                            gu5 gu5Var2 = new gu5() { // from class: s9f
                                @Override // defpackage.gu5
                                public final Object invoke() {
                                    g4aVar23.setValue(Boolean.TRUE);
                                    Boolean bool8 = Boolean.FALSE;
                                    g4aVar31.setValue(bool8);
                                    g4aVar30.setValue(bool8);
                                    g4aVar22.setValue(bool8);
                                    g4aVar32.setValue(bool8);
                                    g4aVar33.setValue(bool8);
                                    g4aVar24.setValue(bool8);
                                    g4aVar28.setValue(bool8);
                                    return j6g.a;
                                }
                            };
                            bVar2.p(gu5Var2);
                            objV24 = gu5Var2;
                        } else {
                            g4aVar22 = g4aVar36;
                            g4aVar23 = g4aVar29;
                            g4aVar24 = g4aVar34;
                        }
                        gt6.h("Basic: Back + Title", (gu5) objV24, eVarF4, vt6Var, false, false, null, null, null, bVar2, 3510, 496);
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        e eVarF5 = g.f(aVar, 1.0f);
                        Object objV25 = bVar2.v();
                        if (objV25 == c0020a2) {
                            gu5 gu5Var3 = new gu5() { // from class: t9f
                                @Override // defpackage.gu5
                                public final Object invoke() {
                                    Boolean bool8 = Boolean.FALSE;
                                    g4aVar23.setValue(bool8);
                                    Boolean bool9 = Boolean.TRUE;
                                    g4aVar31.setValue(bool9);
                                    g4aVar30.setValue(bool9);
                                    g4aVar22.setValue(bool8);
                                    g4aVar32.setValue(bool8);
                                    g4aVar33.setValue(bool8);
                                    g4aVar24.setValue(bool8);
                                    g4aVar28.setValue(bool8);
                                    return j6g.a;
                                }
                            };
                            bVar2.p(gu5Var3);
                            objV25 = gu5Var3;
                        }
                        gt6.h("Logo + Profile", (gu5) objV25, eVarF5, vt6Var, false, false, null, null, null, bVar2, 3510, 496);
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        e eVarF6 = g.f(aVar, 1.0f);
                        Object objV26 = bVar2.v();
                        if (objV26 == c0020a2) {
                            gu5 gu5Var4 = new gu5() { // from class: u9f
                                @Override // defpackage.gu5
                                public final Object invoke() {
                                    Boolean bool8 = Boolean.TRUE;
                                    g4aVar23.setValue(bool8);
                                    g4aVar31.setValue(bool8);
                                    Boolean bool9 = Boolean.FALSE;
                                    g4aVar30.setValue(bool9);
                                    g4aVar22.setValue(bool8);
                                    g4aVar32.setValue(bool9);
                                    g4aVar33.setValue(bool9);
                                    g4aVar24.setValue(bool8);
                                    g4aVar35.setValue(bool8);
                                    g4aVar28.setValue(bool9);
                                    return j6g.a;
                                }
                            };
                            g4aVar28 = g4aVar28;
                            bVar2.p(gu5Var4);
                            objV26 = gu5Var4;
                        }
                        gt6.h("Full Featured", (gu5) objV26, eVarF6, vt6Var, false, false, null, null, null, bVar2, 3510, 496);
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        e eVarF7 = g.f(aVar, 1.0f);
                        Object objV27 = bVar2.v();
                        if (objV27 == c0020a2) {
                            gu5 gu5Var5 = new gu5() { // from class: v9f
                                @Override // defpackage.gu5
                                public final Object invoke() {
                                    Boolean bool8 = Boolean.FALSE;
                                    g4aVar23.setValue(bool8);
                                    g4aVar31.setValue(bool8);
                                    Boolean bool9 = Boolean.TRUE;
                                    g4aVar30.setValue(bool9);
                                    g4aVar22.setValue(bool8);
                                    g4aVar32.setValue(bool9);
                                    g4aVar33.setValue(bool8);
                                    g4aVar24.setValue(bool8);
                                    g4aVar28.setValue(bool8);
                                    return j6g.a;
                                }
                            };
                            bVar2.p(gu5Var5);
                            objV27 = gu5Var5;
                        }
                        gt6.h("Sign In Flow", (gu5) objV27, eVarF7, vt6Var, false, false, null, null, null, bVar2, 3510, 496);
                        jh2.f(bVar2, g.h(aVar, 8.0f));
                        e eVarF8 = g.f(aVar, 1.0f);
                        Object objV28 = bVar2.v();
                        if (objV28 == c0020a2) {
                            rn4 rn4Var = new rn4(g4aVar23, g4aVar31, g4aVar30, g4aVar22, g4aVar32, g4aVar33, g4aVar24, g4aVar28);
                            bVar2.p(rn4Var);
                            objV28 = rn4Var;
                        }
                        gt6.h("Search Bar + Profile", (gu5) objV28, eVarF8, vt6Var, false, false, null, null, null, bVar2, 3510, 496);
                        bVar2.q();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVar2);
            cVar = cVar2;
            dmd.a(eVarD, ah2VarC, null, null, null, 0, 0L, 0L, null, ah2VarC2, cVar, 805306422, 508);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new qa3(i, 7, gu5Var, d4gVar);
        }
    }

    public static final boolean c(g4a<Boolean> g4aVar) {
        return g4aVar.getValue().booleanValue();
    }

    public static final boolean d(g4a<Boolean> g4aVar) {
        return g4aVar.getValue().booleanValue();
    }

    public static final boolean e(g4a<Boolean> g4aVar) {
        return g4aVar.getValue().booleanValue();
    }

    public static final void f(int i, b bVar) {
        c cVar;
        c cVarH = bVar.h(1510412389);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            cVar = cVarH;
            cif.b("Scroll down to see more options", g.f(androidx.compose.ui.platform.f.a(e.a.b, "TopNavTitle"), 1.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.h, o97Var.c.b.h.a, o97Var.e.f, o97Var.f.a, null, o97Var.d.a, 0L, 3, o97Var.g.c, null, null, 0, 16613336), cVar, 54, 0, 65532);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ov(i);
        }
    }
}
