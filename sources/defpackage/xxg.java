package defpackage;

import defpackage.n83;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xxg implements wxe {
    public final List<qxg> a;
    public final long[] b;
    public final long[] c;

    public xxg(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.b = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            qxg qxgVar = (qxg) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.b;
            jArr[i2] = qxgVar.b;
            jArr[i2 + 1] = qxgVar.c;
        }
        long[] jArr2 = this.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // defpackage.wxe
    public final int a(long j) {
        long[] jArr = this.c;
        int iA = vjg.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.wxe
    public final List<n83> e(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List<qxg> list = this.a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                qxg qxgVar = list.get(i);
                n83 n83Var = qxgVar.a;
                if (n83Var.e == -3.4028235E38f) {
                    arrayList2.add(qxgVar);
                } else {
                    arrayList.add(n83Var);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new wxg());
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            n83.a aVarA = ((qxg) arrayList2.get(i3)).a.a();
            aVarA.e = (-1) - i3;
            aVarA.f = 1;
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    @Override // defpackage.wxe
    public final long f(int i) {
        ka2.l(i >= 0);
        long[] jArr = this.c;
        ka2.l(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.wxe
    public final int m() {
        return this.c.length;
    }
}
