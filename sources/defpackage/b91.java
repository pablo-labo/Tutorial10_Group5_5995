package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b91<T> implements lf3<T> {
    @Override // defpackage.lf3
    public final void a(ye3<T> ye3Var) {
        try {
            d(ye3Var);
        } finally {
            ye3Var.close();
        }
    }

    @Override // defpackage.lf3
    public final void b(ye3<T> ye3Var) {
        boolean zD = ye3Var.d();
        try {
            e(ye3Var);
        } finally {
            if (zD) {
                ye3Var.close();
            }
        }
    }

    @Override // defpackage.lf3
    public void c(ye3<T> ye3Var) {
    }

    public abstract void d(ye3<T> ye3Var);

    public abstract void e(ye3<T> ye3Var);
}
