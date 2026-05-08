package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import defpackage.f84;
import defpackage.sy3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/bridge/CxxModuleWrapperBase;", "Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "getName", "()Ljava/lang/String;", "Lj6g;", "initialize", "()V", "", "canOverrideExistingModule", "()Z", "invalidate", "hd", "resetModule", "Lcom/facebook/jni/HybridData;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public class CxxModuleWrapperBase implements NativeModule {
    private static final Companion Companion = new Companion(null);

    @f84
    private HybridData mHybridData;

    static {
        BridgeSoLoader.staticInit();
    }

    public CxxModuleWrapperBase(HybridData hybridData) {
        hybridData.getClass();
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @sy3
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public native String getName();

    @Override // com.facebook.react.bridge.NativeModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mHybridData.resetNative();
    }

    public final void resetModule(HybridData hd) {
        hd.getClass();
        HybridData hybridData = this.mHybridData;
        if (hd != hybridData) {
            hybridData.resetNative();
            this.mHybridData = hd;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/CxxModuleWrapperBase$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
