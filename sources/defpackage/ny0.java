package defpackage;

import android.app.ApplicationExitInfo;
import androidx.media3.exoplayer.d;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.datadog.android.rum.internal.RumFeature;
import com.facebook.react.bridge.Promise;
import com.indeed.android.rninterviewprep.RNInterviewPrepModule;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ny0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ny0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                d.a aVar = ((ry0) obj2).b;
                String str = vjg.a;
                d.this.s.J((Exception) obj);
                break;
            case 1:
                ((s) obj2).g.m1((r.d) obj, Integer.MIN_VALUE, 9, x.o1(new ja(15)));
                break;
            case 2:
                RNInterviewPrepModule.requestMicrophonePermission$lambda$3((idc) obj2, (Promise) obj);
                break;
            default:
                RumFeature.consumeLastFatalAnr$lambda$6((RumFeature) obj2, (ApplicationExitInfo) obj);
                break;
        }
    }
}
