package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class mdi {

    @VisibleForTesting
    public long a;

    @VisibleForTesting
    public long b;
    public final jdi c;
    public final /* synthetic */ mci d;

    public mdi(mci mciVar) {
        this.d = mciVar;
        i0i i0iVar = mciVar.a;
        this.c = new jdi(this, i0iVar);
        i0iVar.c0.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = jElapsedRealtime;
        this.b = jElapsedRealtime;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(long r11, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdi.a(long, boolean, boolean):boolean");
    }

    @VisibleForTesting
    public final long b() {
        this.d.a.c0.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.b;
        this.b = jElapsedRealtime;
        return j;
    }
}
