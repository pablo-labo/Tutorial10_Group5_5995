package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n8i {
    public static final g8i a;
    public static final q8i b;

    static {
        g8i g8iVar = null;
        try {
            g8iVar = (g8i) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = g8iVar;
        b = new q8i();
    }
}
