package defpackage;

import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k;

/* JADX INFO: loaded from: classes.dex */
public final class t45 {
    public static final k a = new k();
    public static final j<?> b;

    static {
        j<?> jVar = null;
        try {
            jVar = (j) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = jVar;
    }
}
