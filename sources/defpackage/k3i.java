package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k3i {
    public static final Class<?> a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
