package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface hzf extends ese<Object> {

    public static final class a implements hzf, ese<Object> {
        public final vu0 a;

        public a(vu0 vu0Var) {
            this.a = vu0Var;
        }

        @Override // defpackage.hzf
        public final boolean f() {
            return this.a.V;
        }

        @Override // defpackage.ese
        public final Object getValue() {
            return ((gme) this.a.f).getValue();
        }
    }

    public static final class b implements hzf {
        public final Object a;
        public final boolean b;

        public b(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }

        @Override // defpackage.hzf
        public final boolean f() {
            return this.b;
        }

        @Override // defpackage.ese
        public final Object getValue() {
            return this.a;
        }
    }

    boolean f();
}
