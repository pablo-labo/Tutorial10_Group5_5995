package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class va5 {
    public static void a(pa5 pa5Var, w5b w5bVar) {
        if (pa5Var.g(w5bVar)) {
            return;
        }
        try {
            pa5Var.l(w5bVar, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void b(pa5 pa5Var, w5b w5bVar) throws IOException {
        try {
            IOException iOException = null;
            for (w5b w5bVar2 : pa5Var.h(w5bVar)) {
                try {
                    if (pa5Var.i(w5bVar2).b) {
                        b(pa5Var, w5bVar2);
                    }
                    pa5Var.e(w5bVar2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
