package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.common.futures.SimpleSettableFuture;
import defpackage.b0;
import defpackage.kz2;
import defpackage.l;
import defpackage.l5;
import defpackage.qa0;
import defpackage.s55;
import defpackage.z84;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010#R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "Lcom/facebook/react/bridge/queue/MessageQueueThread;", "", "name", "Landroid/os/Looper;", "looper", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "exceptionHandler", "Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;", "stats", "<init>", "(Ljava/lang/String;Landroid/os/Looper;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;)V", "Ljava/lang/Runnable;", "runnable", "", "runOnQueue", "(Ljava/lang/Runnable;)Z", "T", "Ljava/util/concurrent/Callable;", "callable", "Ljava/util/concurrent/Future;", "callOnQueue", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "isOnThread", "()Z", "Lj6g;", "assertIsOnThread", "()V", "message", "(Ljava/lang/String;)V", "quitSynchronous", "getPerfStats", "()Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;", "resetPerfStats", "isIdle", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Landroid/os/Looper;", "getLooper", "()Landroid/os/Looper;", "Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;", "Lcom/facebook/react/bridge/queue/MessageQueueThreadHandler;", "handler", "Lcom/facebook/react/bridge/queue/MessageQueueThreadHandler;", "assertionErrorMessage", "isFinished", "Z", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageQueueThreadImpl implements MessageQueueThread {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String assertionErrorMessage;
    private final MessageQueueThreadHandler handler;
    private volatile boolean isFinished;
    private final Looper looper;
    private final String name;
    private final MessageQueueThreadPerfStats stats;

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats) {
        this.name = str;
        this.looper = looper;
        this.stats = messageQueueThreadPerfStats;
        this.handler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.assertionErrorMessage = l5.m("Expected to be called from the '", str, "' thread!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.Object] */
    public static final void callOnQueue$lambda$0(SimpleSettableFuture simpleSettableFuture, Callable callable) {
        try {
            ?? Call = callable.call();
            CountDownLatch countDownLatch = simpleSettableFuture.a;
            if (countDownLatch.getCount() == 0) {
                throw new RuntimeException("Result has already been set!");
            }
            simpleSettableFuture.b = Call;
            countDownLatch.countDown();
        } catch (Exception e) {
            simpleSettableFuture.getClass();
            CountDownLatch countDownLatch2 = simpleSettableFuture.a;
            if (countDownLatch2.getCount() == 0) {
                b0.o("Result has already been set!");
            } else {
                simpleSettableFuture.c = e;
                countDownLatch2.countDown();
            }
        }
    }

    public static final MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        return INSTANCE.create(messageQueueThreadSpec, queueThreadExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetPerfStats$lambda$1(MessageQueueThreadImpl messageQueueThreadImpl) {
        INSTANCE.assignToPerfStats(messageQueueThreadImpl.stats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread(String message) {
        message.getClass();
        SoftAssertions.assertCondition(isOnThread(), this.assertionErrorMessage + " " + message);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public <T> Future<T> callOnQueue(Callable<T> callable) {
        callable.getClass();
        SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new kz2(1, simpleSettableFuture, callable));
        return simpleSettableFuture;
    }

    public final Looper getLooper() {
        return this.looper;
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    /* JADX INFO: renamed from: getPerfStats, reason: from getter */
    public MessageQueueThreadPerfStats getStats() {
        return this.stats;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isIdle() {
        return this.looper.getQueue().isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isOnThread() {
        return this.looper.getThread() == Thread.currentThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void quitSynchronous() {
        this.isFinished = true;
        this.looper.quit();
        if (this.looper.getThread() != Thread.currentThread()) {
            try {
                this.looper.getThread().join();
            } catch (InterruptedException unused) {
                b0.o(l5.l("Got interrupted waiting to join thread ", this.name));
            }
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void resetPerfStats() {
        INSTANCE.assignToPerfStats(this.stats, -1L, -1L);
        runOnQueue(new qa0(this, 3));
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean runOnQueue(Runnable runnable) {
        runnable.getClass();
        if (!this.isFinished) {
            this.handler.post(runnable);
            return true;
        }
        s55.n("ReactNative", "Tried to enqueue runnable on already finished thread: '" + this.name + "... dropping Runnable.");
        return false;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl$Companion;", "", "<init>", "()V", "Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;", "stats", "", "wall", "cpu", "Lj6g;", "assignToPerfStats", "(Lcom/facebook/react/bridge/queue/MessageQueueThreadPerfStats;JJ)V", "", "name", "Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;", "exceptionHandler", "Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "createForMainThread", "(Ljava/lang/String;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "stackSize", "startNewBackgroundThread", "(Ljava/lang/String;JLcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;", "spec", "create", "(Lcom/facebook/react/bridge/queue/MessageQueueThreadSpec;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;)Lcom/facebook/react/bridge/queue/MessageQueueThreadImpl;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessageQueueThreadSpec.ThreadType.values().length];
                try {
                    iArr[MessageQueueThreadSpec.ThreadType.MAIN_UI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MessageQueueThreadSpec.ThreadType.NEW_BACKGROUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void assignToPerfStats(MessageQueueThreadPerfStats stats, long wall, long cpu) {
            if (stats != null) {
                stats.wallTime = wall;
                stats.cpuTime = cpu;
            }
        }

        private final MessageQueueThreadImpl createForMainThread(String name, QueueThreadExceptionHandler exceptionHandler) {
            Looper mainLooper = Looper.getMainLooper();
            mainLooper.getClass();
            return new MessageQueueThreadImpl(name, mainLooper, exceptionHandler, null, 8, null);
        }

        private final MessageQueueThreadImpl startNewBackgroundThread(String name, long stackSize, QueueThreadExceptionHandler exceptionHandler) {
            Looper looper;
            SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
            new Thread(null, new z84(simpleSettableFuture, 5), l5.l("mqt_", name), stackSize).start();
            try {
                Pair pair = (Pair) simpleSettableFuture.get();
                if (pair != null && (looper = (Looper) pair.first) != null) {
                    return new MessageQueueThreadImpl(name, looper, exceptionHandler, (MessageQueueThreadPerfStats) pair.second, null);
                }
                b0.o("Looper not found for thread");
                return null;
            } catch (InterruptedException e) {
                l5.r(e);
                return null;
            } catch (ExecutionException e2) {
                l5.r(e2);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v1, types: [T, android.util.Pair] */
        public static final void startNewBackgroundThread$lambda$1(SimpleSettableFuture simpleSettableFuture) {
            Process.setThreadPriority(-4);
            Looper.prepare();
            MessageQueueThreadPerfStats messageQueueThreadPerfStats = new MessageQueueThreadPerfStats();
            MessageQueueThreadImpl.INSTANCE.assignToPerfStats(messageQueueThreadPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
            ?? pair = new Pair(Looper.myLooper(), messageQueueThreadPerfStats);
            CountDownLatch countDownLatch = simpleSettableFuture.a;
            if (countDownLatch.getCount() == 0) {
                b0.o("Result has already been set!");
                return;
            }
            simpleSettableFuture.b = pair;
            countDownLatch.countDown();
            Looper.loop();
        }

        public final MessageQueueThreadImpl create(MessageQueueThreadSpec spec, QueueThreadExceptionHandler exceptionHandler) {
            spec.getClass();
            exceptionHandler.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[spec.getThreadType().ordinal()];
            if (i == 1) {
                return createForMainThread(spec.getName(), exceptionHandler);
            }
            if (i == 2) {
                return startNewBackgroundThread(spec.getName(), spec.getStackSize(), exceptionHandler);
            }
            l.g();
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, looper, queueThreadExceptionHandler, messageQueueThreadPerfStats);
    }

    public /* synthetic */ MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, looper, queueThreadExceptionHandler, (i & 8) != 0 ? null : messageQueueThreadPerfStats);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.assertionErrorMessage);
    }
}
