package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class kah implements OnCompleteListener {
    public final qa6 a;
    public final int b;
    public final vg0 c;
    public final long d;
    public final long e;

    public kah(qa6 qa6Var, int i, vg0 vg0Var, long j, long j2) {
        this.a = qa6Var;
        this.b = i;
        this.c = vg0Var;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration a(defpackage.y9h r4, defpackage.g91 r5, int r6) {
        /*
            com.google.android.gms.common.internal.zzj r5 = r5.v
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r5 = r5.d
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.b
            if (r1 == 0) goto L35
            int[] r1 = r5.d
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.p
            int r6 = r5.e
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kah.a(y9h, g91, int):com.google.android.gms.common.internal.ConnectionTelemetryConfiguration");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        long j3 = this.d;
        qa6 qa6Var = this.a;
        if (qa6Var.b()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = pfd.a().a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) {
                y9h y9hVar = (y9h) qa6Var.Y.get(this.c);
                if (y9hVar != null) {
                    Object obj = y9hVar.b;
                    if (obj instanceof g91) {
                        g91 g91Var = (g91) obj;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        int i7 = g91Var.q;
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.c;
                            i = rootTelemetryConfiguration.d;
                            int i8 = rootTelemetryConfiguration.e;
                            int i9 = rootTelemetryConfiguration.a;
                            if (g91Var.v == null || g91Var.q0()) {
                                i2 = i9;
                                i3 = i8;
                            } else {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(y9hVar, g91Var, this.b);
                                if (connectionTelemetryConfigurationA == null) {
                                    return;
                                }
                                boolean z2 = connectionTelemetryConfigurationA.c && j3 > 0;
                                i2 = i9;
                                i3 = connectionTelemetryConfigurationA.e;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i10 = i;
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status status = ((ApiException) exception).getStatus();
                                i4 = status.a;
                                ConnectionResult connectionResult = status.d;
                                if (connectionResult != null) {
                                    i5 = i4;
                                    i6 = connectionResult.b;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        lah lahVar = new lah(new MethodInvocation(this.b, i5, i6, j, j2, null, null, i7, iElapsedRealtime), i2, i10, i3);
                        och ochVar = qa6Var.c0;
                        ochVar.sendMessage(ochVar.obtainMessage(18, lahVar));
                    }
                }
            }
        }
    }
}
