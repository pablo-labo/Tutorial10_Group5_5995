package defpackage;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class ph6 implements JavaScriptExecutorFactory {
    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final JavaScriptExecutor create() {
        HermesExecutor.a aVar = HermesExecutor.a;
        return new HermesExecutor(HermesExecutor.a.initHybridDefaultConfig(true, ""));
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public final void stopSamplingProfiler(String str) {
        str.getClass();
        HermesSamplingProfiler.dumpSampledTraceToFile(str);
        HermesSamplingProfiler.disable();
    }

    public final String toString() {
        return "JSIExecutor+HermesRuntime";
    }
}
