package defpackage;

import defpackage.us2;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class en1 {
    public final j4a<us2.a> a = new j4a<>(new us2.a[16]);

    public final void a(CancellationException cancellationException) {
        j4a<us2.a> j4aVar = this.a;
        int i = j4aVar.c;
        pw1[] pw1VarArr = new pw1[i];
        for (int i2 = 0; i2 < i; i2++) {
            pw1VarArr[i2] = j4aVar.a[i2].b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            pw1VarArr[i3].g(cancellationException);
        }
        if (j4aVar.c == 0) {
            return;
        }
        de7.c("uncancelled requests present");
    }

    public final void b() {
        j4a<us2.a> j4aVar = this.a;
        oh7 oh7VarH = nic.H(0, j4aVar.c);
        int i = oh7VarH.a;
        int i2 = oh7VarH.b;
        if (i <= i2) {
            while (true) {
                j4aVar.a[i].b.resumeWith(j6g.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        j4aVar.g();
    }
}
