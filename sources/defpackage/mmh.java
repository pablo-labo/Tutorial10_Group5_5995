package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mmh extends s7h {
    public boolean b;
    public final /* synthetic */ Object c;

    public mmh(Object obj) {
        super(1);
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            k20.p();
            return null;
        }
        this.b = true;
        return this.c;
    }
}
