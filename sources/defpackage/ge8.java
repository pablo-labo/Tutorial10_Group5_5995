package defpackage;

import defpackage.ke8;
import defpackage.sf8;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class ge8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public ge8(ke8.a aVar, ke8 ke8Var) {
        this.a = 0;
        this.b = ke8Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ke8 ke8Var = (ke8) obj;
                Class<T> cls = ke8Var.b;
                if (cls.isAnonymousClass()) {
                    return null;
                }
                a62 a62VarG = ke8Var.G();
                if (!a62VarG.c) {
                    String strC = a62VarG.f().c();
                    strC.getClass();
                    return strC;
                }
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return zve.n0(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    int iR = zve.R(simpleName, '$', 0, false, 6);
                    return iR == -1 ? simpleName : simpleName.substring(iR + 1, simpleName.length());
                }
                return zve.n0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            case 1:
                return new sf8.a((sf8) obj);
            default:
                in9 in9Var = (in9) ((gu5) obj).invoke();
                return in9Var instanceof d4 ? ((d4) in9Var).h() : in9Var;
        }
    }

    public /* synthetic */ ge8(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }
}
