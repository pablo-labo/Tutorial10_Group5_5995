package defpackage;

import defpackage.xz8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s2a extends mj8 implements Function1<yb2, yb2> {
    final /* synthetic */ boolean $remote = false;
    final /* synthetic */ xz8 $state = xz8.c.c;
    final /* synthetic */ zz8 $type;
    final /* synthetic */ t2a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2a(zz8 zz8Var, t2a t2aVar) {
        super(1);
        this.$type = zz8Var;
        this.this$0 = t2aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final yb2 invoke(yb2 yb2Var) {
        yz8 yz8VarB;
        yb2 yb2Var2 = yb2Var;
        if (yb2Var2 == null || (yz8VarB = yb2Var2.d) == null) {
            yz8VarB = yz8.d;
        }
        yz8 yz8VarB2 = yb2Var2 != null ? yb2Var2.e : null;
        if (this.$remote) {
            yz8VarB2 = yz8.d.b(this.$type, this.$state);
        } else {
            yz8VarB = yz8VarB.b(this.$type, this.$state);
        }
        return t2a.a(this.this$0, yb2Var2, yz8VarB, yz8VarB2);
    }
}
