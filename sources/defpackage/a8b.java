package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a8b {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    public static final class a {
        public a8b a;
    }

    public static final class b {
        public long a;
    }

    public final void a(long j, long j2, List list, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = this.c;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                b bVar = (b) arrayList.get(size);
                long j3 = bVar.a;
                if (j3 > 0 && j3 < j) {
                    c((b) arrayList.remove(size));
                } else if (0 < j2) {
                    arrayList2.add(bVar);
                    if (arrayList.equals(this.b) && bVar.a == -1) {
                        bVar.a = System.nanoTime();
                    }
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (arrayList2.size() <= 0) {
            return;
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            ArrayList arrayList3 = this.d;
            if (i2 >= size2) {
                for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
                    arrayList2.remove(((Number) arrayList3.get(size3)).intValue());
                }
                int size4 = arrayList2.size();
                for (int i3 = 0; i3 < size4; i3++) {
                    ((b) arrayList2.get(i3)).getClass();
                    list.add(null);
                }
                arrayList2.clear();
                arrayList3.clear();
                return;
            }
            if (!arrayList3.contains(Integer.valueOf(i2))) {
                b bVar2 = (b) arrayList2.get(i2);
                int i4 = i2 + 1;
                if (i4 < arrayList2.size()) {
                    bVar2.getClass();
                    throw null;
                }
            }
            i2++;
        }
    }

    public final void b(long j, long j2, ArrayList arrayList) {
        arrayList.getClass();
        synchronized (this.b) {
            arrayList.clear();
            a(j, j2, arrayList, this.a);
            a(j, j2, arrayList, this.b);
            j6g j6gVar = j6g.a;
        }
    }

    public final void c(b bVar) {
        bVar.getClass();
        synchronized (this.e) {
            try {
                this.e.add(bVar);
            } catch (OutOfMemoryError unused) {
                this.e.clear();
                this.e.add(bVar);
            }
        }
    }
}
