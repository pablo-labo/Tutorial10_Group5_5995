package com.facebook.react.uimanager;

import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0087 ¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/ComponentNameResolverBinding;", "", "<init>", "()V", "Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "componentNameResolver", "Lj6g;", "install", "(Lcom/facebook/react/bridge/RuntimeExecutor;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComponentNameResolverBinding {
    public static final ComponentNameResolverBinding INSTANCE = new ComponentNameResolverBinding();

    static {
        SoLoader.l("uimanagerjni");
    }

    private ComponentNameResolverBinding() {
    }

    public static final native void install(RuntimeExecutor runtimeExecutor, Object componentNameResolver);
}
