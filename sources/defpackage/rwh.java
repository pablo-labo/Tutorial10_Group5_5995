package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rwh {
    public static final rwh d = new rwh(0);
    public final q3i a = new q3i();
    public boolean b;
    public boolean c;

    public rwh(int i) {
        b();
        b();
    }

    public static boolean d(Map.Entry entry) {
        ((owh) entry.getKey()).zzc();
        throw null;
    }

    public static final int e(Map.Entry entry) {
        owh owhVar = (owh) entry.getKey();
        entry.getValue();
        owhVar.zzc();
        throw null;
    }

    public final Iterator a() {
        q3i q3iVar = this.a;
        return q3iVar.isEmpty() ? Collections.emptyIterator() : this.c ? new uzh(((j4i) q3iVar.entrySet()).iterator()) : ((j4i) q3iVar.entrySet()).iterator();
    }

    public final void b() {
        if (this.b) {
            return;
        }
        q3i q3iVar = this.a;
        int i = q3iVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = q3iVar.f(i2).b;
            if (obj instanceof oyh) {
                ((oyh) obj).h();
            }
        }
        Iterator it = q3iVar.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof oyh) {
                ((oyh) value).h();
            }
        }
        q3iVar.a();
        this.b = true;
    }

    public final boolean c() {
        q3i q3iVar = this.a;
        if (q3iVar.b > 0) {
            d(q3iVar.f(0));
            throw null;
        }
        Iterator it = q3iVar.b().iterator();
        if (!it.hasNext()) {
            return true;
        }
        d((Map.Entry) it.next());
        throw null;
    }

    public final Object clone() {
        rwh rwhVar = new rwh();
        q3i q3iVar = this.a;
        if (q3iVar.b > 0) {
            ((owh) q3iVar.f(0).a).zze();
            throw null;
        }
        Iterator it = q3iVar.b().iterator();
        if (!it.hasNext()) {
            rwhVar.c = this.c;
            return rwhVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        owh owhVar = (owh) entry.getKey();
        entry.getValue();
        owhVar.zze();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rwh) {
            return this.a.equals(((rwh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public rwh() {
    }
}
