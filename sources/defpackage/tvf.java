package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tvf implements qvf {
    public final /* synthetic */ Class a;
    public final /* synthetic */ pvf b;

    public tvf(Class cls, pvf pvfVar) {
        this.a = cls;
        this.b = pvfVar;
    }

    @Override // defpackage.qvf
    public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
        if (iyfVar.a == this.a) {
            return this.b;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[type=");
        u40.k(this.a, sb, ",adapter=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }
}
