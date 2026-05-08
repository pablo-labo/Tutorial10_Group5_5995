package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import defpackage.lg5;

/* JADX INFO: loaded from: classes.dex */
public final class wng {
    public final lg5 a;
    public final b b;
    public final c c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public static final class a {
        public static void a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                zkd.x("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    public final class b implements DisplayManager.DisplayListener {
        public final DisplayManager a;

        public b(DisplayManager displayManager) {
            this.a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            if (i == 0) {
                wng.a(wng.this, this.a.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public static final class c implements Choreographer.FrameCallback, Handler.Callback {
        public static final c e = new c();
        public volatile long a = -9223372036854775807L;
        public final Handler b;
        public Choreographer c;
        public int d;

        public c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            String str = vjg.a;
            Handler handler = new Handler(looper, this);
            this.b = handler;
            handler.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.a = j;
            Choreographer choreographer = this.c;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    this.c = Choreographer.getInstance();
                } catch (RuntimeException e2) {
                    zkd.U("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
                }
                return true;
            }
            if (i == 2) {
                Choreographer choreographer = this.c;
                if (choreographer != null) {
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 3) {
                return false;
            }
            Choreographer choreographer2 = this.c;
            if (choreographer2 != null) {
                int i3 = this.d - 1;
                this.d = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.a = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public wng(Context context) {
        DisplayManager displayManager;
        lg5 lg5Var = new lg5();
        lg5Var.a = new lg5.a();
        lg5Var.b = new lg5.a();
        lg5Var.d = -9223372036854775807L;
        this.a = lg5Var;
        b bVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new b(displayManager);
        this.b = bVar;
        this.c = bVar != null ? c.e : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static void a(wng wngVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            wngVar.k = refreshRate;
            wngVar.l = (refreshRate * 80) / 100;
        } else {
            zkd.T("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            wngVar.k = -9223372036854775807L;
            wngVar.l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        a.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            lg5 r0 = r9.a
            lg5$a r2 = r0.a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            lg5$a r2 = r0.a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            lg5$a r2 = r0.a
            long r4 = r2.e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f
        L3b:
            float r4 = r9.g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            goto L8d
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            lg5$a r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            lg5$a r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            lg5$a r0 = r0.a
            long r0 = r0.f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.e
            if (r0 < r1) goto L8d
        L87:
            r9.g = r2
            r0 = 0
            r9.d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wng.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.e
            if (r0 == 0) goto L30
            int r1 = r3.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.d
            if (r1 == 0) goto L21
            float r1 = r3.g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.h = r1
            wng.a.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wng.d(boolean):void");
    }
}
