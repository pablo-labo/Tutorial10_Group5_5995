package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mx4 extends up2<j6g> {

    public static final class a extends mx4 {
        public final String b;

        public a(String str) {
            super(j6g.a);
            this.b = str;
        }

        @Override // defpackage.up2
        public final ui8 a(xx9 xx9Var) {
            xx9Var.getClass();
            return lx4.c(kx4.g0, this.b);
        }

        @Override // defpackage.up2
        public final String toString() {
            return this.b;
        }
    }

    @Override // defpackage.up2
    public final j6g b() {
        throw new UnsupportedOperationException();
    }
}
