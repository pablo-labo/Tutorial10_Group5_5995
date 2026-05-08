package defpackage;

import defpackage.kza;

/* JADX INFO: loaded from: classes.dex */
public final class b2a extends mj8 implements gu5<kza.b<Object>> {
    final /* synthetic */ c2a<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2a(c2a<Object> c2aVar) {
        super(0);
        this.this$0 = c2aVar;
    }

    @Override // defpackage.gu5
    public final kza.b<Object> invoke() {
        kza kzaVar = (kza) z92.Q0(this.this$0.c.a.a.b());
        if (kzaVar == null || !(kzaVar instanceof kza.b)) {
            return null;
        }
        kza.b<Object> bVar = (kza.b) kzaVar;
        if (bVar.a == zz8.a) {
            return bVar;
        }
        return null;
    }
}
