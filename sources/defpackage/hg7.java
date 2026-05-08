package defpackage;

import java.util.ArrayList;
import org.koin.core.error.InstanceCreationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hg7<T> {
    public final ue1<T> a;

    public hg7(ue1<T> ue1Var) {
        this.a = ue1Var;
    }

    public T a(fg7 fg7Var) throws InstanceCreationException {
        fg7Var.getClass();
        o81 o81Var = fg7Var.a;
        StringBuilder sb = new StringBuilder("| (+) '");
        ue1<T> ue1Var = this.a;
        sb.append(ue1Var);
        sb.append('\'');
        String string = sb.toString();
        tu8 tu8Var = tu8.a;
        if (o81Var.E(tu8Var)) {
            o81Var.D(tu8Var, string);
        }
        int i = 0;
        try {
            v3b v3bVar = fg7Var.c;
            if (v3bVar == null) {
                v3bVar = new v3b(i);
            }
            return ue1Var.d.invoke(fg7Var.b, v3bVar);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                if (zve.L(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(z92.W0(arrayList, "\n\t", null, null, null, 62));
            String str = "* Instance creation error : could not create instance for '" + ue1Var + "': " + sb2.toString();
            tu8 tu8Var2 = tu8.d;
            if (o81Var.E(tu8Var2)) {
                o81Var.D(tu8Var2, str);
            }
            throw new InstanceCreationException("Could not create instance for '" + ue1Var + '\'', e);
        }
    }

    public abstract void b();

    public abstract T c(fg7 fg7Var);

    public final boolean equals(Object obj) {
        hg7 hg7Var = obj instanceof hg7 ? (hg7) obj : null;
        return this.a.equals(hg7Var != null ? hg7Var.a : null);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
