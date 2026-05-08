package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bkh extends gkh {
    public final transient gkh c;

    public bkh(gkh gkhVar) {
        this.c = gkhVar;
    }

    @Override // defpackage.gkh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // defpackage.gkh
    public final gkh f() {
        return this.c;
    }

    @Override // defpackage.gkh, java.util.List
    /* JADX INFO: renamed from: g */
    public final gkh subList(int i, int i2) {
        gkh gkhVar = this.c;
        zih.b(i, i2, gkhVar.size());
        return gkhVar.subList(gkhVar.size() - i2, gkhVar.size() - i).f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        gkh gkhVar = this.c;
        zih.a(i, gkhVar.size());
        return gkhVar.get((gkhVar.size() - 1) - i);
    }

    @Override // defpackage.gkh, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r1.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.gkh, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.c.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r1.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
