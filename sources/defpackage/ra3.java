package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ra3 {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.common.CustomHeaderWithDividerKt$CustomHeaderWithDivider$1$1$1$1$1", f = "CustomHeaderWithDivider.kt", l = {}, m = "invokeSuspend")
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
        c cVarF = q6.f(632706341, gu5Var, bVar, str);
        int i3 = i | (cVarF.K(str) ? 4 : 2) | (cVarF.x(gu5Var) ? 32 : 16);
        if (cVarF.o(i3 & 1, (i3 & 19) != 18)) {
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarF, 0);
            int iHashCode = Long.hashCode(cVarF.T);
            t8b t8bVarP = cVarF.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarF, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarF, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarF, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarF, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarF, eVarC, eVar);
            e eVarF = f.f(g.f(aVar, 1.0f), 16.0f);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarF, 48);
            int iHashCode2 = Long.hashCode(cVarF.T);
            t8b t8bVarP2 = cVarF.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarF, eVarF);
            cVarF.B();
            if (cVarF.S) {
                cVarF.y(aVar2);
            } else {
                cVarF.n();
            }
            ygg.y(cVarF, ehdVarA, dVar);
            ygg.y(cVarF, t8bVarP2, fVar);
            if (cVarF.S || !wl7.b(cVarF.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarF, iHashCode2, c0251a);
            }
            ygg.y(cVarF, eVarC2, eVar);
            Object objV = cVarF.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarF.l(), cVarF);
            }
            e13 e13Var = (e13) objV;
            i2 = 0;
            fif.b(str, g.w(new LayoutWeightElement(1.0f, true), c20.a.n, 2), eu6.k, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, hz6.f, cVarF, i3 & 14, 0, 65016);
            cVarF = cVarF;
            x2b x2bVarA = z2b.a(R.drawable.cross_icon, 0, cVarF);
            String strI = ak2.I(R.string.close_icon, cVarF);
            boolean zX = cVarF.x(e13Var) | ((i3 & 112) == 32);
            Object objV2 = cVarF.v();
            if (zX || objV2 == c0020a) {
                objV2 = new qj(5, e13Var, gu5Var);
                cVarF.p(objV2);
            }
            gu5Var2 = gu5Var;
            f17.a(x2bVarA, strI, androidx.compose.foundation.b.d(aVar, false, null, null, (gu5) objV2, 15), null, null, 0.0f, null, cVarF, 0, 120);
            cVarF.U(true);
            cVarF.U(true);
        } else {
            gu5Var2 = gu5Var;
            i2 = 0;
            cVarF.D();
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new qa3(i, i2, gu5Var2, str);
        }
    }
}
