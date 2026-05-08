package defpackage;

import defpackage.svf;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ka8 {
    @Deprecated
    public ka8() {
    }

    public boolean a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final w98 c() {
        if (this instanceof w98) {
            return (w98) this;
        }
        bg.n(this, "Not a JSON Array: ");
        return null;
    }

    public final ab8 d() {
        if (this instanceof ab8) {
            return (ab8) this;
        }
        bg.n(this, "Not a JSON Object: ");
        return null;
    }

    public long e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            gc8 gc8Var = new gc8(stringWriter);
            gc8Var.e = true;
            svf.z.getClass();
            svf.t.d(this, gc8Var);
            return stringWriter.toString();
        } catch (IOException e) {
            g7.l(e);
            return null;
        }
    }
}
