package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ehh extends shh {
    public final transient shh f;

    public ehh(shh shhVar) {
        super(1);
        this.f = shhVar;
    }

    @Override // defpackage.shh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        shh shhVar = this.f;
        qki.a(i, shhVar.size());
        return shhVar.get((shhVar.size() - 1) - i);
    }

    @Override // defpackage.shh, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r1.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.shh
    public final shh j() {
        return this.f;
    }

    @Override // defpackage.shh, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final shh subList(int i, int i2) {
        shh shhVar = this.f;
        qki.b(i, i2, shhVar.size());
        return shhVar.subList(shhVar.size() - i2, shhVar.size() - i).j();
    }

    @Override // defpackage.shh, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r1.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.size();
    }
}
