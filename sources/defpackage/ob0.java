package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ComponentActivity;
import androidx.profileinstaller.c;
import defpackage.eha;
import defpackage.v20;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ob0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((gu5) obj).invoke();
                break;
            case 1:
                ComponentActivity.d dVar = (ComponentActivity.d) obj;
                Runnable runnable = dVar.b;
                if (runnable != null) {
                    runnable.run();
                    dVar.b = null;
                }
                break;
            case 2:
                al3 al3Var = (al3) obj;
                v20.a aVarW0 = al3Var.w0();
                al3Var.B0(aVarW0, 1028, new l5((Object) aVarW0, 9));
                al3Var.f.d();
                break;
            case 3:
                bj6 bj6Var = (bj6) obj;
                bj6Var.r0 = true;
                bj6Var.F();
                break;
            case 4:
                eha.c cVar = (eha.c) obj;
                eha.b bVar = cVar.a.get();
                if (bVar != null) {
                    bVar.a(cVar.c.b());
                }
                break;
            case 5:
                c.b((Context) obj, new xr0(1), c.a, false);
                break;
            default:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
        }
    }
}
