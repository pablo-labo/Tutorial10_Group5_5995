package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class w21 extends m63 {
    public final Context a;
    public final b82 b;
    public final b82 c;
    public final String d;

    public w21(Context context, b82 b82Var, b82 b82Var2, String str) {
        if (context == null) {
            ja.k("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (b82Var == null) {
            ja.k("Null wallClock");
            throw null;
        }
        this.b = b82Var;
        if (b82Var2 == null) {
            ja.k("Null monotonicClock");
            throw null;
        }
        this.c = b82Var2;
        if (str != null) {
            this.d = str;
        } else {
            ja.k("Null backendName");
            throw null;
        }
    }

    @Override // defpackage.m63
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.m63
    public final String b() {
        return this.d;
    }

    @Override // defpackage.m63
    public final b82 c() {
        return this.c;
    }

    @Override // defpackage.m63
    public final b82 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m63)) {
            return false;
        }
        m63 m63Var = (m63) obj;
        return this.a.equals(m63Var.a()) && this.b.equals(m63Var.d()) && this.c.equals(m63Var.c()) && this.d.equals(m63Var.b());
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return l6.i(sb, this.d, "}");
    }
}
