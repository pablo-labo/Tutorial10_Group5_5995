package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fh8 {
    public static final fh8 e;
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;

    static {
        int i = 0;
        e = new fh8((Boolean) null, i, i, 127);
    }

    public /* synthetic */ fh8(Boolean bool, int i, int i2, int i3) {
        this(-1, (i3 & 2) != 0 ? null : bool, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2);
    }

    public static fh8 a(int i) {
        int i2 = i & 1;
        fh8 fh8Var = e;
        return new fh8(i2 != 0 ? fh8Var.a : 3, fh8Var.b, (i & 4) != 0 ? fh8Var.c : 3, fh8Var.d);
    }

    public final t37 b(boolean z) {
        int i = this.a;
        zg8 zg8Var = new zg8(i);
        if (i == -1) {
            zg8Var = null;
        }
        int i2 = zg8Var != null ? zg8Var.a : 0;
        Boolean bool = this.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        gh8 gh8Var = new gh8(i3);
        if (i3 == 0) {
            gh8Var = null;
        }
        int i4 = gh8Var != null ? gh8Var.a : 1;
        int i5 = this.d;
        s37 s37Var = i5 != -1 ? new s37(i5) : null;
        return new t37(z, i2, zBooleanValue, i4, s37Var != null ? s37Var.a : 1, b19.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh8)) {
            return false;
        }
        fh8 fh8Var = (fh8) obj;
        return this.a == fh8Var.a && wl7.b(this.b, fh8Var.b) && this.c == fh8Var.c && this.d == fh8Var.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        return w40.c(this.d, w40.c(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) zg8.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) gh8.a(this.c)) + ", imeAction=" + ((Object) s37.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }

    public fh8(int i, Boolean bool, int i2, int i3) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
    }
}
