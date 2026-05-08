package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c4e implements zu5 {
    public final /* synthetic */ j4e a;

    public /* synthetic */ c4e(j4e j4eVar) {
        this.a = j4eVar;
    }

    @Override // defpackage.zu5
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        sl8 sl8Var = (sl8) obj2;
        long j = ((ooa) obj3).a;
        j4e j4eVar = this.a;
        long jB = j4eVar.b(sl8Var, j);
        long jB2 = j4eVar.b(sl8Var, ((ooa) obj4).a);
        j4eVar.l(zBooleanValue);
        return Boolean.valueOf(j4eVar.o(jB, jB2, ((Boolean) obj5).booleanValue(), (u2e) obj6));
    }
}
