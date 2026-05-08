package defpackage;

import androidx.fragment.app.g;
import com.indeed.android.jobsearch.viewjob.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.viewjob.ViewJobBottomSheetFragment$onClickReportError$1", f = "ViewJobBottomSheetFragment.kt", l = {488}, m = "invokeSuspend")
public final class fqg extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqg(a aVar, lu2<? super fqg> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new fqg(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((fqg) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            g gVarRequireActivity = this.this$0.requireActivity();
            gVarRequireActivity.getClass();
            String strA = ((nl0) this.this$0.u0.getValue()).a();
            ba5 ba5Var = (ba5) pnb.B(this.this$0).a(null, fwc.a.b(ba5.class), null);
            q3 q3Var = new q3(this.this$0, 7);
            this.label = 1;
            Object objD = p2d.d(gVarRequireActivity, strA, ba5Var, r2d.ErrorReport, "WebView", q3Var, this);
            g13 g13Var = g13.a;
            if (objD == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
