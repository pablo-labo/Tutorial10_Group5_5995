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
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class q1c {
    public static final void a(final int i, final gu5 gu5Var, b bVar, final e eVar, final String str, final boolean z) {
        int i2;
        gu5 gu5Var2;
        c cVarH = bVar.h(1483684700);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            gu5Var2 = gu5Var;
            i2 |= cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            gu5Var2 = gu5Var;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            gt6.h(str, gu5Var2, eVar, vt6.Lg, false, false, z ? fv6.g3 : fv6.e7, null, null, cVarH, ((i2 >> 3) & 14) | 3072 | ((i2 >> 6) & 112) | ((i2 << 6) & 896), 432);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: q0c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q1c.a(ka2.L(i | 1), gu5Var, (b) obj, eVar, str, z);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r46, defpackage.ah2 r47, androidx.compose.runtime.b r48, int r49) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q1c.b(java.lang.String, ah2, androidx.compose.runtime.b, int):void");
    }

    public static final void c(int i, gu5 gu5Var, b bVar, String str, boolean z) {
        gu5 gu5Var2;
        String str2;
        boolean z2;
        c cVarH = bVar.h(1325764166);
        int i2 = (cVarH.K(str) ? 4 : 2) | i | (cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 3;
            gu5Var2 = gu5Var;
            str2 = str;
            z2 = z;
            a((i3 & 112) | 390 | (i3 & 7168), gu5Var2, cVarH, g.f(e.a.b, 1.0f), str2, z2);
        } else {
            gu5Var2 = gu5Var;
            str2 = str;
            z2 = z;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pzb(str2, z2, gu5Var2, i, 0);
        }
    }

    public static final void d(ah2 ah2Var, b bVar, int i) {
        c cVarH = bVar.h(541219882);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            o97.g gVar = ((o97) cVarH.M(p97.a)).i;
            e eVarI = f.i(e.a.b, 16.0f, 8.0f, 16.0f, 8.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarI);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
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
            ah2Var.q(qb2.a, cVarH, 54);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new hzb(ah2Var, i);
        }
    }

    public static final void e(int i, b bVar) {
        c cVarH = bVar.h(-2044639322);
        if (cVarH.o(i & 1, i != 0)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarF = g.f(e.a.b, 1.0f);
            o97.g gVar = o97Var.i;
            a84.b(0.0f, 0, 6, 0L, cVarH, g.h(eVarF, 3.0f));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new bj2(i);
        }
    }

    public static final void f(final gu5<j6g> gu5Var, final wu5<? super ps7, Object, ? super String, j6g> wu5Var, final wu5<? super hs7, Object, ? super String, j6g> wu5Var2, final androidx.fragment.app.g gVar, final svb svbVar, final vsb vsbVar, b bVar, final int i) {
        gu5Var.getClass();
        wu5Var.getClass();
        wu5Var2.getClass();
        svbVar.getClass();
        vsbVar.getClass();
        c cVarH = bVar.h(-1808503780);
        int i2 = i | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.x(gVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(svbVar) ? 16384 : 8192) | (cVarH.x(vsbVar) ? 131072 : 65536);
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            dmd.a(g.d(e.a.b, 1.0f), bh2.c(-722348072, new pe(gu5Var, 7), cVarH), null, null, null, 0, 0L, 0L, null, bh2.c(1717428333, new wu5() { // from class: o0c
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    gza gzaVar = (gza) obj;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    gzaVar.getClass();
                    int i3 = 2;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= bVar2.K(gzaVar) ? 4 : 2;
                    }
                    final int i4 = 0;
                    final int i5 = 1;
                    if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                        e eVarM = pnb.M(f.e(g.d(e.a.b, 1.0f), gzaVar), pnb.L(0, 1, bVar2), true);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarM);
                        gl2.j.getClass();
                        pm8.a aVar = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        final androidx.fragment.app.g gVar2 = gVar;
                        final wu5 wu5Var3 = wu5Var;
                        final svb svbVar2 = svbVar;
                        q1c.b("Summary", bh2.c(404892950, new fs0(gVar2, wu5Var3, svbVar2, i5), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Contact Information", bh2.c(-8764019, new jzb(gVar2, wu5Var3, i4), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Work Experience", bh2.c(41920974, new wu5() { // from class: m0c
                            @Override // defpackage.wu5
                            public final Object q(Object obj4, Object obj5, Object obj6) {
                                int i6 = i4;
                                svb svbVar3 = svbVar2;
                                wu5 wu5Var4 = wu5Var3;
                                androidx.fragment.app.g gVar3 = gVar2;
                                byte b = 0;
                                int i7 = 1;
                                pb2 pb2Var = (pb2) obj4;
                                b bVar3 = (b) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                switch (i6) {
                                    case 0:
                                        pb2Var.getClass();
                                        if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            q1c.d(bh2.c(-1537895559, new ie4(4, gVar3, wu5Var4), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(-521316638, new s0c(gVar3, svbVar3, wu5Var4), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(-209925567, new g1c(wu5Var4, gVar3, i7), bVar3), bVar3, 6);
                                        } else {
                                            bVar3.D();
                                        }
                                        break;
                                    default:
                                        pb2Var.getClass();
                                        if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            q1c.d(bh2.c(-1183100608, new l1c(gVar3, wu5Var4, b == true ? 1 : 0), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(-166521687, new y0c(i7, wu5Var4, svbVar3, gVar3), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(144869384, new z0c(gVar3, wu5Var4, i7), bVar3), bVar3, 6);
                                        } else {
                                            bVar3.D();
                                        }
                                        break;
                                }
                                return j6g.a;
                            }
                        }, bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Education", bh2.c(92605967, new n0c(gVar2, wu5Var3, svbVar2), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Single Skill", bh2.c(143290960, new p0c(gVar2, wu5Var3, svbVar2), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Skills List", bh2.c(193975953, new uzb(i5, gVar2, wu5Var3), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Certification", bh2.c(244660946, new fl6(i5, wu5Var3, gVar2, svbVar2), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Publications", bh2.c(295345939, new wu5() { // from class: r0c
                            @Override // defpackage.wu5
                            public final Object q(Object obj4, Object obj5, Object obj6) {
                                int i6 = i4;
                                svb svbVar3 = svbVar2;
                                wu5 wu5Var4 = wu5Var3;
                                androidx.fragment.app.g gVar3 = gVar2;
                                byte b = 0;
                                byte b2 = 0;
                                int i7 = 1;
                                pb2 pb2Var = (pb2) obj4;
                                b bVar3 = (b) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                switch (i6) {
                                    case 0:
                                        pb2Var.getClass();
                                        if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            q1c.d(bh2.c(-1284470594, new izb(gVar3, wu5Var4, 2), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(-267891673, new i1c(b2 == true ? 1 : 0, wu5Var4, gVar3, svbVar3), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(43499398, new j1c(gVar3, wu5Var4, b == true ? 1 : 0), bVar3), bVar3, 6);
                                        } else {
                                            bVar3.D();
                                        }
                                        break;
                                    default:
                                        pb2Var.getClass();
                                        if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            q1c.d(bh2.c(-1902982752, new d1c(gVar3, wu5Var4, i7), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(-453807273, new e1c(i7, wu5Var4, svbVar3, gVar3), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(609381336, new f1c(gVar3, wu5Var4, i7), bVar3), bVar3, 6);
                                        } else {
                                            bVar3.D();
                                        }
                                        break;
                                }
                                return j6g.a;
                            }
                        }, bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Patent", bh2.c(346030932, new s0c(gVar2, wu5Var3, svbVar2, i4), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Group", bh2.c(396715925, new wu5() { // from class: m0c
                            @Override // defpackage.wu5
                            public final Object q(Object obj4, Object obj5, Object obj6) {
                                int i6 = i5;
                                svb svbVar3 = svbVar2;
                                wu5 wu5Var4 = wu5Var3;
                                androidx.fragment.app.g gVar3 = gVar2;
                                byte b = 0;
                                int i7 = 1;
                                pb2 pb2Var = (pb2) obj4;
                                b bVar3 = (b) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                switch (i6) {
                                    case 0:
                                        pb2Var.getClass();
                                        if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            q1c.d(bh2.c(-1537895559, new ie4(4, gVar3, wu5Var4), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(-521316638, new s0c(gVar3, svbVar3, wu5Var4), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(-209925567, new g1c(wu5Var4, gVar3, i7), bVar3), bVar3, 6);
                                        } else {
                                            bVar3.D();
                                        }
                                        break;
                                    default:
                                        pb2Var.getClass();
                                        if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            q1c.d(bh2.c(-1183100608, new l1c(gVar3, wu5Var4, b == true ? 1 : 0), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(-166521687, new y0c(i7, wu5Var4, svbVar3, gVar3), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(144869384, new z0c(gVar3, wu5Var4, i7), bVar3), bVar3, 6);
                                        } else {
                                            bVar3.D();
                                        }
                                        break;
                                }
                                return j6g.a;
                            }
                        }, bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Languages", bh2.c(-173310485, new wu5() { // from class: r0c
                            @Override // defpackage.wu5
                            public final Object q(Object obj4, Object obj5, Object obj6) {
                                int i6 = i5;
                                svb svbVar3 = svbVar2;
                                wu5 wu5Var4 = wu5Var3;
                                androidx.fragment.app.g gVar3 = gVar2;
                                byte b = 0;
                                byte b2 = 0;
                                int i7 = 1;
                                pb2 pb2Var = (pb2) obj4;
                                b bVar3 = (b) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                switch (i6) {
                                    case 0:
                                        pb2Var.getClass();
                                        if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            q1c.d(bh2.c(-1284470594, new izb(gVar3, wu5Var4, 2), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(-267891673, new i1c(b2 == true ? 1 : 0, wu5Var4, gVar3, svbVar3), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(43499398, new j1c(gVar3, wu5Var4, b == true ? 1 : 0), bVar3), bVar3, 6);
                                        } else {
                                            bVar3.D();
                                        }
                                        break;
                                    default:
                                        pb2Var.getClass();
                                        if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            q1c.d(bh2.c(-1902982752, new d1c(gVar3, wu5Var4, i7), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(-453807273, new e1c(i7, wu5Var4, svbVar3, gVar3), bVar3), bVar3, 6);
                                            q1c.d(bh2.c(609381336, new f1c(gVar3, wu5Var4, i7), bVar3), bVar3, 6);
                                        } else {
                                            bVar3.D();
                                        }
                                        break;
                                }
                                return j6g.a;
                            }
                        }, bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Award", bh2.c(-122625492, new m1c(i4, gVar2, wu5Var3, svbVar2), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Link", bh2.c(-71940499, new zy9(i5, gVar2, wu5Var3, svbVar2), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Additional Info", bh2.c(-21255506, new t0c(gVar2, wu5Var3, i3), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Military Service", bh2.c(29429487, new mlb(i5, gVar2, wu5Var3, svbVar2), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        wu5 wu5Var4 = wu5Var2;
                        q1c.b("Preferred Job Title", bh2.c(80114480, new d1c(gVar2, wu5Var4, i3), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        vsb vsbVar2 = vsbVar;
                        q1c.b("Work Area", bh2.c(130799473, new s0c(gVar2, wu5Var4, vsbVar2, i3), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Job Type", bh2.c(181484466, new wyb(gVar2, wu5Var4, i4), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Work Schedule", bh2.c(232169459, new ezb(gVar2, wu5Var4, i4), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Minimum Base Pay", bh2.c(282854452, new izb(gVar2, wu5Var4, i4), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Relocation", bh2.c(1397924298, new uzb(i4, gVar2, wu5Var4), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Remote", bh2.c(1448609291, new e0c(gVar2, wu5Var4, i4), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        q1c.b("Work Well Being", bh2.c(1499294284, new k0c(i4, gVar2, wu5Var4, vsbVar2), bVar2), bVar2, 54);
                        q1c.e(0, bVar2);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 805306422, 508);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(wu5Var, wu5Var2, gVar, svbVar, vsbVar, i) { // from class: v0c
                public final /* synthetic */ wu5 b;
                public final /* synthetic */ wu5 c;
                public final /* synthetic */ androidx.fragment.app.g d;
                public final /* synthetic */ svb e;
                public final /* synthetic */ vsb f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(295345);
                    q1c.f(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
