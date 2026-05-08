package defpackage;

import defpackage.cx5;
import defpackage.hpd;
import java.util.function.Function;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dx5 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dx5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bx5 bx5Var = ((cx5.b) obj2).c;
                return bx5Var.a.b(((cx5.a) obj).a);
            default:
                hpd.a aVar = (hpd.a) obj2;
                g gVar = (g) obj;
                aVar.getClass();
                ppd.a(aVar, gVar);
                return aVar.b.get(gVar);
        }
    }
}
