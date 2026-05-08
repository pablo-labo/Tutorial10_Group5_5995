package defpackage;

import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class imc implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ReactInstanceManagerInspectorTarget.mHybridData$lambda$0(runnable);
    }
}
