package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class b7e implements Executor {
    public static final Logger f = Logger.getLogger(b7e.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public c c = c.a;
    public long d = 0;
    public final b e = new b();

    public class a implements Runnable {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.run();
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    public final class b implements Runnable {
        public Runnable a;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        
            r9.a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
        
            defpackage.b7e.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
        
            r9.a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0036 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                b7e r2 = defpackage.b7e.this     // Catch: java.lang.Throwable -> L50
                java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L50
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L50
                if (r0 != 0) goto L28
                b7e r0 = defpackage.b7e.this     // Catch: java.lang.Throwable -> L1c
                b7e$c r3 = r0.c     // Catch: java.lang.Throwable -> L1c
                b7e$c r4 = b7e.c.d     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L40
            L14:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                r9.interrupt()
                goto L40
            L1c:
                r9 = move-exception
                goto L73
            L1e:
                long r5 = r0.d     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.d = r5     // Catch: java.lang.Throwable -> L1c
                r0.c = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                b7e r3 = defpackage.b7e.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.b     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                r9.a = r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L41
                b7e r9 = defpackage.b7e.this     // Catch: java.lang.Throwable -> L1c
                b7e$c r0 = b7e.c.a     // Catch: java.lang.Throwable -> L1c
                r9.c = r0     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L40
                goto L14
            L40:
                return
            L41:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L50
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.a     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
                r3.run()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            L4d:
                r9.a = r2     // Catch: java.lang.Throwable -> L50
                goto L2
            L50:
                r9 = move-exception
                goto L75
            L52:
                r0 = move-exception
                goto L70
            L54:
                r3 = move-exception
                java.util.logging.Logger r4 = defpackage.b7e.f     // Catch: java.lang.Throwable -> L52
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L52
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
                r6.<init>()     // Catch: java.lang.Throwable -> L52
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.Runnable r7 = r9.a     // Catch: java.lang.Throwable -> L52
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L52
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
                goto L4d
            L70:
                r9.a = r2     // Catch: java.lang.Throwable -> L50
                throw r0     // Catch: java.lang.Throwable -> L50
            L73:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r9     // Catch: java.lang.Throwable -> L50
            L75:
                if (r1 == 0) goto L7e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L7e:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: b7e.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (b7e.this.b) {
                    b7e.this.c = c.a;
                    throw e;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + b7e.this.c + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final /* synthetic */ c[] e;

        static {
            c cVar = new c("IDLE", 0);
            a = cVar;
            c cVar2 = new c("QUEUING", 1);
            b = cVar2;
            c cVar3 = new c("QUEUED", 2);
            c = cVar3;
            c cVar4 = new c("RUNNING", 3);
            d = cVar4;
            e = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }
    }

    public b7e(Executor executor) {
        fib.i(executor);
        this.a = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            defpackage.fib.i(r8)
            java.util.ArrayDeque r0 = r7.b
            monitor-enter(r0)
            b7e$c r1 = r7.c     // Catch: java.lang.Throwable -> L6d
            b7e$c r2 = b7e.c.d     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            b7e$c r2 = b7e.c.c     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.d     // Catch: java.lang.Throwable -> L6d
            b7e$a r1 = new b7e$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque r8 = r7.b     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            b7e$c r8 = b7e.c.b     // Catch: java.lang.Throwable -> L6d
            r7.c = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.a     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            b7e$b r5 = r7.e     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            b7e$c r0 = r7.c
            if (r0 == r8) goto L2e
            goto L69
        L2e:
            java.util.ArrayDeque r0 = r7.b
            monitor-enter(r0)
            long r5 = r7.d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            b7e$c r1 = r7.c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r7 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r7
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.ArrayDeque r2 = r7.b
            monitor-enter(r2)
            b7e$c r0 = r7.c     // Catch: java.lang.Throwable -> L55
            b7e$c r3 = b7e.c.a     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            b7e$c r3 = b7e.c.b     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r7 = move-exception
            goto L6b
        L57:
            java.util.ArrayDeque r7 = r7.b     // Catch: java.lang.Throwable -> L55
            boolean r7 = r7.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L61
            r7 = 1
            goto L62
        L61:
            r7 = 0
        L62:
            boolean r0 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L6a
            if (r7 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
        L69:
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r7
        L6d:
            r7 = move-exception
            goto L76
        L6f:
            java.util.ArrayDeque r7 = r7.b     // Catch: java.lang.Throwable -> L6d
            r7.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7e.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
