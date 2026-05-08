package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ey3 implements r6e<oh7> {
    public final CharSequence a;
    public final Function2<CharSequence, Integer, Pair<Integer, Integer>> b;

    public static final class a implements Iterator<oh7>, ze8 {
        public int a = -1;
        public int b;
        public int c;
        public oh7 d;

        public a() {
            int iC = nic.C(0, 0, ey3.this.a.length());
            this.b = iC;
            this.c = iC;
        }

        public final void a() {
            ey3 ey3Var = ey3.this;
            CharSequence charSequence = ey3Var.a;
            int i = this.c;
            if (i < 0) {
                this.a = 0;
                this.d = null;
                return;
            }
            if (i > charSequence.length()) {
                int i2 = this.b;
                charSequence.getClass();
                this.d = new oh7(i2, charSequence.length() - 1, 1);
                this.c = -1;
            } else {
                Pair<Integer, Integer> pairInvoke = ey3Var.b.invoke(charSequence, Integer.valueOf(this.c));
                if (pairInvoke == null) {
                    int i3 = this.b;
                    charSequence.getClass();
                    this.d = new oh7(i3, charSequence.length() - 1, 1);
                    this.c = -1;
                } else {
                    int iIntValue = pairInvoke.a().intValue();
                    int iIntValue2 = pairInvoke.b().intValue();
                    this.d = nic.H(this.b, iIntValue);
                    int i4 = iIntValue + iIntValue2;
                    this.b = i4;
                    this.c = i4 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
            this.a = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.a == -1) {
                a();
            }
            return this.a == 1;
        }

        @Override // java.util.Iterator
        public final oh7 next() {
            if (this.a == -1) {
                a();
            }
            if (this.a == 0) {
                k20.p();
                return null;
            }
            oh7 oh7Var = this.d;
            oh7Var.getClass();
            this.d = null;
            this.a = -1;
            return oh7Var;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ey3(CharSequence charSequence, Function2 function2) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = function2;
    }

    @Override // defpackage.r6e
    public final Iterator<oh7> iterator() {
        return new a();
    }
}
