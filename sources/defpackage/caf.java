package defpackage;

import defpackage.tsd;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface caf extends nh5 {
    @Override // defpackage.nh5
    default Object a(tsd.a aVar, float f, lu2 lu2Var) {
        return b(aVar, f, hh2.a0, (pu2) lu2Var);
    }

    Object b(xrd xrdVar, float f, Function1 function1, pu2 pu2Var);
}
