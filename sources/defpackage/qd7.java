package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qd7 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final <T extends brg> void a(yd8<T> yd8Var, Function1<? super p63, ? extends T> function1) {
        yd8Var.getClass();
        function1.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(yd8Var)) {
            g7.m("A `initializer` with the same `clazz` has already been added: ", 46, yd8Var.p());
        } else {
            linkedHashMap.put(yd8Var, new drg(yd8Var, function1));
        }
    }

    public final pd7 b() {
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        drg[] drgVarArr = (drg[]) collectionValues.toArray(new drg[0]);
        return new pd7((drg[]) Arrays.copyOf(drgVarArr, drgVarArr.length));
    }
}
