package defpackage;

import defpackage.ia4;
import defpackage.ua4;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wa4 extends ja4 {
    public xa4 o0;
    public dwa p0;
    public boolean q0;
    public wu5<? super e13, ? super ooa, ? super lu2<? super j6g>, ? extends Object> r0;
    public wu5<? super e13, ? super Float, ? super lu2<? super j6g>, ? extends Object> s0;
    public boolean t0;

    @uh3(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {312}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ long $startedPosition;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$startedPosition = j;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = wa4.this.new a(this.$startedPosition, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                e13 e13Var = (e13) this.L$0;
                wu5<? super e13, ? super ooa, ? super lu2<? super j6g>, ? extends Object> wu5Var = wa4.this.r0;
                ooa ooaVar = new ooa(this.$startedPosition);
                this.label = 1;
                Object objQ = wu5Var.q(e13Var, ooaVar, this);
                g13 g13Var = g13.a;
                if (objQ == g13Var) {
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

    @uh3(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {319}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ long $velocity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$velocity = j;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = wa4.this.new b(this.$velocity, lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                e13 e13Var = (e13) this.L$0;
                wa4 wa4Var = wa4.this;
                wu5<? super e13, ? super Float, ? super lu2<? super j6g>, ? extends Object> wu5Var = wa4Var.s0;
                long jF = vmg.f(this.$velocity, wa4Var.t0 ? -1.0f : 1.0f);
                dwa dwaVar = wa4.this.p0;
                ua4.a aVar = ua4.a;
                Float f = new Float(dwaVar == dwa.a ? vmg.c(jF) : vmg.b(jF));
                this.label = 1;
                Object objQ = wu5Var.q(e13Var, f, this);
                g13 g13Var = g13.a;
                if (objQ == g13Var) {
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

    public wa4() {
        throw null;
    }

    @Override // defpackage.ja4
    public final Object j2(ia4.a aVar, ia4 ia4Var) {
        Object objA = this.o0.a(new va4(aVar, this, null), ia4Var);
        return objA == g13.a ? objA : j6g.a;
    }

    @Override // defpackage.ja4
    public final void k2(long j) {
        if (!this.c0 || wl7.b(this.r0, ua4.a)) {
            return;
        }
        u63.Y(Q1(), null, i13.d, new a(j, null), 1);
    }

    @Override // defpackage.ja4
    public final void l2(long j) {
        if (!this.c0 || wl7.b(this.s0, ua4.b)) {
            return;
        }
        u63.Y(Q1(), null, i13.d, new b(j, null), 1);
    }

    @Override // defpackage.ja4
    public final boolean m2() {
        return this.q0;
    }
}
