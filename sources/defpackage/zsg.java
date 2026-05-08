package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsg {
    public static final hb9 a;

    public static final class a extends i7 {
        public static final a d = new a("inherited", false);
    }

    public static final class b extends i7 {
        public static final b d = new b("internal", false);
    }

    public static final class c extends i7 {
        public static final c d = new c("invisible_fake", false);
    }

    public static final class d extends i7 {
        public static final d d = new d("local", false);
    }

    public static final class e extends i7 {
        public static final e d = new e("private", false);
    }

    public static final class f extends i7 {
        public static final f d = new f("private_to_this", false);

        @Override // defpackage.i7
        public final String V() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends i7 {
        public static final g d = new g("protected", true);
    }

    public static final class h extends i7 {
        public static final h d = new h("public", true);
    }

    public static final class i extends i7 {
        public static final i d = new i("unknown", false);
    }

    static {
        hb9 hb9Var = new hb9();
        hb9Var.put(f.d, 0);
        hb9Var.put(e.d, 0);
        hb9Var.put(b.d, 1);
        hb9Var.put(g.d, 1);
        hb9Var.put(h.d, 2);
        a = hb9Var.j();
    }
}
