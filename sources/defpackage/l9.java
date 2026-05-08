package defpackage;

import defpackage.o7d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.kotlin.activityresult.ActivityResultsManager$1", f = "ActivityResultsManager.kt", l = {101}, m = "invokeSuspend")
public final class l9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ o9 this$0;

    public static final class a implements rpa {
        public final /* synthetic */ qw1 a;
        public final /* synthetic */ xi0 b;
        public final /* synthetic */ o9 c;

        public a(qw1 qw1Var, xi0 xi0Var, o9 o9Var) {
            this.a = qw1Var;
            this.b = xi0Var;
            this.c = o9Var;
        }

        @Override // defpackage.rpa
        public final void a(wi0 wi0Var) {
            Object aVar;
            qw1 qw1Var = this.a;
            if (qw1Var.v()) {
                this.b.b(this);
                try {
                    this.c.a.f(wi0Var);
                    aVar = j6g.a;
                } catch (Throwable th) {
                    aVar = new o7d.a(th);
                }
                qw1Var.resumeWith(aVar);
            }
        }
    }

    public static final class b implements Function1<Throwable, j6g> {
        public final /* synthetic */ xi0 a;
        public final /* synthetic */ a b;

        public b(xi0 xi0Var, a aVar) {
            this.a = xi0Var;
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Throwable th) {
            this.a.b(this.b);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(o9 o9Var, lu2<? super l9> lu2Var) {
        super(2, lu2Var);
        this.this$0 = o9Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new l9(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((l9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            o9 o9Var = this.this$0;
            this.L$0 = o9Var;
            this.L$1 = o9Var;
            this.label = 1;
            qw1 qw1Var = new qw1(1, ewa.v(this));
            qw1Var.q();
            a aVar = new a(qw1Var, o9Var, o9Var);
            o9Var.c.a(aVar);
            qw1Var.t(new b(o9Var, aVar));
            Object objP = qw1Var.p();
            g13 g13Var = g13.a;
            if (objP == g13Var) {
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
