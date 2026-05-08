package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t05 implements d65<z21> {

    public static final class a {
        public static final t05 a = new t05();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        z21 z21Var = z21.f;
        if (z21Var != null) {
            return z21Var;
        }
        ja.k("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }
}
