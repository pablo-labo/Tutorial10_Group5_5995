package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jk5<T> implements wi5 {
    public final /* synthetic */ luc<Object> a;

    public jk5(luc<Object> lucVar) {
        this.a = lucVar;
    }

    @Override // defpackage.wi5
    public final Object a(T t, lu2<? super j6g> lu2Var) {
        luc<Object> lucVar = this.a;
        if (lucVar.element == ewa.W) {
            lucVar.element = t;
            return j6g.a;
        }
        l5.q("Flow has more than one element");
        return null;
    }
}
