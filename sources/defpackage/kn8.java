package defpackage;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.i;

/* JADX INFO: loaded from: classes.dex */
public class kn8 {
    public volatile sp9 a;
    public volatile tr1 b;

    static {
        i.a();
    }

    public final sp9 a(sp9 sp9Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = sp9Var;
                        this.b = tr1.a;
                    } catch (InvalidProtocolBufferException unused) {
                        this.a = sp9Var;
                        this.b = tr1.a;
                    }
                }
            }
        }
        return this.a;
    }
}
