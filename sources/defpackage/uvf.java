package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uvf implements qvf {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ pvf c;

    public uvf(Class cls, Class cls2, pvf pvfVar) {
        this.a = cls;
        this.b = cls2;
        this.c = pvfVar;
    }

    @Override // defpackage.qvf
    public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
        Class<? super T> cls = iyfVar.a;
        if (cls == this.a || cls == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[type=");
        u40.k(this.b, sb, "+");
        u40.k(this.a, sb, ",adapter=");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
