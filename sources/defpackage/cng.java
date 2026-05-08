package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cng {
    public static final cng b = new cng(zr4.a);
    public final List<o5c> a;

    public static final class a {
        public static cng a(p5c p5cVar) {
            if (p5cVar.l() == 0) {
                return cng.b;
            }
            List<o5c> listM = p5cVar.m();
            listM.getClass();
            return new cng(listM);
        }
    }

    public cng(List<o5c> list) {
        this.a = list;
    }
}
