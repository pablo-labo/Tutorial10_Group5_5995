package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class h9a extends mj8 implements Function1<o9a, j6g> {
    final /* synthetic */ g9a $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9a(g9a g9aVar) {
        super(1);
        this.$event = g9aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(o9a o9aVar) {
        o9a o9aVar2 = o9aVar;
        o9aVar2.getClass();
        o9aVar2.a = Long.valueOf(this.$event.c);
        o9aVar2.b = Long.valueOf(this.$event.d);
        this.$event.getClass();
        o9aVar2.c = 0L;
        String str = this.$event.e;
        o9aVar2.d = str == null ? null : web.C(str);
        return j6g.a;
    }
}
