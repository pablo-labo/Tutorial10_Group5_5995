package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.f;
import defpackage.fx9;
import defpackage.ke3;
import defpackage.kg8;
import defpackage.n39;
import defpackage.xd3;
import defpackage.xe3;
import defpackage.yd3;
import defpackage.z54;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class j implements c, c.a {
    public volatile xd3 V;
    public final d<?> a;
    public final e b;
    public volatile int c;
    public volatile b d;
    public volatile Object e;
    public volatile fx9.a<?> f;

    public j(d dVar, e eVar) {
        this.a = dVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // com.bumptech.glide.load.engine.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r5.e
            r5.e = r1
            boolean r0 = r5.b(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            com.bumptech.glide.load.engine.b r0 = r5.d
            if (r0 == 0) goto L2d
            com.bumptech.glide.load.engine.b r0 = r5.d
            boolean r0 = r0.a()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r5.d = r1
            r5.f = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L90
            int r1 = r5.c
            com.bumptech.glide.load.engine.d<?> r3 = r5.a
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto L90
            com.bumptech.glide.load.engine.d<?> r1 = r5.a
            java.util.ArrayList r1 = r1.b()
            int r3 = r5.c
            int r4 = r3 + 1
            r5.c = r4
            java.lang.Object r1 = r1.get(r3)
            fx9$a r1 = (fx9.a) r1
            r5.f = r1
            fx9$a<?> r1 = r5.f
            if (r1 == 0) goto L32
            com.bumptech.glide.load.engine.d<?> r1 = r5.a
            d64 r1 = r1.p
            fx9$a<?> r3 = r5.f
            ke3<Data> r3 = r3.c
            xe3 r3 = r3.e()
            boolean r1 = r1.c(r3)
            if (r1 != 0) goto L7c
            com.bumptech.glide.load.engine.d<?> r1 = r5.a
            fx9$a<?> r3 = r5.f
            ke3<Data> r3 = r3.c
            java.lang.Class r3 = r3.a()
            vz8 r1 = r1.c(r3)
            if (r1 == 0) goto L32
        L7c:
            fx9$a<?> r0 = r5.f
            fx9$a<?> r1 = r5.f
            ke3<Data> r1 = r1.c
            com.bumptech.glide.load.engine.d<?> r3 = r5.a
            knb r3 = r3.o
            tne r4 = new tne
            r4.<init>(r5, r0)
            r1.d(r3, r4)
            r0 = r2
            goto L32
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.j.a():boolean");
    }

    public final boolean b(Object obj) throws Throwable {
        Throwable th;
        int i = n39.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            com.bumptech.glide.load.data.a aVarG = this.a.c.a().g(obj);
            Object objA = aVarG.a();
            Object objD = this.a.d(objA);
            yd3 yd3Var = new yd3(objD, objA, this.a.i);
            kg8 kg8Var = this.f.a;
            d<?> dVar = this.a;
            xd3 xd3Var = new xd3(kg8Var, dVar.n);
            z54 z54VarA = ((f.c) dVar.h).a();
            z54VarA.b(xd3Var, yd3Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + xd3Var + ", data: " + obj + ", encoder: " + objD + ", duration: " + n39.a(jElapsedRealtimeNanos));
            }
            if (z54VarA.a(xd3Var) != null) {
                this.V = xd3Var;
                this.d = new b(Collections.singletonList(this.f.a), this.a, this);
                this.f.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.V + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.b.f(this.f.a, aVarG.a(), this.f.c, this.f.c.e(), this.f.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f.c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.c
    public final void cancel() {
        fx9.a<?> aVar = this.f;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public final void e(kg8 kg8Var, Exception exc, ke3<?> ke3Var, xe3 xe3Var) {
        this.b.e(kg8Var, exc, ke3Var, this.f.c.e());
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public final void f(kg8 kg8Var, Object obj, ke3<?> ke3Var, xe3 xe3Var, kg8 kg8Var2) {
        this.b.f(kg8Var, obj, ke3Var, this.f.c.e(), kg8Var);
    }
}
