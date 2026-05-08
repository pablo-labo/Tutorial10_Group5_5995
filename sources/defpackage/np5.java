package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface np5<C> {

    public static final class a<C> implements np5<C> {
        public static final a b = new a("TEXT_MAP_INJECT");
        public static final a c = new a("TEXT_MAP_EXTRACT");
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final String toString() {
            return a.class.getSimpleName() + "." + this.a;
        }
    }
}
