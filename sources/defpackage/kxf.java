package defpackage;

import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kxf implements Function1 {
    public static final kxf b = new kxf(0);
    public final /* synthetic */ int a;

    public kxf(a5 a5Var) {
        this.a = 1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection<ui8> collectionB;
        switch (this.a) {
            case 0:
                d4c d4cVar = (d4c) obj;
                d4cVar.getClass();
                return d4cVar;
            case 1:
                kwf kwfVar = (kwf) obj;
                kwfVar.getClass();
                a5 a5Var = kwfVar instanceof a5 ? (a5) kwfVar : null;
                if (a5Var != null) {
                    collectionB = z92.h1(a5Var.b.invoke().a, a5Var.i(false));
                } else {
                    collectionB = kwfVar.b();
                    collectionB.getClass();
                }
                return collectionB;
            default:
                return (hv1) obj;
        }
    }

    public /* synthetic */ kxf(int i) {
        this.a = i;
    }
}
