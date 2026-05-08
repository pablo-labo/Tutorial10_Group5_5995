package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.passport.AppInitValuesHolder$getUserDataMergeStatus$2", f = "AppInitValuesHolder.kt", l = {}, m = "invokeSuspend")
public final class dl0 extends c1f implements Function2<Integer, lu2<? super Boolean>, Object> {
    /* synthetic */ int I$0;
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        dl0 dl0Var = new dl0(2, lu2Var);
        dl0Var.I$0 = ((Number) obj).intValue();
        return dl0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, lu2<? super Boolean> lu2Var) {
        return ((dl0) create(Integer.valueOf(num.intValue()), lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        if (this.label == 0) {
            r7d.b(obj);
            return Boolean.valueOf(i > 0);
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
