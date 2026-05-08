package defpackage;

import com.google.android.gms.internal.measurement.zzev;
import defpackage.cyh;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uxh<T extends cyh<T>> {
    public static final uxh d = new uxh(0);
    public final d6i a;
    public boolean b;
    public boolean c;

    public uxh(int i) {
        int i2 = y5i.V;
        d6i d6iVar = new d6i(0);
        this.a = d6iVar;
        if (!this.b) {
            d6iVar.d();
            this.b = true;
        }
        if (this.b) {
            return;
        }
        d6iVar.d();
        this.b = true;
    }

    public static <T extends cyh<T>> boolean a(Map.Entry<T, Object> entry) {
        entry.getKey().zzc();
        throw null;
    }

    public static int c(Map.Entry<T, Object> entry) {
        zzev.d2(1);
        T key = entry.getKey();
        entry.getValue();
        key.zzc();
        throw null;
    }

    public final void b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (entry.getValue() instanceof b1i) {
            int i = b1i.c;
            throw new NoSuchMethodError();
        }
        key.zzd();
        throw null;
    }

    public final Object clone() {
        uxh uxhVar = new uxh();
        d6i d6iVar = this.a;
        if (d6iVar.b.size() > 0) {
            Map.Entry entryF = d6iVar.f(0);
            cyh cyhVar = (cyh) entryF.getKey();
            entryF.getValue();
            cyhVar.zzd();
            throw null;
        }
        Iterator it = d6iVar.h().iterator();
        if (!it.hasNext()) {
            uxhVar.c = this.c;
            return uxhVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        cyh cyhVar2 = (cyh) entry.getKey();
        entry.getValue();
        cyhVar2.zzd();
        throw null;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        boolean z = this.c;
        d6i d6iVar = this.a;
        if (!z) {
            return ((l7i) d6iVar.entrySet()).iterator();
        }
        Iterator it = ((l7i) d6iVar.entrySet()).iterator();
        f1i f1iVar = new f1i();
        f1iVar.a = it;
        return f1iVar;
    }

    public final boolean e() {
        d6i d6iVar = this.a;
        if (d6iVar.b.size() > 0) {
            a(d6iVar.f(0));
            throw null;
        }
        Iterator it = d6iVar.h().iterator();
        if (!it.hasNext()) {
            return true;
        }
        a((Map.Entry) it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uxh) {
            return this.a.equals(((uxh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public uxh() {
        this.a = new d6i(16);
    }
}
