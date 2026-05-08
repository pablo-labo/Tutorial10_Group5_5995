package defpackage;

import defpackage.ly8;

/* JADX INFO: loaded from: classes3.dex */
public final class my8 extends mj8 implements gu5<Boolean> {
    final /* synthetic */ ly8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my8(ly8 ly8Var) {
        super(0);
        this.this$0 = ly8Var;
    }

    @Override // defpackage.gu5
    public final Boolean invoke() {
        boolean z;
        ly8 ly8Var = this.this$0;
        ly8Var.getClass();
        if (ly8.a.a(ly8Var)) {
            z = true;
            break;
        }
        for (y yVar : ly8Var.e) {
            if (wl7.b(yVar.getType(), pg8.e) && ly8.a.a(yVar)) {
                z = true;
                break;
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
