package defpackage;

import defpackage.mke;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public class iwf {
    public final boolean a;
    public final boolean b;
    public final fyf c;
    public final ka6 d;
    public final v1 e;
    public int f;
    public ArrayDeque<fdd> g;
    public mke h;

    public static abstract class a {

        /* JADX INFO: renamed from: iwf$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0271a extends a {
        }

        public static final class b extends a {
            public static final b a = new b();

            @Override // iwf.a
            public final fdd a(iwf iwfVar, zi8 zi8Var) {
                iwfVar.getClass();
                zi8Var.getClass();
                return iwfVar.c.S(zi8Var);
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            @Override // iwf.a
            public final fdd a(iwf iwfVar, zi8 zi8Var) {
                iwfVar.getClass();
                zi8Var.getClass();
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends a {
            public static final d a = new d();

            @Override // iwf.a
            public final fdd a(iwf iwfVar, zi8 zi8Var) {
                iwfVar.getClass();
                zi8Var.getClass();
                return iwfVar.c.v(zi8Var);
            }
        }

        public abstract fdd a(iwf iwfVar, zi8 zi8Var);
    }

    public iwf(boolean z, boolean z2, s62 s62Var, ka6 ka6Var, v1 v1Var) {
        s62Var.getClass();
        ka6Var.getClass();
        v1Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = s62Var;
        this.d = ka6Var;
        this.e = v1Var;
    }

    public final void a() {
        ArrayDeque<fdd> arrayDeque = this.g;
        arrayDeque.getClass();
        arrayDeque.clear();
        mke mkeVar = this.h;
        mkeVar.getClass();
        mkeVar.clear();
    }

    public final void b() {
        if (this.g == null) {
            this.g = new ArrayDeque<>(4);
        }
        if (this.h == null) {
            int i = mke.c;
            this.h = mke.b.a();
        }
    }
}
