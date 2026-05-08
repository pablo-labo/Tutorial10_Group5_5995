package defpackage;

import defpackage.qn2;
import org.apache.avro.reflect.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class pn2 extends qn2<Object, Object>.n<Object> {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn2(qn2.o[] oVarArr, boolean z, Object obj) {
        super(oVarArr);
        this.b = z;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [V, java.lang.Object] */
    @Override // qn2.n
    @Nullable
    public final Object b(@Nullable qn2.h hVar, @Nullable qn2.e eVar, @Nullable rn2 rn2Var) {
        if (eVar != null) {
            V v = eVar.b;
            if (this.b) {
                eVar.b = this.c;
            }
            return v;
        }
        if (rn2Var != null) {
            qn2.l.a(rn2Var.a, rn2Var.b, rn2Var.c, rn2Var.d, rn2Var.e, this.c);
            return null;
        }
        r6.g("No entries segment");
        return null;
    }
}
