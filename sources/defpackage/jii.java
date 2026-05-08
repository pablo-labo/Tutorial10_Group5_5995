package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class jii {
    public final String a;
    public final String b;
    public final boolean c;

    public jii(String str, boolean z) {
        fib.f(str);
        this.a = str;
        fib.f("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jii)) {
            return false;
        }
        jii jiiVar = (jii) obj;
        return xna.a(this.a, jiiVar.a) && xna.a(this.b, jiiVar.b) && xna.a(null, null) && this.c == jiiVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        fib.i(null);
        throw null;
    }
}
