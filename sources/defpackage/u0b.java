package defpackage;

import defpackage.kza;
import defpackage.m2b;
import defpackage.qsg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u0b<T> implements uab<T> {
    public static final u0b<Object> e = new u0b<>(kza.b.g);
    public final ArrayList a;
    public int b;
    public int c;
    public int d;

    public u0b(List<nrf<T>> list, int i, int i2) {
        list.getClass();
        this.a = new ArrayList(list);
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((nrf) it.next()).b.size();
        }
        this.b = size;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.uab
    public final int a() {
        return this.c + this.b + this.d;
    }

    @Override // defpackage.uab
    public final int b() {
        return this.b;
    }

    @Override // defpackage.uab
    public final int c() {
        return this.c;
    }

    @Override // defpackage.uab
    public final int d() {
        return this.d;
    }

    public final qsg.a e(int i) {
        ArrayList arrayList;
        int i2 = 0;
        int size = i - this.c;
        while (true) {
            arrayList = this.a;
            if (size < ((nrf) arrayList.get(i2)).b.size() || i2 >= u63.J(arrayList)) {
                break;
            }
            size -= ((nrf) arrayList.get(i2)).b.size();
            i2++;
        }
        return new qsg.a(((nrf) arrayList.get(i2)).c, size, i - this.c, ((a() - i) - this.d) - 1, g(), h());
    }

    public final T f(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((nrf) arrayList.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((nrf) arrayList.get(i2)).b.get(i);
    }

    public final int g() {
        Integer numValueOf;
        int[] iArr = ((nrf) z92.O0(this.a)).a;
        iArr.getClass();
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i > i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    public final int h() {
        Integer numValueOf;
        int[] iArr = ((nrf) z92.Y0(this.a)).a;
        iArr.getClass();
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    public final m2b<T> i(kza<T> kzaVar) {
        kzaVar.getClass();
        boolean z = kzaVar instanceof kza.b;
        ArrayList arrayList = this.a;
        if (!z) {
            if (!(kzaVar instanceof kza.a)) {
                r6.g("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                return null;
            }
            oh7 oh7Var = new oh7(0, 0, 1);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                nrf nrfVar = (nrf) it.next();
                int[] iArr = nrfVar.a;
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        int i2 = iArr[i];
                        if (oh7Var.a <= i2 && i2 <= oh7Var.b) {
                            size += nrfVar.b.size();
                            it.remove();
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            int i3 = this.b - size;
            this.b = i3;
            int i4 = this.d;
            this.d = 0;
            return new m2b.b(this.c + i3, size, 0, i4);
        }
        kza.b bVar = (kza.b) kzaVar;
        List<nrf<T>> list = bVar.b;
        List<nrf<T>> list2 = list;
        Iterator<T> it2 = list2.iterator();
        int size2 = 0;
        while (it2.hasNext()) {
            size2 += ((nrf) it2.next()).b.size();
        }
        int iOrdinal = bVar.a.ordinal();
        if (iOrdinal == 0) {
            r6.g("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            return null;
        }
        if (iOrdinal == 1) {
            int i5 = this.c;
            arrayList.addAll(0, list);
            this.b += size2;
            this.c = bVar.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                w92.w0(arrayList2, ((nrf) it3.next()).b);
            }
            return new m2b.d(arrayList2, this.c, i5);
        }
        if (iOrdinal != 2) {
            l.g();
            return null;
        }
        int i6 = this.d;
        int i7 = this.b;
        arrayList.addAll(arrayList.size(), list);
        this.b += size2;
        this.d = bVar.d;
        int i8 = this.c + i7;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            w92.w0(arrayList3, ((nrf) it4.next()).b);
        }
        return new m2b.a(i8, this.d, i6, arrayList3);
    }

    public final String toString() throws IOException {
        int i = this.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(f(i2));
        }
        String strW0 = z92.W0(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        sb.append(this.c);
        sb.append(" placeholders), ");
        sb.append(strW0);
        sb.append(", (");
        return w20.k(sb, this.d, " placeholders)]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u0b(kza.b<T> bVar) {
        this(bVar.b, bVar.c, bVar.d);
        bVar.getClass();
    }
}
