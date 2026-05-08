package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class sob implements rob, tob {
    public final nde a = wg2.d(0, 0, null, 7);
    public final nde b = wg2.d(0, 0, null, 7);

    @uh3(c = "com.indeed.android.jobsearch.pulse.ProctorEventsManager$publishProctorRefreshFailureEvent$1", f = "ProctorEventsManager.kt", l = {46}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return sob.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                sob.this.b.i();
                nde ndeVar = sob.this.b;
                j6g j6gVar = j6g.a;
                this.label = 1;
                Object objA = ndeVar.a(j6gVar, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
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

    @uh3(c = "com.indeed.android.jobsearch.pulse.ProctorEventsManager$publishProctorUpdateEvent$1", f = "ProctorEventsManager.kt", l = {35}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return sob.this.new b(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                sob.this.a.i();
                nde ndeVar = sob.this.a;
                j6g j6gVar = j6g.a;
                this.label = 1;
                Object objA = ndeVar.a(j6gVar, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
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

    @Override // defpackage.rob
    public final nde a() {
        return this.b;
    }

    @Override // defpackage.tob
    public final void b() {
        u63.Y(f13.b(), null, null, new b(null), 3);
    }

    @Override // defpackage.tob
    public final void c() {
        u63.Y(f13.b(), null, null, new a(null), 3);
    }

    @Override // defpackage.rob
    public final nde d() {
        return this.a;
    }
}
