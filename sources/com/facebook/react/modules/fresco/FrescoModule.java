package com.facebook.react.modules.fresco;

import android.content.Context;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import defpackage.bkc;
import defpackage.dz2;
import defpackage.enc;
import defpackage.f64;
import defpackage.f94;
import defpackage.fc4;
import defpackage.ft5;
import defpackage.it5;
import defpackage.j3f;
import defpackage.j6;
import defpackage.j6g;
import defpackage.lpa;
import defpackage.m27;
import defpackage.msb;
import defpackage.n27;
import defpackage.nmc;
import defpackage.p27;
import defpackage.pab;
import defpackage.po1;
import defpackage.q27;
import defpackage.rfe;
import defpackage.s55;
import defpackage.tp5;
import defpackage.u9a;
import defpackage.wab;
import defpackage.web;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.CookieJar;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = FrescoModule.NAME, needsEagerInit = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001$B)\b\u0007\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "clearOnDestroy", "Ln27;", "imagePipelineConfig", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;ZLn27;)V", "Lm27;", "imagePipeline", "hasBeenInitializedExternally", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lm27;ZZ)V", "Lj6g;", "initialize", "()V", "", "getName", "()Ljava/lang/String;", "clearSensitiveData", "onHostResume", "onHostPause", "onHostDestroy", "invalidate", "Z", "config", "Ln27;", "pipeline", "Lm27;", "getImagePipeline", "()Lm27;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String NAME = "FrescoModule";
    private static boolean hasBeenInitialized;
    private final boolean clearOnDestroy;
    private n27 config;
    private m27 pipeline;

    /* JADX INFO: renamed from: com.facebook.react.modules.fresco.FrescoModule$a, reason: from kotlin metadata */
    public static final class Companion {
        public static n27.a a(ReactContext reactContext) {
            reactContext.getClass();
            HashSet hashSet = new HashSet();
            j3f j3fVar = new j3f();
            new LinkedHashMap();
            new LinkedHashMap();
            hashSet.add(j3fVar);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.c(0L, timeUnit);
            builder.z = Util.b(0L, timeUnit);
            builder.A = Util.b(0L, timeUnit);
            builder.j = new bkc();
            OkHttpClient okHttpClient = new OkHttpClient(builder);
            CookieJar cookieJar = okHttpClient.Y;
            cookieJar.getClass();
            ((dz2) cookieJar).c(new JavaNetCookieJar(new tp5()));
            Context applicationContext = reactContext.getApplicationContext();
            applicationContext.getClass();
            n27.a aVar = new n27.a(applicationContext);
            aVar.c = new lpa(okHttpClient);
            aVar.c = new enc(okHttpClient);
            aVar.b = f94.b;
            aVar.d = hashSet;
            p27.a aVar2 = aVar.g;
            aVar2.getClass();
            aVar2.c = true;
            j6g j6gVar = j6g.a;
            return aVar;
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, m27 m27Var, boolean z, boolean z2) {
        this(reactApplicationContext, z, null, 4, null);
        this.pipeline = m27Var;
        if (z2) {
            hasBeenInitialized = true;
        }
    }

    public static final n27.a getDefaultConfigBuilder(ReactContext reactContext) {
        INSTANCE.getClass();
        return Companion.a(reactContext);
    }

    private final m27 getImagePipeline() {
        if (this.pipeline == null) {
            q27 q27Var = q27.p;
            web.h(q27Var, "ImagePipelineFactory was not initialized!");
            this.pipeline = q27Var.e();
        }
        return this.pipeline;
    }

    public static final boolean hasBeenInitialized() {
        INSTANCE.getClass();
        return hasBeenInitialized;
    }

    public void clearSensitiveData() {
        m27 imagePipeline = getImagePipeline();
        if (imagePipeline != null) {
            j6 j6Var = new j6(8);
            imagePipeline.f.c(j6Var);
            imagePipeline.g.c(j6Var);
            f64 f64Var = imagePipeline.c.get();
            f64Var.getClass();
            f64 f64Var2 = f64Var;
            f64Var2.b().a();
            f64Var2.a().a();
            Iterator<Map.Entry<String, po1>> it = f64Var2.c().entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        boolean z;
        boolean zP = wab.p(5);
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.getClass();
        reactApplicationContext.addLifecycleEventListener(this);
        INSTANCE.getClass();
        boolean z2 = hasBeenInitialized;
        n27 n27Var = this.config;
        if (!z2) {
            if (n27Var == null) {
                n27Var = new n27(Companion.a(reactApplicationContext));
            }
            fc4.a aVar = new fc4.a();
            Context applicationContext = reactApplicationContext.getApplicationContext();
            fc4 fc4Var = new fc4(aVar);
            it5.a();
            if (ft5.b) {
                s55.a.getClass();
                if (zP) {
                    wab.t(5, ft5.class.getSimpleName(), "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
                }
            } else {
                ft5.b = true;
            }
            synchronized (u9a.class) {
                z = u9a.a != null;
            }
            if (!z) {
                it5.a();
                try {
                    try {
                        try {
                            try {
                                Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, applicationContext);
                            } catch (ClassNotFoundException unused) {
                                u9a.a(new msb());
                            } catch (IllegalAccessException unused2) {
                                u9a.a(new msb());
                            }
                        } catch (NoSuchMethodException unused3) {
                            u9a.a(new msb());
                        }
                    } catch (InvocationTargetException unused4) {
                        u9a.a(new msb());
                    }
                } finally {
                    it5.a();
                }
            }
            Context applicationContext2 = applicationContext.getApplicationContext();
            synchronized (q27.class) {
                try {
                    if (q27.p != null) {
                        s55.a.getClass();
                        if (zP) {
                            wab.t(5, q27.class.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                        }
                    }
                    q27.p = new q27(n27Var);
                } finally {
                }
            }
            it5.a();
            ft5.a = new pab(applicationContext2, fc4Var);
            int i = rfe.W;
            it5.a();
            it5.a();
            hasBeenInitialized = true;
        } else if (n27Var != null) {
            s55.n("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.config = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        m27 imagePipeline;
        INSTANCE.getClass();
        if (hasBeenInitialized && this.clearOnDestroy && (imagePipeline = getImagePipeline()) != null) {
            j6 j6Var = new j6(8);
            imagePipeline.f.c(j6Var);
            imagePipeline.g.c(j6Var);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, m27 m27Var) {
        this(reactApplicationContext, m27Var, false, false, 12, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, m27 m27Var, boolean z) {
        this(reactApplicationContext, m27Var, z, false, 8, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, null, 4, null);
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, n27 n27Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : n27Var);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, n27 n27Var) {
        super(reactApplicationContext);
        this.clearOnDestroy = z;
        this.config = n27Var;
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, m27 m27Var, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, m27Var, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, false, null, 6, null);
    }
}
