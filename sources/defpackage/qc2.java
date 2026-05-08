package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2", f = "LimitOffsetPagingSource.kt", l = {148}, m = "invokeSuspend")
public final class qc2 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ oc2<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc2(oc2<Object> oc2Var, lu2<? super qc2> lu2Var) {
        super(2, lu2Var);
        this.this$0 = oc2Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new qc2(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((qc2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            km7 km7VarK = this.this$0.d.k();
            String[] strArr = this.this$0.a;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.label = 1;
            obj = km7VarK.b.e(strArr2, km7VarK.e, km7VarK.f, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.b.invalidate();
        }
        return j6g.a;
    }
}
