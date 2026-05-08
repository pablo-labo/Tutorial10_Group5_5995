package com.datadog.android.core.internal.thread;

import com.datadog.android.api.InternalLogger;
import defpackage.gu5;
import defpackage.mj8;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "durationMs", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "sleepSafe", "(JLcom/datadog/android/api/InternalLogger;)Z", "Ljava/lang/Runnable;", "task", "", "t", "logger", "Lj6g;", "loggingAfterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;Lcom/datadog/android/api/InternalLogger;)V", "", "ERROR_UNCAUGHT_EXECUTION_EXCEPTION", "Ljava/lang/String;", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class ThreadExtKt {
    public static final String ERROR_UNCAUGHT_EXECUTION_EXCEPTION = "Uncaught exception during the task execution";

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void loggingAfterExecute(java.lang.Runnable r19, java.lang.Throwable r20, com.datadog.android.api.InternalLogger r21) {
        /*
            r0 = r19
            r21.getClass()
            if (r20 != 0) goto L3f
            boolean r1 = r0 instanceof java.util.concurrent.Future
            if (r1 == 0) goto L3f
            r1 = r0
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            boolean r1 = r1.isDone()
            if (r1 == 0) goto L3f
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0     // Catch: java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c java.lang.InterruptedException -> L1e
            r0.get()     // Catch: java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c java.lang.InterruptedException -> L1e
            goto L3f
        L1a:
            r0 = move-exception
            goto L39
        L1c:
            r0 = move-exception
            goto L3d
        L1e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L26
            r0.interrupt()     // Catch: java.lang.SecurityException -> L26
            goto L3f
        L26:
            r0 = move-exception
            r5 = r0
            com.datadog.android.api.InternalLogger$Level r2 = com.datadog.android.api.InternalLogger.Level.ERROR
            com.datadog.android.api.InternalLogger$Target r3 = com.datadog.android.api.InternalLogger.Target.MAINTAINER
            com.datadog.android.core.internal.thread.ThreadExtKt$loggingAfterExecute$1 r4 = com.datadog.android.core.internal.thread.ThreadExtKt.AnonymousClass1.INSTANCE
            r8 = 48
            r9 = 0
            r6 = 0
            r7 = 0
            r1 = r21
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L3f
        L39:
            java.lang.Throwable r0 = r0.getCause()
        L3d:
            r14 = r0
            goto L41
        L3f:
            r14 = r20
        L41:
            if (r14 == 0) goto L5f
            com.datadog.android.api.InternalLogger$Level r11 = com.datadog.android.api.InternalLogger.Level.ERROR
            com.datadog.android.api.InternalLogger$Target r0 = com.datadog.android.api.InternalLogger.Target.USER
            com.datadog.android.api.InternalLogger$Target r1 = com.datadog.android.api.InternalLogger.Target.TELEMETRY
            com.datadog.android.api.InternalLogger$Target[] r0 = new com.datadog.android.api.InternalLogger.Target[]{r0, r1}
            java.util.List r12 = defpackage.u63.a0(r0)
            com.datadog.android.core.internal.thread.ThreadExtKt$loggingAfterExecute$2 r13 = com.datadog.android.core.internal.thread.ThreadExtKt.AnonymousClass2.INSTANCE
            r17 = 48
            r18 = 0
            r15 = 0
            r16 = 0
            r10 = r21
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.thread.ThreadExtKt.loggingAfterExecute(java.lang.Runnable, java.lang.Throwable, com.datadog.android.api.InternalLogger):void");
    }

    public static final boolean sleepSafe(long j, InternalLogger internalLogger) {
        internalLogger.getClass();
        try {
            try {
                Thread.sleep(j);
                return false;
            } catch (IllegalArgumentException e) {
                InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) C05532.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
                return false;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return true;
            }
        } catch (SecurityException e2) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) C05521.INSTANCE, (Throwable) e2, false, (Map) null, 48, (Object) null);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.thread.ThreadExtKt$loggingAfterExecute$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Thread was unable to set its own interrupted state";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.thread.ThreadExtKt$loggingAfterExecute$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return ThreadExtKt.ERROR_UNCAUGHT_EXECUTION_EXCEPTION;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.thread.ThreadExtKt$sleepSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05521 extends mj8 implements gu5<String> {
        public static final C05521 INSTANCE = new C05521();

        public C05521() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Thread was unable to set its own interrupted state";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.thread.ThreadExtKt$sleepSafe$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05532 extends mj8 implements gu5<String> {
        public static final C05532 INSTANCE = new C05532();

        public C05532() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Thread tried to sleep for a negative amount of time";
        }
    }
}
