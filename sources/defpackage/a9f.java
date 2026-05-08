package defpackage;

import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.TarePluginManager$init$1", f = "TarePluginManager.kt", l = {73}, m = "invokeSuspend")
public final class a9f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ z8f this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ z8f a;

        public a(z8f z8fVar) {
            this.a = z8fVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            int iOrdinal = ((y49) obj).ordinal();
            z8f z8fVar = this.a;
            if (iOrdinal == 0) {
                z8fVar.getClass();
                z8fVar.a("notifyUserDidLogin", new b9f(3, null), new mh(z8fVar, 11));
            } else {
                if (iOrdinal != 1) {
                    l.g();
                    return null;
                }
                z8fVar.getClass();
                ((JSTBroadcast) cr8.p(JSTBroadcast.class)).dispatch(JSTBroadcastEvent.UserDidLogout.INSTANCE);
                z8fVar.a("notifyUserDidLogout", new c9f(3, null), new v02(z8fVar, 8));
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9f(z8f z8fVar, lu2<? super a9f> lu2Var) {
        super(2, lu2Var);
        this.this$0 = z8fVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new a9f(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
        ((a9f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        nde ndeVarA = ((t49) this.this$0.a.getValue()).a();
        a aVar = new a(this.this$0);
        this.label = 1;
        ndeVarA.e(aVar, this);
        return g13.a;
    }
}
