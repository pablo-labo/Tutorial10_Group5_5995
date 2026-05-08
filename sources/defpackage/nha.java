package defpackage;

import androidx.datastore.preferences.protobuf.b0;

/* JADX INFO: loaded from: classes.dex */
public final class nha {
    public static final mha a;
    public static final b0 b;

    static {
        mha mhaVar = null;
        try {
            mhaVar = (mha) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = mhaVar;
        b = new b0();
    }
}
