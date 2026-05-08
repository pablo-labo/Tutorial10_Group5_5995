package defpackage;

import defpackage.a5i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m3i {
    public static volatile m3i b;
    public static final m3i c;
    public final Map<a, a5i.c<?, ?>> a;

    public static final class a {
        public final Object a;
        public final int b;

        public a(x8i x8iVar, int i) {
            this.a = x8iVar;
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
            Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        c = new m3i(0);
    }

    public m3i() {
        this.a = new HashMap();
    }

    public static m3i a() {
        m3i m3iVar;
        m3i m3iVar2 = b;
        if (m3iVar2 != null) {
            return m3iVar2;
        }
        synchronized (m3i.class) {
            try {
                m3iVar = b;
                if (m3iVar == null) {
                    Class<?> cls = k3i.a;
                    if (cls != null) {
                        try {
                            m3iVar = (m3i) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                            m3iVar = c;
                        }
                        b = m3iVar;
                    } else {
                        m3iVar = c;
                        b = m3iVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m3iVar;
    }

    public m3i(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
