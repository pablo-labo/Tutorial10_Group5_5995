package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k4i {
    public static final r3i a = new r3i();
    public static final t3i<?> b;

    static {
        t3i<?> t3iVar = null;
        try {
            t3iVar = (t3i) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = t3iVar;
    }
}
