package defpackage;

import android.widget.PopupWindow;
import androidx.media3.session.a0;
import androidx.media3.session.j;
import defpackage.fmc;
import defpackage.kv8;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sm3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sm3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tm3 tm3Var = (tm3) obj;
                PopupWindow popupWindow = tm3Var.c;
                if (popupWindow != null && popupWindow.isShowing()) {
                    popupWindow.dismiss();
                    tm3Var.c = null;
                    tm3Var.b = null;
                }
                break;
            case 1:
                ((j) obj).T0();
                break;
            case 2:
                ynb ynbVar = (ynb) obj;
                aw8 aw8Var = ynbVar.f;
                if (ynbVar.b == 0) {
                    ynbVar.c = true;
                    aw8Var.f(kv8.a.ON_PAUSE);
                }
                if (ynbVar.a == 0 && ynbVar.c) {
                    aw8Var.f(kv8.a.ON_STOP);
                    ynbVar.d = true;
                    break;
                }
                break;
            case 3:
                fmc fmcVar = ((fmc.b) obj).a.get();
                if (fmcVar != null) {
                    fmcVar.h.w();
                }
                break;
            case 4:
                sm5.b((sm5) obj);
                break;
            default:
                ((a0) obj).c();
                break;
        }
    }
}
