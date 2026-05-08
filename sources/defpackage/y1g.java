package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.UIPMessagingEventsImpl$1", f = "UIPMessagingEventsImpl.kt", l = {57}, m = "invokeSuspend")
public final class y1g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ z1g this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ z1g a;

        public a(z1g z1gVar) {
            this.a = z1gVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            int iOrdinal = ((y49) obj).ordinal();
            z1g z1gVar = this.a;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    l.g();
                    return null;
                }
                z1gVar.h(0);
            } else if (bu8.a.h()) {
                z1gVar.a(z1gVar.W, new vy2(14));
            } else {
                u63.Y(f13.a(z1gVar.a), null, null, new x1g(z1gVar, null), 3);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1g(z1g z1gVar, lu2<? super y1g> lu2Var) {
        super(2, lu2Var);
        this.this$0 = z1gVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new y1g(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
        ((y1g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
