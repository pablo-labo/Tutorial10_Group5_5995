package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
import defpackage.l5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/hermes/reactexecutor/HermesExecutor;", "Lcom/facebook/react/bridge/JavaScriptExecutor;", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HermesExecutor extends JavaScriptExecutor {
    public static final a a = new a();
    public static String b;

    public static final class a {
        @DoNotStrip
        private final HybridData initHybrid(boolean z, String str, long j) {
            return HermesExecutor.initHybrid(z, str, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @DoNotStrip
        public final HybridData initHybridDefaultConfig(boolean z, String str) {
            return HermesExecutor.b(str, z);
        }
    }

    static {
        if (b == null) {
            SoLoader.l("hermes");
            SoLoader.l("hermes_executor");
            b = "Release";
        }
    }

    public static final /* synthetic */ HybridData b(String str, boolean z) {
        return initHybridDefaultConfig(z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DoNotStrip
    public static final native HybridData initHybrid(boolean z, String str, long j);

    @DoNotStrip
    private static final native HybridData initHybridDefaultConfig(boolean z, String str);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public final String getName() {
        return l5.l("HermesExecutor", b);
    }
}
