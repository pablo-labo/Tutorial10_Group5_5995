package defpackage;

import defpackage.v03;
import kotlin.jvm.functions.Function1;
import v03.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r1<B extends v03.a, E extends B> implements v03.b<E> {
    public final Function1<v03.a, E> a;
    public final v03.b<?> b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [v03$b<?>] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1<? super v03$a, ? extends E extends B>, kotlin.jvm.functions.Function1<v03$a, E extends B>] */
    public r1(v03.b<B> bVar, Function1<? super v03.a, ? extends E> function1) {
        bVar.getClass();
        this.a = function1;
        this.b = bVar instanceof r1 ? (v03.b<B>) ((r1) bVar).b : bVar;
    }
}
