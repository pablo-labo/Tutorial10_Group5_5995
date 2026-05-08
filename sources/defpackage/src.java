package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class src implements ewe {
    public final oug a;
    public final b b;

    public static final class a {
        public final Bitmap a;
        public final Map<String, Object> b;
        public final int c;

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i) {
            this.a = bitmap;
            this.b = map;
            this.c = i;
        }
    }

    public static final class b extends a89<MemoryCache.Key, a> {
        public final /* synthetic */ src g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, src srcVar) {
            super(i);
            this.g = srcVar;
        }

        @Override // defpackage.a89
        public final void a(boolean z, MemoryCache.Key key, a aVar, a aVar2) {
            a aVar3 = aVar;
            this.g.a.c(key, aVar3.a, aVar3.b, aVar3.c);
        }

        @Override // defpackage.a89
        public final int f(MemoryCache.Key key, a aVar) {
            return aVar.c;
        }
    }

    public src(int i, oug ougVar) {
        this.a = ougVar;
        this.b = new b(i, this);
    }

    @Override // defpackage.ewe
    public final void a(int i) {
        int i2;
        if (i >= 40) {
            this.b.g(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        b bVar = this.b;
        synchronized (bVar.c) {
            i2 = bVar.d;
        }
        bVar.g(i2 / 2);
    }

    @Override // defpackage.ewe
    public final MemoryCache.a b(MemoryCache.Key key) {
        a aVarB = this.b.b(key);
        if (aVarB != null) {
            return new MemoryCache.a(aVarB.a, aVarB.b);
        }
        return null;
    }

    @Override // defpackage.ewe
    public final void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map) {
        int i;
        int iW = ka2.w(bitmap);
        b bVar = this.b;
        synchronized (bVar.c) {
            i = bVar.a;
        }
        b bVar2 = this.b;
        if (iW <= i) {
            bVar2.c(key, new a(bitmap, map, iW));
        } else {
            bVar2.d(key);
            this.a.c(key, bitmap, map, iW);
        }
    }
}
