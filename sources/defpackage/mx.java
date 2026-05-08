package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.mx;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mx {

    @uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.skills.AddSkillFlowKt$AddSkillFlow$1$1$1$1$1", f = "AddSkillFlow.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            dg3.g(dg3.a(rxb.a, ca9.e, nx.a, "Add"));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.skills.AddSkillFlowKt$AddSkillFlow$1$1$2$1$1", f = "AddSkillFlow.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            dg3.g(dg3.a(rxb.a, ca9.e, nx.b, "Add"));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.skills.AddSkillFlowKt$AddSkillFlow$1$1$3$1$1", f = "AddSkillFlow.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            dg3.g(dg3.a(rxb.a, ca9.e, nx.c, "Add"));
            return j6g.a;
        }
    }

    public static final void a(final boolean z, final t41 t41Var, final Function1<? super zie, j6g> function1, final gu5<j6g> gu5Var, final b5g b5gVar, final hw9 hw9Var, final yvb yvbVar, zie zieVar, androidx.compose.runtime.b bVar, final int i, final int i2) {
        zie zieVar2;
        int i3;
        androidx.compose.runtime.c cVar;
        final zie zieVar3;
        zie zieVar4;
        final iba ibaVar;
        dbf dbfVar;
        String str;
        t41Var.getClass();
        function1.getClass();
        gu5Var.getClass();
        b5gVar.getClass();
        yvbVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-489125019);
        int i4 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(t41Var) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.d(b5gVar.ordinal()) ? 16384 : 8192) | (cVarH.x(hw9Var) ? 131072 : 65536) | (cVarH.x(yvbVar) ? 1048576 : 524288);
        int i5 = i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i5 != 0) {
            i3 = i4 | 12582912;
            zieVar2 = zieVar;
        } else {
            zieVar2 = zieVar;
            i3 = i4 | (cVarH.K(zieVar2) ? 8388608 : 4194304);
        }
        boolean z2 = true;
        if (cVarH.o(i3 & 1, (i3 & 4793491) != 4793490)) {
            zie zieVar5 = i5 != 0 ? null : zieVar2;
            iba ibaVarB = q92.B(new s[0], cVarH);
            String strK = z ? z3.k(cVarH, 1301065098, R.string.edit_skill, cVarH, false) : z3.k(cVarH, 1301121611, R.string.add_skill, cVarH, false);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                if (zieVar5 == null || (str = zieVar5.b) == null) {
                    str = "";
                }
                objV = r.f(str);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(zieVar5 != null ? zieVar5.c : null);
                cVarH.p(objV2);
            }
            final g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f((zieVar5 == null || (dbfVar = zieVar5.i) == null) ? null : dbfVar.a);
                cVarH.p(objV3);
            }
            final g4a g4aVar3 = (g4a) objV3;
            final g4a g4aVarA = dj5.a(yvbVar.V, cVarH);
            int i6 = i3 & 14;
            boolean z3 = i6 == 4;
            Object objV4 = cVarH.v();
            if (z3 || objV4 == c0020a) {
                objV4 = yvbVar.u(null, z);
                cVarH.p(objV4);
            }
            final List list = (List) objV4;
            boolean zX = cVarH.x(t41Var) | ((i3 & 57344) == 16384) | cVarH.K(strK) | cVarH.x(list) | ((i3 & 7168) == 2048) | (i6 == 4) | ((i3 & 896) == 256) | cVarH.x(ibaVarB) | cVarH.x(yvbVar);
            if ((i3 & 458752) != 131072 && !cVarH.x(hw9Var)) {
                z2 = false;
            }
            boolean zK = zX | z2 | cVarH.K(g4aVarA);
            Object objV5 = cVarH.v();
            if (zK || objV5 == c0020a) {
                final String str2 = strK;
                zieVar4 = zieVar5;
                ibaVar = ibaVarB;
                Function1 function12 = new Function1() { // from class: ww
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gba gbaVar = (gba) obj;
                        gbaVar.getClass();
                        final t41 t41Var2 = t41Var;
                        final b5g b5gVar2 = b5gVar;
                        final String str3 = str2;
                        final List list2 = list;
                        final gu5 gu5Var2 = gu5Var;
                        final boolean z4 = z;
                        final Function1 function13 = function1;
                        final iba ibaVar2 = ibaVar;
                        final yvb yvbVar2 = yvbVar;
                        final hw9 hw9Var2 = hw9Var;
                        final g4a g4aVar4 = g4aVar;
                        final g4a g4aVar5 = g4aVar3;
                        hba.a(gbaVar, "SKILL_NAME", new ah2(1049631650, new xu5() { // from class: hx
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                j6g j6gVar;
                                int i7;
                                final bd0 bd0Var = (bd0) obj2;
                                d dVar = (d) obj3;
                                b bVar2 = (b) obj4;
                                ((Integer) obj5).getClass();
                                bd0Var.getClass();
                                dVar.getClass();
                                t41 t41Var3 = t41Var2;
                                boolean zX2 = bVar2.x(t41Var3);
                                Object objV6 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (zX2 || objV6 == c0020a2) {
                                    objV6 = new q2(t41Var3, 3);
                                    bVar2.p(objV6);
                                }
                                iwc iwcVar = fwc.a;
                                final f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV6), dVar.getDefaultViewModelCreationExtras(), bVar2);
                                j6g j6gVar2 = j6g.a;
                                Object objV7 = bVar2.v();
                                if (objV7 == c0020a2) {
                                    objV7 = new mx.a(2, null);
                                    bVar2.p(objV7);
                                }
                                to4.d(bVar2, j6gVar2, (Function2) objV7);
                                fje fjeVar = fje.a;
                                String strI = ak2.I(fjeVar.a(), bVar2);
                                final g4a g4aVar6 = g4aVar4;
                                String str4 = (String) g4aVar6.getValue();
                                List list3 = c0h.F() ? (List) ((gme) f51Var.k0).getValue() : (List) ((gme) f51Var.i0).getValue();
                                float fB = i3c.b(fjeVar.c(), wh.d);
                                String strI2 = ak2.I(R.string.skill_duplicate_error, bVar2);
                                int i8 = 1;
                                int i9 = 0;
                                boolean z5 = b5gVar2 == b5g.b;
                                boolean zF = c0h.F();
                                boolean zX3 = bVar2.x(f51Var);
                                List list4 = list2;
                                boolean zX4 = zX3 | bVar2.x(list4);
                                Object objV8 = bVar2.v();
                                if (zX4 || objV8 == c0020a2) {
                                    objV8 = new xw(i9, f51Var, list4);
                                    bVar2.p(objV8);
                                }
                                Function1 function14 = (Function1) objV8;
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK2 = bVar2.K(gu5Var3);
                                Object objV9 = bVar2.v();
                                if (zK2 || objV9 == c0020a2) {
                                    objV9 = new y9(i8, gu5Var3);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var4 = (gu5) objV9;
                                final boolean z6 = z4;
                                boolean zA = bVar2.a(z6);
                                final Function1 function15 = function13;
                                boolean zK3 = zA | bVar2.K(function15);
                                final iba ibaVar3 = ibaVar2;
                                boolean zX5 = zK3 | bVar2.x(ibaVar3) | bVar2.x(f51Var);
                                final yvb yvbVar3 = yvbVar2;
                                boolean zX6 = zX5 | bVar2.x(yvbVar3) | bVar2.x(bd0Var);
                                Object objV10 = bVar2.v();
                                final g4a g4aVar7 = g4aVar5;
                                if (zX6 || objV10 == c0020a2) {
                                    j6gVar = j6gVar2;
                                    i7 = 0;
                                    objV10 = new Function1() { // from class: yw
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            Object next;
                                            String str5 = (String) obj6;
                                            str5.getClass();
                                            g4a g4aVar8 = g4aVar6;
                                            g4aVar8.setValue(str5);
                                            mx.b(nx.a);
                                            boolean zF2 = c0h.F();
                                            Function1 function16 = function15;
                                            iba ibaVar4 = ibaVar3;
                                            g4a g4aVar9 = g4aVar7;
                                            if (zF2) {
                                                if (!z6) {
                                                    String str6 = (String) g4aVar9.getValue();
                                                    if (str6 != null) {
                                                        f51 f51Var2 = f51Var;
                                                        f51Var2.getClass();
                                                        Iterator it = ((List) ((gme) f51Var2.k0).getValue()).iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                next = null;
                                                                break;
                                                            }
                                                            next = it.next();
                                                            if (wl7.b(((g51) next).d, str6)) {
                                                                break;
                                                            }
                                                        }
                                                        g51 g51Var = (g51) next;
                                                        if (g51Var != null ? g51Var.e : false) {
                                                            yvbVar3.t(str6);
                                                            ibaVar4.p("CROWTAXO_CHILD_QUESTION");
                                                        } else if (c0h.I()) {
                                                            function16.invoke(new zie(null, (String) g4aVar8.getValue(), null, null, false, (String) g4aVar9.getValue(), null, null, null, null, 989));
                                                        } else {
                                                            ibaVar4.p("EXPERIENCE");
                                                        }
                                                    } else {
                                                        function16.invoke(new zie(null, (String) g4aVar8.getValue(), null, null, false, null, null, null, null, null, 1021));
                                                    }
                                                } else if (c0h.I()) {
                                                    function16.invoke(new zie(null, (String) g4aVar8.getValue(), null, null, false, (String) g4aVar9.getValue(), null, null, null, null, 989));
                                                } else {
                                                    ibaVar4.p("EXPERIENCE");
                                                }
                                            } else if (c0h.I()) {
                                                function16.invoke(new zie(null, (String) g4aVar8.getValue(), null, null, false, (String) g4aVar9.getValue(), null, null, null, null, 989));
                                            } else {
                                                ibaVar4.p("EXPERIENCE");
                                            }
                                            return j6g.a;
                                        }
                                    };
                                    bVar2.p(objV10);
                                } else {
                                    j6gVar = j6gVar2;
                                    i7 = 0;
                                }
                                Function1 function16 = (Function1) objV10;
                                Object objV11 = bVar2.v();
                                if (objV11 == c0020a2) {
                                    objV11 = new zw(i7);
                                    bVar2.p(objV11);
                                }
                                gu5 gu5Var5 = (gu5) objV11;
                                Float fValueOf = Float.valueOf(fB);
                                Object objV12 = bVar2.v();
                                if (objV12 == c0020a2) {
                                    objV12 = new ru(1, g4aVar7);
                                    bVar2.p(objV12);
                                }
                                j6g j6gVar3 = j6gVar;
                                e51.b(str3, strI, null, null, true, false, str4, list3, function14, gu5Var4, function16, null, gu5Var5, fValueOf, (Function1) objV12, hw9Var2, R.string.next_button_label, list4, strI2, z5, zF, bVar2, 221184, 287104, 2060);
                                return j6gVar3;
                            }
                        }, true));
                        final g4a g4aVar6 = g4aVar2;
                        hba.a(gbaVar, "EXPERIENCE", new ah2(257117195, new xu5() { // from class: ix
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                Object axVar;
                                g4a g4aVar7;
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV6 = bVar2.v();
                                int i7 = 2;
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV6 == c0020a2) {
                                    objV6 = new mx.b(2, null);
                                    bVar2.p(objV6);
                                }
                                to4.d(bVar2, j6gVar, (Function2) objV6);
                                float fB = i3c.b(fje.b.c(), wh.e);
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK2 = bVar2.K(gu5Var3);
                                Object objV7 = bVar2.v();
                                if (zK2 || objV7 == c0020a2) {
                                    objV7 = new eh(i7, gu5Var3);
                                    bVar2.p(objV7);
                                }
                                gu5 gu5Var4 = (gu5) objV7;
                                Function1 function14 = function13;
                                boolean zK3 = bVar2.K(function14);
                                Object objV8 = bVar2.v();
                                g4a g4aVar8 = g4aVar4;
                                g4a g4aVar9 = g4aVar6;
                                g4a g4aVar10 = g4aVar5;
                                if (zK3 || objV8 == c0020a2) {
                                    g4aVar7 = g4aVar8;
                                    axVar = new ax(function14, g4aVar7, g4aVar9, g4aVar10, 0);
                                    bVar2.p(axVar);
                                } else {
                                    axVar = objV8;
                                    g4aVar7 = g4aVar8;
                                }
                                gu5 gu5Var5 = (gu5) axVar;
                                boolean zK4 = bVar2.K(function14);
                                Object objV9 = bVar2.v();
                                if (zK4 || objV9 == c0020a2) {
                                    objV9 = new bx(0, function14, g4aVar7, g4aVar10);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var6 = (gu5) objV9;
                                iba ibaVar3 = ibaVar2;
                                boolean zX2 = bVar2.x(ibaVar3);
                                Object objV10 = bVar2.v();
                                if (zX2 || objV10 == c0020a2) {
                                    objV10 = new er(ibaVar3, 3);
                                    bVar2.p(objV10);
                                }
                                Float fValueOf = Float.valueOf(fB);
                                b5g b5gVar3 = b5gVar2;
                                ah2 ah2VarC = bh2.c(-873565107, new dx(b5gVar3, function14, g4aVar9, g4aVar7), bVar2);
                                sb1.a(str3, gu5Var4, gu5Var5, R.string.finish_button_label, gu5Var6, 0, (gu5) objV10, fValueOf, b5gVar3, false, false, false, false, null, 0, ah2VarC, bVar2, 0, 196608, 32288);
                                return j6gVar;
                            }
                        }, true));
                        final ese eseVar = g4aVarA;
                        hba.a(gbaVar, "CROWTAXO_CHILD_QUESTION", new ah2(-1386831574, new xu5() { // from class: jx
                            @Override // defpackage.xu5
                            public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                                b bVar2 = (b) obj4;
                                s6.g((Integer) obj5, (bd0) obj2, (d) obj3);
                                j6g j6gVar = j6g.a;
                                Object objV6 = bVar2.v();
                                b.a.C0020a c0020a2 = b.a.a;
                                if (objV6 == c0020a2) {
                                    objV6 = new mx.c(2, null);
                                    bVar2.p(objV6);
                                }
                                to4.d(bVar2, j6gVar, (Function2) objV6);
                                float fB = i3c.b(fje.b.c(), wh.e);
                                gu5 gu5Var3 = gu5Var2;
                                boolean zK2 = bVar2.K(gu5Var3);
                                Object objV7 = bVar2.v();
                                if (zK2 || objV7 == c0020a2) {
                                    objV7 = new sg(1, gu5Var3);
                                    bVar2.p(objV7);
                                }
                                gu5 gu5Var4 = (gu5) objV7;
                                Function1 function14 = function13;
                                boolean zK3 = bVar2.K(function14);
                                Object objV8 = bVar2.v();
                                g4a g4aVar7 = g4aVar4;
                                g4a g4aVar8 = g4aVar5;
                                if (zK3 || objV8 == c0020a2) {
                                    of ofVar = new of(function14, g4aVar7, g4aVar6, g4aVar8, 1);
                                    bVar2.p(ofVar);
                                    objV8 = ofVar;
                                }
                                gu5 gu5Var5 = (gu5) objV8;
                                yvb yvbVar3 = yvbVar2;
                                boolean zX2 = bVar2.x(yvbVar3) | bVar2.K(function14);
                                Object objV9 = bVar2.v();
                                if (zX2 || objV9 == c0020a2) {
                                    objV9 = new kx(yvbVar3, function14, g4aVar7, g4aVar8);
                                    bVar2.p(objV9);
                                }
                                gu5 gu5Var6 = (gu5) objV9;
                                iba ibaVar3 = ibaVar2;
                                boolean zX3 = bVar2.x(ibaVar3);
                                Object objV10 = bVar2.v();
                                if (zX3 || objV10 == c0020a2) {
                                    objV10 = new id(ibaVar3, 4);
                                    bVar2.p(objV10);
                                }
                                sb1.a(str3, gu5Var4, gu5Var5, R.string.save_button_label, gu5Var6, 0, (gu5) objV10, Float.valueOf(fB), b5gVar2, false, false, false, false, null, 0, bh2.c(1777453420, new lx(yvbVar3, eseVar, g4aVar8, 0), bVar2), bVar2, 0, 196608, 32288);
                                return j6gVar;
                            }
                        }, true));
                        return j6g.a;
                    }
                };
                cVarH.p(function12);
                objV5 = function12;
            } else {
                zieVar4 = zieVar5;
                ibaVar = ibaVarB;
            }
            cVar = cVarH;
            nba.c(ibaVar, "SKILL_NAME", null, null, null, null, null, null, null, null, (Function1) objV5, cVar, 0, 0, 1020);
            zieVar3 = zieVar4;
        } else {
            cVar = cVarH;
            cVar.D();
            zieVar3 = zieVar2;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, t41Var, function1, gu5Var, b5gVar, hw9Var, yvbVar, zieVar3, i, i2) { // from class: cx
                public final /* synthetic */ yvb V;
                public final /* synthetic */ zie W;
                public final /* synthetic */ int X;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ t41 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ b5g e;
                public final /* synthetic */ hw9 f;

                {
                    this.X = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(262145);
                    mx.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL, this.X);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(nx nxVar) {
        dg3.i(dg3.a(rxb.a, ca9.e, nxVar, "Add"));
    }
}
