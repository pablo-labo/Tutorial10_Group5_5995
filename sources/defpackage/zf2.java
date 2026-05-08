package defpackage;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf2 implements uv8 {
    public final /* synthetic */ dqa a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ zf2(dqa dqaVar, ComponentActivity componentActivity) {
        this.a = dqaVar;
        this.b = componentActivity;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        int i = ComponentActivity.i0;
        if (aVar == kv8.a.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = ComponentActivity.b.a(this.b);
            dqa dqaVar = this.a;
            dqaVar.e = onBackInvokedDispatcherA;
            dqaVar.e(dqaVar.g);
        }
    }
}
