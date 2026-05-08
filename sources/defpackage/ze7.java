package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ze7 extends mj8 implements Function1<pma, j6g> {
    final /* synthetic */ af7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze7(af7 af7Var) {
        super(1);
        this.this$0 = af7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(pma pmaVar) {
        pma pmaVar2 = pmaVar;
        pmaVar2.a();
        j4a<qug<pma>> j4aVar = this.this$0.d;
        qug<pma>[] qugVarArr = j4aVar.a;
        int i = j4aVar.c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (wl7.b(qugVarArr[i2], pmaVar2)) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            this.this$0.d.k(i2);
        }
        af7 af7Var = this.this$0;
        if (af7Var.d.c == 0) {
            af7Var.b.invoke();
        }
        return j6g.a;
    }
}
