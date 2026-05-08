package defpackage;

import androidx.compose.runtime.h;

/* JADX INFO: loaded from: classes.dex */
public final class om2 {
    public static final <T> T a(nm2 nm2Var, h hVar) {
        if (!nm2Var.k().c0) {
            ae7.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) us3.f(nm2Var).p0.a(hVar);
    }
}
