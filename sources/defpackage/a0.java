package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 implements y {
    public final en6 a;
    public final int b;
    public final int c;
    public pl2 d;

    public a0(en6 en6Var, int i, int i2) {
        en6Var.getClass();
        this.a = en6Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.y
    public final int b() {
        return this.c;
    }

    @Override // defpackage.y
    public final int c() {
        return this.b;
    }

    @Override // defpackage.y
    public final y getParent() {
        return this.d;
    }

    @Override // defpackage.y
    public final en6 getType() {
        return this.a;
    }
}
