package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ona<E> {
    public Object[] a;
    public int b;

    public static final class a extends mj8 implements Function1<E, CharSequence> {
        final /* synthetic */ ona<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ona<E> onaVar) {
            super(1);
            this.this$0 = onaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Object obj) {
            return obj == this.this$0 ? "(this)" : String.valueOf(obj);
        }
    }

    public final E a() {
        if (!d()) {
            return (E) this.a[0];
        }
        s6.j("ObjectList is empty.");
        return null;
    }

    public final E b(int i) {
        if (i >= 0 && i < this.b) {
            return (E) this.a[i];
        }
        f(i);
        throw null;
    }

    public final int c(E e) {
        Object[] objArr = this.a;
        int i = 0;
        if (e == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (e.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final boolean e() {
        return this.b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ona) {
            ona onaVar = (ona) obj;
            int i = onaVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = onaVar.a;
                oh7 oh7VarH = nic.H(0, i2);
                int i3 = oh7VarH.a;
                int i4 = oh7VarH.b;
                if (i3 > i4) {
                    return true;
                }
                while (wl7.b(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i) {
        StringBuilder sbG = o6.g(i, "Index ", " must be in 0..");
        sbG.append(this.b - 1);
        throw new IndexOutOfBoundsException(sbG.toString());
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        a aVar = new a(this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) aVar.invoke(obj));
            i2++;
        }
        return sb.toString();
    }
}
