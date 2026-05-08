package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class uy6 implements Function1<ng8, Boolean> {
    public final /* synthetic */ fm5 a;

    public uy6(fm5 fm5Var) {
        this.a = fm5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ng8 ng8Var) {
        boolean z;
        KeyEvent keyEvent = ng8Var.a;
        keyEvent.getClass();
        if (lg8.a(ak2.a(keyEvent.getKeyCode()), lg8.i) && pg8.A(keyEvent) == 2) {
            boolean zIsShiftPressed = keyEvent.isShiftPressed();
            z = true;
            fm5 fm5Var = this.a;
            if (zIsShiftPressed) {
                fm5Var.c(2);
            } else {
                fm5Var.c(1);
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
