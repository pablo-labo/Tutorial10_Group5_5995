package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.exoplayer.image.ImageOutput;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import defpackage.ayd;
import defpackage.b0;
import defpackage.d82;
import defpackage.fze;
import defpackage.gdb;
import defpackage.n2f;
import defpackage.ox0;
import defpackage.so3;
import defpackage.u25;
import defpackage.v25;
import defpackage.vjg;
import defpackage.w25;
import defpackage.x25;
import defpackage.y25;
import defpackage.yp3;
import defpackage.zsd;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends gdb {

    public interface a {
        default void h() {
        }
    }

    public static final class b {
        public final Context a;
        public final n2f b;
        public final u25 c;
        public final v25 d;
        public final w25 e;
        public fze<f> f;
        public final y25 g;
        public final b0 h;
        public Looper i;
        public final int j;
        public final ox0 k;
        public final int l;
        public final boolean m;
        public final ayd n;
        public final zsd o;
        public final long p;
        public final long q;
        public final long r;
        public final so3 s;
        public final long t;
        public final long u;
        public final boolean v;
        public boolean w;
        public final String x;

        public b(Context context, yp3 yp3Var) {
            u25 u25Var = new u25(yp3Var);
            v25 v25Var = new v25(context);
            w25 w25Var = new w25(context);
            x25 x25Var = new x25(0);
            y25 y25Var = new y25(context);
            b0 b0Var = new b0(7);
            this.a = context;
            this.c = u25Var;
            this.d = v25Var;
            this.e = w25Var;
            this.f = x25Var;
            this.g = y25Var;
            this.h = b0Var;
            String str = vjg.a;
            Looper looperMyLooper = Looper.myLooper();
            this.i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.k = ox0.h;
            this.l = 1;
            this.m = true;
            this.n = ayd.c;
            this.p = 5000L;
            this.q = 15000L;
            this.r = TimeBasedInteractionIdentifier.DEFAULT_TIME_THRESHOLD_MS;
            this.o = zsd.b;
            this.s = new so3(vjg.O(20L), vjg.O(500L));
            this.b = d82.a;
            this.t = 500L;
            this.u = 2000L;
            this.v = true;
            this.x = "";
            this.j = -1000;
            if (Build.VERSION.SDK_INT >= 35) {
            }
        }
    }

    public static class c {
        public static final c a = new c();
    }

    @Override // defpackage.gdb
    ExoPlaybackException a();

    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}
