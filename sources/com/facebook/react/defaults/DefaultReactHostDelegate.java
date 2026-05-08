package com.facebook.react.defaults;

import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostDelegate;
import com.facebook.react.runtime.hermes.HermesInstance;
import defpackage.inc;
import defpackage.iq0;
import defpackage.j6g;
import defpackage.pnc;
import defpackage.zr4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00100\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00102\n\u0010\u0016\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R$\u0010\u0011\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00100\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactHostDelegate;", "Lcom/facebook/react/runtime/ReactHostDelegate;", "", "jsMainModulePath", "Lcom/facebook/react/bridge/JSBundleLoader;", "jsBundleLoader", "", "Linc;", "reactPackages", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lj6g;", "exceptionHandler", "Lpnc$a;", "turboModuleManagerDelegateBuilder", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/JSBundleLoader;Ljava/util/List;Lcom/facebook/react/runtime/JSRuntimeFactory;Lcom/facebook/react/runtime/BindingsInstaller;Lkotlin/jvm/functions/Function1;Lpnc$a;)V", "error", "handleInstanceException", "(Ljava/lang/Exception;)V", "Ljava/lang/String;", "getJsMainModulePath", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/JSBundleLoader;", "getJsBundleLoader", "()Lcom/facebook/react/bridge/JSBundleLoader;", "Ljava/util/List;", "getReactPackages", "()Ljava/util/List;", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "getJsRuntimeFactory", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "Lcom/facebook/react/runtime/BindingsInstaller;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "Lkotlin/jvm/functions/Function1;", "Lpnc$a;", "getTurboModuleManagerDelegateBuilder", "()Lpnc$a;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultReactHostDelegate implements ReactHostDelegate {
    private final BindingsInstaller bindingsInstaller;
    private final Function1<Exception, j6g> exceptionHandler;
    private final JSBundleLoader jsBundleLoader;
    private final String jsMainModulePath;
    private final JSRuntimeFactory jsRuntimeFactory;
    private final List<inc> reactPackages;
    private final pnc.a turboModuleManagerDelegateBuilder;

    public /* synthetic */ DefaultReactHostDelegate(String str, JSBundleLoader jSBundleLoader, List list, JSRuntimeFactory jSRuntimeFactory, BindingsInstaller bindingsInstaller, Function1 function1, pnc.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jSBundleLoader, (i & 4) != 0 ? zr4.a : list, (i & 8) != 0 ? new HermesInstance() : jSRuntimeFactory, (i & 16) != 0 ? null : bindingsInstaller, (i & 32) != 0 ? new iq0(5) : function1, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g _init_$lambda$0(Exception exc) throws Exception {
        exc.getClass();
        throw exc;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public BindingsInstaller getBindingsInstaller() {
        return this.bindingsInstaller;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public JSBundleLoader getJsBundleLoader() {
        return this.jsBundleLoader;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public String getJsMainModulePath() {
        return this.jsMainModulePath;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public JSRuntimeFactory getJsRuntimeFactory() {
        return this.jsRuntimeFactory;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public List<inc> getReactPackages() {
        return this.reactPackages;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public pnc.a getTurboModuleManagerDelegateBuilder() {
        return this.turboModuleManagerDelegateBuilder;
    }

    @Override // com.facebook.react.runtime.ReactHostDelegate
    public void handleInstanceException(Exception error) {
        error.getClass();
        this.exceptionHandler.invoke(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultReactHostDelegate(String str, JSBundleLoader jSBundleLoader, List<? extends inc> list, JSRuntimeFactory jSRuntimeFactory, BindingsInstaller bindingsInstaller, Function1<? super Exception, j6g> function1, pnc.a aVar) {
        str.getClass();
        jSBundleLoader.getClass();
        list.getClass();
        jSRuntimeFactory.getClass();
        function1.getClass();
        aVar.getClass();
        this.jsMainModulePath = str;
        this.jsBundleLoader = jSBundleLoader;
        this.reactPackages = list;
        this.jsRuntimeFactory = jSRuntimeFactory;
        this.bindingsInstaller = bindingsInstaller;
        this.exceptionHandler = function1;
        this.turboModuleManagerDelegateBuilder = aVar;
    }
}
