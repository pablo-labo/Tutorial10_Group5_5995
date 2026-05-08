package defpackage;

import defpackage.v03;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {105, 106, 108}, m = "invokeSuspend")
public final class fl5 extends c1f implements Function2<upb<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ pz8<Object> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ goa<Object> $observer;
        final /* synthetic */ pz8<Object> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pz8<Object> pz8Var, goa<Object> goaVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$this_asFlow = pz8Var;
            this.$observer = goaVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$this_asFlow, this.$observer, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$this_asFlow.f(this.$observer);
            return j6g.a;
        }
    }

    @uh3(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ goa<Object> $observer;
        final /* synthetic */ pz8<Object> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pz8<Object> pz8Var, goa<Object> goaVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$this_asFlow = pz8Var;
            this.$observer = goaVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$this_asFlow, this.$observer, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$this_asFlow.i(this.$observer);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl5(pz8<Object> pz8Var, lu2<? super fl5> lu2Var) {
        super(2, lu2Var);
        this.$this_asFlow = pz8Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        fl5 fl5Var = new fl5(this.$this_asFlow, lu2Var);
        fl5Var.L$0 = obj;
        return fl5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(upb<Object> upbVar, lu2<? super j6g> lu2Var) throws Throwable {
        ((fl5) create(upbVar, lu2Var)).invokeSuspend(j6g.a);
        return g13.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [goa, int] */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        goa goaVar;
        ?? r0 = this.label;
        g13 g13Var = g13.a;
        try {
        } catch (Throwable th) {
            eq3 eq3Var = a74.a;
            k89 k89VarJ1 = m89.a.J1();
            gja gjaVar = gja.b;
            k89VarJ1.getClass();
            v03 v03VarC = v03.a.C0438a.c(k89VarJ1, gjaVar);
            b bVar = new b(this.$this_asFlow, r0, null);
            this.L$0 = th;
            this.label = 3;
            if (u63.q0(v03VarC, bVar, this) != g13Var) {
                throw th;
            }
        }
        if (r0 == 0) {
            r7d.b(obj);
            final upb upbVar = (upb) this.L$0;
            goaVar = new goa() { // from class: el5
                @Override // defpackage.goa
                public final void d(Object obj2) {
                    upbVar.f(obj2);
                }
            };
            eq3 eq3Var2 = a74.a;
            k89 k89VarJ12 = m89.a.J1();
            a aVar = new a(this.$this_asFlow, goaVar, null);
            this.L$0 = goaVar;
            this.label = 1;
            if (u63.q0(k89VarJ12, aVar, this) == g13Var) {
                return g13Var;
            }
        } else {
            if (r0 != 1) {
                if (r0 == 2) {
                    r7d.b(obj);
                    throw new KotlinNothingValueException();
                }
                if (r0 != 3) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = (Throwable) this.L$0;
                r7d.b(obj);
                throw th2;
            }
            goaVar = (goa) this.L$0;
            r7d.b(obj);
        }
        this.L$0 = goaVar;
        this.label = 2;
        ls3.a(this);
        return g13Var;
    }
}
