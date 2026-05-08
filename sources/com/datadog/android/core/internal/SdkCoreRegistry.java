package com.datadog.android.core.internal;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import defpackage.gu5;
import defpackage.l5;
import defpackage.mj8;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/datadog/android/core/internal/SdkCoreRegistry;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "name", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lj6g;", "register", "(Ljava/lang/String;Lcom/datadog/android/api/SdkCore;)V", "unregister", "(Ljava/lang/String;)Lcom/datadog/android/api/SdkCore;", "getInstance", "clear", "()V", "Lcom/datadog/android/api/InternalLogger;", "", "instances", "Ljava/util/Map;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SdkCoreRegistry {
    public static final String DEFAULT_INSTANCE_NAME = "_dd.sdk_core.default";
    private final Map<String, SdkCore> instances;
    private final InternalLogger internalLogger;

    /* JADX INFO: renamed from: com.datadog.android.core.internal.SdkCoreRegistry$register$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$key = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.m("An SdkCode with name ", this.$key, " has already been registered.");
        }
    }

    public SdkCoreRegistry(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
        this.instances = new LinkedHashMap();
    }

    public static /* synthetic */ SdkCore getInstance$default(SdkCoreRegistry sdkCoreRegistry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return sdkCoreRegistry.getInstance(str);
    }

    public static /* synthetic */ SdkCore unregister$default(SdkCoreRegistry sdkCoreRegistry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return sdkCoreRegistry.unregister(str);
    }

    public final void clear() {
        this.instances.clear();
    }

    public final SdkCore getInstance(String name) {
        if (name == null) {
            name = DEFAULT_INSTANCE_NAME;
        }
        return this.instances.get(name);
    }

    public final void register(String name, SdkCore sdkCore) {
        sdkCore.getClass();
        if (name == null) {
            name = DEFAULT_INSTANCE_NAME;
        }
        if (this.instances.containsKey(name)) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new AnonymousClass1(name), (Throwable) null, false, (Map) null, 56, (Object) null);
        } else {
            this.instances.put(name, sdkCore);
        }
    }

    public final SdkCore unregister(String name) {
        if (name == null) {
            name = DEFAULT_INSTANCE_NAME;
        }
        return this.instances.remove(name);
    }
}
