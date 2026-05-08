package defpackage;

import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.sp7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$setupDialogContainer$1$1$1$1$6$1", f = "IanMainFragment.kt", l = {}, m = "invokeSuspend")
public final class bq6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $screenNameToLog;
    int label;
    final /* synthetic */ IanMainFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq6(String str, IanMainFragment ianMainFragment, lu2<? super bq6> lu2Var) {
        super(2, lu2Var);
        this.$screenNameToLog = str;
        this.this$0 = ianMainFragment;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new bq6(this.$screenNameToLog, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((bq6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, this.$screenNameToLog, null, new bt(this.this$0, 8)));
        return j6g.a;
    }
}
