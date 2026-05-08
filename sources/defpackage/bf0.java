package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bf0 implements af0 {
    public final ui8 a;
    public final Map<n8a, up2<?>> b;
    public final qne c;

    public bf0(mge mgeVar, Map map, qne qneVar) {
        if (mgeVar == null) {
            b(0);
            throw null;
        }
        if (map == null) {
            b(1);
            throw null;
        }
        this.a = mgeVar;
        this.b = map;
        this.c = qneVar;
    }

    public static /* synthetic */ void b(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.af0
    public final qne g() {
        return this.c;
    }

    @Override // defpackage.af0
    public final ui8 getType() {
        ui8 ui8Var = this.a;
        if (ui8Var != null) {
            return ui8Var;
        }
        b(3);
        throw null;
    }

    @Override // defpackage.af0
    public final mq5 h() {
        t52 t52VarD = b04.d(this);
        if (t52VarD != null) {
            if (lx4.f(t52VarD)) {
                t52VarD = null;
            }
            if (t52VarD != null) {
                return b04.c(t52VarD);
            }
        }
        return null;
    }

    @Override // defpackage.af0
    public final Map<n8a, up2<?>> i() {
        Map<n8a, up2<?>> map = this.b;
        if (map != null) {
            return map;
        }
        b(4);
        throw null;
    }

    public final String toString() {
        return mz3.a.x(this, null);
    }
}
