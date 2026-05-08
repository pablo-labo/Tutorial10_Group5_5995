package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.layout.q;

/* JADX INFO: loaded from: classes.dex */
public interface jm8 extends e.b {
    bg9 d(q qVar, vf9 vf9Var, long j);

    default int p(w59 w59Var, pl7 pl7Var, int i) {
        return d(new g(w59Var, w59Var.getLayoutDirection()), new mo3(pl7Var, jg9.a, kg9.a, 1), mq2.b(0, i, 7)).getWidth();
    }

    default int r(w59 w59Var, pl7 pl7Var, int i) {
        return d(new g(w59Var, w59Var.getLayoutDirection()), new mo3(pl7Var, jg9.b, kg9.b, 1), mq2.b(i, 0, 13)).getHeight();
    }

    default int v(w59 w59Var, pl7 pl7Var, int i) {
        return d(new g(w59Var, w59Var.getLayoutDirection()), new mo3(pl7Var, jg9.a, kg9.b, 1), mq2.b(i, 0, 13)).getHeight();
    }

    default int z(w59 w59Var, pl7 pl7Var, int i) {
        return d(new g(w59Var, w59Var.getLayoutDirection()), new mo3(pl7Var, jg9.b, kg9.a, 1), mq2.b(0, i, 7)).getWidth();
    }
}
