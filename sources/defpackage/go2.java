package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class go2 {

    @uh3(c = "com.indeed.android.messaging.ui.report.spam.ConfirmationScreenKt$ConfirmationScreen$1$1", f = "ConfirmationScreen.kt", l = {}, m = "invokeSuspend")
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
            q6.n("messagingReportSpamConfirm", null, null, 6, (tp7) cr8.p(tp7.class));
            return j6g.a;
        }
    }

    public static final void a(gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, int i) {
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, -288508716);
        int i2 = (cVarC.x(gu5Var) ? 4 : 2) | i | (cVarC.x(gu5Var2) ? 32 : 16);
        if (cVarC.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarC.M(p97.a);
            tjf tjfVar = (tjf) cVarC.M(fif.a);
            j6g j6gVar = j6g.a;
            Object objV = cVarC.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new a(2, null);
                cVarC.p(objV);
            }
            to4.d(cVarC, j6gVar, (Function2) objV);
            boolean z = (i2 & 14) == 4;
            Object objV2 = cVarC.v();
            if (z || objV2 == c0020a) {
                objV2 = new sg(2, gu5Var);
                cVarC.p(objV2);
            }
            g71.a(false, (gu5) objV2, cVarC, 0, 1);
            boolean z2 = (i2 & 112) == 32;
            Object objV3 = cVarC.v();
            if (z2 || objV3 == c0020a) {
                objV3 = new gd(2, gu5Var2);
                cVarC.p(objV3);
            }
            oi7.a(R.string.messaging_report_confirmation_header, "ReportSpamConfirmation", null, null, (gu5) objV3, bh2.c(-1460850813, new y02(gu5Var2, 1, (byte) 0), cVarC), null, false, false, null, bh2.c(245811201, new r00(1, o97Var, tjfVar), cVarC), cVarC, 196656, 972);
        } else {
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new jd(i, 3, gu5Var, gu5Var2);
        }
    }
}
