package defpackage;

import com.facebook.react.bridge.UIManagerProvider;
import defpackage.pnc;
import defpackage.wmc;

/* JADX INFO: loaded from: classes3.dex */
public final class ymc extends zmc {
    @Override // defpackage.wmc
    public final boolean b() {
        this.d.getClass();
        return true;
    }

    @Override // defpackage.wmc
    public final c0f c() {
        this.d.getClass();
        return new wmc.a();
    }

    @Override // defpackage.wmc
    public final m34 getDevSupportManagerFactory() {
        m34 m34Var = (m34) a7e.S(a7e.V(z92.G0(this.e), new wa(16)));
        return m34Var == null ? (m34) g("getDevSupportManagerFactory") : m34Var;
    }

    @Override // com.facebook.react.defaults.b, defpackage.wmc
    public final pnc.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return (pnc.a) g("getReactPackageTurboModuleManagerDelegateBuilder");
    }

    @Override // defpackage.wmc
    public final fuc getRedBoxHandler() {
        return (fuc) g("getRedBoxHandler");
    }

    @Override // com.facebook.react.defaults.b, defpackage.wmc
    public final UIManagerProvider getUIManagerProvider() {
        return (UIManagerProvider) g("getUIManagerProvider");
    }
}
