package defpackage;

import defpackage.h5c;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p8a implements o8a {
    public final i5c a;
    public final h5c b;

    public p8a(i5c i5cVar, h5c h5cVar) {
        this.a = i5cVar;
        this.b = h5cVar;
    }

    @Override // defpackage.o8a
    public final boolean a(int i) {
        return c(i).f().booleanValue();
    }

    @Override // defpackage.o8a
    public final String b(int i) throws IOException {
        muf<List<String>, List<String>, Boolean> mufVarC = c(i);
        List<String> listA = mufVarC.a();
        String strW0 = z92.W0(mufVarC.b(), ".", null, null, null, 62);
        if (listA.isEmpty()) {
            return strW0;
        }
        return z92.W0(listA, "/", null, null, null, 62) + '/' + strW0;
    }

    public final muf<List<String>, List<String>, Boolean> c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            h5c.c cVarL = this.b.l(i);
            String strL = this.a.l(cVarL.p());
            h5c.c.EnumC0254c enumC0254cN = cVarL.n();
            enumC0254cN.getClass();
            int iOrdinal = enumC0254cN.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(strL);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(strL);
            } else {
                if (iOrdinal != 2) {
                    l.g();
                    return null;
                }
                linkedList2.addFirst(strL);
                z = true;
            }
            i = cVarL.o();
        }
        return new muf<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // defpackage.o8a
    public final String getString(int i) {
        String strL = this.a.l(i);
        strL.getClass();
        return strL;
    }
}
