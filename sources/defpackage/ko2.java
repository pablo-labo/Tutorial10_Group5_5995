package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ko2 implements uld {
    public Object a;
    public Object b;

    public ko2(int i) {
        gse gseVarE = hh2.e(new Pair(Integer.MIN_VALUE, null));
        this.a = gseVarE;
        this.b = new jo2(gseVarE);
    }

    @Override // defpackage.uld
    public Object a(vld vldVar, Object obj) {
        return ((Function2) this.a).invoke(vldVar, obj);
    }

    @Override // defpackage.uld
    public Object b(Object obj) {
        return ((Function1) this.b).invoke(obj);
    }

    public void c(Boolean bool) {
        gse gseVar = (gse) this.a;
        Pair pair = new Pair(Integer.valueOf(((Number) ((Pair) gseVar.getValue()).d()).intValue() + 1), bool);
        gseVar.getClass();
        gseVar.m(null, pair);
    }

    public ko2(Function2 function2, Function1 function1) {
        this.a = function2;
        this.b = function1;
    }
}
