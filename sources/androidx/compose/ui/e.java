package androidx.compose.ui;

import defpackage.ae7;
import defpackage.e13;
import defpackage.eu2;
import defpackage.ex7;
import defpackage.f13;
import defpackage.loa;
import defpackage.pi6;
import defpackage.qy7;
import defpackage.t71;
import defpackage.tia;
import defpackage.ts3;
import defpackage.us3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    public static final class a implements e {
        public static final /* synthetic */ a b = new a();

        @Override // androidx.compose.ui.e
        public final <R> R c(R r, Function2<? super R, ? super b, ? extends R> function2) {
            return r;
        }

        @Override // androidx.compose.ui.e
        public final boolean e(Function1<? super b, Boolean> function1) {
            return true;
        }

        @Override // androidx.compose.ui.e
        public final e o(e eVar) {
            return eVar;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    public interface b extends e {
        @Override // androidx.compose.ui.e
        default <R> R c(R r, Function2<? super R, ? super b, ? extends R> function2) {
            return function2.invoke(r, this);
        }

        @Override // androidx.compose.ui.e
        default boolean e(Function1<? super b, Boolean> function1) {
            return function1.invoke(this).booleanValue();
        }
    }

    public static abstract class c implements ts3 {
        public loa V;
        public tia W;
        public boolean X;
        public boolean Y;
        public boolean Z;
        public boolean a0;
        public eu2 b;
        public pi6.a b0;
        public int c;
        public boolean c0;
        public c e;
        public c f;
        public c a = this;
        public int d = -1;

        public final e13 Q1() {
            eu2 eu2Var = this.b;
            if (eu2Var != null) {
                return eu2Var;
            }
            eu2 eu2VarA = f13.a(us3.g(this).getCoroutineContext().d1(new qy7((ex7) us3.g(this).getCoroutineContext().h1(ex7.a.a))));
            this.b = eu2VarA;
            return eu2VarA;
        }

        public boolean R1() {
            return !(this instanceof t71);
        }

        public void S1() {
            if (this.c0) {
                ae7.b("node attached multiple times");
            }
            if (this.W == null) {
                ae7.b("attach invoked on a node without a coordinator");
            }
            this.c0 = true;
            this.Z = true;
        }

        public void T1() {
            if (!this.c0) {
                ae7.b("Cannot detach a node that is not attached");
            }
            if (this.Z) {
                ae7.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.a0) {
                ae7.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.c0 = false;
            eu2 eu2Var = this.b;
            if (eu2Var != null) {
                f13.c(eu2Var, new ModifierNodeDetachedCancellationException());
                this.b = null;
            }
        }

        public void U1() {
        }

        public void V1() {
        }

        public void W1() {
        }

        public void X1() {
            if (!this.c0) {
                ae7.b("reset() called on an unattached node");
            }
            W1();
        }

        public void Y1() {
            if (!this.c0) {
                ae7.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.Z) {
                ae7.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.Z = false;
            U1();
            this.a0 = true;
        }

        public void Z1() {
            if (!this.c0) {
                ae7.b("node detached multiple times");
            }
            if (this.W == null) {
                ae7.b("detach invoked on a node without a coordinator");
            }
            if (!this.a0) {
                ae7.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.a0 = false;
            pi6.a aVar = this.b0;
            if (aVar != null) {
                aVar.invoke();
            }
            V1();
        }

        public void a2(c cVar) {
            this.a = cVar;
        }

        public void b2(tia tiaVar) {
            this.W = tiaVar;
        }

        @Override // defpackage.ts3
        public final c k() {
            return this.a;
        }
    }

    <R> R c(R r, Function2<? super R, ? super b, ? extends R> function2);

    boolean e(Function1<? super b, Boolean> function1);

    default e o(e eVar) {
        return eVar == a.b ? this : new androidx.compose.ui.a(this, eVar);
    }
}
