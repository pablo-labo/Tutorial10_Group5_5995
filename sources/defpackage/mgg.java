package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.h;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.mgg;
import defpackage.o97;
import defpackage.pm8;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mgg {

    @uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.summary.UpdateSummarySheetKt$UpdateSummarySheet$1$1", f = "UpdateSummarySheet.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ sm5 $focusRequester;
        final /* synthetic */ g4a<jhf> $textInput$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, sm5 sm5Var, g4a g4aVar) {
            super(2, lu2Var);
            this.$focusRequester = sm5Var;
            this.$textInput$delegate = g4aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(lu2Var, this.$focusRequester, this.$textInput$delegate);
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
            sm5.b(this.$focusRequester);
            int length = this.$textInput$delegate.getValue().a.b.length();
            g4a<jhf> g4aVar = this.$textInput$delegate;
            g4aVar.setValue(jhf.a(g4aVar.getValue(), null, cr8.c(length, length), 5));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.profile.screens.sheets.profilesubtab.summary.UpdateSummarySheetKt$UpdateSummarySheet$4$1$4$1", f = "UpdateSummarySheet.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ sm5 $focusRequester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(sm5 sm5Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$focusRequester = sm5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$focusRequester, lu2Var);
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
            sm5.b(this.$focusRequester);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final gu5<j6g> gu5Var, Function1<? super String, j6g> function1, final String str, final b5g b5gVar, androidx.compose.runtime.b bVar, final int i) {
        gu5 gu5Var2;
        String str2;
        boolean z2;
        boolean z3;
        final Function1<? super String, j6g> function12 = function1;
        gu5Var.getClass();
        function12.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(345618260);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(function12) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.d(b5gVar.ordinal()) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            String strK = z ? z3.k(cVarH, 1277216082, R.string.edit_summary_header, cVarH, false) : (str == null || zve.U(str)) ? z3.k(cVarH, 1277315251, R.string.add_summary_header, cVarH, false) : z3.k(cVarH, 1277379762, R.string.edit_summary_header, cVarH, false);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(new jhf(v1c.c(str), 0L, 6));
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(lcf.c);
                cVarH.p(objV2);
            }
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(Boolean.FALSE);
                cVarH.p(objV3);
            }
            final g4a g4aVar2 = (g4a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = r.f(Boolean.FALSE);
                cVarH.p(objV4);
            }
            final g4a g4aVar3 = (g4a) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = r.f(Boolean.FALSE);
                cVarH.p(objV5);
            }
            g4a g4aVar4 = (g4a) objV5;
            boolean z4 = !wl7.b(((jhf) g4aVar.getValue()).a.b, str);
            Object objV6 = cVarH.v();
            if (objV6 == c0020a) {
                objV6 = new sm5();
                cVarH.p(objV6);
            }
            final sm5 sm5Var = (sm5) objV6;
            j6g j6gVar = j6g.a;
            Object objV7 = cVarH.v();
            if (objV7 == c0020a) {
                objV7 = new a(null, sm5Var, g4aVar);
                cVarH.p(objV7);
            }
            to4.d(cVarH, j6gVar, (Function2) objV7);
            final ne4 ne4Var = p97.a;
            if (z || str == null || zve.U(str)) {
                cVarH.L(1278461786);
                cVarH.U(false);
                gu5Var2 = null;
            } else {
                cVarH.L(1278488849);
                Object objV8 = cVarH.v();
                if (objV8 == c0020a) {
                    objV8 = new xf4(3, g4aVar4);
                    cVarH.p(objV8);
                }
                gu5Var2 = (gu5) objV8;
                cVarH.U(false);
            }
            if (z || !v1c.h(((jhf) g4aVar.getValue()).a.b)) {
                str2 = strK;
                z2 = false;
            } else {
                str2 = strK;
                z2 = true;
            }
            boolean zH = v1c.h(((jhf) g4aVar.getValue()).a.b);
            boolean zA = cVarH.a(z4) | ((i2 & 112) == 32);
            Object objV9 = cVarH.v();
            if (zA || objV9 == c0020a) {
                objV9 = new qn4(z4, gu5Var, g4aVar3, 1);
                cVarH.p(objV9);
            }
            gu5 gu5Var3 = (gu5) objV9;
            int i3 = i2 & 896;
            boolean z5 = i3 == 256;
            Object objV10 = cVarH.v();
            if (z5 || objV10 == c0020a) {
                z3 = true;
                objV10 = new f1d(function12, g4aVar, 1);
                cVarH.p(objV10);
            } else {
                z3 = true;
            }
            Function2 function2 = new Function2() { // from class: kgg
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    e.a aVar;
                    e eVar;
                    String str3;
                    int i4;
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e.a aVar2 = e.a.b;
                        e eVarF = g.f(aVar2, 1.0f);
                        float f = v1c.e;
                        h hVar = ne4Var;
                        o97.g gVar = ((o97) bVar2.M(hVar)).i;
                        e eVarB = nub.b(f.j(eVarF, f, 8.0f, f, 0.0f, 8));
                        b5g b5gVar2 = b5gVar;
                        b5g b5gVar3 = b5g.c;
                        e eVarA = nub.a(eVarB, b5gVar2 == b5gVar3, "Update summary failed", oub.SAVE);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarA);
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
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        g4a g4aVar5 = g4aVar;
                        jhf jhfVar = (jhf) g4aVar5.getValue();
                        e eVarF2 = g.f(aVar2, 1.0f);
                        sm5 sm5Var2 = sm5Var;
                        e eVarA2 = androidx.compose.ui.focus.c.a(eVarF2, sm5Var2);
                        String strI = ak2.I(R.string.update_summary_field_label, bVar2);
                        String strI2 = ak2.I(R.string.summary_rich_text_delete_button, bVar2);
                        String strI3 = ak2.I(R.string.summary_rich_text_bulleted_list_mode_toggle, bVar2);
                        String strI4 = ak2.I(R.string.summary_rich_text_numbered_list_mode_toggle, bVar2);
                        o97.g gVar2 = ((o97) bVar2.M(hVar)).i;
                        Object objV11 = bVar2.v();
                        b.a.C0020a c0020a2 = b.a.a;
                        if (objV11 == c0020a2) {
                            objV11 = new zd(4, g4aVar5);
                            bVar2.p(objV11);
                        }
                        Function1 function13 = (Function1) objV11;
                        Object objV12 = bVar2.v();
                        if (objV12 == c0020a2) {
                            aVar = aVar2;
                            objV12 = new lg(13);
                            bVar2.p(objV12);
                        } else {
                            aVar = aVar2;
                        }
                        Function1 function14 = (Function1) objV12;
                        Object objV13 = bVar2.v();
                        if (objV13 == c0020a2) {
                            eVar = eVarA2;
                            str3 = strI4;
                            objV13 = new ff(3, g4aVar2);
                            bVar2.p(objV13);
                        } else {
                            eVar = eVarA2;
                            str3 = strI4;
                        }
                        e.a aVar4 = aVar;
                        qw6.a(jhfVar, "", strI3, str3, strI2, 160.0f, eVar, strI, 0, true, kcf.c, function13, function14, (Function1) objV13, null, bVar2, 48, 1797168, 136960);
                        j6g j6gVar2 = j6g.a;
                        Object objV14 = bVar2.v();
                        if (objV14 == c0020a2) {
                            objV14 = new mgg.b(sm5Var2, null);
                            bVar2.p(objV14);
                        }
                        to4.d(bVar2, j6gVar2, (Function2) objV14);
                        jh2.f(bVar2, g.h(aVar4, v1c.d));
                        bVar2.q();
                        g4a g4aVar6 = g4aVar3;
                        if (((Boolean) g4aVar6.getValue()).booleanValue()) {
                            bVar2.L(2017674612);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-summary", "confirmation-alert", sp7.c.a.a, null, null, 24));
                            Object objV15 = bVar2.v();
                            if (objV15 == c0020a2) {
                                objV15 = new fl4(2, g4aVar6);
                                bVar2.p(objV15);
                            }
                            gu5 gu5Var4 = (gu5) objV15;
                            gu5 gu5Var5 = gu5Var;
                            boolean zK = bVar2.K(gu5Var5);
                            Object objV16 = bVar2.v();
                            if (zK || objV16 == c0020a2) {
                                i4 = 0;
                                objV16 = new jgg(gu5Var5, g4aVar6, 0);
                                bVar2.p(objV16);
                            } else {
                                i4 = 0;
                            }
                            r03.e(gu5Var4, (gu5) objV16, bVar2, 6);
                        } else {
                            i4 = 0;
                            bVar2.L(2010637612);
                        }
                        bVar2.F();
                        if (b5gVar2 == b5gVar3) {
                            bVar2.L(2018228024);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-summary", "error-toast", sp7.c.a.c, null, null, 24));
                            Function1 function15 = function12;
                            boolean zK2 = bVar2.K(function15);
                            Object objV17 = bVar2.v();
                            if (zK2 || objV17 == c0020a2) {
                                objV17 = new m9f(function15, g4aVar5, 1);
                                bVar2.p(objV17);
                            }
                            rg0.a((gu5) objV17, bVar2, i4);
                        } else {
                            bVar2.L(2010637612);
                        }
                        bVar2.F();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            };
            function12 = function12;
            sb1.a(str2, gu5Var3, (gu5) objV10, 0, null, 0, null, null, null, true, zH, z2, false, gu5Var2, 0, bh2.c(-607464554, function2, cVarH), cVarH, 805306368, 196608, 20984);
            cVarH = cVarH;
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, e.a.b);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            if (((Boolean) g4aVar4.getValue()).booleanValue()) {
                cVarH.L(2123593767);
                ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-summary", "confirmation-alert", sp7.c.a.a, null, null, 24));
                String strI = ak2.I(R.string.confirm_delete_summary, cVarH);
                boolean z6 = i3 == 256;
                Object objV11 = cVarH.v();
                if (z6 || objV11 == c0020a) {
                    objV11 = new sj4(9, g4aVar4, function12);
                    cVarH.p(objV11);
                }
                gu5 gu5Var4 = (gu5) objV11;
                Object objV12 = cVarH.v();
                if (objV12 == c0020a) {
                    objV12 = new uu(4, g4aVar4);
                    cVarH.p(objV12);
                }
                hh2.d(null, strI, gu5Var4, (gu5) objV12, ak2.I(R.string.delete, cVarH), ak2.I(R.string.cancel, cVarH), true, false, 0, cVarH, 1575942, 384);
            } else {
                cVarH.L(2115427220);
            }
            cVarH.U(false);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, gu5Var, function12, str, b5gVar, i) { // from class: lgg
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ b5g e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    mgg.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
