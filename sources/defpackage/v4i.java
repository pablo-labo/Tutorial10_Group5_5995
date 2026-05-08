package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v4i {
    public static final t4i a;
    public static final z4i b;

    static {
        t4i t4iVar = null;
        try {
            t4iVar = (t4i) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = t4iVar;
        b = new z4i();
    }
}
