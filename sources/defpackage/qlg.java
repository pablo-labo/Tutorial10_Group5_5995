package defpackage;

import defpackage.b32;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qlg implements b32 {
    public final String a;

    public static final class a extends qlg {
        public final int b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(int i) {
            StringBuilder sbG = o6.g(i, "must have at least ", " value parameter");
            sbG.append(i > 1 ? "s" : "");
            super(sbG.toString());
            this.b = i;
        }

        @Override // defpackage.b32
        public final boolean b(iv7 iv7Var) {
            return iv7Var.i().size() >= this.b;
        }
    }

    public static final class b extends qlg {
        public final int b;

        public b() {
            super("must have exactly 2 value parameters");
            this.b = 2;
        }

        @Override // defpackage.b32
        public final boolean b(iv7 iv7Var) {
            return iv7Var.i().size() == this.b;
        }
    }

    public static final class c extends qlg {
        public static final c b = new c("must have no value parameters");

        @Override // defpackage.b32
        public final boolean b(iv7 iv7Var) {
            return iv7Var.i().isEmpty();
        }
    }

    public static final class d extends qlg {
        public static final d b = new d("must have a single value parameter");

        @Override // defpackage.b32
        public final boolean b(iv7 iv7Var) {
            return iv7Var.i().size() == 1;
        }
    }

    public qlg(String str) {
        this.a = str;
    }

    @Override // defpackage.b32
    public final String a(iv7 iv7Var) {
        return b32.a.a(this, iv7Var);
    }

    @Override // defpackage.b32
    public final String getDescription() {
        return this.a;
    }
}
