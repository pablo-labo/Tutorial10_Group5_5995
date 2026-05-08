package androidx.work;

import android.content.Context;
import androidx.work.c;
import defpackage.a74;
import defpackage.c1f;
import defpackage.e13;
import defpackage.eq3;
import defpackage.eu2;
import defpackage.f13;
import defpackage.fbe;
import defpackage.g13;
import defpackage.hp5;
import defpackage.hz8;
import defpackage.i50;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.qy7;
import defpackage.r6;
import defpackage.r7d;
import defpackage.u63;
import defpackage.uh3;
import defpackage.v03;
import defpackage.x2h;
import defpackage.yy7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class CoroutineWorker extends c {
    public final qy7 a;
    public final fbe<c.a> b;
    public final eq3 c;

    @uh3(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ yy7<hp5> $jobFuture;
        Object L$0;
        int label;
        final /* synthetic */ CoroutineWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yy7<hp5> yy7Var, CoroutineWorker coroutineWorker, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$jobFuture = yy7Var;
            this.this$0 = coroutineWorker;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$jobFuture, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yy7 yy7Var = (yy7) this.L$0;
                r7d.b(obj);
                yy7Var.a.i((R) obj);
                return j6g.a;
            }
            r7d.b(obj);
            yy7<hp5> yy7Var2 = this.$jobFuture;
            CoroutineWorker coroutineWorker = this.this$0;
            this.L$0 = yy7Var2;
            this.label = 1;
            coroutineWorker.getClass();
            r6.g("Not implemented");
            return null;
        }
    }

    @uh3(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return CoroutineWorker.this.new b(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.label = 1;
                    obj = coroutineWorker.b();
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
                CoroutineWorker.this.b.i((c.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.b.j(th);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = u63.f();
        fbe<c.a> fbeVar = new fbe<>();
        this.b = fbeVar;
        fbeVar.a(new i50(this, 2), ((x2h) getTaskExecutor()).a);
        this.c = a74.a;
    }

    public abstract Object b();

    @Override // androidx.work.c
    public final hz8<hp5> getForegroundInfoAsync() {
        qy7 qy7VarF = u63.f();
        eq3 eq3Var = this.c;
        eq3Var.getClass();
        eu2 eu2VarA = f13.a(v03.a.C0438a.c(eq3Var, qy7VarF));
        yy7 yy7Var = new yy7(qy7VarF);
        u63.Y(eu2VarA, null, null, new a(yy7Var, this, null), 3);
        return yy7Var;
    }

    @Override // androidx.work.c
    public final void onStopped() {
        super.onStopped();
        this.b.cancel(false);
    }

    @Override // androidx.work.c
    public final hz8<c.a> startWork() {
        eq3 eq3Var = this.c;
        eq3Var.getClass();
        u63.Y(f13.a(v03.a.C0438a.c(eq3Var, this.a)), null, null, new b(null), 3);
        return this.b;
    }
}
