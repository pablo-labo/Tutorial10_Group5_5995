package defpackage;

import android.util.Log;
import defpackage.e64;
import defpackage.n64;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class p64 implements z54 {
    public final File b;
    public n64 e;
    public final e64 d = new e64();
    public final long c = 262144000;
    public final mjd a = new mjd();

    @Deprecated
    public p64(File file) {
        this.b = file;
    }

    @Override // defpackage.z54
    public final File a(kg8 kg8Var) {
        String strA = this.a.a(kg8Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strA + " for for Key: " + kg8Var);
        }
        try {
            n64.e eVarG = c().G(strA);
            if (eVarG != null) {
                return eVarG.a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.z54
    public final void b(kg8 kg8Var, yd3 yd3Var) {
        e64.a aVar;
        boolean z;
        String strA = this.a.a(kg8Var);
        e64 e64Var = this.d;
        synchronized (e64Var) {
            aVar = (e64.a) e64Var.a.get(strA);
            if (aVar == null) {
                e64.b bVar = e64Var.b;
                synchronized (bVar.a) {
                    aVar = (e64.a) bVar.a.poll();
                }
                if (aVar == null) {
                    aVar = new e64.a();
                }
                e64Var.a.put(strA, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strA + " for for Key: " + kg8Var);
            }
            try {
                n64 n64VarC = c();
                if (n64VarC.G(strA) == null) {
                    n64.c cVarS = n64VarC.s(strA);
                    if (cVarS == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strA));
                    }
                    try {
                        if (((zs4) yd3Var.b).d(yd3Var.a, cVarS.b(), (ova) yd3Var.c)) {
                            n64.a(n64.this, cVarS, true);
                            cVarS.c = true;
                        }
                        if (!z) {
                            try {
                                cVarS.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!cVarS.c) {
                            try {
                                cVarS.a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.a(strA);
        }
    }

    public final synchronized n64 c() {
        try {
            if (this.e == null) {
                this.e = n64.P(this.b, this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }
}
