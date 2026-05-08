package defpackage;

import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf2 implements uv8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        Window window;
        View viewPeekDecorView;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i2 = ComponentActivity.i0;
                if (aVar == kv8.a.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            default:
                pld pldVar = (pld) obj;
                if (aVar == kv8.a.ON_RESUME && i6a.k()) {
                    pldVar.n();
                    break;
                }
                break;
        }
    }
}
