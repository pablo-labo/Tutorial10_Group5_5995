package com.datadog.android.core.configuration;

import defpackage.gu5;
import defpackage.j6g;
import defpackage.w40;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014¨\u0006'"}, d2 = {"Lcom/datadog/android/core/configuration/BackPressureStrategy;", "", "", "capacity", "Lkotlin/Function0;", "Lj6g;", "onThresholdReached", "Lkotlin/Function1;", "onItemDropped", "Lcom/datadog/android/core/configuration/BackPressureMitigation;", "backpressureMitigation", "<init>", "(ILgu5;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/core/configuration/BackPressureMitigation;)V", "component1", "()I", "component2", "()Lgu5;", "component3", "()Lkotlin/jvm/functions/Function1;", "component4", "()Lcom/datadog/android/core/configuration/BackPressureMitigation;", "copy", "(ILgu5;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/core/configuration/BackPressureMitigation;)Lcom/datadog/android/core/configuration/BackPressureStrategy;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCapacity", "Lgu5;", "getOnThresholdReached", "Lkotlin/jvm/functions/Function1;", "getOnItemDropped", "Lcom/datadog/android/core/configuration/BackPressureMitigation;", "getBackpressureMitigation", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class BackPressureStrategy {
    private final BackPressureMitigation backpressureMitigation;
    private final int capacity;
    private final Function1<Object, j6g> onItemDropped;
    private final gu5<j6g> onThresholdReached;

    public BackPressureStrategy(int i, gu5<j6g> gu5Var, Function1<Object, j6g> function1, BackPressureMitigation backPressureMitigation) {
        gu5Var.getClass();
        function1.getClass();
        backPressureMitigation.getClass();
        this.capacity = i;
        this.onThresholdReached = gu5Var;
        this.onItemDropped = function1;
        this.backpressureMitigation = backPressureMitigation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BackPressureStrategy copy$default(BackPressureStrategy backPressureStrategy, int i, gu5 gu5Var, Function1 function1, BackPressureMitigation backPressureMitigation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = backPressureStrategy.capacity;
        }
        if ((i2 & 2) != 0) {
            gu5Var = backPressureStrategy.onThresholdReached;
        }
        if ((i2 & 4) != 0) {
            function1 = backPressureStrategy.onItemDropped;
        }
        if ((i2 & 8) != 0) {
            backPressureMitigation = backPressureStrategy.backpressureMitigation;
        }
        return backPressureStrategy.copy(i, gu5Var, function1, backPressureMitigation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    public final gu5<j6g> component2() {
        return this.onThresholdReached;
    }

    public final Function1<Object, j6g> component3() {
        return this.onItemDropped;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BackPressureMitigation getBackpressureMitigation() {
        return this.backpressureMitigation;
    }

    public final BackPressureStrategy copy(int capacity, gu5<j6g> onThresholdReached, Function1<Object, j6g> onItemDropped, BackPressureMitigation backpressureMitigation) {
        onThresholdReached.getClass();
        onItemDropped.getClass();
        backpressureMitigation.getClass();
        return new BackPressureStrategy(capacity, onThresholdReached, onItemDropped, backpressureMitigation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackPressureStrategy)) {
            return false;
        }
        BackPressureStrategy backPressureStrategy = (BackPressureStrategy) other;
        return this.capacity == backPressureStrategy.capacity && wl7.b(this.onThresholdReached, backPressureStrategy.onThresholdReached) && wl7.b(this.onItemDropped, backPressureStrategy.onItemDropped) && this.backpressureMitigation == backPressureStrategy.backpressureMitigation;
    }

    public final BackPressureMitigation getBackpressureMitigation() {
        return this.backpressureMitigation;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final Function1<Object, j6g> getOnItemDropped() {
        return this.onItemDropped;
    }

    public final gu5<j6g> getOnThresholdReached() {
        return this.onThresholdReached;
    }

    public int hashCode() {
        return this.backpressureMitigation.hashCode() + ((this.onItemDropped.hashCode() + w40.d(Integer.hashCode(this.capacity) * 31, 31, this.onThresholdReached)) * 31);
    }

    public String toString() {
        return "BackPressureStrategy(capacity=" + this.capacity + ", onThresholdReached=" + this.onThresholdReached + ", onItemDropped=" + this.onItemDropped + ", backpressureMitigation=" + this.backpressureMitigation + ")";
    }
}
