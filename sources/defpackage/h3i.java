package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h3i {
    public static final a3i a;
    public static final z2i b;

    static {
        a3i a3iVar = null;
        try {
            a3iVar = (a3i) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = a3iVar;
        b = new z2i();
    }
}
