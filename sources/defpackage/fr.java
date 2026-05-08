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
import defpackage.pm8;
import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fr {

    public static final class a implements l74 {
        public final /* synthetic */ iba a;
        public final /* synthetic */ zq b;

        public a(iba ibaVar, zq zqVar) {
            this.a = ibaVar;
            this.b = zqVar;
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
            dg3.i(dg3.b(rxb.a, "profile-tab-add-language", gr.b, null, 8));
        }
    }

    public static final void a(final t41 t41Var, final Function1<? super wj8, j6g> function1, final gu5<j6g> gu5Var, final b5g b5gVar, final hw9 hw9Var, wj8 wj8Var, androidx.compose.runtime.b bVar, final int i, final int i2) {
        wj8 wj8Var2;
        int i3;
        final wj8 wj8Var3;
        Object obj;
        iba ibaVar;
        t41Var.getClass();
        function1.getClass();
        gu5Var.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(804534312);
        int i4 = i | (cVarH.x(t41Var) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | (cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.d(b5gVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(hw9Var) ? 16384 : 8192);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            wj8Var2 = wj8Var;
        } else {
            wj8Var2 = wj8Var;
            i3 = i4 | (cVarH.K(wj8Var2) ? 131072 : 65536);
        }
        if (cVarH.o(i3 & 1, (74899 & i3) != 74898)) {
            wj8 wj8Var4 = i5 != 0 ? null : wj8Var2;
            final String strI = ak2.I(R.string.add_language, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                String str = wj8Var4 != null ? wj8Var4.b : null;
                if (str == null) {
                    str = "";
                }
                objV = r.f(str);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(wj8Var4 != null ? wj8Var4.c : null);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(wj8Var4 != null ? wj8Var4.d : null);
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f(wj8Var4 != null ? wj8Var4.e : null);
                cVarH.p(objV4);
            }
            final g4a g4aVar4 = (g4a) objV4;
            final iba ibaVarB = q92.B(new s[0], cVarH);
            boolean zX = cVarH.x(ibaVarB);
            Object objV5 = cVarH.v();
            if (zX || objV5 == c0020a) {
                objV5 = new k1(ibaVarB, 1);
                cVarH.p(objV5);
            }
            to4.b(ibaVarB, (Function1) objV5, cVarH);
            boolean zX2 = ((i3 & 896) == 256) | cVarH.x(t41Var) | cVarH.K(strI) | cVarH.x(ibaVarB) | ((57344 & i3) == 16384 || cVarH.x(hw9Var)) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objV6 = cVarH.v();
            if (zX2 || objV6 == c0020a) {
                obj = new Function1() { // from class: xq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        gba gbaVar = (gba) obj2;
                        gbaVar.getClass();
                        final t41 t41Var2 = t41Var;
                        final String str2 = strI;
                        final gu5 gu5Var2 = gu5Var;
                        final iba ibaVar2 = ibaVarB;
                        final hw9 hw9Var2 = hw9Var;
                        final g4a g4aVar5 = g4aVar;
                        final g4a g4aVar6 = g4aVar2;
                        hba.a(gbaVar, "LANGUAGE_NAME", new ah2(-1537879477, new xu5() { // from class: ar
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                d dVar = (d) obj4;
                                b bVar2 = (b) obj5;
                                ((Integer) obj6).getClass();
                                ((bd0) obj3).getClass();
                                dVar.getClass();
                                t41 t41Var3 = t41Var2;
                                boolean zX3 = bVar2.x(t41Var3);
                                Object objV7 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zX3 || objV7 == c0020a2) {
                                    objV7 = new me(t41Var3, 1);
                                    bVar2.p(objV7);
                                }
                                iwc iwcVar = fwc.a;
                                f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV7), dVar.getDefaultViewModelCreationExtras(), bVar2);
                                ik8 ik8Var = ik8.a;
                                String strI2 = ak2.I(ik8Var.a(), bVar2);
                                g4a g4aVar7 = g4aVar5;
                                String str3 = (String) g4aVar7.getValue();
                                List list = (List) ((gme) f51Var.g0).getValue();
                                float fB = i3c.b(ik8Var.c(), wh.d);
                                boolean zX4 = bVar2.x(f51Var);
                                Object objV8 = bVar2.v();
                                if (zX4 || objV8 == c0020a2) {
                                    objV8 = new ne(f51Var, 1);
                                    bVar2.p(objV8);
                                }
                                Function1 function12 = (Function1) objV8;
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK = bVar2.K(gu5Var3);
                                Object objV9 = bVar2.v();
                                if (zK || objV9 == c0020a2) {
                                    objV9 = new eb(1, gu5Var3);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var4 = (gu5) objV9;
                                iba ibaVar3 = ibaVar2;
                                boolean zX5 = bVar2.x(ibaVar3);
                                Object objV10 = bVar2.v();
                                if (zX5 || objV10 == c0020a2) {
                                    objV10 = new fb(ibaVar3, g4aVar7, 1);
                                    bVar2.p(objV10);
                                }
                                Function1 function13 = (Function1) objV10;
                                Float fValueOf = Float.valueOf(fB);
                                Object objV11 = bVar2.v();
                                if (objV11 == c0020a2) {
                                    objV11 = new uq(0, g4aVar6);
                                    bVar2.p(objV11);
                                }
                                e51.b(str2, strI2, null, null, true, false, str3, list, function12, gu5Var4, function13, null, null, fValueOf, (Function1) objV11, hw9Var2, 0, null, null, false, false, bVar2, 221184, 287104, 2033676);
                                return j6g.a;
                            }
                        }, true));
                        final g4a g4aVar7 = g4aVar3;
                        final g4a g4aVar8 = g4aVar4;
                        final b5g b5gVar2 = b5gVar;
                        final Function1 function12 = function1;
                        hba.a(gbaVar, "PROFICIENCY", new ah2(2030583490, new xu5() { // from class: br
                            @Override // defpackage.xu5
                            public final Object j(Object obj3, Object obj4, Object obj5, Object obj6) {
                                b bVar2 = (b) obj5;
                                s6.g((Integer) obj6, (bd0) obj3, (d) obj4);
                                j6g j6gVar = j6g.a;
                                Object objV7 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV7 == c0020a2) {
                                    objV7 = new xi(1);
                                    bVar2.p(objV7);
                                }
                                to4.b(j6gVar, (Function1) objV7, bVar2);
                                float fB = i3c.b(ik8.b.c(), wh.d);
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK = bVar2.K(gu5Var3);
                                Object objV8 = bVar2.v();
                                if (zK || objV8 == c0020a2) {
                                    objV8 = new cr(0, gu5Var3);
                                    bVar2.p(objV8);
                                }
                                gu5 gu5Var4 = (gu5) objV8;
                                final Function1 function13 = function12;
                                boolean zK2 = bVar2.K(function13);
                                Object objV9 = bVar2.v();
                                final g4a g4aVar9 = g4aVar5;
                                final g4a g4aVar10 = g4aVar6;
                                final g4a g4aVar11 = g4aVar7;
                                final g4a g4aVar12 = g4aVar8;
                                if (zK2 || objV9 == c0020a2) {
                                    dr drVar = new dr(function13, g4aVar9, g4aVar10, g4aVar11, g4aVar12, 0);
                                    bVar2.p(drVar);
                                    objV9 = drVar;
                                }
                                gu5 gu5Var5 = (gu5) objV9;
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV10 = bVar2.v();
                                if (zX3 || objV10 == c0020a2) {
                                    objV10 = new er(ibaVar3, 0);
                                    bVar2.p(objV10);
                                }
                                Float fValueOf = Float.valueOf(fB);
                                final b5g b5gVar3 = b5gVar2;
                                ah2 ah2VarC = bh2.c(-806305216, new Function2() { // from class: tq
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj7, Object obj8) {
                                        b bVar3 = (b) obj7;
                                        int iIntValue = ((Integer) obj8).intValue();
                                        if (bVar3.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            e eVarB = nub.b(f.h(e.a.b, v1c.e, 0.0f, 2));
                                            b5g b5gVar4 = b5gVar3;
                                            b5g b5gVar5 = b5g.c;
                                            e eVarA = nub.a(eVarB, b5gVar4 == b5gVar5, "Add language failed", oub.SAVE);
                                            ag9 ag9VarD = hl1.d(c20.a.a, false);
                                            int iHashCode = Long.hashCode(bVar3.k());
                                            t8b t8bVarM = bVar3.m();
                                            e eVarC = androidx.compose.ui.c.c(bVar3, eVarA);
                                            gl2.j.getClass();
                                            pm8.a aVar = gl2.a.b;
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
                                            ygg.y(bVar3, ag9VarD, gl2.a.g);
                                            ygg.y(bVar3, t8bVarM, gl2.a.f);
                                            gl2.a.C0251a c0251a = gl2.a.j;
                                            if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                                                uz.g(iHashCode, bVar3, iHashCode, c0251a);
                                            }
                                            ygg.y(bVar3, eVarC, gl2.a.d);
                                            final g4a g4aVar13 = g4aVar11;
                                            String str3 = (String) g4aVar13.getValue();
                                            Object objV11 = bVar3.v();
                                            final g4a g4aVar14 = g4aVar12;
                                            b.a.C0020a c0020a3 = b.a.a;
                                            if (objV11 == c0020a3) {
                                                objV11 = new vq(g4aVar13, g4aVar14);
                                                bVar3.p(objV11);
                                            }
                                            ygg.e(str3, (Function2) objV11, bVar3, 48);
                                            bVar3.q();
                                            if (b5gVar4 == b5gVar5) {
                                                bVar3.L(1114344809);
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-add-language", "error-toast", sp7.c.a.c, null, null, 24));
                                                final Function1 function14 = function13;
                                                boolean zK3 = bVar3.K(function14);
                                                Object objV12 = bVar3.v();
                                                if (zK3 || objV12 == c0020a3) {
                                                    final g4a g4aVar15 = g4aVar9;
                                                    final g4a g4aVar16 = g4aVar10;
                                                    gu5 gu5Var6 = new gu5() { // from class: wq
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // defpackage.gu5
                                                        public final Object invoke() {
                                                            ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-language", "refresh", null, null, 12));
                                                            function14.invoke(new wj8(33, (String) null, (String) g4aVar15.getValue(), (String) g4aVar16.getValue(), (String) g4aVar13.getValue(), (String) g4aVar14.getValue()));
                                                            return j6g.a;
                                                        }
                                                    };
                                                    bVar3.p(gu5Var6);
                                                    objV12 = gu5Var6;
                                                }
                                                rg0.a((gu5) objV12, bVar3, 0);
                                            } else {
                                                bVar3.L(1105881282);
                                            }
                                            bVar3.F();
                                        } else {
                                            bVar3.D();
                                        }
                                        return j6g.a;
                                    }
                                }, bVar2);
                                sb1.a(str2, gu5Var4, gu5Var5, R.string.finish_button_label, null, 0, (gu5) objV10, fValueOf, b5gVar3, false, false, false, false, null, 0, ah2VarC, bVar2, 0, 196608, 32304);
                                return j6gVar;
                            }
                        }, true));
                        return j6g.a;
                    }
                };
                ibaVar = ibaVarB;
                cVarH.p(obj);
            } else {
                obj = objV6;
                ibaVar = ibaVarB;
            }
            nba.c(ibaVar, "LANGUAGE_NAME", null, null, null, null, null, null, null, null, (Function1) obj, cVarH, 0, 0, 1020);
            wj8Var3 = wj8Var4;
        } else {
            cVarH.D();
            wj8Var3 = wj8Var2;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(function1, gu5Var, b5gVar, hw9Var, wj8Var3, i, i2) { // from class: yq
                public final /* synthetic */ int V;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ b5g d;
                public final /* synthetic */ hw9 e;
                public final /* synthetic */ wj8 f;

                {
                    this.V = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = ka2.L(32769);
                    fr.a(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj2, iL, this.V);
                    return j6g.a;
                }
            };
        }
    }
}
