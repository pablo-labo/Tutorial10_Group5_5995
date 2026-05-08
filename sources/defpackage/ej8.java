package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.lyft.kronos.internal.ntp.SntpClient;
import defpackage.xme;

/* JADX INFO: loaded from: classes3.dex */
public final class ej8 implements dj8 {
    public final xme a;

    public ej8(xme xmeVar, ypd ypdVar) {
        this.a = xmeVar;
    }

    @Override // defpackage.c82
    public final long i() {
        fj8 fj8Var;
        xme xmeVar = this.a;
        long j = xmeVar.i;
        xmeVar.a();
        ws9 ws9Var = xmeVar.e;
        SharedPreferences sharedPreferences = (SharedPreferences) ((qq2) ws9Var.b).a;
        long j2 = sharedPreferences.getLong("com.lyft.kronos.cached_current_time", 0L);
        long j3 = sharedPreferences.getLong("com.lyft.kronos.cached_elapsed_time", 0L);
        SntpClient.a aVar = j3 == 0 ? null : new SntpClient.a(j2, j3, sharedPreferences.getLong("com.lyft.kronos.cached_offset", 0L), (ypd) ws9Var.c);
        if (xmeVar.a.get() == xme.a.a && aVar != null && Math.abs((aVar.a - aVar.b) - (System.currentTimeMillis() - SystemClock.elapsedRealtime())) >= 1000) {
            synchronized (ws9Var) {
                ((SharedPreferences) ((qq2) ws9Var.b).a).edit().clear().apply();
                j6g j6gVar = j6g.a;
            }
            aVar = null;
        }
        if (aVar == null) {
            if (SystemClock.elapsedRealtime() - xmeVar.b.get() >= j) {
                xmeVar.b();
            }
            fj8Var = null;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - aVar.b;
            if (jElapsedRealtime >= xmeVar.j && SystemClock.elapsedRealtime() - xmeVar.b.get() >= j) {
                xmeVar.b();
            }
            fj8Var = new fj8((SystemClock.elapsedRealtime() - aVar.b) + aVar.a + aVar.c, Long.valueOf(jElapsedRealtime));
        }
        if (fj8Var == null) {
            fj8Var = new fj8(System.currentTimeMillis(), null);
        }
        return fj8Var.a;
    }

    @Override // defpackage.dj8
    public final void shutdown() {
        xme xmeVar = this.a;
        xmeVar.a();
        xmeVar.a.set(xme.a.c);
        xmeVar.c.shutdown();
    }
}
