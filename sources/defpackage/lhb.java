package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.sp7;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lhb {

    @uh3(c = "com.indeed.android.push.postapply.PostApplyPushPrimerBottomSheetKt$PostApplyPushPrimerBottomSheet$1$1", f = "PostApplyPushPrimerBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ mhb $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mhb mhbVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$viewModel = mhbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$viewModel, lu2Var);
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
            mhb mhbVar = this.$viewModel;
            p8c p8cVar = mhbVar.b;
            boolean zBooleanValue = ((Boolean) mhbVar.e.getValue()).booleanValue();
            p8cVar.getClass();
            ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, zBooleanValue ? "postApplyPushPrimerReengagement" : "postApplyPushPrimer", null, new od2(9)));
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.push.postapply.PostApplyPushPrimerBottomSheetKt$PostApplyPushPrimerBottomSheet$3$1$1$1$1$1$1", f = "PostApplyPushPrimerBottomSheet.kt", l = {112}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hee $bottomSheetState;
        final /* synthetic */ mhb $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hee heeVar, mhb mhbVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$bottomSheetState = heeVar;
            this.$viewModel = mhbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$bottomSheetState, this.$viewModel, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hee heeVar = this.$bottomSheetState;
                this.label = 1;
                Object objB = heeVar.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            this.$viewModel.h("CloseButton");
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.push.postapply.PostApplyPushPrimerBottomSheetKt$PostApplyPushPrimerBottomSheet$3$1$2$1$1", f = "PostApplyPushPrimerBottomSheet.kt", l = {179}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hee $bottomSheetState;
        final /* synthetic */ mhb $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(hee heeVar, mhb mhbVar, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$bottomSheetState = heeVar;
            this.$viewModel = mhbVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$bottomSheetState, this.$viewModel, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hee heeVar = this.$bottomSheetState;
                this.label = 1;
                Object objB = heeVar.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            this.$viewModel.h("CloseButton");
            return j6g.a;
        }
    }

    public static final void a(final mhb mhbVar, final Function1<? super String, j6g> function1, androidx.compose.runtime.b bVar, int i) {
        androidx.compose.runtime.c cVar;
        mhbVar.getClass();
        function1.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(1611951681);
        int i2 = (cVarH.x(mhbVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function1) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            final hee heeVarF = hv9.f(true, cVarH, 6, 2);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV;
            final g4a g4aVarA = r.a(mhbVar.V, cVarH);
            j6g j6gVar = j6g.a;
            boolean zX = cVarH.x(mhbVar);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new a(mhbVar, null);
                cVarH.p(objV2);
            }
            to4.d(cVarH, j6gVar, (Function2) objV2);
            final x2b x2bVarA = z2b.a(R.drawable.ic_push_notification_primer_v2_notification_center, 0, cVarH);
            boolean zX2 = cVarH.x(mhbVar);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new oj(mhbVar, 15);
                cVarH.p(objV3);
            }
            cVar = cVarH;
            nx6.a((gu5) objV3, null, heeVarF, null, false, null, bh2.c(934209255, new wu5() { // from class: khb
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    e eVarJ;
                    boolean z;
                    e eVarJ2;
                    e13 e13Var2;
                    hee heeVar;
                    mhb mhbVar2;
                    af1 af1Var;
                    b.a.C0020a c0020a2;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean z2 = ((Configuration) bVar2.M(AndroidCompositionLocals_androidKt.a)).orientation == 2;
                        e.a aVar = e.a.b;
                        e eVarF = g.f(aVar, 1.0f);
                        o97 o97Var2 = o97Var;
                        if (z2) {
                            o97.g gVar = o97Var2.i;
                            eVarJ = f.j(aVar, 0.0f, 32.0f, 0.0f, 0.0f, 13);
                        } else {
                            eVarJ = aVar;
                        }
                        e eVarO = eVarF.o(eVarJ);
                        af1 af1Var2 = c20.a.a;
                        ag9 ag9VarD = hl1.d(af1Var2, false);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = c.c(bVar2, eVarO);
                        gl2.j.getClass();
                        pm8.a aVar2 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        gl2.a.d dVar = gl2.a.g;
                        ygg.y(bVar2, ag9VarD, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        gl2.a.e eVar = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar);
                        e eVarO2 = (z2 ? g.t(aVar, 0.0f, 480.0f, 1) : g.f(aVar, 1.0f)).o(z2 ? g.c(aVar, 1.0f) : aVar);
                        af1 af1Var3 = c20.a.b;
                        androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.a;
                        e eVarH = bVar3.h(eVarO2, af1Var3);
                        af1.a aVar3 = c20.a.m;
                        vs0.k kVar = vs0.c;
                        ob2 ob2VarA = mb2.a(kVar, aVar3, bVar2, 0);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = c.c(bVar2, eVarH);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, dVar);
                        ygg.y(bVar2, t8bVarM2, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                        }
                        ygg.y(bVar2, eVarC2, eVar);
                        e eVarF2 = g.f(aVar, 1.0f);
                        if (z2) {
                            z = false;
                            eVarJ2 = g.j(new LayoutWeightElement(1.0f, true), 0.0f, 150.0f, 1);
                        } else {
                            z = false;
                            eVarJ2 = aVar;
                        }
                        e eVarO3 = eVarF2.o(eVarJ2);
                        ag9 ag9VarD2 = hl1.d(af1Var2, false);
                        int iHashCode3 = Long.hashCode(bVar2.k());
                        t8b t8bVarM3 = bVar2.m();
                        e eVarC3 = c.c(bVar2, eVarO3);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ag9VarD2, dVar);
                        ygg.y(bVar2, t8bVarM3, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode3))) {
                            uz.g(iHashCode3, bVar2, iHashCode3, c0251a);
                        }
                        ygg.y(bVar2, eVarC3, eVar);
                        boolean z3 = z2;
                        f17.a(x2bVarA, null, androidx.compose.ui.platform.f.a(g.f(aVar, 1.0f), "Image_PostApply"), null, z2 ? ft2.a.b : ft2.a.d, 0.0f, null, bVar2, 432, 104);
                        e13 e13Var3 = e13Var;
                        hee heeVar2 = heeVarF;
                        mhb mhbVar3 = mhbVar;
                        af1 af1Var4 = c20.a.c;
                        b.a.C0020a c0020a3 = b.a.a;
                        if (z3) {
                            e13Var2 = e13Var3;
                            heeVar = heeVar2;
                            mhbVar2 = mhbVar3;
                            af1Var = af1Var4;
                            c0020a2 = c0020a3;
                            bVar2.L(2001152825);
                        } else {
                            bVar2.L(2005769562);
                            boolean zX3 = bVar2.x(e13Var3) | bVar2.K(heeVar2) | bVar2.x(mhbVar3);
                            Object objV4 = bVar2.v();
                            if (zX3 || objV4 == c0020a3) {
                                objV4 = new q6a(2, e13Var3, heeVar2, mhbVar3);
                                bVar2.p(objV4);
                            }
                            e eVarH2 = bVar3.h(aVar, af1Var4);
                            o97.g gVar2 = o97Var2.i;
                            e13Var2 = e13Var3;
                            c0020a2 = c0020a3;
                            heeVar = heeVar2;
                            mhbVar2 = mhbVar3;
                            af1Var = af1Var4;
                            rq6.b((gu5) objV4, g.n(f.f(eVarH2, 16.0f), 48.0f), false, null, null, pyd.c, bVar2, 196608, 28);
                        }
                        bVar2.F();
                        bVar2.q();
                        o97.g gVar3 = o97Var2.i;
                        o97.a.e eVar2 = o97Var2.c.a;
                        o97.h hVar = o97Var2.j;
                        e eVarF3 = g.f(f.j(f.h(aVar, 32.0f, 0.0f, 2), 0.0f, 32.0f, 0.0f, 0.0f, 13), 1.0f);
                        ob2 ob2VarA2 = mb2.a(kVar, c20.a.n, bVar2, 48);
                        int iHashCode4 = Long.hashCode(bVar2.k());
                        t8b t8bVarM4 = bVar2.m();
                        e eVarC4 = c.c(bVar2, eVarF3);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA2, dVar);
                        ygg.y(bVar2, t8bVarM4, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode4))) {
                            uz.g(iHashCode4, bVar2, iHashCode4, c0251a);
                        }
                        ygg.y(bVar2, eVarC4, eVar);
                        cif.b(ak2.I(R.string.push_primer_post_apply_title, bVar2), f.j(g.f(aVar, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7), eVar2.c, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(hVar.e, 0L, 0L, o97Var2.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), bVar2, 0, 0, 65016);
                        cif.b(ak2.I(R.string.push_primer_post_apply_description, bVar2), f.j(g.f(aVar, 1.0f), 0.0f, 0.0f, 0.0f, 24.0f, 7), eVar2.b, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, hVar.f, bVar2, 0, 0, 65016);
                        String strI = ak2.I(R.string.push_primer_v2_allow_notifications, bVar2);
                        mhb mhbVar4 = mhbVar2;
                        boolean zX4 = bVar2.x(mhbVar4);
                        Object objV5 = bVar2.v();
                        b.a.C0020a c0020a4 = c0020a2;
                        if (zX4 || objV5 == c0020a4) {
                            objV5 = new k30(mhbVar4, 15);
                            bVar2.p(objV5);
                        }
                        gt6.h(strI, (gu5) objV5, g.f(aVar, 1.0f), null, false, false, null, null, null, bVar2, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                        b bVar4 = bVar2;
                        int i3 = 7;
                        if (((String) g4aVarA.getValue()) != null) {
                            bVar4.L(-203759835);
                            String strI2 = ak2.I(R.string.push_primer_post_apply_view_application, bVar4);
                            boolean zX5 = bVar4.x(mhbVar4);
                            Function1 function12 = function1;
                            boolean zK = zX5 | bVar4.K(function12);
                            Object objV6 = bVar4.v();
                            if (zK || objV6 == c0020a4) {
                                objV6 = new ro2(i3, mhbVar4, function12);
                                bVar4.p(objV6);
                            }
                            gt6.k(strI2, (gu5) objV6, g.f(aVar, 1.0f), null, false, null, null, bVar4, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                            bVar4 = bVar4;
                        } else {
                            bVar4.L(-211170199);
                        }
                        bVar4.F();
                        bVar4.q();
                        bVar4.q();
                        if (z3) {
                            bVar4.L(-406570460);
                            e13 e13Var4 = e13Var2;
                            hee heeVar3 = heeVar;
                            boolean zX6 = bVar4.x(e13Var4) | bVar4.K(heeVar3) | bVar4.x(mhbVar4);
                            Object objV7 = bVar4.v();
                            if (zX6 || objV7 == c0020a4) {
                                objV7 = new zq7(1, e13Var4, heeVar3, mhbVar4);
                                bVar4.p(objV7);
                            }
                            rq6.b((gu5) objV7, g.n(f.f(bVar3.h(aVar, af1Var), 16.0f), 48.0f), false, null, null, bh2.c(-1755997851, new rj4(o97Var2, i3), bVar4), bVar4, 196608, 28);
                        } else {
                            bVar4.L(-414407787);
                        }
                        bVar4.F();
                        bVar4.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVar, 1572864, 58);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new zja(mhbVar, function1, i);
        }
    }
}
