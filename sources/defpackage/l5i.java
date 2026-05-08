package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class l5i {
    public static final l5i c = new l5i();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final n2i a = new n2i();

    public final <T> w5i<T> a(Class<T> cls) {
        w5i<T> w5iVarN;
        Class<?> cls2;
        Charset charset = mzh.a;
        if (cls == null) {
            ja.k("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        w5i<T> w5iVar = (w5i) concurrentHashMap.get(cls);
        if (w5iVar != null) {
            return w5iVar;
        }
        n2i n2iVar = this.a;
        n2iVar.getClass();
        Class<?> cls3 = z5i.a;
        if (!dzh.class.isAssignableFrom(cls) && (cls2 = z5i.a) != null && !cls2.isAssignableFrom(cls)) {
            l5.q("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        g3i g3iVarZzb = ((t2i) n2iVar.b).zzb(cls);
        if (g3iVarZzb.zzb()) {
            if (dzh.class.isAssignableFrom(cls)) {
                w5iVarN = new l4i<>(z5i.d, yxh.a, g3iVarZzb.zzc());
            } else {
                b8i<?, ?> b8iVar = z5i.b;
                qxh<?> qxhVar = yxh.b;
                if (qxhVar == null) {
                    r6.g("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w5iVarN = new l4i<>(b8iVar, qxhVar, g3iVarZzb.zzc());
            }
        } else if (dzh.class.isAssignableFrom(cls)) {
            w5iVarN = g3iVarZzb.zza() == 1 ? e4i.n(g3iVarZzb, v4i.b, p1i.b, z5i.d, yxh.a, h3i.b) : e4i.n(g3iVarZzb, v4i.b, p1i.b, z5i.d, null, h3i.b);
        } else if (g3iVarZzb.zza() == 1) {
            t4i t4iVar = v4i.a;
            u1i u1iVar = p1i.a;
            b8i<?, ?> b8iVar2 = z5i.b;
            qxh<?> qxhVar2 = yxh.b;
            if (qxhVar2 == null) {
                r6.g("Protobuf runtime is not correctly loaded.");
                return null;
            }
            w5iVarN = e4i.n(g3iVarZzb, t4iVar, u1iVar, b8iVar2, qxhVar2, h3i.a);
        } else {
            w5iVarN = e4i.n(g3iVarZzb, v4i.a, p1i.a, z5i.c, null, h3i.a);
        }
        w5i<T> w5iVar2 = (w5i) concurrentHashMap.putIfAbsent(cls, w5iVarN);
        return w5iVar2 != null ? w5iVar2 : w5iVarN;
    }
}
