package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ck7 {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.interviewprep.InterviewPrepEmptyStateCTAKt$InterviewPrepEmptyStateCTA$1$1", f = "InterviewPrepEmptyStateCTA.kt", l = {}, m = "invokeSuspend")
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
            Function1<lx5, j6g> function1 = c05.a;
            c05.c("MyJobs/Interviews/Zrp", new vg(7));
            return j6g.a;
        }
    }

    public static final void a(int i, gu5 gu5Var, b bVar, String str) {
        c cVarF = q6.f(-2130272806, gu5Var, bVar, str);
        int i2 = (cVarF.K(str) ? 4 : 2) | i | (cVarF.x(gu5Var) ? 32 : 16);
        if (cVarF.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarF.M(p97.a);
            j6g j6gVar = j6g.a;
            Object objV = cVarF.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new a(2, null);
                cVarF.p(objV);
            }
            to4.d(cVarF, j6gVar, (Function2) objV);
            hza hzaVar = hq1.a;
            o97.a aVar = o97Var.c;
            fq1 fq1VarA = hq1.a(aVar.b.h.a, aVar.a.f, 0L, 0L, cVarF, 12);
            fgd fgdVarA = ggd.a(o97Var.h.b);
            boolean z = (i2 & 112) == 32;
            Object objV2 = cVarF.v();
            if (z || objV2 == c0020a) {
                objV2 = new sd(7, gu5Var);
                cVarF.p(objV2);
            }
            nq1.a((gu5) objV2, null, false, fgdVarA, fq1VarA, null, null, null, null, bh2.c(486107594, new uzb(2, o97Var, str), cVarF), cVarF, 805306368, 486);
            cVarF = cVarF;
        } else {
            cVarF.D();
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new bk7(str, gu5Var, i, 0);
        }
    }
}
