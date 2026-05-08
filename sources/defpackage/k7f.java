package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k7f {
    public final String a;

    public static final class a extends k7f {
        public static final a b = new a("applied");
    }

    public static final class b extends k7f {
        public static final b b = new b("archived");
    }

    public static final class c extends k7f {
        public static final c b = new c("interviews");
    }

    public static final class d extends k7f {
        public static final d b = new d("invitations");
    }

    public static final class e extends k7f {
        public static final e b = new e("saved");
    }

    public k7f(String str) {
        this.a = str;
    }
}
