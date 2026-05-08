package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagemanipulator.ManipulatorTask", f = "ImageManipulatorContext.kt", l = {65}, m = "render")
public final class ab9 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bb9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab9(bb9 bb9Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = bb9Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
