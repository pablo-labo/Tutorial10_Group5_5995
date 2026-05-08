package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import defpackage.slb;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d90 implements wlb, nnb, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long W;
    public long V;
    public final View a;
    public boolean c;
    public boolean f;
    public final PriorityQueue<qnb> b = new PriorityQueue<>(11, new c90(0));
    public final Choreographer d = Choreographer.getInstance();
    public final a e = new a();

    public static final class a implements vlb {
        public boolean a;
        public long b;

        @Override // defpackage.vlb
        public final long a() {
            if (this.a) {
                return Long.MAX_VALUE;
            }
            return Math.max(0L, this.b - System.nanoTime());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d90(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.a = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            c90 r1 = new c90
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.d = r0
            d90$a r0 = new d90$a
            r0.<init>()
            r4.e = r0
            long r0 = defpackage.d90.W
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            long r0 = (long) r1
            defpackage.d90.W = r0
        L49:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L55
            r5 = 1
            r4.f = r5
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d90.<init>(android.view.View):void");
    }

    @Override // defpackage.nnb
    public final void b(slb.a aVar) {
        this.b.add(new qnb(0, aVar));
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.post(this);
    }

    @Override // defpackage.nnb
    public final void c(slb.a aVar) {
        this.b.add(new qnb(1, aVar));
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.post(this);
    }

    public final boolean d() {
        a aVar = this.e;
        long jA = aVar.a();
        fb0.a(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jA > 0) {
            PriorityQueue<qnb> priorityQueue = this.b;
            qnb qnbVarPeek = priorityQueue.peek();
            qnbVarPeek.getClass();
            if (!qnbVarPeek.b.d(aVar)) {
                priorityQueue.poll();
                z = false;
            }
            aVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f) {
            this.V = j;
            this.a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f = false;
        this.a.removeCallbacks(this);
        this.d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue<qnb> priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.c && this.f) {
            View view = this.a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * W) + nanos;
                a aVar = this.e;
                aVar.a = z;
                aVar.b = Math.max(this.V, nanos) + W;
                boolean zD = false;
                while (!priorityQueue.isEmpty() && !zD) {
                    if (aVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zD = d();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zD = d();
                    }
                }
                if (zD) {
                    this.d.postFrameCallback(this);
                } else {
                    this.c = false;
                }
                fb0.a(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.c = false;
    }
}
