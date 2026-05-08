package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class s6d {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.ResponseUnlikelyModalbottomSheetKt$CustomHeaderWithDivider$1$1$1$1$1", f = "ResponseUnlikelyModalbottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onIconClick;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gu5<j6g> gu5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$onIconClick = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$onIconClick, lu2Var);
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
            this.$onIconClick.invoke();
            return j6g.a;
        }
    }

    public static final void a(int i, gu5 gu5Var, b bVar, String str) {
        gu5 gu5Var2;
        int i2;
        c cVarH = bVar.h(-1416500968);
        int i3 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            o97.g gVar = o97Var.i;
            e eVarF = g.f(f.f(aVar, 24.0f), 1.0f);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            fif.b(str, g.w(new LayoutWeightElement(1.0f, true), c20.a.n, 2), pnb.g(4278193426L), 0L, o97Var.f.c, null, 0L, null, new dcf(5), 0L, 0, false, 0, 0, null, o97Var.j.f, cVarH, (i3 & 14) | 384, 0, 64984);
            cVarH = cVarH;
            jh2.f(cVarH, g.r(aVar, 16.0f));
            x2b x2bVarA = z2b.a(R.drawable.cross_icon, 0, cVarH);
            String strI = ak2.I(R.string.close_icon, cVarH);
            boolean zX = cVarH.x(e13Var) | ((i3 & 112) == 32);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new ro2(10, e13Var, gu5Var);
                cVarH.p(objV2);
            }
            gu5Var2 = gu5Var;
            f17.a(x2bVarA, strI, androidx.compose.foundation.b.d(aVar, false, null, null, (gu5) objV2, 15), null, null, 0.0f, null, cVarH, 0, 120);
            jh2.f(cVarH, g.r(aVar, 8.0f));
            i2 = 1;
            cVarH.U(true);
            cVarH.U(true);
        } else {
            gu5Var2 = gu5Var;
            i2 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new bk7(str, gu5Var2, i, i2);
        }
    }

    public static final void b(hw9 hw9Var, final String str, final String str2, gu5 gu5Var, final ah2 ah2Var, b bVar, final int i) {
        final hw9 hw9Var2 = hw9Var;
        gu5 gu5Var2 = gu5Var;
        hw9Var2.getClass();
        str.getClass();
        str2.getClass();
        c cVarH = bVar.h(-1995673958);
        int i2 = i | (cVarH.x(hw9Var2) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            o97 o97Var = (o97) cVarH.M(p97.a);
            androidx.compose.material.a.a(bh2.c(766347436, new wa3(str, e13Var, hw9Var2, o97Var, str2), cVarH), null, hw9Var, false, ggd.b(20.0f, 20.0f, 0.0f, 0.0f), 0.0f, o97Var.c.b.a, 0L, 0L, bh2.c(510171667, new xa3(ah2Var, 3), cVarH), cVarH, ((i2 << 6) & 896) | 805306886, 426);
            hw9Var2 = hw9Var;
            boolean zC = hw9Var2.c();
            boolean zX = cVarH.x(e13Var) | ((i2 & 14) == 4 || cVarH.x(hw9Var2)) | ((i2 & 7168) == 2048);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                gu5Var2 = gu5Var;
                objV2 = new qc7(e13Var, hw9Var2, gu5Var2, 1);
                cVarH.p(objV2);
            } else {
                gu5Var2 = gu5Var;
            }
            g71.a(zC, (gu5) objV2, cVarH, 0, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final gu5 gu5Var3 = gu5Var2;
            iVarW.d = new Function2(str, str2, gu5Var3, ah2Var, i) { // from class: r6d
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ ah2 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(24585);
                    s6d.b(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
