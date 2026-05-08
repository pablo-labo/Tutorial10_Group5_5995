package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sp7;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class bo4 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, final gu5 gu5Var5, final gu5 gu5Var6, final gu5 gu5Var7, final String str, final String str2, final Locale locale, final String str3, final ig3 ig3Var, final String str4, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, final Function1 function15, final b5g b5gVar, b bVar, final int i) {
        gu5 gu5Var8;
        int i2;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        gu5Var6.getClass();
        gu5Var7.getClass();
        str.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function15.getClass();
        b5gVar.getClass();
        c cVarH = bVar.h(-1989380365);
        int i3 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var4) ? 16384 : 8192) | (cVarH.x(gu5Var5) ? 131072 : 65536) | (cVarH.x(gu5Var6) ? 1048576 : 524288) | (cVarH.x(gu5Var7) ? 8388608 : 4194304) | (cVarH.K(str) ? 67108864 : 33554432) | (cVarH.K(str2) ? 536870912 : 268435456);
        int i4 = 115040256 | (cVarH.x(locale) ? 4 : 2) | (cVarH.K(str3) ? 32 : 16) | (cVarH.K(ig3Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.d(b5gVar.ordinal()) ? 536870912 : 268435456);
        if (cVarH.o(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378) ? false : true)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            if (z) {
                cVarH.L(624287163);
                cVarH.U(false);
                gu5Var8 = null;
            } else {
                cVarH.L(624314846);
                Object objV2 = cVarH.v();
                if (objV2 == c0020a) {
                    objV2 = new il4(2, g4aVar);
                    cVarH.p(objV2);
                }
                gu5Var8 = (gu5) objV2;
                cVarH.U(false);
            }
            String strI = ak2.I(R.string.label_edit_work_exp, cVarH);
            gu5 gu5Var9 = v1c.h(str) ? gu5Var2 : null;
            gu5 gu5Var10 = gu5Var8;
            boolean z2 = (i3 & 112) == 32;
            Object objV3 = cVarH.v();
            if (z2 || objV3 == c0020a) {
                objV3 = new hh(8, gu5Var);
                cVarH.p(objV3);
            }
            sb1.a(strI, (gu5) objV3, gu5Var9, 0, null, 0, null, null, b5gVar, true, false, false, false, gu5Var10, R.string.label_delete_work_exp, bh2.c(353875569, new Function2() { // from class: zn4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ag9 ag9VarD = hl1.d(c20.a.a, false);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e.a aVar = e.a.b;
                        e eVarC = androidx.compose.ui.c.c(bVar2, aVar);
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
                        e eVarB = nub.b(g.d(aVar, 1.0f));
                        b5g b5gVar2 = b5gVar;
                        b5g b5gVar3 = b5g.c;
                        e eVarA = nub.a(eVarB, b5gVar2 == b5gVar3, "Edit work experience failed", oub.SAVE);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, bVar2, 48);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarA);
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
                        hfg.a(function1, str, gu5Var4, bVar2, 6);
                        b8g.a(function12, str2, gu5Var5, bVar2, 6);
                        nzd.a(locale, gu5Var6, ak2.I(R.string.label_add_work_exp_job_country, bVar2), false, null, f.a(androidx.compose.foundation.layout.f.h(aVar, 12.0f, 0.0f, 2), "EditWorkExpClickableCountry"), bVar2, 199680, 16);
                        mfg.a(function13, str3, gu5Var7, bVar2, 6);
                        qgg.a(function14, ig3Var, null, bVar2, 6, 8);
                        m8g.a(function15, str4, bVar2, 6);
                        bVar2.q();
                        if (b5gVar2 == b5gVar3) {
                            bVar2.L(-1505872905);
                            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-work-experience", "error-toast", sp7.c.a.c, null, null, 24));
                            gu5 gu5Var11 = gu5Var2;
                            boolean zK = bVar2.K(gu5Var11);
                            Object objV4 = bVar2.v();
                            if (zK || objV4 == b.a.a) {
                                objV4 = new ta(5, gu5Var11);
                                bVar2.p(objV4);
                            }
                            rg0.a((gu5) objV4, bVar2, 0);
                        } else {
                            bVar2.L(-1511871157);
                        }
                        bVar2.F();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, (234881024 & (i4 >> 3)) | 805306368, 196608, 7416);
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
            if (((Boolean) g4aVar.getValue()).booleanValue()) {
                cVarH.L(1581309258);
                ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-work-experience", "confirmation-alert", sp7.c.a.a, null, null, 24));
                String strI2 = ak2.I(R.string.confirm_delete_work_experience, cVarH);
                boolean z3 = (i3 & 7168) == 2048;
                Object objV4 = cVarH.v();
                if (z3 || objV4 == c0020a) {
                    i2 = 3;
                    objV4 = new mg0(gu5Var3, g4aVar, 3);
                    cVarH.p(objV4);
                } else {
                    i2 = 3;
                }
                gu5 gu5Var11 = (gu5) objV4;
                Object objV5 = cVarH.v();
                if (objV5 == c0020a) {
                    objV5 = new ae(i2, g4aVar);
                    cVarH.p(objV5);
                }
                hh2.d(null, strI2, gu5Var11, (gu5) objV5, ak2.I(R.string.delete, cVarH), ak2.I(R.string.cancel, cVarH), true, false, 0, cVarH, 1575942, 384);
            } else {
                cVarH.L(1574667849);
            }
            cVarH.U(false);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, gu5Var6, gu5Var7, str, str2, locale, str3, ig3Var, str4, function1, function12, function13, function14, function15, b5gVar, i) { // from class: ao4
                public final /* synthetic */ gu5 V;
                public final /* synthetic */ gu5 W;
                public final /* synthetic */ String X;
                public final /* synthetic */ String Y;
                public final /* synthetic */ Locale Z;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String a0;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ ig3 b0;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ String c0;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ Function1 d0;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ Function1 e0;
                public final /* synthetic */ gu5 f;
                public final /* synthetic */ Function1 f0;
                public final /* synthetic */ Function1 g0;
                public final /* synthetic */ Function1 h0;
                public final /* synthetic */ b5g i0;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    bo4.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
