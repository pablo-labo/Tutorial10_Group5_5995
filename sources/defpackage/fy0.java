package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fy0 {
    public static final fy0 d = new a().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public static final class a {
        public boolean a;
        public boolean b;
        public boolean c;

        public final fy0 a() {
            if (this.a || !(this.b || this.c)) {
                return new fy0(this);
            }
            r6.g("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }
    }

    public fy0(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fy0.class != obj.getClass()) {
            return false;
        }
        fy0 fy0Var = (fy0) obj;
        return this.a == fy0Var.a && this.b == fy0Var.b && this.c == fy0Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
