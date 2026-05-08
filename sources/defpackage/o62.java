package defpackage;

import defpackage.o7d;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class o62<T> implements x3b<T> {
    public final Function2<yd8<Object>, List<? extends zf8>, KSerializer<T>> a;
    public final p62<w3b<T>> b = new p62<>();

    /* JADX WARN: Multi-variable type inference failed */
    public o62(Function2<? super yd8<Object>, ? super List<? extends zf8>, ? extends KSerializer<T>> function2) {
        this.a = function2;
    }

    @Override // defpackage.x3b
    public final Object a(yd8 yd8Var, ArrayList arrayList) {
        Object aVar;
        w3b<T> w3bVar = this.b.get(jh2.p(yd8Var));
        w3bVar.getClass();
        e4a e4aVar = (e4a) w3bVar;
        T t = e4aVar.a.get();
        if (t == null) {
            synchronized (e4aVar) {
                t = e4aVar.a.get();
                if (t == null) {
                    t = (T) new w3b();
                    e4aVar.a = new SoftReference<>(t);
                }
            }
        }
        w3b w3bVar2 = t;
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new hg8((zf8) it.next()));
        }
        ConcurrentHashMap<List<hg8>, o7d<KSerializer<T>>> concurrentHashMap = w3bVar2.a;
        o7d<KSerializer<T>> o7dVar = concurrentHashMap.get(arrayList2);
        if (o7dVar == null) {
            try {
                aVar = (KSerializer) this.a.invoke(yd8Var, arrayList);
            } catch (Throwable th) {
                aVar = new o7d.a(th);
            }
            o7d<KSerializer<T>> o7dVar2 = new o7d<>(aVar);
            o7d<KSerializer<T>> o7dVarPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, o7dVar2);
            o7dVar = o7dVarPutIfAbsent == null ? o7dVar2 : o7dVarPutIfAbsent;
        }
        return o7dVar.b();
    }
}
