package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hu7 implements gu5 {
    public final /* synthetic */ int a;
    public final mp8 b;
    public final Object c;

    public /* synthetic */ hu7(mp8 mp8Var, Object obj, int i) {
        this.a = i;
        this.b = mp8Var;
        this.c = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        mp8 mp8Var = this.b;
        switch (i) {
            case 0:
                mge mgeVarO = mp8Var.a.o.l().j(((iu7) obj).a).o();
                mgeVarO.getClass();
                return mgeVarO;
            default:
                mp8Var.a.b.a(((lp8) obj).o.e);
                return null;
        }
    }
}
