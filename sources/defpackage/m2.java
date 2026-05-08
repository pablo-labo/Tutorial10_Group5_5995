package defpackage;

import defpackage.spe;
import defpackage.t22;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m2<T> implements Iterator<T> {
    public a a;
    public String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("READY", 0);
            a = aVar;
            a aVar2 = new a("NOT_READY", 1);
            b = aVar2;
            a aVar3 = new a("DONE", 2);
            c = aVar3;
            a aVar4 = new a("FAILED", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a aVar;
        String string;
        t22 t22Var;
        a aVar2 = this.a;
        a aVar3 = a.d;
        if (aVar2 == aVar3) {
            bg.h();
            return false;
        }
        int iOrdinal = aVar2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.a = aVar3;
            spe.a aVar4 = (spe.a) this;
            int i = aVar4.e;
            while (true) {
                int length = aVar4.e;
                aVar = a.c;
                if (length == -1) {
                    aVar4.a = aVar;
                    string = null;
                    break;
                }
                qpe qpeVar = (qpe) aVar4;
                t22.b bVar = qpeVar.V.a;
                CharSequence charSequence = qpeVar.c;
                int length2 = charSequence.length();
                pnb.u(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (bVar.a(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                CharSequence charSequence2 = aVar4.c;
                if (length == -1) {
                    length = charSequence2.length();
                    aVar4.e = -1;
                } else {
                    aVar4.e = length + 1;
                }
                int i2 = aVar4.e;
                if (i2 == i) {
                    int i3 = i2 + 1;
                    aVar4.e = i3;
                    if (i3 > charSequence2.length()) {
                        aVar4.e = -1;
                    }
                } else {
                    while (true) {
                        t22Var = aVar4.d;
                        if (i >= length || !t22Var.a(charSequence2.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (length > i && t22Var.a(charSequence2.charAt(length - 1))) {
                        length--;
                    }
                    int i4 = aVar4.f;
                    if (i4 == 1) {
                        length = charSequence2.length();
                        aVar4.e = -1;
                        while (length > i && t22Var.a(charSequence2.charAt(length - 1))) {
                            length--;
                        }
                    } else {
                        aVar4.f = i4 - 1;
                    }
                    string = charSequence2.subSequence(i, length).toString();
                }
            }
            this.b = string;
            if (this.a != aVar) {
                this.a = a.a;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            k20.p();
            return null;
        }
        this.a = a.b;
        T t = (T) this.b;
        this.b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
