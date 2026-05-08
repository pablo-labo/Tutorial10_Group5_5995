package defpackage;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class koa {
    public static final <T extends e.c & joa> void a(T t, gu5<j6g> gu5Var) {
        loa loaVar = t.V;
        if (loaVar == null) {
            loaVar = new loa(t);
            t.V = loaVar;
        }
        us3.g(t).getSnapshotObserver().a(loaVar, loa.b, gu5Var);
    }
}
