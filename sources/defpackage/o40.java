package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class o40 extends mj8 implements xu5<Integer, Integer, Integer, Integer, j6g> {
    final /* synthetic */ int $semanticsId;
    final /* synthetic */ q40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(q40 q40Var, int i) {
        super(4);
        this.this$0 = q40Var;
        this.$semanticsId = i;
    }

    @Override // defpackage.xu5
    public final j6g j(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        q40 q40Var = this.this$0;
        abb abbVar = q40Var.a;
        abbVar.a.notifyViewEntered(q40Var.c, this.$semanticsId, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return j6g.a;
    }
}
