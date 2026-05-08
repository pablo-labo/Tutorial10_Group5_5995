package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.indeed.android.rnghostwriter.RNGhostwriterModule;
import com.reactnativemenu.MenuViewManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jo9 implements inc {
    public final /* synthetic */ int a;

    public /* synthetic */ jo9(int i) {
        this.a = i;
    }

    @Override // defpackage.inc
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        int i = this.a;
        reactApplicationContext.getClass();
        switch (i) {
            case 0:
                return zr4.a;
            default:
                return u63.d0(new RNGhostwriterModule(reactApplicationContext));
        }
    }

    @Override // defpackage.inc
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                return u63.d0(new MenuViewManager());
            default:
                return new ArrayList();
        }
    }
}
