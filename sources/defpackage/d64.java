package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d64 {
    public static final b a;
    public static final c b;
    public static final e c;

    public class a extends d64 {
        @Override // defpackage.d64
        public final boolean a() {
            return true;
        }

        @Override // defpackage.d64
        public final boolean b() {
            return true;
        }

        @Override // defpackage.d64
        public final boolean c(xe3 xe3Var) {
            return xe3Var == xe3.b;
        }

        @Override // defpackage.d64
        public final boolean d(boolean z, xe3 xe3Var, ss4 ss4Var) {
            return (xe3Var == xe3.d || xe3Var == xe3.e) ? false : true;
        }
    }

    public class b extends d64 {
        @Override // defpackage.d64
        public final boolean a() {
            return false;
        }

        @Override // defpackage.d64
        public final boolean b() {
            return false;
        }

        @Override // defpackage.d64
        public final boolean c(xe3 xe3Var) {
            return false;
        }

        @Override // defpackage.d64
        public final boolean d(boolean z, xe3 xe3Var, ss4 ss4Var) {
            return false;
        }
    }

    public class c extends d64 {
        @Override // defpackage.d64
        public final boolean a() {
            return true;
        }

        @Override // defpackage.d64
        public final boolean b() {
            return false;
        }

        @Override // defpackage.d64
        public final boolean c(xe3 xe3Var) {
            return (xe3Var == xe3.c || xe3Var == xe3.e) ? false : true;
        }

        @Override // defpackage.d64
        public final boolean d(boolean z, xe3 xe3Var, ss4 ss4Var) {
            return false;
        }
    }

    public class d extends d64 {
        @Override // defpackage.d64
        public final boolean a() {
            return false;
        }

        @Override // defpackage.d64
        public final boolean b() {
            return true;
        }

        @Override // defpackage.d64
        public final boolean c(xe3 xe3Var) {
            return false;
        }

        @Override // defpackage.d64
        public final boolean d(boolean z, xe3 xe3Var, ss4 ss4Var) {
            return (xe3Var == xe3.d || xe3Var == xe3.e) ? false : true;
        }
    }

    public class e extends d64 {
        @Override // defpackage.d64
        public final boolean a() {
            return true;
        }

        @Override // defpackage.d64
        public final boolean b() {
            return true;
        }

        @Override // defpackage.d64
        public final boolean c(xe3 xe3Var) {
            return xe3Var == xe3.b;
        }

        @Override // defpackage.d64
        public final boolean d(boolean z, xe3 xe3Var, ss4 ss4Var) {
            return ((z && xe3Var == xe3.c) || xe3Var == xe3.a) && ss4Var == ss4.b;
        }
    }

    static {
        new a();
        a = new b();
        b = new c();
        new d();
        c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(xe3 xe3Var);

    public abstract boolean d(boolean z, xe3 xe3Var, ss4 ss4Var);
}
