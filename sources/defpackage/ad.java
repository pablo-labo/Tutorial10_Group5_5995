package defpackage;

import androidx.compose.foundation.layout.f;
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
import defpackage.mu0;
import defpackage.pm8;
import defpackage.sp7;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ad {
    public static final void a(final boolean z, final Function1 function1, final gu5 gu5Var, final b5g b5gVar, final mu0 mu0Var, b bVar, final int i) {
        c cVar;
        int i2;
        int i3;
        final iba ibaVar;
        mu0.a aVar;
        function1.getClass();
        gu5Var.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-1668467218);
        int i4 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.d(b5gVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(mu0Var) ? 16384 : 8192);
        int i5 = 1;
        if (cVarH.o(i4 & 1, (i4 & 9363) != 9362)) {
            if (z) {
                i2 = 349917409;
                i3 = R.string.edit_group;
            } else {
                i2 = 349973922;
                i3 = R.string.add_group;
            }
            final String strK = z3.k(cVarH, i2, i3, cVarH, false);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                String str = mu0Var != null ? mu0Var.a : null;
                if (str == null) {
                    str = "";
                }
                objV = r.f(str);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f((mu0Var == null || (aVar = mu0Var.c) == null) ? null : aVar.b);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                String str2 = mu0Var != null ? mu0Var.b : null;
                objV3 = r.f(str2 != null ? str2 : "");
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            final o97 o97Var = (o97) cVarH.M(p97.a);
            iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV4 = cVarH.v();
            if (zX || objV4 == c0020a) {
                objV4 = new sa(ibaVarB, i5);
                cVarH.p(objV4);
            }
            to4.b(ibaVarB, (Function1) objV4, cVarH);
            boolean zX2 = ((i4 & 896) == 256) | cVarH.x(ibaVarB) | cVarH.K(strK) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | cVarH.x(o97Var);
            Object objV5 = cVarH.v();
            if (zX2 || objV5 == c0020a) {
                ibaVar = ibaVarB;
                Function1 function12 = new Function1() { // from class: gc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final iba ibaVar2 = ibaVar;
                        final String str3 = strK;
                        final gu5 gu5Var2 = gu5Var;
                        final g4a g4aVar4 = g4aVar;
                        hba.a(gbaVar, "TITLE", new ah2(-1670598037, new xu5() { // from class: rc
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                gu5 gu5Var3;
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).getClass();
                                ((bd0) obj2).getClass();
                                ((d) obj3).getClass();
                                float fB = i3c.b(qu0.a.c(), wh.a);
                                g4a g4aVar5 = g4aVar4;
                                boolean zU = zve.U((String) g4aVar5.getValue());
                                int i6 = 0;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zU) {
                                    bVar2.L(1295383307);
                                    bVar2.F();
                                    gu5Var3 = null;
                                } else {
                                    bVar2.L(1295262593);
                                    iba ibaVar3 = ibaVar2;
                                    boolean zX3 = bVar2.x(ibaVar3);
                                    Object objV6 = bVar2.v();
                                    if (zX3 || objV6 == c0020a2) {
                                        objV6 = new vc(ibaVar3, i6);
                                        bVar2.p(objV6);
                                    }
                                    gu5Var3 = (gu5) objV6;
                                    bVar2.F();
                                }
                                gu5 gu5Var4 = gu5Var2;
                                boolean zK = bVar2.K(gu5Var4);
                                Object objV7 = bVar2.v();
                                if (zK || objV7 == c0020a2) {
                                    objV7 = new wc(i6, gu5Var4);
                                    bVar2.p(objV7);
                                }
                                Float fValueOf = Float.valueOf(fB);
                                String str4 = str3;
                                sb1.a(str4, (gu5) objV7, gu5Var3, 0, null, 0, null, fValueOf, null, false, false, false, false, null, 0, bh2.c(-1517406803, new xb(i6, str4, g4aVar5), bVar2), bVar2, 0, 196608, 32632);
                                return j6g.a;
                            }
                        }, true));
                        final g4a g4aVar5 = g4aVar2;
                        hba.a(gbaVar, "TIME_PERIOD", new ah2(11896340, new xu5() { // from class: sc
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV6 = bVar2.v();
                                int i6 = 0;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV6 == c0020a2) {
                                    objV6 = new yb(i6);
                                    bVar2.p(objV6);
                                }
                                to4.b(j6gVar, (Function1) objV6, bVar2);
                                float fB = i3c.b(qu0.b.c(), wh.a);
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK = bVar2.K(gu5Var3);
                                Object objV7 = bVar2.v();
                                if (zK || objV7 == c0020a2) {
                                    objV7 = new zb(i6, gu5Var3);
                                    bVar2.p(objV7);
                                }
                                gu5 gu5Var4 = (gu5) objV7;
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV8 = bVar2.v();
                                if (zX3 || objV8 == c0020a2) {
                                    objV8 = new ac(ibaVar3, i6);
                                    bVar2.p(objV8);
                                }
                                gu5 gu5Var5 = (gu5) objV8;
                                boolean zX4 = bVar2.x(ibaVar3);
                                Object objV9 = bVar2.v();
                                if (zX4 || objV9 == c0020a2) {
                                    objV9 = new bc(ibaVar3, i6);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var6 = (gu5) objV9;
                                boolean zX5 = bVar2.x(ibaVar3);
                                Object objV10 = bVar2.v();
                                if (zX5 || objV10 == c0020a2) {
                                    objV10 = new ya(ibaVar3, 1);
                                    bVar2.p(objV10);
                                }
                                Float fValueOf = Float.valueOf(fB);
                                ah2 ah2VarC = bh2.c(1199784150, new cc(0, g4aVar5), bVar2);
                                sb1.a(str3, gu5Var4, gu5Var5, 0, gu5Var6, 0, (gu5) objV10, fValueOf, null, false, false, false, false, null, 0, ah2VarC, bVar2, 0, 196608, 32552);
                                return j6gVar;
                            }
                        }, true));
                        final o97 o97Var2 = o97Var;
                        final g4a g4aVar6 = g4aVar3;
                        final b5g b5gVar2 = b5gVar;
                        final Function1 function13 = function1;
                        hba.a(gbaVar, "DESCRIPTION", new ah2(-555015693, new xu5() { // from class: tc
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV6 = bVar2.v();
                                int i6 = 0;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV6 == c0020a2) {
                                    objV6 = new dc(0);
                                    bVar2.p(objV6);
                                }
                                to4.b(j6gVar, (Function1) objV6, bVar2);
                                float fB = i3c.b(qu0.c.c(), wh.a);
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK = bVar2.K(gu5Var3);
                                Object objV7 = bVar2.v();
                                if (zK || objV7 == c0020a2) {
                                    objV7 = new ec(i6, gu5Var3);
                                    bVar2.p(objV7);
                                }
                                gu5 gu5Var4 = (gu5) objV7;
                                final Function1 function14 = function13;
                                boolean zK2 = bVar2.K(function14);
                                Object objV8 = bVar2.v();
                                final g4a g4aVar7 = g4aVar4;
                                final g4a g4aVar8 = g4aVar6;
                                final g4a g4aVar9 = g4aVar5;
                                if (zK2 || objV8 == c0020a2) {
                                    objV8 = new gu5() { // from class: fc
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.gu5
                                        public final Object invoke() {
                                            ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-groups", "save", null, null, 12));
                                            function14.invoke(new lu0((String) g4aVar7.getValue(), (ig3) g4aVar9.getValue(), (String) g4aVar8.getValue(), 1));
                                            return j6g.a;
                                        }
                                    };
                                    bVar2.p(objV8);
                                }
                                gu5 gu5Var5 = (gu5) objV8;
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV9 = bVar2.v();
                                if (zX3 || objV9 == c0020a2) {
                                    objV9 = new hc(ibaVar3, i6);
                                    bVar2.p(objV9);
                                }
                                Float fValueOf = Float.valueOf(fB);
                                b5g b5gVar3 = b5gVar2;
                                ah2 ah2VarC = bh2.c(632872117, new ic(b5gVar3, g4aVar8, o97Var2), bVar2);
                                sb1.a(str3, gu5Var4, gu5Var5, R.string.finish_button_label, null, 0, (gu5) objV9, fValueOf, b5gVar3, false, false, false, false, null, 0, ah2VarC, bVar2, 0, 196608, 32304);
                                if (b5gVar3 == b5g.c) {
                                    bVar2.L(1155076673);
                                    ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-add-groups", "error-toast", sp7.c.a.c, null, null, 24));
                                    boolean zK3 = bVar2.K(function14);
                                    Object objV10 = bVar2.v();
                                    if (zK3 || objV10 == c0020a2) {
                                        jc jcVar = new jc(function14, g4aVar7, g4aVar8, g4aVar9, 0);
                                        bVar2.p(jcVar);
                                        objV10 = jcVar;
                                    }
                                    rg0.a((gu5) objV10, bVar2, 0);
                                } else {
                                    bVar2.L(1143219855);
                                }
                                bVar2.F();
                                return j6gVar;
                            }
                        }, true));
                        return j6g.a;
                    }
                };
                cVarH.p(function12);
                objV5 = function12;
            } else {
                ibaVar = ibaVarB;
            }
            cVar = cVarH;
            nba.c(ibaVar, "TITLE", null, null, null, null, null, null, null, null, (Function1) objV5, cVar, 0, 0, 1020);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, function1, gu5Var, b5gVar, mu0Var, i) { // from class: pc
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ b5g d;
                public final /* synthetic */ mu0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    ad.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final bd b(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 79833656) {
            if (str.equals("TITLE")) {
                return bd.a;
            }
            return null;
        }
        if (iHashCode == 428414940) {
            if (str.equals("DESCRIPTION")) {
                return bd.c;
            }
            return null;
        }
        if (iHashCode == 1244187507 && str.equals("TIME_PERIOD")) {
            return bd.b;
        }
        return null;
    }

    public static final void c(bd bdVar) {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-groups", bdVar, null, 8));
    }

    public static final void d(Function1<? super ig3, j6g> function1, ig3 ig3Var, b bVar, int i) {
        function1.getClass();
        c cVarH = bVar.h(-106732550);
        int i2 = (cVarH.K(ig3Var) ? 32 : 16) | i;
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            e eVarF = f.f(e.a.b, 12.0f);
            ob2 ob2VarA = mb2.a(new vs0.i(12.0f, true, new us0(i3)), c20.a.m, cVarH, 6);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
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
            kv6.a(ak2.I(R.string.label_time_period, cVarH), null, null, null, false, null, cVarH, 0, 126);
            gz9.c(function1, ig3Var, ak2.I(R.string.current_group, cVarH), false, false, null, true, 0, 0, null, cVarH, 100687878 | (i2 & 112), 3816);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new uc(function1, i, i3, ig3Var);
        }
    }
}
