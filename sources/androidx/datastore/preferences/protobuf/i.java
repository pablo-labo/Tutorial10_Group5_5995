package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.n;
import defpackage.r45;
import defpackage.sp9;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static volatile i b;
    public static final i c;
    public final Map<a, n.e<?, ?>> a;

    public static final class a {
        public final Object a;
        public final int b;

        public a(int i, sp9 sp9Var) {
            this.a = sp9Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        c = new i(0);
    }

    public i() {
        this.a = new HashMap();
    }

    public static i a() {
        i iVar;
        i iVar2 = b;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (i.class) {
            try {
                iVar = b;
                if (iVar == null) {
                    Class<?> cls = r45.a;
                    if (cls != null) {
                        try {
                            iVar = (i) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                            iVar = c;
                        }
                        b = iVar;
                    } else {
                        iVar = c;
                        b = iVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public i(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
