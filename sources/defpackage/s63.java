package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ObsoleteSdkInt"})
public interface s63 {
    void a(Context context, c06 c06Var, CancellationSignal cancellationSignal, xr0 xr0Var, kk0 kk0Var);

    default Object b(Context context, c06 c06Var, wa6 wa6Var) {
        qw1 qw1Var = new qw1(1, ewa.v(wa6Var));
        qw1Var.q();
        CancellationSignal cancellationSignal = new CancellationSignal();
        qw1Var.t(new r63(cancellationSignal));
        a(context, c06Var, cancellationSignal, new xr0(1), new kk0(qw1Var));
        return qw1Var.p();
    }
}
