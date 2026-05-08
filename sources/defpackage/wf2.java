package defpackage;

import androidx.activity.ComponentActivity;
import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf2 implements uv8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wf2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i2 = ComponentActivity.i0;
                if (aVar == kv8.a.ON_DESTROY) {
                    componentActivity.b.b = null;
                    if (!componentActivity.isChangingConfigurations()) {
                        componentActivity.getViewModelStore().a();
                    }
                    ComponentActivity.d dVar = componentActivity.f;
                    ComponentActivity componentActivity2 = ComponentActivity.this;
                    componentActivity2.getWindow().getDecorView().removeCallbacks(dVar);
                    componentActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(dVar);
                }
                break;
            default:
                cld cldVar = (cld) obj;
                if (aVar == kv8.a.ON_START) {
                    cldVar.h = true;
                } else if (aVar == kv8.a.ON_STOP) {
                    cldVar.h = false;
                }
                break;
        }
    }
}
