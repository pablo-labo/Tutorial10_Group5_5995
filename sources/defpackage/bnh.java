package defpackage;

import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bnh extends AbstractMap<String, Object> {
    public final Object a;
    public final xmh b;

    public bnh(Object obj, boolean z) {
        this.a = obj;
        xmh xmhVarA = xmh.a(obj.getClass(), z);
        this.b = xmhVarA;
        if (xmhVarA.a.isEnum()) {
            o6.h();
            throw null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set entrySet() {
        return new znh(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        hoh hohVarB;
        if ((obj instanceof String) && (hohVarB = this.b.b((String) obj)) != null) {
            return hoh.a(this.a, hohVarB.b);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        hoh hohVarB = this.b.b(str);
        String strValueOf = String.valueOf(str);
        String strConcat = strValueOf.length() != 0 ? "no field of key ".concat(strValueOf) : new String("no field of key ");
        if (hohVarB == null) {
            ja.k(strConcat);
            return null;
        }
        Field field = hohVarB.b;
        Object obj3 = this.a;
        Object objA = hoh.a(obj3, field);
        obj2.getClass();
        hohVarB.c(obj3, obj2);
        return objA;
    }
}
