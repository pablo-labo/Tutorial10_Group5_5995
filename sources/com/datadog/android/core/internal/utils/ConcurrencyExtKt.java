package com.datadog.android.core.internal.utils;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.lint.InternalApi;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.u63;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljava/util/concurrent/Executor;", "", "operationName", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Ljava/lang/Runnable;", "runnable", "Lj6g;", "executeSafe", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "", "delay", "Ljava/util/concurrent/TimeUnit;", "unit", "Ljava/util/concurrent/ScheduledFuture;", "scheduleSafe", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/String;JLjava/util/concurrent/TimeUnit;Lcom/datadog/android/api/InternalLogger;Ljava/lang/Runnable;)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/Future;", "submitSafe", "(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "ERROR_TASK_REJECTED", "Ljava/lang/String;", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class ConcurrencyExtKt {
    public static final String ERROR_TASK_REJECTED = "Unable to schedule %s task on the executor";

    /* JADX INFO: renamed from: com.datadog.android.core.internal.utils.ConcurrencyExtKt$executeSafe$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $operationName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$operationName = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, ConcurrencyExtKt.ERROR_TASK_REJECTED, Arrays.copyOf(new Object[]{this.$operationName}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.utils.ConcurrencyExtKt$scheduleSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05541 extends mj8 implements gu5<String> {
        final /* synthetic */ String $operationName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05541(String str) {
            super(0);
            this.$operationName = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, ConcurrencyExtKt.ERROR_TASK_REJECTED, Arrays.copyOf(new Object[]{this.$operationName}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.utils.ConcurrencyExtKt$submitSafe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05551 extends mj8 implements gu5<String> {
        final /* synthetic */ String $operationName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05551(String str) {
            super(0);
            this.$operationName = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, ConcurrencyExtKt.ERROR_TASK_REJECTED, Arrays.copyOf(new Object[]{this.$operationName}, 1));
        }
    }

    @InternalApi
    public static final void executeSafe(Executor executor, String str, InternalLogger internalLogger, Runnable runnable) {
        executor.getClass();
        str.getClass();
        internalLogger.getClass();
        runnable.getClass();
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(str), (Throwable) e, false, (Map) null, 48, (Object) null);
        }
    }

    @InternalApi
    public static final ScheduledFuture<?> scheduleSafe(ScheduledExecutorService scheduledExecutorService, String str, long j, TimeUnit timeUnit, InternalLogger internalLogger, Runnable runnable) {
        scheduledExecutorService.getClass();
        str.getClass();
        timeUnit.getClass();
        internalLogger.getClass();
        runnable.getClass();
        try {
            return scheduledExecutorService.schedule(runnable, j, timeUnit);
        } catch (RejectedExecutionException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05541(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    @InternalApi
    public static final Future<?> submitSafe(ExecutorService executorService, String str, InternalLogger internalLogger, Runnable runnable) {
        executorService.getClass();
        str.getClass();
        internalLogger.getClass();
        runnable.getClass();
        try {
            return executorService.submit(runnable);
        } catch (RejectedExecutionException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new C05551(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }
}
