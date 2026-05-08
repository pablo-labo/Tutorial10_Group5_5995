package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r45 {
    public static final Class<?> a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
