package androidx.navigation;

import defpackage.h5;
import defpackage.o6;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final r<Object> a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    public static final class a {
        public r<Object> a;
        public boolean b;
        public Object c;
        public boolean d;
        public boolean e;

        /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.navigation.b a() {
            /*
                Method dump skipped, instruction units count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.b.a.a():androidx.navigation.b");
        }
    }

    public b(r<Object> rVar, boolean z, Object obj, boolean z2, boolean z3) {
        if (!rVar.a && z) {
            h5.k(rVar.b().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            o6.m("Argument with type ", rVar.b(), " has null value but is not nullable.");
            throw null;
        }
        this.a = rVar;
        this.b = z;
        this.e = obj;
        this.c = z2 || z3;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !b.class.equals(obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b != bVar.b || this.c != bVar.c || !this.a.equals(bVar.a)) {
            return false;
        }
        Object obj2 = bVar.e;
        Object obj3 = this.e;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b.class.getSimpleName());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.e);
        }
        return sb.toString();
    }
}
