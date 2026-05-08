package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kai {
    public static final p9i a;
    public static final m9i b;

    static {
        p9i p9iVar = null;
        try {
            p9iVar = (p9i) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = p9iVar;
        b = new m9i();
    }
}
