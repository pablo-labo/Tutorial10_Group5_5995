package defpackage;

import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;

/* JADX INFO: loaded from: classes.dex */
public final class rb9 {
    public static final w a;
    public static final x b;

    static {
        w wVar = null;
        try {
            wVar = (w) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = wVar;
        b = new x();
    }
}
