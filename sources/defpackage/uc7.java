package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.le0;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class uc7 {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.InfoBottomSheetModalKt$QuestionWithLink$1$1$1", f = "InfoBottomSheetModal.kt", l = {135}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onContactClick;
        final /* synthetic */ hw9 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hw9 hw9Var, gu5<j6g> gu5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = hw9Var;
            this.$onContactClick = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$sheetState, this.$onContactClick, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$sheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
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
            this.$onContactClick.invoke();
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.components.InfoBottomSheetModalKt$QuestionWithLink$2$1$1$1", f = "InfoBottomSheetModal.kt", l = {127}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onContactClick;
        final /* synthetic */ hw9 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hw9 hw9Var, gu5<j6g> gu5Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = hw9Var;
            this.$onContactClick = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$sheetState, this.$onContactClick, lu2Var);
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
                hw9 hw9Var = this.$sheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
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
            this.$onContactClick.invoke();
            return j6g.a;
        }
    }

    public static final void a(hw9 hw9Var, final String str, final String str2, final gu5 gu5Var, ah2 ah2Var, androidx.compose.runtime.b bVar, int i) {
        final hw9 hw9Var2 = hw9Var;
        hw9Var2.getClass();
        str.getClass();
        str2.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(455708285);
        int i2 = i | (cVarH.x(hw9Var2) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV;
            fgd fgdVarB = ggd.b(20.0f, 20.0f, 0.0f, 0.0f);
            final o97 o97Var = (o97) cVarH.M(p97.a);
            androidx.compose.material.a.a(bh2.c(-380593365, new wu5() { // from class: nc7
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    e.a aVar;
                    gl2.a.f fVar;
                    gl2.a.e eVar;
                    gl2.a.C0251a c0251a;
                    gl2.a.d dVar;
                    pm8.a aVar2;
                    af1.a aVar3;
                    hw9 hw9Var3;
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        vs0.k kVar = vs0.c;
                        af1.a aVar4 = c20.a.m;
                        ob2 ob2VarA = mb2.a(kVar, aVar4, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e.a aVar5 = e.a.b;
                        e eVarC = androidx.compose.ui.c.c(bVar2, aVar5);
                        gl2.j.getClass();
                        pm8.a aVar6 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar6);
                        } else {
                            bVar2.n();
                        }
                        gl2.a.d dVar2 = gl2.a.g;
                        ygg.y(bVar2, ob2VarA, dVar2);
                        gl2.a.f fVar2 = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar2);
                        gl2.a.C0251a c0251a2 = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a2);
                        }
                        gl2.a.e eVar2 = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar2);
                        boolean zO = i6a.o();
                        String str3 = str;
                        e13 e13Var2 = e13Var;
                        hw9 hw9Var4 = hw9Var2;
                        if (zO) {
                            bVar2.L(1516465270);
                            aVar = aVar5;
                            fVar = fVar2;
                            eVar = eVar2;
                            c0251a = c0251a2;
                            dVar = dVar2;
                            aVar2 = aVar6;
                            aVar3 = aVar4;
                            hw9Var3 = hw9Var4;
                            nx6.c(str3, null, false, false, false, null, null, bh2.c(-153476687, new ie4(2, e13Var2, hw9Var4), bVar2), null, null, bVar2, 12583296, 890);
                            bVar2.F();
                        } else {
                            bVar2.L(1711483046);
                            boolean zX = bVar2.x(e13Var2) | bVar2.x(hw9Var4);
                            Object objV2 = bVar2.v();
                            if (zX || objV2 == b.a.a) {
                                objV2 = new q61(4, e13Var2, hw9Var4);
                                bVar2.p(objV2);
                            }
                            ra3.a(0, (gu5) objV2, bVar2, str3);
                            bVar2.F();
                            fVar = fVar2;
                            eVar = eVar2;
                            c0251a = c0251a2;
                            aVar = aVar5;
                            aVar2 = aVar6;
                            dVar = dVar2;
                            aVar3 = aVar4;
                            hw9Var3 = hw9Var4;
                        }
                        o97 o97Var2 = o97Var;
                        o97.b bVar3 = o97Var2.e;
                        long j = bVar3.f;
                        float fC = bkf.c(j);
                        long j2 = bVar3.d;
                        e.a aVar7 = aVar;
                        e eVarJ = f.j(aVar7, bkf.c(j), fC, bkf.c(j), 0.0f, 8);
                        ob2 ob2VarA2 = mb2.a(kVar, aVar3, bVar2, 0);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarJ);
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
                        ygg.y(bVar2, t8bVarM2, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                        }
                        ygg.y(bVar2, eVarC2, eVar);
                        fif.b(str2, null, o97Var2.c.a.a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var2.j.g, bVar2, 0, 0, 65530);
                        jh2.f(bVar2, f.j(aVar7, 0.0f, 0.0f, 0.0f, bkf.c(j2), 7));
                        uc7.b(gu5Var, hw9Var3, bVar2, 64);
                        jh2.f(bVar2, f.j(aVar7, 0.0f, 0.0f, 0.0f, bkf.c(j2), 7));
                        bVar2.q();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), null, hw9Var, false, fgdVarB, 0.0f, o97Var.c.b.a, 0L, 0L, bh2.c(2078924900, new lb(ah2Var, 7), cVarH), cVarH, ((i2 << 6) & 896) | 805306886, 426);
            hw9Var2 = hw9Var;
            boolean zC = hw9Var2.c();
            boolean zX = cVarH.x(e13Var) | ((i2 & 14) == 4 || cVarH.x(hw9Var2));
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new ua3(e13Var, hw9Var2, 1);
                cVarH.p(objV2);
            }
            g71.a(zC, (gu5) objV2, cVarH, 0, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new oc7(hw9Var2, str, str2, gu5Var, ah2Var, i);
        }
    }

    public static final void b(gu5<j6g> gu5Var, hw9 hw9Var, androidx.compose.runtime.b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-237720390);
        int i3 = (cVarH.x(gu5Var) ? 4 : 2) | i | (cVarH.x(hw9Var) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            o97 o97Var = (o97) cVarH.M(p97.a);
            cVarH.L(-816019357);
            le0.b bVar2 = new le0.b();
            int iK = bVar2.k(new foe(o97Var.c.a.a, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65534));
            try {
                String string = context.getString(R.string.have_a_question);
                string.getClass();
                bVar2.g(string);
                bVar2.g(" ");
                j6g j6gVar = j6g.a;
                bVar2.i(iK);
                String string2 = context.getString(R.string.contact_us);
                string2.getClass();
                bVar2.j("contactUs", string2);
                cVarH.L(-816005582);
                iK = bVar2.k(new foe(o97Var.c.a.d, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odf.c, (vbe) null, 61438));
                try {
                    bVar2.g(ak2.I(R.string.contact_us, cVarH));
                    bVar2.i(iK);
                    cVarH.U(false);
                    bVar2.h();
                    le0 le0VarL = bVar2.l();
                    cVarH.U(false);
                    Object objV = cVarH.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        m74 m74Var = to4.a;
                        objV = v40.b(cVarH.l(), cVarH);
                    }
                    e13 e13Var = (e13) objV;
                    tjf tjfVar = o97Var.j.g;
                    int i4 = i3 & 112;
                    int i5 = i3 & 14;
                    boolean zX = cVarH.x(e13Var) | (i4 == 32 || cVarH.x(hw9Var)) | (i5 == 4);
                    Object objV2 = cVarH.v();
                    if (zX || objV2 == c0020a) {
                        objV2 = new qc7(e13Var, hw9Var, gu5Var, 0);
                        cVarH.p(objV2);
                    }
                    e eVarD = androidx.compose.foundation.b.d(e.a.b, false, null, null, (gu5) objV2, 15);
                    boolean zK = (i4 == 32 || cVarH.x(hw9Var)) | cVarH.K(le0VarL) | cVarH.x(e13Var) | (i5 == 4);
                    Object objV3 = cVarH.v();
                    if (zK || objV3 == c0020a) {
                        iv2 iv2Var = new iv2(le0VarL, e13Var, hw9Var, gu5Var, 2);
                        cVarH.p(iv2Var);
                        objV3 = iv2Var;
                    }
                    i2 = 4;
                    p72.a(le0VarL, eVarD, tjfVar, false, 0, 0, null, (Function1) objV3, cVarH, 0, 120);
                } finally {
                }
            } finally {
            }
        } else {
            i2 = 4;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jh(gu5Var, i, i2, hw9Var);
        }
    }
}
