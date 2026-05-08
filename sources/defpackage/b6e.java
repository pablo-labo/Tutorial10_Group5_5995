package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b6e extends qv5 implements Function2<Long, e6e, e6e> {
    public static final b6e a = new b6e(2, d6e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final e6e invoke(Long l, e6e e6eVar) {
        int i = d6e.a;
        return new e6e(l.longValue(), e6eVar, 0);
    }
}
