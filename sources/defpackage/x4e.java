package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x4e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> extends mj8 implements gu5<T> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(w4e w4eVar, r5e<T> r5eVar) {
        T t = (T) w4eVar.a.d(r5eVar);
        return t == null ? a.a.invoke() : t;
    }
}
