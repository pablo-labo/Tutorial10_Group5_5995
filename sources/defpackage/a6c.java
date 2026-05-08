package defpackage;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.z;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a6c {
    public static final a6c c = new a6c();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final wa9 a = new wa9();

    public final <T> uod<T> a(Class<T> cls) {
        uod<T> uodVarW;
        Class<?> cls2;
        p.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        uod<T> uodVar = (uod) concurrentHashMap.get(cls);
        if (uodVar != null) {
            return uodVar;
        }
        wa9 wa9Var = this.a;
        wa9Var.getClass();
        Class<?> cls3 = e0.a;
        if (!n.class.isAssignableFrom(cls) && (cls2 = e0.a) != null && !cls2.isAssignableFrom(cls)) {
            l5.q("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        pp9 pp9VarA = wa9Var.a.a(cls);
        if (!pp9VarA.a()) {
            boolean zIsAssignableFrom = n.class.isAssignableFrom(cls);
            x5c x5cVar = x5c.a;
            if (zIsAssignableFrom) {
                uodVarW = pp9VarA.c() == x5cVar ? z.w(pp9VarA, nha.b, s.b, e0.d, t45.a, rb9.b) : z.w(pp9VarA, nha.b, s.b, e0.d, null, rb9.b);
            } else if (pp9VarA.c() == x5cVar) {
                mha mhaVar = nha.a;
                s.a aVar = s.a;
                h0<?, ?> h0Var = e0.b;
                j<?> jVar = t45.b;
                if (jVar == null) {
                    r6.g("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                uodVarW = z.w(pp9VarA, mhaVar, aVar, h0Var, jVar, rb9.a);
            } else {
                uodVarW = z.w(pp9VarA, nha.a, s.a, e0.c, null, rb9.a);
            }
        } else if (n.class.isAssignableFrom(cls)) {
            uodVarW = new a0<>(e0.d, t45.a, pp9VarA.b());
        } else {
            h0<?, ?> h0Var2 = e0.b;
            j<?> jVar2 = t45.b;
            if (jVar2 == null) {
                r6.g("Protobuf runtime is not correctly loaded.");
                return null;
            }
            uodVarW = new a0<>(h0Var2, jVar2, pp9VarA.b());
        }
        uod<T> uodVar2 = (uod) concurrentHashMap.putIfAbsent(cls, uodVarW);
        return uodVar2 != null ? uodVar2 : uodVarW;
    }
}
