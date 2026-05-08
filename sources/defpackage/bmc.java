package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bmc implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
    }
}
