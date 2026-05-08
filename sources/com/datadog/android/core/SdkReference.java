package com.datadog.android.core;

import com.datadog.android.Datadog;
import com.datadog.android.api.SdkCore;
import com.datadog.android.core.internal.DatadogCore;
import defpackage.j6g;
import defpackage.mj8;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/core/SdkReference;", "", "", "sdkInstanceName", "Lkotlin/Function1;", "Lcom/datadog/android/api/SdkCore;", "Lj6g;", "onSdkInstanceCaptured", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "tryAcquire", "()Lcom/datadog/android/api/SdkCore;", "get", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicReference;", "reference", "Ljava/util/concurrent/atomic/AtomicReference;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SdkReference {
    private final Function1<SdkCore, j6g> onSdkInstanceCaptured;
    private final AtomicReference<SdkCore> reference;
    private final String sdkInstanceName;

    /* JADX WARN: Multi-variable type inference failed */
    public SdkReference(String str, Function1<? super SdkCore, j6g> function1) {
        function1.getClass();
        this.sdkInstanceName = str;
        this.onSdkInstanceCaptured = function1;
        this.reference = new AtomicReference<>(null);
    }

    private final SdkCore tryAcquire() {
        SdkCore datadog;
        synchronized (this.reference) {
            datadog = this.reference.get();
            if (datadog == null) {
                if (Datadog.isInitialized(this.sdkInstanceName)) {
                    datadog = Datadog.getInstance(this.sdkInstanceName);
                    this.reference.set(datadog);
                    this.onSdkInstanceCaptured.invoke(datadog);
                } else {
                    datadog = null;
                }
            }
        }
        return datadog;
    }

    public final SdkCore get() {
        SdkCore sdkCore = this.reference.get();
        if (sdkCore == null) {
            return tryAcquire();
        }
        DatadogCore datadogCore = sdkCore instanceof DatadogCore ? (DatadogCore) sdkCore : null;
        Boolean boolValueOf = datadogCore != null ? Boolean.valueOf(datadogCore.isActive$dd_sdk_android_core_release()) : null;
        if (boolValueOf == null || boolValueOf.booleanValue()) {
            return sdkCore;
        }
        AtomicReference<SdkCore> atomicReference = this.reference;
        while (!atomicReference.compareAndSet(sdkCore, null) && atomicReference.get() == sdkCore) {
        }
        return null;
    }

    /* JADX INFO: renamed from: com.datadog.android.core.SdkReference$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/api/SdkCore;", "it", "Lj6g;", "invoke", "(Lcom/datadog/android/api/SdkCore;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<SdkCore, j6g> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(SdkCore sdkCore) {
            invoke2(sdkCore);
            return j6g.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SdkCore sdkCore) {
            sdkCore.getClass();
        }
    }

    public SdkReference(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public SdkReference() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SdkReference(String str, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function1);
    }
}
