package defpackage;

import defpackage.yge;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
public final class che extends c1f implements Function2<wi5<Object>, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yge<Object> this$0;

    @uh3(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<bse<Object>, lu2<? super Boolean>, Object> {
        final /* synthetic */ bse<Object> $currentDownStreamFlowState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bse<Object> bseVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$currentDownStreamFlowState = bseVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$currentDownStreamFlowState, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(bse<Object> bseVar, lu2<? super Boolean> lu2Var) {
            return ((a) create(bseVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            bse<Object> bseVar = (bse) this.L$0;
            bse<Object> bseVar2 = this.$currentDownStreamFlowState;
            boolean z = false;
            if (!(bseVar2 instanceof td3) && !(bseVar2 instanceof ec5) && bseVar == bseVar2) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public che(yge<Object> ygeVar, lu2<? super che> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ygeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        che cheVar = new che(this.this$0, lu2Var);
        cheVar.L$0 = obj;
        return cheVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<Object> wi5Var, lu2<? super j6g> lu2Var) {
        return ((che) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        wi5 wi5Var = (wi5) this.L$0;
        bse bseVar = (bse) this.this$0.V.getValue();
        if (!(bseVar instanceof td3)) {
            this.this$0.X.a(new yge.a.C0483a(bseVar));
        }
        gse gseVar = this.this$0.V;
        a aVar = new a(bseVar, null);
        this.label = 1;
        wg2.y(wi5Var);
        gseVar.e(new vj5(new huc(), new dhe(wi5Var), aVar), this);
        return g13.a;
    }
}
