package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class mrb extends mj8 implements Function1<String, j6g> {
    final /* synthetic */ nrb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrb(nrb nrbVar) {
        super(1);
        this.this$0 = nrbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(String str) {
        String str2 = str;
        str2.getClass();
        gua guaVar = this.this$0.b;
        if (guaVar != null) {
            guaVar.e.j(str2);
            return j6g.a;
        }
        wl7.g("viewModel");
        throw null;
    }
}
