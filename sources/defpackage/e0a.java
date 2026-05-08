package defpackage;

import defpackage.d0a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", l = {170}, m = "invokeSuspend")
public final class e0a extends c1f implements Function2<e13, lu2<? super d0a.a>, Object> {
    final /* synthetic */ u12<d0a.a> $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", l = {166}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(2, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            e13 e13Var;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                e13Var = (e13) this.L$0;
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e13Var = (e13) this.L$0;
                r7d.b(obj);
            }
            while (u63.U(e13Var.getCoroutineContext())) {
                li liVar = new li(7);
                this.L$0 = e13Var;
                this.label = 1;
                Object objW = ly9.a(getContext()).W(liVar, this);
                g13 g13Var = g13.a;
                if (objW == g13Var) {
                    return g13Var;
                }
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0a(u12<d0a.a> u12Var, lu2<? super e0a> lu2Var) {
        super(2, lu2Var);
        this.$this_busyReceive = u12Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        e0a e0aVar = new e0a(this.$this_busyReceive, lu2Var);
        e0aVar.L$0 = obj;
        return e0aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super d0a.a> lu2Var) {
        return ((e0a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ex7 ex7Var;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            uqe uqeVarY = u63.Y((e13) this.L$0, null, null, new a(2, null), 3);
            try {
                u12<d0a.a> u12Var = this.$this_busyReceive;
                this.L$0 = uqeVarY;
                this.label = 1;
                Object objC = u12Var.c(this);
                g13 g13Var = g13.a;
                if (objC == g13Var) {
                    return g13Var;
                }
                obj = objC;
                ex7Var = uqeVarY;
            } catch (Throwable th2) {
                th = th2;
                ex7Var = uqeVarY;
                ex7Var.h(null);
                throw th;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ex7Var = (ex7) this.L$0;
            try {
                r7d.b(obj);
            } catch (Throwable th3) {
                th = th3;
                ex7Var.h(null);
                throw th;
            }
        }
        d0a.a aVar = (d0a.a) obj;
        ex7Var.h(null);
        return aVar;
    }
}
