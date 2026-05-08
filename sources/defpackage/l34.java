package defpackage;

import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.DebugServerException;
import defpackage.xp1;

/* JADX INFO: loaded from: classes2.dex */
public final class l34 implements i24 {
    public final /* synthetic */ i34 a;
    public final /* synthetic */ xp1.a b;
    public final /* synthetic */ ulc c;

    public l34(i34 i34Var, xp1.a aVar, ulc ulcVar) {
        this.a = i34Var;
        this.b = aVar;
        this.c = ulcVar;
    }

    public final void a(DebugServerException debugServerException) {
        i34 i34Var = this.a;
        tm3 tm3Var = i34Var.d;
        if (tm3Var != null) {
            tm3Var.c();
        }
        i34Var.t = false;
        s55.g("ReactNative", "Unable to download JS bundle", debugServerException);
        UiThreadUtil.runOnUiThread(new z24(0, debugServerException, i34Var));
        this.c.d.u(debugServerException);
    }

    public final void b(Integer num, Integer num2, String str) {
        tm3 tm3Var = this.a.d;
        if (tm3Var != null) {
            UiThreadUtil.runOnUiThread(new rm3(num, num2, tm3Var, str));
        }
    }
}
