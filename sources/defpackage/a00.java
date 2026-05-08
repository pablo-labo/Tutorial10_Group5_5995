package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.util.AgeSignalManager$2", f = "AgeSignalManager.kt", l = {81}, m = "invokeSuspend")
public final class a00 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ g00 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ g00 a;

        public a(g00 g00Var) {
            this.a = g00Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            if (((y49) obj) == y49.a) {
                g00 g00Var = this.a;
                u63.Y(g00Var.b, null, null, new zz(g00Var, null), 3);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(g00 g00Var, lu2<? super a00> lu2Var) {
        super(2, lu2Var);
        this.this$0 = g00Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new a00(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
        ((a00) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        return g13.a;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                throw s6.e(obj);
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        nde ndeVarA = ((t49) this.this$0.d.getValue()).a();
        a aVar = new a(this.this$0);
        this.label = 1;
        ndeVarA.e(aVar, this);
        return g13.a;
    }
}
