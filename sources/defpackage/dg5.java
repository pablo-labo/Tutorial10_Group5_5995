package defpackage;

import defpackage.z9e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dg5 {
    public static final dg5 a = new dg5();
    public static final Map<z9e.a, a> b = Collections.synchronizedMap(new LinkedHashMap());

    public static final class a {
        public final a5a a;
        public x23 b = null;

        public a(a5a a5aVar) {
            this.a = a5aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a == aVar.a && wl7.b(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            x23 x23Var = this.b;
            return iHashCode + (x23Var == null ? 0 : x23Var.hashCode());
        }

        public final String toString() {
            return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
        }
    }

    public static a a(z9e.a aVar) {
        Map<z9e.a, a> map = b;
        map.getClass();
        a aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        n6.d("Cannot get dependency ", aVar, ". Dependencies should be added at class load time.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad A[Catch: all -> 0x00c6, TRY_ENTER, TryCatch #0 {all -> 0x00c6, blocks: (B:21:0x009a, B:24:0x00ad, B:25:0x00c5), top: B:30:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:30:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.pu2 r9) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg5.b(pu2):java.lang.Object");
    }
}
