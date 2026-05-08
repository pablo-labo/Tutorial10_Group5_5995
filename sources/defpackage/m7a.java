package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$6$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
public final class m7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ e8a $myJobsViewModel;
    final /* synthetic */ g4a<j7f> $selectedFilter$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7a(e8a e8aVar, g4a<j7f> g4aVar, lu2<? super m7a> lu2Var) {
        super(2, lu2Var);
        this.$myJobsViewModel = e8aVar;
        this.$selectedFilter$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new m7a(this.$myJobsViewModel, this.$selectedFilter$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((m7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        e8a e8aVar = this.$myJobsViewModel;
        j7f value = this.$selectedFilter$delegate.getValue();
        value.getClass();
        e8aVar.getClass();
        ((gme) e8aVar.V).setValue(value);
        return j6g.a;
    }
}
