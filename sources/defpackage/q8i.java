package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q8i implements g8i {
    @Override // defpackage.g8i
    public final void a() {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.g8i
    public final j8i b() {
        return j8i.a.g();
    }

    @Override // defpackage.g8i
    public final Object c(Object obj) {
        ((j8i) obj).f();
        return obj;
    }

    @Override // defpackage.g8i
    public final boolean d(Object obj) {
        return !((j8i) obj).d();
    }

    @Override // defpackage.g8i
    public final j8i e(Object obj) {
        return (j8i) obj;
    }

    @Override // defpackage.g8i
    public final j8i f(Object obj) {
        return (j8i) obj;
    }

    @Override // defpackage.g8i
    public final j8i zzd(Object obj, Object obj2) {
        j8i j8iVarG = (j8i) obj;
        j8i j8iVar = (j8i) obj2;
        if (!j8iVar.isEmpty()) {
            if (!j8iVarG.d()) {
                j8iVarG = j8iVarG.g();
            }
            j8iVarG.h();
            if (!j8iVar.isEmpty()) {
                j8iVarG.putAll(j8iVar);
            }
        }
        return j8iVarG;
    }
}
