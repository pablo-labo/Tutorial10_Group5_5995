package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lef implements Function1<ng8, Boolean> {
    public final /* synthetic */ fm5 a;
    public final /* synthetic */ lu8 b;

    public lef(fm5 fm5Var, lu8 lu8Var) {
        this.a = fm5Var;
        this.b = lu8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ng8 ng8Var) {
        KeyEvent keyEvent = ng8Var.a;
        InputDevice device = keyEvent.getDevice();
        boolean zC = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual() && pg8.A(keyEvent) == 2 && keyEvent.getSource() != 257) {
            boolean zA = mef.a(19, keyEvent);
            fm5 fm5Var = this.a;
            if (zA) {
                zC = fm5Var.c(5);
            } else if (mef.a(20, keyEvent)) {
                zC = fm5Var.c(6);
            } else if (mef.a(21, keyEvent)) {
                zC = fm5Var.c(3);
            } else if (mef.a(22, keyEvent)) {
                zC = fm5Var.c(4);
            } else if (mef.a(23, keyEvent)) {
                hne hneVar = this.b.c;
                if (hneVar != null) {
                    hneVar.b();
                }
                zC = true;
            }
        }
        return Boolean.valueOf(zC);
    }
}
