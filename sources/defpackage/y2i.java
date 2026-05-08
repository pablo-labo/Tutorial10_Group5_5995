package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class y2i {
    public static final y2i c = new y2i();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ze4 a = new ze4(1);

    public final i3i a(Class cls) {
        i3i r2iVar;
        Charset charset = ezh.a;
        if (cls == null) {
            ja.k("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        i3i i3iVar = (i3i) concurrentHashMap.get(cls);
        if (i3iVar != null) {
            return i3iVar;
        }
        ze4 ze4Var = this.a;
        ze4Var.getClass();
        beb bebVar = o3i.a;
        oyh.class.isAssignableFrom(cls);
        v1i v1iVarZzb = ((d1i) ze4Var.b).zzb(cls);
        if (v1iVarZzb.zzb()) {
            beb bebVar2 = o3i.a;
            iwh iwhVar = lwh.a;
            r2iVar = new r2i(bebVar2, v1iVarZzb.zza());
        } else {
            int i = x2i.a;
            int i2 = l0i.a;
            beb bebVar3 = o3i.a;
            iwh iwhVar2 = v1iVarZzb.zzc() + (-1) != 1 ? lwh.a : null;
            int i3 = r1i.a;
            r2iVar = p2i.n(v1iVarZzb, bebVar3, iwhVar2);
        }
        i3i i3iVar2 = (i3i) concurrentHashMap.putIfAbsent(cls, r2iVar);
        return i3iVar2 != null ? i3iVar2 : r2iVar;
    }
}
