package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$8$1", f = "MyJobsScreen.kt", l = {}, m = "invokeSuspend")
public final class n7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Map<j7f, ss8> $lazyListStates;
    final /* synthetic */ e8a $myJobsViewModel;
    final /* synthetic */ Function2<Boolean, prd, j6g> $notifyScrollState;
    final /* synthetic */ g4a<j7f> $selectedFilter$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n7a(e8a e8aVar, Map<j7f, ss8> map, Function2<? super Boolean, ? super prd, j6g> function2, g4a<j7f> g4aVar, lu2<? super n7a> lu2Var) {
        super(2, lu2Var);
        this.$myJobsViewModel = e8aVar;
        this.$lazyListStates = map;
        this.$notifyScrollState = function2;
        this.$selectedFilter$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new n7a(this.$myJobsViewModel, this.$lazyListStates, this.$notifyScrollState, this.$selectedFilter$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((n7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        e8a e8aVar = this.$myJobsViewModel;
        ss8 ss8Var = this.$lazyListStates.get(this.$selectedFilter$delegate.getValue());
        e8aVar.getClass();
        this.$notifyScrollState.invoke(Boolean.valueOf(ss8Var != null && ss8Var.h() == 0 && ss8Var.i() <= e8aVar.Y), prd.a);
        return j6g.a;
    }
}
