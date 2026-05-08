package defpackage;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class n62<T> implements d8e<T> {
    public final Function1<yd8<?>, KSerializer<T>> a;
    public final p62<ht1<T>> b = new p62<>();

    /* JADX WARN: Multi-variable type inference failed */
    public n62(Function1<? super yd8<?>, ? extends KSerializer<T>> function1) {
        this.a = function1;
    }

    @Override // defpackage.d8e
    public final KSerializer<T> a(yd8<Object> yd8Var) {
        ht1<T> ht1Var = this.b.get(jh2.p(yd8Var));
        ht1Var.getClass();
        e4a e4aVar = (e4a) ht1Var;
        T t = e4aVar.a.get();
        if (t == null) {
            synchronized (e4aVar) {
                t = e4aVar.a.get();
                if (t == null) {
                    t = (T) new ht1(this.a.invoke(yd8Var));
                    e4aVar.a = new SoftReference<>(t);
                }
            }
        }
        return t.a;
    }
}
