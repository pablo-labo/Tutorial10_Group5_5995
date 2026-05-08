package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z2i implements a3i {
    @Override // defpackage.a3i
    public final boolean a(Object obj) {
        return !((u2i) obj).h();
    }

    @Override // defpackage.a3i
    public final u2i b(Object obj) {
        return (u2i) obj;
    }

    @Override // defpackage.a3i
    /* JADX INFO: renamed from: c */
    public final void mo0c(Object obj, Object obj2) {
        u2i u2iVar = (u2i) obj;
        if (u2iVar.isEmpty()) {
            return;
        }
        Iterator it = u2iVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
    }

    @Override // defpackage.a3i
    public final u2i zza(Object obj) {
        return (u2i) obj;
    }

    @Override // defpackage.a3i
    public final void zzb(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.a3i
    public final Object zze(Object obj) {
        ((u2i) obj).g();
        return obj;
    }

    @Override // defpackage.a3i
    public final u2i zzf() {
        return u2i.a.f();
    }

    @Override // defpackage.a3i
    public final u2i c(Object obj, Object obj2) {
        u2i u2iVarF = (u2i) obj;
        u2i u2iVar = (u2i) obj2;
        if (!u2iVar.isEmpty()) {
            if (!u2iVarF.h()) {
                u2iVarF = u2iVarF.f();
            }
            u2iVarF.i();
            if (!u2iVar.isEmpty()) {
                u2iVarF.putAll(u2iVar);
            }
        }
        return u2iVarF;
    }
}
