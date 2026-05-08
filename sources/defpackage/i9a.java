package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class i9a extends mj8 implements Function1<p9a, j6g> {
    final /* synthetic */ g9a $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9a(g9a g9aVar) {
        super(1);
        this.$event = g9aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(p9a p9aVar) {
        p9a p9aVar2 = p9aVar;
        p9aVar2.getClass();
        p9aVar2.a = Long.valueOf(this.$event.f);
        p9aVar2.b = Long.valueOf(this.$event.g);
        p9aVar2.c = Long.valueOf(this.$event.h);
        p9aVar2.d = web.C(this.$event.i);
        p9aVar2.e = Long.valueOf(this.$event.j);
        p9aVar2.f = Long.valueOf(this.$event.k);
        return j6g.a;
    }
}
