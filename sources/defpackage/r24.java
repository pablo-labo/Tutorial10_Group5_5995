package defpackage;

import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import com.facebook.react.devsupport.InspectorFlags;
import defpackage.i34;

/* JADX INFO: loaded from: classes2.dex */
public final class r24 extends ula {
    public final /* synthetic */ i34.b a;

    public r24(i34.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.ula, defpackage.d4d
    public final void a() {
        CxxInspectorPackagerConnection cxxInspectorPackagerConnection;
        i34 i34Var = i34.this;
        if (!InspectorFlags.getFuseboxEnabled() && (cxxInspectorPackagerConnection = i34Var.h.i) != null) {
            cxxInspectorPackagerConnection.sendEventToAllConnections("{ \"id\":1,\"method\":\"Debugger.disable\" }");
        }
        UiThreadUtil.runOnUiThread(new ky1(i34Var, 4));
    }
}
