package defpackage;

import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$setupBottomNav$1$1$1$2$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
public final class wp6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ IanMainFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp6(IanMainFragment ianMainFragment, lu2<? super wp6> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ianMainFragment;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new wp6(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((wp6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        boolean zI = this.this$0.J().i();
        boolean z = dmc.l() && this.this$0.J().g() == xj1.b && ((Boolean) ((gme) ((fj6) this.this$0.q0.getValue()).b).getValue()).booleanValue();
        if (!zI || z) {
            IanMainFragment.G(this.this$0, 0);
        } else {
            IanMainFragment ianMainFragment = this.this$0;
            IanMainFragment.G(ianMainFragment, ((Number) ((gme) ianMainFragment.J().a0).getValue()).intValue());
        }
        return j6g.a;
    }
}
