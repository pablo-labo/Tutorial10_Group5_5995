package okhttp3.internal.concurrent;

import defpackage.j6g;
import defpackage.l6;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "AwaitIdleTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TaskQueue {
    public final TaskRunner a;
    public final String b;
    public boolean c;
    public Task d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AwaitIdleTask extends Task {
        public final CountDownLatch e;

        public AwaitIdleTask() {
            super(l6.i(new StringBuilder(), Util.g, " awaitIdle"), false);
            this.e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            this.e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        this.a = taskRunner;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = Util.a;
        synchronized (this.a) {
            try {
                if (b()) {
                    this.a.d(this);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        Task task = this.d;
        if (task != null && task.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).b) {
                Task task2 = (Task) arrayList.get(size);
                TaskRunner.h.getClass();
                if (TaskRunner.j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(Task task, long j) {
        task.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (e(task, j, false)) {
                    this.a.d(this);
                }
                j6g j6gVar = j6g.a;
            } else if (task.b) {
                TaskRunner.h.getClass();
                if (TaskRunner.j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                TaskRunner.h.getClass();
                if (TaskRunner.j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(okhttp3.internal.concurrent.Task r11, long r12, boolean r14) {
        /*
            r10 = this;
            r11.getClass()
            okhttp3.internal.concurrent.TaskQueue r0 = r11.c
            r1 = 0
            if (r0 != r10) goto L9
            goto Ld
        L9:
            if (r0 != 0) goto L92
            r11.c = r10
        Ld:
            long r2 = java.lang.System.nanoTime()
            long r4 = r2 + r12
            java.util.ArrayList r0 = r10.e
            int r6 = r0.indexOf(r11)
            r7 = -1
            if (r6 == r7) goto L3a
            long r8 = r11.d
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 > 0) goto L37
            okhttp3.internal.concurrent.TaskRunner$Companion r12 = okhttp3.internal.concurrent.TaskRunner.h
            r12.getClass()
            java.util.logging.Logger r12 = okhttp3.internal.concurrent.TaskRunner.j
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L91
            java.lang.String r12 = "already scheduled"
            okhttp3.internal.concurrent.TaskLoggerKt.a(r11, r10, r12)
            return r1
        L37:
            r0.remove(r6)
        L3a:
            r11.d = r4
            okhttp3.internal.concurrent.TaskRunner$Companion r6 = okhttp3.internal.concurrent.TaskRunner.h
            r6.getClass()
            java.util.logging.Logger r6 = okhttp3.internal.concurrent.TaskRunner.j
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r6 = r6.isLoggable(r8)
            if (r6 == 0) goto L67
            if (r14 == 0) goto L59
            long r4 = r4 - r2
            java.lang.String r14 = okhttp3.internal.concurrent.TaskLoggerKt.b(r4)
            java.lang.String r4 = "run again after "
            java.lang.String r14 = r4.concat(r14)
            goto L64
        L59:
            long r4 = r4 - r2
            java.lang.String r14 = okhttp3.internal.concurrent.TaskLoggerKt.b(r4)
            java.lang.String r4 = "scheduled after "
            java.lang.String r14 = r4.concat(r14)
        L64:
            okhttp3.internal.concurrent.TaskLoggerKt.a(r11, r10, r14)
        L67:
            java.util.Iterator r10 = r0.iterator()
            r14 = r1
        L6c:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r10.next()
            okhttp3.internal.concurrent.Task r4 = (okhttp3.internal.concurrent.Task) r4
            long r4 = r4.d
            long r4 = r4 - r2
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 <= 0) goto L80
            goto L84
        L80:
            int r14 = r14 + 1
            goto L6c
        L83:
            r14 = r7
        L84:
            if (r14 != r7) goto L8a
            int r14 = r0.size()
        L8a:
            r0.add(r14, r11)
            if (r14 != 0) goto L91
            r10 = 1
            return r10
        L91:
            return r1
        L92:
            java.lang.String r10 = "task is in multiple queues"
            defpackage.r6.g(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskQueue.e(okhttp3.internal.concurrent.Task, long, boolean):boolean");
    }

    public final void f() {
        byte[] bArr = Util.a;
        synchronized (this.a) {
            try {
                this.c = true;
                if (b()) {
                    this.a.d(this);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getB() {
        return this.b;
    }
}
