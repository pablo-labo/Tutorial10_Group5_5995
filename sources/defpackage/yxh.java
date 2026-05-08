package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yxh {
    public static final pxh a = new pxh();
    public static final qxh<?> b;

    static {
        qxh<?> qxhVar = null;
        try {
            qxhVar = (qxh) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = qxhVar;
    }
}
