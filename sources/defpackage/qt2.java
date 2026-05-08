package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qt2 implements gu5 {
    public final mp8 a;
    public final f62 b;

    public qt2(mp8 mp8Var, f62 f62Var) {
        this.a = mp8Var;
        this.b = f62Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        lf0 annotations = this.b.getAnnotations();
        mp8 mp8Var = this.a;
        mp8Var.getClass();
        annotations.getClass();
        return mp8Var.a.q.b(mp8Var.c.getValue(), annotations);
    }
}
