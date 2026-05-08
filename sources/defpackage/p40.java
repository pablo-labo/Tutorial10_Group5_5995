package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p40 extends mj8 implements xu5<Integer, Integer, Integer, Integer, j6g> {
    final /* synthetic */ y4e $semanticsInfo;
    final /* synthetic */ q40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(q40 q40Var, pm8 pm8Var) {
        super(4);
        this.this$0 = q40Var;
        this.$semanticsInfo = pm8Var;
    }

    @Override // defpackage.xu5
    public final j6g j(Integer num, Integer num2, Integer num3, Integer num4) {
        this.this$0.f.set(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        q40 q40Var = this.this$0;
        abb abbVar = q40Var.a;
        abbVar.a.requestAutofill(q40Var.c, this.$semanticsInfo.b(), this.this$0.f);
        return j6g.a;
    }
}
