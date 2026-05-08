package defpackage;

import android.util.Log;
import defpackage.lza;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PagingDataPresenter$collectFrom$2", f = "PagingDataPresenter.kt", l = {121}, m = "invokeSuspend")
public final class p2b extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ l2b<Object> $pagingData;
    int label;
    final /* synthetic */ n2b<Object> this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ n2b<T> a;
        public final /* synthetic */ l2b<T> b;

        public a(n2b<T> n2bVar, l2b<T> l2bVar) {
            this.a = n2bVar;
            this.b = l2bVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) throws Throwable {
            kza kzaVar = (kza) obj;
            if (Log.isLoggable("Paging", 2)) {
                Log.v("Paging", "Collected " + kzaVar, null);
            }
            n2b<T> n2bVar = this.a;
            Object objQ0 = u63.q0(n2bVar.a, new o2b(kzaVar, n2bVar, this.b, null), lu2Var);
            return objQ0 == g13.a ? objQ0 : j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2b(n2b<Object> n2bVar, l2b<Object> l2bVar, lu2<? super p2b> lu2Var) {
        super(1, lu2Var);
        this.this$0 = n2bVar;
        this.$pagingData = l2bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new p2b(this.this$0, this.$pagingData, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((p2b) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            n2b<Object> n2bVar = this.this$0;
            l2b<Object> l2bVar = this.$pagingData;
            lza.c cVar = l2bVar.b;
            n2bVar.getClass();
            vi5<kza<Object>> vi5Var = l2bVar.a;
            a aVar = new a(n2bVar, l2bVar);
            this.label = 1;
            Object objE = vi5Var.e(aVar, this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
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
