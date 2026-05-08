package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class us1 {
    public Object a;
    public Object b;
    public Object c;

    public us1(ese eseVar, us1 us1Var) {
        this.a = eseVar;
        this.b = us1Var;
        this.c = eseVar.getValue();
    }

    public boolean a() {
        if (((ese) this.a).getValue() != this.c) {
            return true;
        }
        us1 us1Var = (us1) this.b;
        return us1Var != null && us1Var.a();
    }
}
