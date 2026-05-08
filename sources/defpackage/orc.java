package defpackage;

import coil.memory.MemoryCache;

/* JADX INFO: loaded from: classes.dex */
public final class orc implements MemoryCache {
    public final ewe a;
    public final oug b;

    public orc(ewe eweVar, oug ougVar) {
        this.a = eweVar;
        this.b = ougVar;
    }

    @Override // coil.memory.MemoryCache
    public final void a(int i) {
        this.a.a(i);
        this.b.a(i);
    }

    @Override // coil.memory.MemoryCache
    public final MemoryCache.a b(MemoryCache.Key key) {
        MemoryCache.a aVarB = this.a.b(key);
        return aVarB == null ? this.b.b(key) : aVarB;
    }

    @Override // coil.memory.MemoryCache
    public final void c(MemoryCache.Key key, MemoryCache.a aVar) {
        this.a.c(new MemoryCache.Key(key.a, q92.H(key.b)), aVar.a, q92.H(aVar.b));
    }
}
