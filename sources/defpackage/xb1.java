package defpackage;

import defpackage.uo6;
import defpackage.xo6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxb1;", "Lxo6;", "State", "Luo6;", "Event", "Lbrg;", "<init>", "()V", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class xb1<State extends xo6, Event extends uo6> extends brg {
    public final gse b;
    public final gse c;
    public final nde d;
    public final pqc e;

    @uh3(c = "com.indeed.android.myjobs.presentation.BaseViewModel$call$3", f = "BaseViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements wu5<wi5<Object>, Throwable, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // defpackage.wu5
        public final Object q(wi5<Object> wi5Var, Throwable th, lu2<? super j6g> lu2Var) {
            return new a(3, lu2Var).invokeSuspend(j6g.a);
        }
    }

    public static final class b<T> implements wi5 {
        public final /* synthetic */ Function1<T, j6g> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super T, j6g> function1) {
            this.a = function1;
        }

        @Override // defpackage.wi5
        public final Object a(T t, lu2<? super j6g> lu2Var) {
            this.a.invoke(t);
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.BaseViewModel$setEvent$1", f = "BaseViewModel.kt", l = {41}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Event $event;
        int label;
        final /* synthetic */ xb1<State, Event> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xb1<State, Event> xb1Var, Event event, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.this$0 = xb1Var;
            this.$event = event;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.this$0, this.$event, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                nde ndeVar = this.this$0.d;
                Event event = this.$event;
                this.label = 1;
                Object objA = ndeVar.a(event, this);
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

    public xb1() {
        gse gseVarE = hh2.e((xo6) new d2f(new oq(this, 3)).getValue());
        this.b = gseVarE;
        this.c = gseVarE;
        nde ndeVarD = wg2.d(0, 0, null, 7);
        this.d = ndeVarD;
        this.e = wg2.i(ndeVarD);
    }

    public static Object g(vi5 vi5Var, Function1 function1, lu2 lu2Var) throws Throwable {
        Object objE = new nj5(vi5Var, new a(3, null)).e(new b(function1), lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }

    public abstract State h();

    public final State i() {
        return (State) this.c.getValue();
    }

    public final void j(Event event) {
        event.getClass();
        u63.Y(ee3.p(this), null, null, new c(this, event, null), 3);
    }

    public final void k(Function1<? super State, ? extends State> function1) {
        this.b.setValue(function1.invoke(i()));
    }
}
