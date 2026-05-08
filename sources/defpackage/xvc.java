package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class xvc extends mvc implements xw7 {
    public final vvc a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public xvc(vvc vvcVar, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.a = vvcVar;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.xw7
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.ku7
    public final Collection getAnnotations() {
        return r03.n(this.b);
    }

    @Override // defpackage.xw7
    public final n8a getName() {
        String str = this.c;
        if (str != null) {
            return n8a.f(str);
        }
        return null;
    }

    @Override // defpackage.xw7
    public final jw7 getType() {
        return this.a;
    }

    @Override // defpackage.ku7
    public final fu7 p(mq5 mq5Var) {
        mq5Var.getClass();
        return r03.k(this.b, mq5Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        u40.k(xvc.class, sb, ": ");
        sb.append(this.d ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
