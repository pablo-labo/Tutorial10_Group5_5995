package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class mt8 extends AbstractList<String> implements RandomAccess, nt8 {
    public static final s6g b = new s6g(new mt8());
    public final ArrayList a;

    public mt8(nt8 nt8Var) {
        this.a = new ArrayList(nt8Var.size());
        addAll(nt8Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.a.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof nt8) {
            collection = ((nt8) collection).h();
        }
        boolean zAddAll = this.a.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.a;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ur1) {
            ur1 ur1Var = (ur1) obj;
            String strO = ur1Var.o();
            if (ur1Var.g()) {
                arrayList.set(i, strO);
            }
            return strO;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = pi7.a;
        try {
            String str = new String(bArr, "UTF-8");
            if (msb.i(0, bArr, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            l6.p("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // defpackage.nt8
    public final List<?> h() {
        return Collections.unmodifiableList(this.a);
    }

    @Override // defpackage.nt8
    public final ur1 k0(int i) {
        ur1 oz8Var;
        ArrayList arrayList = this.a;
        Object obj = arrayList.get(i);
        if (obj instanceof ur1) {
            oz8Var = (ur1) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            oz8 oz8Var2 = ur1.a;
            try {
                oz8Var = new oz8(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                l6.p("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            oz8 oz8Var3 = ur1.a;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            oz8Var = new oz8(bArr2);
        }
        if (oz8Var != obj) {
            arrayList.set(i, oz8Var);
        }
        return oz8Var;
    }

    @Override // defpackage.nt8
    public final void o0(oz8 oz8Var) {
        this.a.add(oz8Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.a.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof ur1) {
            return ((ur1) objRemove).o();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = pi7.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            l6.p("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.a.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof ur1) {
            return ((ur1) obj2).o();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = pi7.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            l6.p("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.nt8
    public final s6g v() {
        return new s6g(this);
    }

    public mt8() {
        this.a = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.a.size(), collection);
    }
}
