package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class rg0 {

    @uh3(c = "com.indeed.android.profile.components.ApiErrorToastUiKt$ApiErrorToastWithoutRetry$1$1", f = "ApiErrorToastUi.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$text = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$text, lu2Var);
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
            String str = this.$text;
            if (str == null) {
                str = "API Error";
            }
            dg3.e(str, oub.DATA);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        gu5Var.getClass();
        c cVarH = bVar.h(1710430212);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            e eVarA = f.a(androidx.compose.foundation.layout.f.j(g.v(e.a.b, null, 3), 0.0f, 0.0f, 0.0f, v1c.d, 7), "ToastUiForApiError");
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new hu(2);
                cVarH.p(objV);
            }
            e eVarB = b5e.b(eVarA, false, (Function1) objV);
            ag9 ag9VarD = hl1.d(c20.a.h, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
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
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.TRUE);
                cVarH.p(objV2);
            }
            g4a g4aVar = (g4a) objV2;
            fv6 fv6Var = fv6.o3;
            String strI = ak2.I(R.string.something_went_wrong, cVarH);
            String strI2 = ak2.I(R.string.request_failed, cVarH);
            String strI3 = ak2.I(R.string.try_again, cVarH);
            boolean zBooleanValue = ((Boolean) g4aVar.getValue()).booleanValue();
            boolean z = (i2 & 14) == 4;
            Object objV3 = cVarH.v();
            if (z || objV3 == c0020a) {
                objV3 = new mg0(gu5Var, g4aVar, 0);
                cVarH.p(objV3);
            }
            gu5 gu5Var2 = (gu5) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new ae(1, g4aVar);
                cVarH.p(objV4);
            }
            tz6.a(12583296, 776, gu5Var2, (gu5) objV4, fv6Var, cVarH, null, strI, strI2, strI3, null, zBooleanValue);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ng0(i, gu5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r20, java.lang.String r21, final defpackage.gu5<defpackage.j6g> r22, androidx.compose.runtime.b r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg0.b(java.lang.String, java.lang.String, gu5, androidx.compose.runtime.b, int, int):void");
    }
}
