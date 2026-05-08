package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aod {
    public final String a;
    public final bod b;

    public static final class a extends aod {
        public static final a c = new a("Analyzing Job", bod.a);
    }

    public static final class b extends aod {
        public static final b c = new b("Applied", bod.c);
    }

    public static final class c extends aod {
        public static final c c = new c("Auto apply failed", bod.d);
    }

    public static final class d extends aod {
        public static final d c = new d("Filling out application", bod.a);
    }

    public static final class e extends aod {
        public static final e c = new e("Missing required info", bod.b);
    }

    public static final class f extends aod {
        public static final f c = new f("Not Started", bod.a);
    }

    public static final class g extends aod {
        public static final g c = new g("Ready to review", bod.c);
    }

    public static final class h extends aod {
        public static final h c = new h("Submission failed", bod.d);
    }

    public static final class i extends aod {
        public static final i c = new i("Submitting application", bod.a);
    }

    public aod(String str, bod bodVar) {
        this.a = str;
        this.b = bodVar;
    }
}
