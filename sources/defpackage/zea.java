package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zea extends mj8 implements Function1<Object, Boolean> {
    final /* synthetic */ luc<Object> $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zea(luc<Object> lucVar) {
        super(1);
        this.$node = lucVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, jtf, ts3] */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        boolean z;
        ?? r2 = (jtf) obj;
        if (r2.k().c0) {
            this.$node.element = r2;
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
