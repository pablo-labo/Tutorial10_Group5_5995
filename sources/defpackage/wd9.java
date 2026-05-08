package defpackage;

import defpackage.c7e;
import defpackage.mnf;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class wd9 {
    public final md9 a;

    public final class a extends z {
        public final /* synthetic */ wd9 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd9 wd9Var, String str) {
            super(str, 0);
            str.getClass();
            this.c = wd9Var;
        }

        @Override // defpackage.z
        public final List<y> b(en6 en6Var, int i, int i2) {
            int i3;
            en6Var.getClass();
            if (!(en6Var.equals(pg8.Z) ? true : en6Var.equals(zd9.s) ? true : en6Var.equals(zd9.v) ? true : en6Var.equals(ak2.V))) {
                return super.b(en6Var, i, i2);
            }
            CharSequence charSequence = (CharSequence) this.a;
            charSequence.getClass();
            md9 md9Var = this.c.a;
            sd9 sd9VarJ = md9Var.j();
            Set<en6> set = sd9.i;
            charSequence.getClass();
            sd9VarJ.d = charSequence;
            sd9VarJ.e = i;
            sd9VarJ.f = i2;
            b7h b7hVar = sd9VarJ.a;
            b7hVar.c = charSequence;
            b7hVar.f = i;
            b7hVar.d = i;
            b7hVar.e = i;
            b7hVar.h = false;
            b7hVar.g = i2;
            b7hVar.b = 0;
            sd9VarJ.b = b7hVar.a();
            sd9VarJ.g = b7hVar.f;
            sd9VarJ.a();
            uu8 uu8Var = new uu8(sd9VarJ);
            oh7 oh7Var = new oh7(0, uu8Var.b.size(), 1);
            ew5 ew5VarG = md9Var.g();
            ArrayList arrayList = new ArrayList();
            int i4 = oh7Var.b;
            int i5 = i4 - 1;
            if (i5 >= 0) {
                int i6 = 0;
                i3 = 0;
                while (true) {
                    if (wl7.b(new mnf.a(i6).d(), zd9.c)) {
                        if (i3 < i6) {
                            arrayList.add(new oh7(i3, i6 - 1, 1));
                        }
                        i3 = i6 + 1;
                    }
                    if (i6 == i5) {
                        break;
                    }
                    i6++;
                }
            } else {
                i3 = 0;
            }
            if (i3 < i4) {
                arrayList.add(new oh7(i3, i4, 1));
            }
            ew5VarG.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<List> arrayList3 = new ArrayList();
            arrayList3.add(arrayList);
            for (c7e c7eVar : u63.a0(new q51(u63.a0(zd9.I, ak2.e)), new d81(), new hf9(), new z17(), new he7(), new quc(), new ar4(new zq4(), new wue()))) {
                ArrayList arrayList4 = new ArrayList();
                for (List list : arrayList3) {
                    list.getClass();
                    c7e.b bVarA = c7eVar.a(uu8Var, list);
                    arrayList2.addAll(bVarA.a);
                    arrayList4.addAll(bVarA.b);
                }
                arrayList3 = arrayList4;
            }
            return u63.Z(new vd7(new z(charSequence, 0), uu8Var).a(z92.h1(arrayList2, u63.Z(new c7e.a(oh7Var, en6Var)))));
        }
    }

    public wd9(md9 md9Var) {
        md9Var.getClass();
        this.a = md9Var;
    }
}
