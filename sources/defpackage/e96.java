package defpackage;

import defpackage.c7e;
import defpackage.ce9;
import defpackage.e69;
import java.util.ArrayList;
import java.util.List;
import xpb.a;

/* JADX INFO: loaded from: classes3.dex */
public final class e96 extends de9 {
    public final xpb e;
    public final int f;
    public int g;

    public static final class a {
        public static ArrayList a(CharSequence charSequence) {
            charSequence.getClass();
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2) == '|') {
                    int i3 = i2 - 1;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (charSequence.charAt(i3) != '\\') {
                        arrayList.add(charSequence.subSequence(i, i2).toString());
                        i = i2 + 1;
                    }
                }
            }
            arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e96(e69.a aVar, gd9 gd9Var, xpb xpbVar, int i) {
        super(gd9Var, xpbVar.new a());
        gd9Var.getClass();
        this.e = xpbVar;
        this.f = i;
        List listZ = u63.Z(new c7e.a(new oh7(aVar.c, aVar.c(), 1), c0h.e0));
        ArrayList arrayList = xpbVar.b;
        arrayList.addAll(listZ);
        arrayList.addAll(j(aVar));
    }

    @Override // defpackage.ce9
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ce9
    public final boolean f(e69.a aVar) {
        return aVar.b == -1;
    }

    @Override // defpackage.de9
    public final int g(e69.a aVar) {
        return aVar.c();
    }

    @Override // defpackage.de9
    public final ce9.c h(e69.a aVar, gd9 gd9Var) {
        gd9Var.getClass();
        int i = this.g + 1;
        this.g = i;
        ce9.c cVar = ce9.c.e;
        xpb xpbVar = this.e;
        if (i == 1) {
            List listZ = u63.Z(new c7e.a(new oh7(aVar.c + 1, aVar.c(), 1), ak2.d));
            xpbVar.getClass();
            xpbVar.b.addAll(listZ);
            return cVar;
        }
        boolean zM = zve.M(aVar.d, '|');
        ce9.c cVar2 = ce9.c.f;
        if (!zM) {
            return cVar2;
        }
        ArrayList arrayListJ = j(aVar);
        if (arrayListJ.isEmpty()) {
            return cVar2;
        }
        ArrayList arrayListH1 = z92.h1(u63.Z(new c7e.a(new oh7(((c7e.a) z92.O0(arrayListJ)).a.a, ((c7e.a) z92.Y0(arrayListJ)).a.b, 1), c0h.f0)), arrayListJ);
        xpbVar.getClass();
        xpbVar.b.addAll(arrayListH1);
        return cVar;
    }

    @Override // defpackage.de9
    public final en6 i() {
        return c0h.d0;
    }

    public final ArrayList j(e69.a aVar) {
        kd9 kd9Var = ak2.d;
        ArrayList arrayList = new ArrayList();
        int iD = aVar.c;
        String str = aVar.d;
        int i = aVar.b;
        gd9 gd9Var = this.a;
        if (i == -1) {
            iD += hd9.d(gd9Var, str) + 1;
        }
        ArrayList arrayListA = a.a(hd9.b(gd9Var, str));
        int size = arrayListA.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            String str2 = (String) arrayListA.get(i2);
            if (!zve.U(str2) || (1 <= i2 && i2 <= arrayListA.size() - 2)) {
                arrayList.add(new c7e.a(new oh7(iD, str2.length() + iD, 1), ak2.V));
                i3++;
            }
            int length = str2.length() + iD;
            if (i2 < arrayListA.size() - 1) {
                arrayList.add(new c7e.a(new oh7(length, length + 1, 1), kd9Var));
            }
            iD = length + 1;
            if (i3 < this.f) {
                i2++;
            } else if (iD < aVar.c()) {
                arrayList.add(new c7e.a(new oh7(iD, aVar.c(), 1), kd9Var));
                return arrayList;
            }
        }
        return arrayList;
    }
}
