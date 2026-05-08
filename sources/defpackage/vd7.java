package defpackage;

import defpackage.c7e;
import defpackage.ltf;
import defpackage.mnf;
import java.util.ArrayList;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class vd7 extends ltf {
    public final uu8 b;
    public int c;

    public vd7(z zVar, uu8 uu8Var) {
        super(zVar);
        this.b = uu8Var;
        this.c = -1;
    }

    @Override // defpackage.ltf
    public final ltf.a b(ltf.b bVar, List<ltf.a> list, boolean z) {
        vd7 vd7Var;
        list.getClass();
        c7e.a aVar = bVar.c;
        en6 en6Var = aVar.b;
        oh7 oh7Var = aVar.a;
        int i = oh7Var.a;
        int i2 = oh7Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        if (z) {
            d(this.b, arrayList, i, -1, -1);
            vd7Var = this;
        } else {
            vd7Var = this;
        }
        int size = list.size();
        for (int i3 = 1; i3 < size; i3++) {
            ltf.a aVar2 = list.get(i3 - 1);
            ltf.a aVar3 = list.get(i3);
            arrayList.add(aVar2.a);
            int i4 = aVar2.c - 1;
            int i5 = aVar3.b;
            uu8 uu8Var = vd7Var.b;
            vd7Var.d(uu8Var, arrayList, i4, 1, new mnf.a(i5).e(0).b);
        }
        if (!list.isEmpty()) {
            arrayList.add(((ltf.a) z92.Y0(list)).a);
        }
        if (z) {
            uu8 uu8Var2 = vd7Var.b;
            vd7Var.d(uu8Var2, arrayList, i2 - 1, 1, new mnf.a(i2).e(0).b);
        }
        return new ltf.a(vd7Var.a.a(en6Var, arrayList), i, i2);
    }

    @Override // defpackage.ltf
    public final void c(ltf.b bVar, List<ltf.a> list) {
        bVar.getClass();
        int i = bVar.a;
        if (this.c == -1) {
            this.c = i;
        }
        while (true) {
            int i2 = this.c;
            if (i2 >= i) {
                return;
            }
            mnf.a aVar = new mnf.a(i2);
            if (aVar.d() == null) {
                throw new MarkdownParsingException("");
            }
            en6 en6VarD = aVar.d();
            en6VarD.getClass();
            for (y yVar : this.a.b(en6VarD, aVar.e(0).b, aVar.e(0).c)) {
                if (list != null) {
                    int i3 = aVar.a;
                    list.add(new ltf.a(yVar, i3, i3 + 1));
                }
            }
            this.c++;
        }
    }

    public final void d(uu8 uu8Var, ArrayList arrayList, int i, int i2, int i3) {
        mnf.a aVar = new mnf.a(i);
        int i4 = 0;
        while (true) {
            int i5 = i4 + i2;
            if (aVar.e(i5).a == null || aVar.e(i5).b == i3) {
                break;
            } else {
                i4 = i5;
            }
        }
        while (i4 != 0) {
            en6 en6Var = aVar.e(i4).a;
            en6Var.getClass();
            arrayList.addAll(this.a.b(en6Var, aVar.e(i4).b, aVar.e(i4 + 1).b));
            i4 -= i2;
        }
    }
}
