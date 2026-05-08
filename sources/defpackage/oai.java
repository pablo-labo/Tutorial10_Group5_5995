package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class oai {
    public static final oai c = new oai();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final r7i a = new r7i(0);

    public final <T> cbi<T> a(Class<T> cls) {
        cbi<T> cbiVarM;
        Class<?> cls2;
        Charset charset = p5i.a;
        if (cls == null) {
            ja.k("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        cbi<T> cbiVar = (cbi) concurrentHashMap.get(cls);
        if (cbiVar != null) {
            return cbiVar;
        }
        r7i r7iVar = this.a;
        r7iVar.getClass();
        Class<?> cls3 = hbi.a;
        if (!a5i.class.isAssignableFrom(cls) && (cls2 = hbi.a) != null && !cls2.isAssignableFrom(cls)) {
            l5.q("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        u8i u8iVarA = ((w7i) r7iVar.a).a(cls);
        if (u8iVarA.b()) {
            if (a5i.class.isAssignableFrom(cls)) {
                cbiVarM = new j9i<>(hbi.d, k4i.a, u8iVarA.c());
            } else {
                rci<?, ?> rciVar = hbi.b;
                t3i<?> t3iVar = k4i.b;
                if (t3iVar == null) {
                    r6.g("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                cbiVarM = new j9i<>(rciVar, t3iVar, u8iVarA.c());
            }
        } else if (a5i.class.isAssignableFrom(cls)) {
            cbiVarM = u8iVarA.a() == 1 ? e9i.m(u8iVarA, kai.b, k7i.b, hbi.d, k4i.a, n8i.b) : e9i.m(u8iVarA, kai.b, k7i.b, hbi.d, null, n8i.b);
        } else if (u8iVarA.a() == 1) {
            p9i p9iVar = kai.a;
            p7i p7iVar = k7i.a;
            rci<?, ?> rciVar2 = hbi.b;
            t3i<?> t3iVar2 = k4i.b;
            if (t3iVar2 == null) {
                r6.g("Protobuf runtime is not correctly loaded.");
                return null;
            }
            cbiVarM = e9i.m(u8iVarA, p9iVar, p7iVar, rciVar2, t3iVar2, n8i.a);
        } else {
            cbiVarM = e9i.m(u8iVarA, kai.a, k7i.a, hbi.c, null, n8i.a);
        }
        cbi<T> cbiVar2 = (cbi) concurrentHashMap.putIfAbsent(cls, cbiVarM);
        return cbiVar2 != null ? cbiVar2 : cbiVarM;
    }
}
