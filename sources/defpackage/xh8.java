package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface xh8 {

    public static final class a {
        public static vh8 a() {
            vh8 vh8Var = web.d;
            if (vh8Var != null) {
                return vh8Var;
            }
            r6.g("KoinApplication has not been started");
            return null;
        }
    }

    vh8 getKoin();
}
