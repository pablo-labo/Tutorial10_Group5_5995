package defpackage;

import com.indeed.android.jobsearch.LaunchActivity;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.passport.PassportSignInWebViewFragment$onClickReportError$1", f = "PassportSignInWebViewFragment.kt", l = {346}, m = "invokeSuspend")
public final class i5b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ h5b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5b(h5b h5bVar, lu2<? super i5b> lu2Var) {
        super(2, lu2Var);
        this.this$0 = h5bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new i5b(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((i5b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            LaunchActivity launchActivityM = this.this$0.M();
            String strA = ((nl0) this.this$0.r0.getValue()).a();
            ba5 ba5Var = (ba5) pnb.B(this.this$0).a(null, fwc.a.b(ba5.class), null);
            or orVar = new or(this.this$0, 14);
            this.label = 1;
            Object objD = p2d.d(launchActivityM, strA, ba5Var, r2d.ErrorReport, "WebView", orVar, this);
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
