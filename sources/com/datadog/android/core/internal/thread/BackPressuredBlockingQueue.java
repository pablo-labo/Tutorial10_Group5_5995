package com.datadog.android.core.internal.thread;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BackPressureMitigation;
import com.datadog.android.core.configuration.BackPressureStrategy;
import defpackage.gu5;
import defpackage.l;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.p6;
import defpackage.t40;
import defpackage.u63;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!¨\u0006\""}, d2 = {"Lcom/datadog/android/core/internal/thread/BackPressuredBlockingQueue;", "", "E", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lcom/datadog/android/api/InternalLogger;", "logger", "", "executorContext", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "backPressureStrategy", "<init>", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Lcom/datadog/android/core/configuration/BackPressureStrategy;)V", "e", "Lkotlin/Function1;", "", "operation", "addWithBackPressure", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "Lj6g;", "onThresholdReached", "()V", "item", "onItemDropped", "(Ljava/lang/Object;)V", "offer", "(Ljava/lang/Object;)Z", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z", "Lcom/datadog/android/api/InternalLogger;", "Ljava/lang/String;", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class BackPressuredBlockingQueue<E> extends LinkedBlockingQueue<E> {
    private final BackPressureStrategy backPressureStrategy;
    private final String executorContext;
    private final InternalLogger logger;

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackPressureMitigation.values().length];
            try {
                iArr[BackPressureMitigation.DROP_OLDEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackPressureMitigation.IGNORE_NEWEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$offer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "E", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<E, Boolean> {
        final /* synthetic */ BackPressuredBlockingQueue<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackPressuredBlockingQueue<E> backPressuredBlockingQueue) {
            super(1);
            this.this$0 = backPressuredBlockingQueue;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(E e) {
            e.getClass();
            return Boolean.valueOf(BackPressuredBlockingQueue.super.offer(e));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$onItemDropped$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "E", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05501 extends mj8 implements gu5<String> {
        final /* synthetic */ E $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05501(E e) {
            super(0);
            this.$item = e;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return t40.i(this.$item, "Dropped item in BackPressuredBlockingQueue queue: ");
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$onThresholdReached$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "E", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05511 extends mj8 implements gu5<String> {
        final /* synthetic */ BackPressuredBlockingQueue<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05511(BackPressuredBlockingQueue<E> backPressuredBlockingQueue) {
            super(0);
            this.this$0 = backPressuredBlockingQueue;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return p6.c(((BackPressuredBlockingQueue) this.this$0).backPressureStrategy.getCapacity(), "BackPressuredBlockingQueue reached capacity:");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackPressuredBlockingQueue(InternalLogger internalLogger, String str, BackPressureStrategy backPressureStrategy) {
        super(backPressureStrategy.getCapacity());
        internalLogger.getClass();
        str.getClass();
        backPressureStrategy.getClass();
        this.logger = internalLogger;
        this.executorContext = str;
        this.backPressureStrategy = backPressureStrategy;
    }

    private final boolean addWithBackPressure(E e, Function1<? super E, Boolean> operation) throws InterruptedException {
        int iRemainingCapacity = remainingCapacity();
        if (iRemainingCapacity != 0) {
            if (iRemainingCapacity == 1) {
                onThresholdReached();
            }
            return operation.invoke(e).booleanValue();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.backPressureStrategy.getBackpressureMitigation().ordinal()];
        if (i == 1) {
            E eTake = take();
            eTake.getClass();
            onItemDropped(eTake);
            return operation.invoke(e).booleanValue();
        }
        if (i == 2) {
            onItemDropped(e);
            return true;
        }
        l.g();
        return false;
    }

    private final void onItemDropped(E item) {
        this.backPressureStrategy.getOnItemDropped().invoke(item);
        this.logger.log(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5<String>) new C05501(item), (Throwable) null, false, lc9.a0(new Pair("backpressure.capacity", Integer.valueOf(this.backPressureStrategy.getCapacity())), new Pair("executor.context", this.executorContext)));
    }

    private final void onThresholdReached() {
        this.backPressureStrategy.getOnThresholdReached().invoke();
        this.logger.log(InternalLogger.Level.WARN, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5<String>) new C05511(this), (Throwable) null, false, lc9.a0(new Pair("backpressure.capacity", Integer.valueOf(this.backPressureStrategy.getCapacity())), new Pair("executor.context", this.executorContext)));
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public boolean offer(E e, long timeout, TimeUnit unit) {
        e.getClass();
        if (!super.offer(e, timeout, unit)) {
            return offer(e);
        }
        if (remainingCapacity() != 0) {
            return true;
        }
        onThresholdReached();
        return true;
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e) {
        e.getClass();
        return addWithBackPressure(e, new AnonymousClass1(this));
    }
}
