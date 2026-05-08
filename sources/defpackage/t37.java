package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t37 {
    public static final t37 g = new t37(false, 0, true, 1, 1, b19.c);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final b19 f;

    public t37(boolean z, int i, boolean z2, int i2, int i3, b19 b19Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = b19Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t37)) {
            return false;
        }
        t37 t37Var = (t37) obj;
        return this.a == t37Var.a && this.b == t37Var.b && this.c == t37Var.c && this.d == t37Var.d && this.e == t37Var.e && wl7.b(this.f, t37Var.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + w40.c(this.e, w40.c(this.d, ia.f(w40.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) zg8.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) gh8.a(this.d)) + ", imeAction=" + ((Object) s37.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
