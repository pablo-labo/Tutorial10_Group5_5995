package defpackage;

import defpackage.drf;
import defpackage.pw8;
import defpackage.r2b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2", f = "LimitOffsetPagingSource.kt", l = {121}, m = "invokeSuspend")
public final class nc2 extends c1f implements Function2<drf, lu2<? super r2b.b<Integer, Object>>, Object> {
    final /* synthetic */ r2b.a<Integer> $params;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oc2<Object> this$0;

    @uh3(c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1", f = "LimitOffsetPagingSource.kt", l = {122, 124}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<crf<r2b.b<Integer, Object>>, lu2<? super r2b.b<Integer, Object>>, Object> {
        final /* synthetic */ r2b.a<Integer> $params;
        int label;
        final /* synthetic */ oc2<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oc2<Object> oc2Var, r2b.a<Integer> aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = oc2Var;
            this.$params = aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, this.$params, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(crf<r2b.b<Integer, Object>> crfVar, lu2<? super r2b.b<Integer, Object>> lu2Var) {
            return ((a) create(crfVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            g13 g13Var = g13.a;
            if (i == 0) {
                r7d.b(obj);
                oc2<Object> oc2Var = this.this$0;
                kfd kfdVar = oc2Var.e;
                xed xedVar = oc2Var.d;
                this.label = 1;
                obj = u63.q0(((eu2) xedVar.j()).a, new zed(xedVar, new jfd(l6.i(new StringBuilder("SELECT COUNT(*) FROM ( "), kfdVar.a, " )"), kfdVar, null), null), this);
                if (obj != g13Var) {
                }
            }
            if (i != 1) {
                if (i == 2) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            int iIntValue = ((Number) obj).intValue();
            this.this$0.f.set(iIntValue);
            r2b.a<Integer> aVar = this.$params;
            oc2<Object> oc2Var2 = this.this$0;
            kfd kfdVar2 = oc2Var2.e;
            pw8.a aVar2 = oc2Var2.c;
            this.label = 2;
            Object objA = hfd.a(aVar, kfdVar2, iIntValue, aVar2, this);
            return objA == g13Var ? g13Var : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc2(oc2<Object> oc2Var, r2b.a<Integer> aVar, lu2<? super nc2> lu2Var) {
        super(2, lu2Var);
        this.this$0 = oc2Var;
        this.$params = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        nc2 nc2Var = new nc2(this.this$0, this.$params, lu2Var);
        nc2Var.L$0 = obj;
        return nc2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drf drfVar, lu2<? super r2b.b<Integer, Object>> lu2Var) {
        return ((nc2) create(drfVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        drf drfVar = (drf) this.L$0;
        a aVar = new a(this.this$0, this.$params, null);
        this.label = 1;
        Object objA = drfVar.a(drf.a.a, aVar, this);
        g13 g13Var = g13.a;
        return objA == g13Var ? g13Var : objA;
    }
}
