package defpackage;

import androidx.compose.ui.layout.g;
import androidx.compose.ui.layout.q;

/* JADX INFO: loaded from: classes.dex */
public interface lm8 extends ts3 {
    bg9 d(q qVar, vf9 vf9Var, long j);

    default int p(w59 w59Var, pl7 pl7Var, int i) {
        return d(new g(w59Var, w59Var.getLayoutDirection()), new aja(pl7Var, cja.a, dja.a), mq2.b(0, i, 7)).getWidth();
    }

    default int r(w59 w59Var, pl7 pl7Var, int i) {
        return d(new g(w59Var, w59Var.getLayoutDirection()), new aja(pl7Var, cja.b, dja.b), mq2.b(i, 0, 13)).getHeight();
    }

    default int v(w59 w59Var, pl7 pl7Var, int i) {
        return d(new g(w59Var, w59Var.getLayoutDirection()), new aja(pl7Var, cja.a, dja.b), mq2.b(i, 0, 13)).getHeight();
    }

    default int z(w59 w59Var, pl7 pl7Var, int i) {
        return d(new g(w59Var, w59Var.getLayoutDirection()), new aja(pl7Var, cja.b, dja.a), mq2.b(0, i, 7)).getWidth();
    }
}
