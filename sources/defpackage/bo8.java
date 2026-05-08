package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bo8 extends jo8 {
    public final /* synthetic */ gg1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo8(gg1 gg1Var, int i, int i2, ao8 ao8Var, no8 no8Var) {
        super(gg1Var, i, i2, ao8Var, no8Var);
        this.f = gg1Var;
    }

    @Override // defpackage.jo8
    public final io8 b(int i, ho8[] ho8VarArr, List<ld6> list, int i2) {
        return new io8(i, ho8VarArr, this.f, list, i2);
    }
}
