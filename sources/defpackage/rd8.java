package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rd8 {
    public static final c a = new c(md8.BOOLEAN);
    public static final c b = new c(md8.CHAR);
    public static final c c = new c(md8.BYTE);
    public static final c d = new c(md8.SHORT);
    public static final c e = new c(md8.INT);
    public static final c f = new c(md8.FLOAT);
    public static final c g = new c(md8.LONG);
    public static final c h = new c(md8.DOUBLE);

    public static final class a extends rd8 {
        public final rd8 i;

        public a(rd8 rd8Var) {
            rd8Var.getClass();
            this.i = rd8Var;
        }
    }

    public static final class b extends rd8 {
        public final String i;

        public b(String str) {
            this.i = str;
        }
    }

    public static final class c extends rd8 {
        public final md8 i;

        public c(md8 md8Var) {
            this.i = md8Var;
        }
    }

    public final String toString() {
        return sd8.b(this);
    }
}
