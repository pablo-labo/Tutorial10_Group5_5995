package defpackage;

import defpackage.kza;
import defpackage.qsg;
import defpackage.r2b;
import defpackage.xz8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0b<Key, Value> {
    public final h4 a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public final go1 g;
    public final go1 h;
    public final LinkedHashMap i;
    public final h3a j;

    public static final class a<Key, Value> {
        public final a5a a = pnb.i();
        public final e0b<Key, Value> b;

        public a(h4 h4Var) {
            this.b = new e0b<>(h4Var);
        }
    }

    public e0b(h4 h4Var) {
        this.a = h4Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.g = h22.a(-1, 6, null);
        this.h = h22.a(-1, 6, null);
        this.i = new LinkedHashMap();
        h3a h3aVar = new h3a();
        h3aVar.c(zz8.a, xz8.b.b);
        this.j = h3aVar;
    }

    public final s2b<Key, Value> a(qsg.a aVar) {
        Integer numValueOf;
        ArrayList arrayList = this.c;
        List listZ1 = z92.z1(arrayList);
        if (aVar != null) {
            int i = aVar.e;
            int size = this.e;
            int i2 = -this.d;
            int size2 = (arrayList.size() - 1) - this.d;
            int i3 = i2;
            while (i3 < i) {
                size += i3 > size2 ? 10 : ((r2b.b.c) arrayList.get(this.d + i3)).a.size();
                i3++;
            }
            int i4 = size + aVar.f;
            if (i < i2) {
                i4 -= 10;
            }
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = null;
        }
        return new s2b<>(listZ1, numValueOf, this.a, this.e);
    }

    public final boolean b(int i, zz8 zz8Var, r2b.b.c<Key, Value> cVar) {
        zz8Var.getClass();
        cVar.getClass();
        int i2 = cVar.d;
        List<Value> list = cVar.a;
        int i3 = cVar.e;
        int iOrdinal = zz8Var.ordinal();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (iOrdinal == 0) {
            if (!arrayList2.isEmpty()) {
                r6.g("cannot receive multiple init calls");
                return false;
            }
            if (i != 0) {
                r6.g("init loadId must be the initial value, 0");
                return false;
            }
            arrayList.add(cVar);
            this.d = 0;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            this.f = i3;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            this.e = i2;
            return true;
        }
        LinkedHashMap linkedHashMap = this.i;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return true;
            }
            if (arrayList2.isEmpty()) {
                r6.g("should've received an init before append");
                return false;
            }
            if (i == 0) {
                arrayList.add(cVar);
                if (i3 == Integer.MIN_VALUE) {
                    int size = this.f - list.size();
                    i3 = size < 0 ? 0 : size;
                }
                this.f = i3 != Integer.MIN_VALUE ? i3 : 0;
                linkedHashMap.remove(zz8.c);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                r6.g("should've received an init before prepend");
                return false;
            }
            if (i == 0) {
                arrayList.add(0, cVar);
                this.d++;
                if (i2 == Integer.MIN_VALUE) {
                    int size2 = this.e - list.size();
                    i2 = size2 < 0 ? 0 : size2;
                }
                this.e = i2 != Integer.MIN_VALUE ? i2 : 0;
                linkedHashMap.remove(zz8.b);
                return true;
            }
        }
        return false;
    }

    public final kza.b c(r2b.b.c cVar, zz8 zz8Var) {
        cVar.getClass();
        int iOrdinal = zz8Var.ordinal();
        int size = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                size = 0 - this.d;
            } else {
                if (iOrdinal != 2) {
                    l.g();
                    return null;
                }
                size = (this.c.size() - this.d) - 1;
            }
        }
        List listZ = u63.Z(new nrf(size, cVar.a));
        int iOrdinal2 = zz8Var.ordinal();
        h3a h3aVar = this.j;
        if (iOrdinal2 == 0) {
            kza.b<Object> bVar = kza.b.g;
            return new kza.b(zz8.a, listZ, this.e, this.f, h3aVar.d(), null);
        }
        if (iOrdinal2 == 1) {
            kza.b<Object> bVar2 = kza.b.g;
            return new kza.b(zz8.b, listZ, this.e, -1, h3aVar.d(), null);
        }
        if (iOrdinal2 != 2) {
            l.g();
            return null;
        }
        kza.b<Object> bVar3 = kza.b.g;
        return new kza.b(zz8.c, listZ, -1, this.f, h3aVar.d(), null);
    }
}
