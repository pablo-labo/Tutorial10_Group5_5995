package defpackage;

import androidx.fragment.app.g;
import androidx.navigation.e;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.launch.LaunchFragment$navigateToNextScreen$1", f = "LaunchFragment.kt", l = {241}, m = "invokeSuspend")
public final class bl8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ LaunchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl8(LaunchFragment launchFragment, lu2<? super bl8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = launchFragment;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new bl8(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((bl8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            if (!this.this$0.a) {
                il0 il0Var = il0.a;
                this.label = 1;
                Object objI = il0Var.i(this);
                g13 g13Var = g13.a;
                if (objI == g13Var) {
                    return g13Var;
                }
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        g activity = this.this$0.getActivity();
        ArrayList arrayList = lz2.a;
        lz2.d("LaunchFragment", "@@navigateToNextScreen unconditional sdc check: activity=" + activity + " finishing=" + (activity != null ? Boolean.valueOf(activity.isFinishing()) : null), false, null);
        if (activity == null || activity.isFinishing()) {
            lz2.d("LaunchFragment", "@@navigateToNextScreen not proceeding (2)", false, null);
        } else {
            m99 m99Var = (m99) this.this$0.V.getValue();
            m99Var.j("splash");
            m99Var.a0.j(Boolean.TRUE);
            m99 m99Var2 = (m99) this.this$0.V.getValue();
            e eVarK = mh2.k(this.this$0);
            LaunchActivity launchActivity = this.this$0.W;
            if (launchActivity == null) {
                wl7.g("activity");
                throw null;
            }
            m99Var2.h(launchActivity, eVarK);
        }
        return j6g.a;
    }
}
