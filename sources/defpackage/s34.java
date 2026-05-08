package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s34 {
    public static final s34 e = new a(0).a();
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public static final class a {
        public final int a;
        public int b;
        public int c;
        public String d;

        public a(int i) {
            this.a = i;
        }

        public final s34 a() {
            ka2.l(this.b <= this.c);
            return new s34(this);
        }
    }

    static {
        String str = vjg.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public s34(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s34)) {
            return false;
        }
        s34 s34Var = (s34) obj;
        return this.a == s34Var.a && this.b == s34Var.b && this.c == s34Var.c && Objects.equals(this.d, s34Var.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
