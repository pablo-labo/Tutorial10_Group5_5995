package defpackage;

import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rv5 {
    public final mq5 a;
    public final String b;

    public static final class a extends rv5 {
        public static final a c = new a(ere.l, "Function");
    }

    public static final class b extends rv5 {
        public static final b c = new b(ere.i, "KFunction");
    }

    public static final class c extends rv5 {
        public static final c c = new c(ere.i, "KSuspendFunction");
    }

    public static final class d extends rv5 {
        public static final d c = new d(ere.f, "SuspendFunction");
    }

    public rv5(mq5 mq5Var, String str) {
        mq5Var.getClass();
        this.a = mq5Var;
        this.b = str;
    }

    public final n8a a(int i) {
        return n8a.h(this.b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(JwtParser.SEPARATOR_CHAR);
        return w40.f(sb, this.b, 'N');
    }
}
