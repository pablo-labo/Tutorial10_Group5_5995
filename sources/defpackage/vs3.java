package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class vs3 {
    public static final View a(ts3 ts3Var) {
        if (!ts3Var.k().c0) {
            ae7.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) tm8.a(us3.f(ts3Var));
    }
}
