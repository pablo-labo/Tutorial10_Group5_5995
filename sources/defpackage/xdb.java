package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xdb extends o1 {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final emf[] l;
    public final Object[] m;
    public final HashMap<Object, Integer> n;

    public xdb(emf[] emfVarArr, Object[] objArr, wee weeVar) {
        super(weeVar);
        int length = emfVarArr.length;
        this.l = emfVarArr;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap<>();
        int length2 = emfVarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            emf emfVar = emfVarArr[i];
            this.l[i2] = emfVar;
            this.k[i2] = iO;
            this.j[i2] = iH;
            iO += emfVar.o();
            iH += this.l[i2].h();
            this.n.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.h = iO;
        this.i = iH;
    }

    @Override // defpackage.emf
    public final int h() {
        return this.i;
    }

    @Override // defpackage.emf
    public final int o() {
        return this.h;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xdb(ArrayList arrayList, wee weeVar) {
        emf[] emfVarArr = new emf[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            emfVarArr[i2] = ((im9) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((im9) it2.next()).a();
            i++;
        }
        this(emfVarArr, objArr, weeVar);
    }
}
