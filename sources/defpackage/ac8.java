package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
public final class ac8 extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bc8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac8(bc8 bc8Var, x81 x81Var) {
        super(x81Var);
        this.this$0 = bc8Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return bc8.a(this.this$0, null, this);
    }
}
