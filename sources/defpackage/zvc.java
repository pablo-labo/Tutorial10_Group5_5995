package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class zvc {
    public static final Field a(qf8<?> qf8Var) {
        qf8Var.getClass();
        xf8<?> xf8VarC = akg.c(qf8Var);
        if (xf8VarC != null) {
            return xf8VarC.Z.getValue();
        }
        return null;
    }

    public static final Method b(ve8<?> ve8Var) {
        pv1<?> pv1VarW;
        ve8Var.getClass();
        wd8 wd8VarA = akg.a(ve8Var);
        Member member = (wd8VarA == null || (pv1VarW = wd8VarA.w()) == null) ? null : pv1VarW.getMember();
        if (member instanceof Method) {
            return (Method) member;
        }
        return null;
    }
}
