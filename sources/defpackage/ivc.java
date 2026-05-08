package defpackage;

import defpackage.qu7;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public final class ivc implements qu7 {
    public final ClassLoader a;

    public ivc(ClassLoader classLoader) {
        this.a = classLoader;
    }

    @Override // defpackage.qu7
    public final void a(mq5 mq5Var) {
        mq5Var.getClass();
    }

    @Override // defpackage.qu7
    public final svc b(mq5 mq5Var) {
        mq5Var.getClass();
        return new svc(mq5Var);
    }

    @Override // defpackage.qu7
    public final hvc c(qu7.a aVar) {
        Class<?> cls;
        a62 a62Var = aVar.a;
        mq5 mq5Var = a62Var.a;
        String strH = wve.H(a62Var.b.a.a, JwtParser.SEPARATOR_CHAR, '$');
        if (!mq5Var.a.c()) {
            strH = mq5Var.a.a + JwtParser.SEPARATOR_CHAR + strH;
        }
        try {
            cls = Class.forName(strH, false, this.a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            return new hvc(cls);
        }
        return null;
    }
}
