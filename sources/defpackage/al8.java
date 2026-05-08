package defpackage;

import androidx.fragment.app.g;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import defpackage.xh8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.launch.LaunchFragment$handleReportError$1", f = "LaunchFragment.kt", l = {270}, m = "invokeSuspend")
public final class al8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ LaunchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al8(LaunchFragment launchFragment, lu2<? super al8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = launchFragment;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new al8(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((al8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        qpd qpdVarD;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            g gVarRequireActivity = this.this$0.requireActivity();
            gVarRequireActivity.getClass();
            String strA = ((nl0) this.this$0.Y.getValue()).a();
            hg6 hg6Var = this.this$0;
            if (hg6Var instanceof ai8) {
                qpdVarD = ((ai8) hg6Var).d();
            } else {
                hg6Var.getClass();
                qpdVarD = (qpd) xh8.a.a().a.b;
            }
            ba5 ba5Var = (ba5) qpdVarD.a(null, fwc.a.b(ba5.class), null);
            ne neVar = new ne(this.this$0, 8);
            this.label = 1;
            Object objD = p2d.d(gVarRequireActivity, strA, ba5Var, r2d.ErrorReport, "WebView", neVar, this);
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
