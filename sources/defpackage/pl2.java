package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class pl2 extends a0 {
    public final List<y> e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public pl2(en6 en6Var, List<? extends y> list) {
        en6Var.getClass();
        y yVar = (y) z92.Q0(list);
        int iC = yVar != null ? yVar.c() : 0;
        y yVar2 = (y) z92.Z0(list);
        super(en6Var, iC, yVar2 != null ? yVar2.b() : 0);
        this.e = list;
        for (y yVar3 : list) {
            if (yVar3 instanceof a0) {
                ((a0) yVar3).d = this;
            }
        }
    }

    @Override // defpackage.y
    public final List<y> a() {
        return this.e;
    }
}
