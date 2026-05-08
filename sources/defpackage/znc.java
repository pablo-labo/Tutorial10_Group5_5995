package defpackage;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.uimanager.UIManagerModule;

/* JADX INFO: loaded from: classes2.dex */
public final class znc extends GuardedRunnable {
    public final /* synthetic */ aoc a;
    public final /* synthetic */ kf7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znc(aoc aocVar, kf7 kf7Var, mkf mkfVar) {
        super(mkfVar);
        this.a = aocVar;
        this.b = kf7Var;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        aoc aocVar = this.a;
        UIManagerModule uIManagerModule = (UIManagerModule) aocVar.getReactContext().a.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            int id = aocVar.getId();
            kf7 kf7Var = this.b;
            uIManagerModule.updateInsetsPadding(id, kf7Var.b, kf7Var.a, kf7Var.d, kf7Var.c);
        }
    }
}
