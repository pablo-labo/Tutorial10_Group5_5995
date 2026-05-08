package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class szc {

    public static final class a implements l74 {
        public final /* synthetic */ iba a;
        public final /* synthetic */ pzc b;

        public a(iba ibaVar, pzc pzcVar) {
            this.a = ibaVar;
            this.b = pzcVar;
        }

        @Override // defpackage.l74
        public final void dispose() {
            iba ibaVar = this.a;
            ibaVar.getClass();
            ibaVar.q.remove(this.b);
        }
    }

    public static final class b implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            dg3.i(szc.b(gzc.b));
            dg3.i(szc.b(gzc.a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final tzc tzcVar, final List<String> list, final Function2<? super tzc, ? super List<String>, j6g> function2, final gu5<j6g> gu5Var, final t41 t41Var, final b5g b5gVar, final hw9 hw9Var, androidx.compose.runtime.b bVar, final int i) {
        c cVar;
        final iba ibaVar;
        function2.getClass();
        gu5Var.getClass();
        t41Var.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-1074092038);
        int i2 = i | (cVarH.d(tzcVar.ordinal()) ? 4 : 2) | (cVarH.x(list) ? 32 : 16) | (cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(t41Var) ? 16384 : 8192) | (cVarH.d(b5gVar.ordinal()) ? 131072 : 65536) | (cVarH.x(hw9Var) ? 1048576 : 524288);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            iba ibaVarB = q92.B(new s[0], cVarH);
            final String strI = ak2.I(R.string.edit_relocation, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(tzcVar);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(list);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f("");
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f(Boolean.FALSE);
                cVarH.p(objV4);
            }
            final g4a g4aVar4 = (g4a) objV4;
            final boolean z = (((tzc) g4aVar.getValue()) == tzcVar && wl7.b((List) g4aVar2.getValue(), list)) ? false : true;
            boolean zX = cVarH.x(ibaVarB);
            Object objV5 = cVarH.v();
            if (zX || objV5 == c0020a) {
                objV5 = new ne(ibaVarB, 15);
                cVarH.p(objV5);
            }
            to4.b(ibaVarB, (Function1) objV5, cVarH);
            j6g j6gVar = j6g.a;
            Object objV6 = cVarH.v();
            if (objV6 == c0020a) {
                objV6 = new xi(13);
                cVarH.p(objV6);
            }
            to4.b(j6gVar, (Function1) objV6, cVarH);
            boolean zK = cVarH.K(strI) | cVarH.a(z) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((458752 & i2) == 131072) | cVarH.x(ibaVarB) | cVarH.x(t41Var) | ((i2 & 3670016) == 1048576 || cVarH.x(hw9Var));
            Object objV7 = cVarH.v();
            if (zK || objV7 == c0020a) {
                ibaVar = ibaVarB;
                Function1 function1 = new Function1() { // from class: lzc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final String str = strI;
                        final boolean z2 = z;
                        final gu5 gu5Var2 = gu5Var;
                        final Function2 function22 = function2;
                        final b5g b5gVar2 = b5gVar;
                        final g4a g4aVar5 = g4aVar;
                        final g4a g4aVar6 = g4aVar2;
                        final g4a g4aVar7 = g4aVar4;
                        final iba ibaVar2 = ibaVar;
                        final g4a g4aVar8 = g4aVar3;
                        hba.a(gbaVar, "RELOCATION_PREFERENCE", new ah2(464664631, new xu5() { // from class: nzc
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).getClass();
                                ((bd0) obj2).getClass();
                                ((d) obj3).getClass();
                                final g4a g4aVar9 = g4aVar5;
                                int iOrdinal = ((tzc) g4aVar9.getValue()).ordinal();
                                gu5 gu5Var3 = null;
                                final g4a g4aVar10 = g4aVar6;
                                boolean z3 = true;
                                if (iOrdinal != 0 && iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        l.g();
                                        return null;
                                    }
                                    if (((List) g4aVar10.getValue()).isEmpty()) {
                                        z3 = false;
                                    }
                                }
                                final boolean z4 = z2;
                                boolean zA = bVar2.a(z4);
                                final gu5 gu5Var4 = gu5Var2;
                                boolean zK2 = zA | bVar2.K(gu5Var4);
                                Object objV8 = bVar2.v();
                                final g4a g4aVar11 = g4aVar7;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zK2 || objV8 == c0020a2) {
                                    objV8 = new gu5() { // from class: qzc
                                        @Override // defpackage.gu5
                                        public final Object invoke() {
                                            if (z4) {
                                                g4aVar11.setValue(Boolean.TRUE);
                                            } else {
                                                gu5Var4.invoke();
                                            }
                                            return j6g.a;
                                        }
                                    };
                                    bVar2.p(objV8);
                                }
                                gu5 gu5Var5 = (gu5) objV8;
                                final Function2 function23 = function22;
                                if (z3) {
                                    bVar2.L(145130195);
                                    boolean zK3 = bVar2.K(function23);
                                    Object objV9 = bVar2.v();
                                    if (zK3 || objV9 == c0020a2) {
                                        objV9 = new vv2(function23, g4aVar9, g4aVar10);
                                        bVar2.p(objV9);
                                    }
                                    gu5Var3 = (gu5) objV9;
                                    bVar2.F();
                                } else {
                                    bVar2.L(145498847);
                                    bVar2.F();
                                }
                                final b5g b5gVar3 = b5gVar2;
                                final iba ibaVar3 = ibaVar2;
                                final g4a g4aVar12 = g4aVar8;
                                sb1.a(str, gu5Var5, gu5Var3, 0, null, 0, null, null, b5gVar3, false, false, false, false, null, 0, bh2.c(-1038186247, new Function2() { // from class: rzc
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj6, Object obj7) {
                                        b bVar3 = (b) obj6;
                                        int iIntValue = ((Integer) obj7).intValue();
                                        if (bVar3.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            ag9 ag9VarD = hl1.d(c20.a.a, false);
                                            int iHashCode = Long.hashCode(bVar3.k());
                                            t8b t8bVarM = bVar3.m();
                                            e.a aVar = e.a.b;
                                            e eVarC = androidx.compose.ui.c.c(bVar3, aVar);
                                            gl2.j.getClass();
                                            pm8.a aVar2 = gl2.a.b;
                                            if (bVar3.j() == null) {
                                                pg8.B();
                                                throw null;
                                            }
                                            bVar3.B();
                                            if (bVar3.f()) {
                                                bVar3.y(aVar2);
                                            } else {
                                                bVar3.n();
                                            }
                                            gl2.a.d dVar = gl2.a.g;
                                            ygg.y(bVar3, ag9VarD, dVar);
                                            gl2.a.f fVar = gl2.a.f;
                                            ygg.y(bVar3, t8bVarM, fVar);
                                            gl2.a.C0251a c0251a = gl2.a.j;
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                                                uz.g(iHashCode, bVar3, iHashCode, c0251a);
                                            }
                                            gl2.a.e eVar = gl2.a.d;
                                            ygg.y(bVar3, eVarC, eVar);
                                            e eVarM = pnb.M(f.h(g.f(aVar, 1.0f), v1c.e, 0.0f, 2), pnb.L(0, 1, bVar3), true);
                                            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar3, 0);
                                            int iHashCode2 = Long.hashCode(bVar3.k());
                                            t8b t8bVarM2 = bVar3.m();
                                            e eVarC2 = androidx.compose.ui.c.c(bVar3, eVarM);
                                            if (bVar3.j() == null) {
                                                pg8.B();
                                                throw null;
                                            }
                                            bVar3.B();
                                            if (bVar3.f()) {
                                                bVar3.y(aVar2);
                                            } else {
                                                bVar3.n();
                                            }
                                            ygg.y(bVar3, ob2VarA, dVar);
                                            ygg.y(bVar3, t8bVarM2, fVar);
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                                                uz.g(iHashCode2, bVar3, iHashCode2, c0251a);
                                            }
                                            ygg.y(bVar3, eVarC2, eVar);
                                            g4a g4aVar13 = g4aVar9;
                                            tzc tzcVar2 = (tzc) g4aVar13.getValue();
                                            g4a g4aVar14 = g4aVar10;
                                            List list2 = (List) g4aVar14.getValue();
                                            Object objV10 = bVar3.v();
                                            b.a.C0020a c0020a3 = b.a.a;
                                            if (objV10 == c0020a3) {
                                                objV10 = new ns(5, g4aVar13);
                                                bVar3.p(objV10);
                                            }
                                            Function1 function12 = (Function1) objV10;
                                            iba ibaVar4 = ibaVar3;
                                            boolean zX2 = bVar3.x(ibaVar4);
                                            Object objV11 = bVar3.v();
                                            g4a g4aVar15 = g4aVar12;
                                            if (zX2 || objV11 == c0020a3) {
                                                objV11 = new m78(ibaVar4, g4aVar15, 1);
                                                bVar3.p(objV11);
                                            }
                                            gu5 gu5Var6 = (gu5) objV11;
                                            boolean zX3 = bVar3.x(ibaVar4);
                                            Object objV12 = bVar3.v();
                                            if (zX3 || objV12 == c0020a3) {
                                                objV12 = new ny(ibaVar4, g4aVar15, 2);
                                                bVar3.p(objV12);
                                            }
                                            Function1 function13 = (Function1) objV12;
                                            Object objV13 = bVar3.v();
                                            if (objV13 == c0020a3) {
                                                objV13 = new mb(6, g4aVar14);
                                                bVar3.p(objV13);
                                            }
                                            hic.e(tzcVar2, list2, function12, gu5Var6, function13, (Function1) objV13, bVar3, 1576320);
                                            jh2.f(bVar3, g.h(aVar, v1c.d));
                                            bVar3.q();
                                            g4a g4aVar16 = g4aVar11;
                                            if (((Boolean) g4aVar16.getValue()).booleanValue()) {
                                                bVar3.L(-681824458);
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-preferences-tab-relocation-preference", "confirmation-alert", sp7.c.a.a, null, null, 24));
                                                Object objV14 = bVar3.v();
                                                if (objV14 == c0020a3) {
                                                    objV14 = new bw(4, g4aVar16);
                                                    bVar3.p(objV14);
                                                }
                                                gu5 gu5Var7 = (gu5) objV14;
                                                gu5 gu5Var8 = gu5Var4;
                                                boolean zK4 = bVar3.K(gu5Var8);
                                                Object objV15 = bVar3.v();
                                                if (zK4 || objV15 == c0020a3) {
                                                    objV15 = new yp0(9, gu5Var8, g4aVar16);
                                                    bVar3.p(objV15);
                                                }
                                                r03.e(gu5Var7, (gu5) objV15, bVar3, 6);
                                            } else {
                                                bVar3.L(-691748209);
                                            }
                                            bVar3.F();
                                            if (b5gVar3 == b5g.c) {
                                                bVar3.L(-681067252);
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-preferences-tab-relocation-preference", "error-toast", sp7.c.a.c, null, null, 24));
                                                Function2 function24 = function23;
                                                boolean zK5 = bVar3.K(function24);
                                                Object objV16 = bVar3.v();
                                                if (zK5 || objV16 == c0020a3) {
                                                    objV16 = new kzc(function24, g4aVar13, g4aVar14, 0);
                                                    bVar3.p(objV16);
                                                }
                                                rg0.a((gu5) objV16, bVar3, 0);
                                            } else {
                                                bVar3.L(-691748209);
                                            }
                                            bVar3.F();
                                            bVar3.q();
                                        } else {
                                            bVar3.D();
                                        }
                                        return j6g.a;
                                    }
                                }, bVar2), bVar2, 0, 196608, 32504);
                                return j6g.a;
                            }
                        }, true));
                        final t41 t41Var2 = t41Var;
                        final hw9 hw9Var2 = hw9Var;
                        hba.a(gbaVar, "LOCATION_AUTOCOMPLETE", new ah2(-327849824, new xu5() { // from class: ozc
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                d dVar = (d) obj3;
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).getClass();
                                ((bd0) obj2).getClass();
                                dVar.getClass();
                                t41 t41Var3 = t41Var2;
                                boolean zX2 = bVar2.x(t41Var3);
                                Object objV8 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zX2 || objV8 == c0020a2) {
                                    objV8 = new yh(t41Var3, 14);
                                    bVar2.p(objV8);
                                }
                                iwc iwcVar = fwc.a;
                                f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV8), dVar.getDefaultViewModelCreationExtras(), bVar2);
                                String strI2 = ak2.I(R.string.desired_location, bVar2);
                                final g4a g4aVar9 = g4aVar8;
                                String str2 = (String) g4aVar9.getValue();
                                List<g51> listS = f51Var.s();
                                boolean zX3 = bVar2.x(f51Var);
                                Object objV9 = bVar2.v();
                                if (zX3 || objV9 == c0020a2) {
                                    objV9 = new cu(f51Var, 13);
                                    bVar2.p(objV9);
                                }
                                Function1 function12 = (Function1) objV9;
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK2 = bVar2.K(gu5Var3);
                                Object objV10 = bVar2.v();
                                if (zK2 || objV10 == c0020a2) {
                                    objV10 = new u9(11, gu5Var3);
                                    bVar2.p(objV10);
                                }
                                gu5 gu5Var4 = (gu5) objV10;
                                final iba ibaVar3 = ibaVar2;
                                boolean zX4 = bVar2.x(ibaVar3);
                                Object objV11 = bVar2.v();
                                if (zX4 || objV11 == c0020a2) {
                                    final g4a g4aVar10 = g4aVar6;
                                    final g4a g4aVar11 = g4aVar5;
                                    objV11 = new Function1() { // from class: jzc
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            String str3 = (String) obj6;
                                            str3.getClass();
                                            g4a g4aVar12 = g4aVar9;
                                            if (!str3.equals((String) g4aVar12.getValue())) {
                                                g4a g4aVar13 = g4aVar10;
                                                List list2 = (List) g4aVar13.getValue();
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj7 : list2) {
                                                    String str4 = (String) obj7;
                                                    if (!wl7.b(str4, str3) && !wl7.b(str4, (String) g4aVar12.getValue())) {
                                                        arrayList.add(obj7);
                                                    }
                                                }
                                                g4aVar13.setValue(z92.g1(str3, arrayList));
                                                g4aVar12.setValue("");
                                                if (!((List) g4aVar13.getValue()).isEmpty()) {
                                                    g4aVar11.setValue(tzc.c);
                                                }
                                            }
                                            ibaVar3.p("RELOCATION_PREFERENCE");
                                            return j6g.a;
                                        }
                                    };
                                    bVar2.p(objV11);
                                }
                                Function1 function13 = (Function1) objV11;
                                boolean zX5 = bVar2.x(ibaVar3);
                                Object objV12 = bVar2.v();
                                if (zX5 || objV12 == c0020a2) {
                                    objV12 = new ib(ibaVar3, 5);
                                    bVar2.p(objV12);
                                }
                                e51.b(str, strI2, null, null, true, false, str2, listS, function12, gu5Var4, function13, (gu5) objV12, null, null, null, hw9Var2, 0, null, null, false, false, bVar2, 221184, 262528, 2056204);
                                return j6g.a;
                            }
                        }, true));
                        return j6g.a;
                    }
                };
                cVarH.p(function1);
                objV7 = function1;
            } else {
                ibaVar = ibaVarB;
            }
            cVar = cVarH;
            nba.c(ibaVar, "RELOCATION_PREFERENCE", null, null, null, null, null, null, null, null, (Function1) objV7, cVar, 0, 0, 1020);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(list, function2, gu5Var, t41Var, b5gVar, hw9Var, i) { // from class: mzc
                public final /* synthetic */ hw9 V;
                public final /* synthetic */ List b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ t41 e;
                public final /* synthetic */ b5g f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(2097153);
                    szc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final String b(gzc gzcVar) {
        int iOrdinal = gzcVar.ordinal();
        pjb pjbVar = pjb.e;
        rxb rxbVar = rxb.b;
        if (iOrdinal == 0) {
            return dg3.b(rxbVar, pjbVar, null, "Edit", 4);
        }
        if (iOrdinal == 1) {
            return dg3.a(rxbVar, pjbVar, gzc.b, "");
        }
        l.g();
        return null;
    }
}
