package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s80 extends mj8 implements Function1<e13, af7> {
    final /* synthetic */ ncb $request;
    final /* synthetic */ u80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(ncb ncbVar, u80 u80Var) {
        super(1);
        this.$request = ncbVar;
        this.this$0 = u80Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final af7 invoke(e13 e13Var) {
        return new af7(this.$request, new r80(this.this$0));
    }
}
