package com.facebook.react.internal.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.soloader.SoLoader;
import defpackage.f84;
import defpackage.zr4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0014¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H$¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u0003R\u001a\u0010\u001c\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u0003¨\u0006 "}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;", "", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/jni/HybridData;)V", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "moduleName", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "getModule", "(Ljava/lang/String;)Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "", "unstable_isModuleRegistered", "(Ljava/lang/String;)Z", "Lcom/facebook/react/bridge/NativeModule;", "getLegacyModule", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "unstable_isLegacyModuleRegistered", "", "getEagerInitModuleNames", "()Ljava/util/List;", "unstable_shouldEnableLegacyModuleInterop", "()Z", "Lj6g;", "maybeLoadOtherSoLibraries", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class TurboModuleManagerDelegate {
    private static final Companion Companion = new Companion(null);

    @f84
    private final HybridData mHybridData;

    static {
        SoLoader.l("turbomodulejsijni");
    }

    public TurboModuleManagerDelegate() {
        maybeLoadOtherSoLibraries();
        this.mHybridData = initHybrid();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    public List<String> getEagerInitModuleNames() {
        return zr4.a;
    }

    public NativeModule getLegacyModule(String moduleName) {
        moduleName.getClass();
        return null;
    }

    public abstract TurboModule getModule(String moduleName);

    public abstract HybridData initHybrid();

    public final synchronized void maybeLoadOtherSoLibraries() {
    }

    public boolean unstable_isLegacyModuleRegistered(String moduleName) {
        moduleName.getClass();
        return false;
    }

    public abstract boolean unstable_isModuleRegistered(String moduleName);

    /* JADX INFO: renamed from: unstable_shouldEnableLegacyModuleInterop */
    public boolean getShouldEnableLegacyModuleInterop() {
        return false;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TurboModuleManagerDelegate(HybridData hybridData) {
        hybridData.getClass();
        maybeLoadOtherSoLibraries();
        this.mHybridData = hybridData;
    }
}
