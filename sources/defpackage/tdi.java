package defpackage;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class tdi {
    public final /* synthetic */ mci a;

    public tdi(mci mciVar) {
        this.a = mciVar;
    }

    public final void a() {
        mci mciVar = this.a;
        mciVar.b();
        eyh eyhVarF = mciVar.f();
        i0i i0iVar = mciVar.a;
        i0iVar.c0.getClass();
        if (eyhVarF.k(System.currentTimeMillis())) {
            mciVar.f().g0.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                mciVar.zzr().c0.b("Detected application was in foreground");
                i0iVar.c0.getClass();
                c(System.currentTimeMillis(), false);
            }
        }
    }

    public final void b(long j, boolean z) {
        mci mciVar = this.a;
        mciVar.b();
        mciVar.n();
        if (mciVar.f().k(j)) {
            mciVar.f().g0.a(true);
        }
        mciVar.f().j0.b(j);
        if (mciVar.f().g0.b()) {
            c(j, z);
        }
    }

    @VisibleForTesting
    public final void c(long j, boolean z) {
        mci mciVar = this.a;
        mciVar.b();
        i0i i0iVar = mciVar.a;
        if (i0iVar.d()) {
            mciVar.f().j0.b(j);
            i0iVar.c0.getClass();
            mciVar.zzr().c0.a(Long.valueOf(SystemClock.elapsedRealtime()), "Session started, time");
            long j2 = j / 1000;
            mciVar.h().o(j, Long.valueOf(j2), "auto", "_sid");
            mciVar.f().g0.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            if (i0iVar.V.k(null, djh.p0) && z) {
                bundle.putLong("_aib", 1L);
            }
            mciVar.h().n(j, bundle, "auto", "_s");
            ((aei) dei.b.zza()).getClass();
            if (i0iVar.V.k(null, djh.u0)) {
                String strA = mciVar.f().o0.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                mciVar.h().n(j, l6.e("_ffr", strA), "auto", "_ssr");
            }
        }
    }
}
