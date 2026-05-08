package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xld implements uld<Object, Object> {
    public final /* synthetic */ Function2<vld, Object, Object> a;
    public final /* synthetic */ Function1<Object, Object> b;

    /* JADX WARN: Multi-variable type inference failed */
    public xld(Function2<? super vld, Object, Object> function2, Function1<Object, Object> function1) {
        this.a = function2;
        this.b = function1;
    }

    @Override // defpackage.uld
    public final Object a(vld vldVar, Object obj) {
        return this.a.invoke(vldVar, obj);
    }

    @Override // defpackage.uld
    public final Object b(Object obj) {
        return this.b.invoke(obj);
    }
}
