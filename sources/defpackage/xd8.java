package defpackage;

import defpackage.df8;
import defpackage.qf8;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class xd8 {
    public static final boolean a(ud8<?> ud8Var) {
        pv1<?> pv1VarW;
        pv1<?> pv1VarY;
        if (ud8Var instanceof df8) {
            qf8 qf8Var = (qf8) ud8Var;
            Field fieldA = zvc.a(qf8Var);
            if (!(fieldA != null ? fieldA.isAccessible() : true)) {
                return false;
            }
            Method methodB = zvc.b(qf8Var.c());
            if (!(methodB != null ? methodB.isAccessible() : true)) {
                return false;
            }
            Method methodB2 = zvc.b(((df8) ud8Var).e());
            if (!(methodB2 != null ? methodB2.isAccessible() : true)) {
                return false;
            }
        } else if (ud8Var instanceof qf8) {
            qf8 qf8Var2 = (qf8) ud8Var;
            Field fieldA2 = zvc.a(qf8Var2);
            if (!(fieldA2 != null ? fieldA2.isAccessible() : true)) {
                return false;
            }
            Method methodB3 = zvc.b(qf8Var2.c());
            if (!(methodB3 != null ? methodB3.isAccessible() : true)) {
                return false;
            }
        } else if (ud8Var instanceof qf8.b) {
            Field fieldA3 = zvc.a(((qf8.b) ud8Var).o());
            if (!(fieldA3 != null ? fieldA3.isAccessible() : true)) {
                return false;
            }
            Method methodB4 = zvc.b((ve8) ud8Var);
            if (!(methodB4 != null ? methodB4.isAccessible() : true)) {
                return false;
            }
        } else if (ud8Var instanceof df8.a) {
            Field fieldA4 = zvc.a(((df8.a) ud8Var).o());
            if (!(fieldA4 != null ? fieldA4.isAccessible() : true)) {
                return false;
            }
            Method methodB5 = zvc.b((ve8) ud8Var);
            if (!(methodB5 != null ? methodB5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(ud8Var instanceof ve8)) {
                StringBuilder sb = new StringBuilder("Unknown callable: ");
                sb.append(ud8Var);
                Class<?> cls = ud8Var.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new UnsupportedOperationException(sb.toString());
            }
            ve8 ve8Var = (ve8) ud8Var;
            Method methodB6 = zvc.b(ve8Var);
            if (!(methodB6 != null ? methodB6.isAccessible() : true)) {
                return false;
            }
            wd8 wd8VarA = akg.a(ud8Var);
            Object member = (wd8VarA == null || (pv1VarY = wd8VarA.y()) == null) ? null : pv1VarY.getMember();
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            wd8 wd8VarA2 = akg.a(ve8Var);
            Member member2 = (wd8VarA2 == null || (pv1VarW = wd8VarA2.w()) == null) ? null : pv1VarW.getMember();
            Constructor constructor = member2 instanceof Constructor ? (Constructor) member2 : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
