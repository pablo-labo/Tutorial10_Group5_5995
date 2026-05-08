package com.facebook.react.bridge;

import android.os.Trace;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.dkc;
import defpackage.f84;
import defpackage.h3f;
import defpackage.i3f;
import defpackage.j6g;
import defpackage.r6;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8G¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0011\u0010*\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0011\u0010+\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0011\u0010,\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b,\u0010\u0015R\u0011\u0010.\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u0011\u0010\r\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b/\u0010\f¨\u00061"}, d2 = {"Lcom/facebook/react/bridge/ModuleHolder;", "", "Lcom/facebook/react/module/model/ReactModuleInfo;", "moduleInfo", "Ljavax/inject/Provider;", "Lcom/facebook/react/bridge/NativeModule;", "provider", "<init>", "(Lcom/facebook/react/module/model/ReactModuleInfo;Ljavax/inject/Provider;)V", "nativeModule", "(Lcom/facebook/react/bridge/NativeModule;)V", "create", "()Lcom/facebook/react/bridge/NativeModule;", "module", "Lj6g;", "doInitialize", "markInitializable$ReactAndroid_release", "()V", "markInitializable", "", "hasInstance$ReactAndroid_release", "()Z", "hasInstance", "destroy", "", "instanceKey", "I", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "reactModuleInfo", "Lcom/facebook/react/module/model/ReactModuleInfo;", "Ljavax/inject/Provider;", "internalModule", "Lcom/facebook/react/bridge/NativeModule;", "initializable", "Z", "isCreating", "isInitializing", "getCanOverrideExistingModule", "canOverrideExistingModule", "isTurboModule", "isCxxModule", "getClassName", "className", "getModule", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class ModuleHolder {
    private static final Companion Companion = new Companion(null);
    private static final AtomicInteger instanceKeyCounter = new AtomicInteger(1);
    private boolean initializable;
    private final int instanceKey;
    private NativeModule internalModule;
    private boolean isCreating;
    private boolean isInitializing;
    private final String name;
    private Provider<? extends NativeModule> provider;
    private final ReactModuleInfo reactModuleInfo;

    public ModuleHolder(NativeModule nativeModule) {
        nativeModule.getClass();
        this.instanceKey = instanceKeyCounter.getAndIncrement();
        String name = nativeModule.getName();
        name.getClass();
        this.name = name;
        String name2 = nativeModule.getName();
        name2.getClass();
        this.reactModuleInfo = new ReactModuleInfo(name2, nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), TurboModule.class.isAssignableFrom(nativeModule.getClass()));
        this.internalModule = nativeModule;
        dkc.c.getClass();
    }

    private final NativeModule create() {
        boolean z = false;
        SoftAssertions.assertCondition(this.internalModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.name, this.instanceKey);
        i3f i3fVar = new i3f("ModuleHolder.createModule");
        i3fVar.S(this.name, "name");
        i3fVar.T();
        dkc.c.getClass();
        try {
            Provider<? extends NativeModule> provider = this.provider;
            if (provider == null) {
                throw new IllegalStateException("Required value was null.");
            }
            NativeModule nativeModule = provider.get();
            nativeModule.getClass();
            NativeModule nativeModule2 = nativeModule;
            this.provider = null;
            synchronized (this) {
                try {
                    this.internalModule = nativeModule2;
                    if (this.initializable && !this.isInitializing) {
                        z = true;
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                doInitialize(nativeModule2);
            }
            return nativeModule2;
        } finally {
        }
    }

    private final void doInitialize(NativeModule module) {
        boolean z;
        i3f i3fVar = new i3f("ModuleHolder.initialize");
        i3fVar.S(this.name, "name");
        i3fVar.T();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.name, this.instanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.initializable || this.isInitializing) {
                        z = false;
                    } else {
                        z = true;
                        this.isInitializing = true;
                    }
                    j6g j6gVar = j6g.a;
                } finally {
                }
            }
            if (z) {
                if (module != null) {
                    module.initialize();
                }
                synchronized (this) {
                    this.isInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.name, this.instanceKey);
            new h3f(11);
            Trace.endSection();
        }
    }

    public final synchronized void destroy() {
        NativeModule nativeModule = this.internalModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public final boolean getCanOverrideExistingModule() {
        return this.reactModuleInfo.c;
    }

    public final String getClassName() {
        return this.reactModuleInfo.b;
    }

    @f84
    public final NativeModule getModule() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            try {
                NativeModule nativeModule2 = this.internalModule;
                if (nativeModule2 != null) {
                    return nativeModule2;
                }
                if (this.isCreating) {
                    z = false;
                } else {
                    z = true;
                    this.isCreating = true;
                }
                j6g j6gVar = j6g.a;
                if (z) {
                    NativeModule nativeModuleCreate = create();
                    synchronized (this) {
                        this.isCreating = false;
                        notifyAll();
                    }
                    return nativeModuleCreate;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.internalModule;
                        if (nativeModule != null || !this.isCreating) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (nativeModule == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return nativeModule;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @f84
    public final String getName() {
        return this.name;
    }

    public final synchronized boolean hasInstance$ReactAndroid_release() {
        return this.internalModule != null;
    }

    public final boolean isCxxModule() {
        return this.reactModuleInfo.e;
    }

    public final boolean isTurboModule() {
        return this.reactModuleInfo.f;
    }

    public final void markInitializable$ReactAndroid_release() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            try {
                this.initializable = true;
                nativeModule = this.internalModule;
                if (nativeModule == null) {
                    z = false;
                    nativeModule = null;
                } else if (this.isInitializing) {
                    throw new IllegalStateException("Check failed.");
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (nativeModule != null) {
                doInitialize(nativeModule);
            } else {
                r6.g("Required value was null.");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/bridge/ModuleHolder$Companion;", "", "<init>", "()V", "instanceKeyCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider<? extends NativeModule> provider) {
        reactModuleInfo.getClass();
        provider.getClass();
        this.instanceKey = instanceKeyCounter.getAndIncrement();
        this.name = reactModuleInfo.a;
        this.provider = provider;
        this.reactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.d) {
            this.internalModule = create();
        }
    }
}
