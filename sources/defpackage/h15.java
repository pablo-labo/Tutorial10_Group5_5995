package defpackage;

import defpackage.l9c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h15 extends mj8 implements Function1<wpe, l9c<List<Object>>> {
    final /* synthetic */ i15<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h15(b9c b9cVar) {
        super(1);
        this.this$0 = b9cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final l9c<List<Object>> invoke(wpe wpeVar) {
        wpe wpeVar2 = wpeVar;
        wpeVar2.getClass();
        ArrayList arrayList = new ArrayList();
        while (((Boolean) wpeVar2.next().b).booleanValue()) {
            arrayList.add(this.this$0.a.invoke(wpeVar2));
        }
        return new l9c.b(arrayList);
    }
}
