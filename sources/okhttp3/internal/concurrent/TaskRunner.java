package okhttp3.internal.concurrent;

import defpackage.j6g;
import defpackage.l6;
import defpackage.p6;
import defpackage.r6;
import defpackage.ujg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "Backend", "Companion", "RealBackend", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TaskRunner {
    public static final Companion h = new Companion(0);
    public static final TaskRunner i = new TaskRunner(new RealBackend(new ujg(l6.i(new StringBuilder(), Util.g, " TaskRunner"), true)));
    public static final Logger j;
    public final RealBackend a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final TaskRunner$runnable$1 g = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
        @Override // java.lang.Runnable
        public final void run() {
            Task taskC;
            long jNanoTime;
            while (true) {
                TaskRunner taskRunner = this.a;
                synchronized (taskRunner) {
                    taskC = taskRunner.c();
                }
                if (taskC == null) {
                    return;
                }
                TaskQueue taskQueue = taskC.c;
                taskQueue.getClass();
                TaskRunner taskRunner2 = this.a;
                TaskRunner.h.getClass();
                boolean zIsLoggable = TaskRunner.j.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = System.nanoTime();
                    TaskLoggerKt.a(taskC, taskQueue, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    try {
                        TaskRunner.a(taskRunner2, taskC);
                        j6g j6gVar = j6g.a;
                        if (zIsLoggable) {
                            TaskLoggerKt.a(taskC, taskQueue, "finished run in ".concat(TaskLoggerKt.b(System.nanoTime() - jNanoTime)));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        TaskLoggerKt.a(taskC, taskQueue, "failed a run in ".concat(TaskLoggerKt.b(System.nanoTime() - jNanoTime)));
                    }
                    throw th;
                }
            }
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Backend {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RealBackend implements Backend {
        public final ThreadPoolExecutor a;

        public RealBackend(ujg ujgVar) {
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ujgVar);
        }

        public final void a(TaskRunner$runnable$1 taskRunner$runnable$1) {
            taskRunner$runnable$1.getClass();
            this.a.execute(taskRunner$runnable$1);
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        logger.getClass();
        j = logger;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend realBackend) {
        this.a = realBackend;
    }

    public static final void a(TaskRunner taskRunner, Task task) {
        byte[] bArr = Util.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.a);
        try {
            long jA = task.a();
            synchronized (taskRunner) {
                taskRunner.b(task, jA);
                j6g j6gVar = j6g.a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (taskRunner) {
                taskRunner.b(task, -1L);
                j6g j6gVar2 = j6g.a;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(Task task, long j2) {
        byte[] bArr = Util.a;
        TaskQueue taskQueue = task.c;
        taskQueue.getClass();
        if (taskQueue.d != task) {
            r6.g("Check failed.");
            return;
        }
        boolean z = taskQueue.f;
        taskQueue.f = false;
        taskQueue.d = null;
        this.e.remove(taskQueue);
        if (j2 != -1 && !z && !taskQueue.c) {
            taskQueue.e(task, j2, true);
        }
        if (taskQueue.e.isEmpty()) {
            return;
        }
        this.f.add(taskQueue);
    }

    public final Task c() {
        boolean z;
        byte[] bArr = Util.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Task task2 = (Task) ((TaskQueue) it.next()).e.get(0);
                long jMax = Math.max(0L, task2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task != null) {
                        z = true;
                        break;
                    }
                    task = task2;
                }
            }
            ArrayList arrayList2 = this.e;
            if (task != null) {
                byte[] bArr2 = Util.a;
                task.d = -1L;
                TaskQueue taskQueue = task.c;
                taskQueue.getClass();
                taskQueue.e.remove(task);
                arrayList.remove(taskQueue);
                taskQueue.d = task;
                arrayList2.add(taskQueue);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    this.a.a(this.g);
                }
                return task;
            }
            if (!this.c) {
                this.c = true;
                this.d = jNanoTime + jMin;
                try {
                    try {
                        long j2 = jMin / 1000000;
                        long j3 = jMin - (1000000 * j2);
                        if (j2 > 0 || jMin > 0) {
                            wait(j2, (int) j3);
                        }
                    } catch (InterruptedException unused) {
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((TaskQueue) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size2);
                            taskQueue2.b();
                            if (taskQueue2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.c = false;
                }
            } else if (jMin < this.d - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void d(TaskQueue taskQueue) {
        taskQueue.getClass();
        byte[] bArr = Util.a;
        if (taskQueue.d == null) {
            boolean zIsEmpty = taskQueue.e.isEmpty();
            ArrayList arrayList = this.f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                arrayList.getClass();
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.c) {
            notify();
        } else {
            this.a.a(this.g);
        }
    }

    public final TaskQueue e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new TaskQueue(this, p6.c(i2, "Q"));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "<init>", "()V", "Lokhttp3/internal/concurrent/TaskRunner;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
