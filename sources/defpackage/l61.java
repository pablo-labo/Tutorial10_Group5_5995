package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface l61 extends iy3 {
    Object B1(peb pebVar, x81 x81Var);

    default Object P1(long j, l8f l8fVar, lu2 lu2Var) {
        return l8fVar.invoke(this, lu2Var);
    }

    neb Q0();

    long a();

    opg getViewConfiguration();

    default long r0() {
        return 0L;
    }

    default Object v1(long j, Function2 function2, pu2 pu2Var) {
        return function2.invoke(this, pu2Var);
    }
}
