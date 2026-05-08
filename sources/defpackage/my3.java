package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class my3 {
    public final y8c<?> a;
    public final int b;
    public final int c;

    public my3(y8c<?> y8cVar, int i, int i2) {
        yid.b(y8cVar, "Null dependency anInterface.");
        this.a = y8cVar;
        this.b = i;
        this.c = i2;
    }

    public static my3 a(y8c<?> y8cVar) {
        return new my3(y8cVar, 1, 0);
    }

    public static my3 b(Class<?> cls) {
        return new my3(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof my3)) {
            return false;
        }
        my3 my3Var = (my3) obj;
        return this.a.equals(my3Var.a) && this.b == my3Var.b && this.c == my3Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                g7.l(p6.c(i2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return l6.i(sb, str, "}");
    }

    public my3(int i, int i2, Class cls) {
        this((y8c<?>) y8c.a(cls), i, i2);
    }
}
