package defpackage;

import defpackage.m2;
import defpackage.t22;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class spe {
    public final rpe b;
    public final t22 a = t22.d.a;
    public final int c = Integer.MAX_VALUE;

    public static abstract class a extends m2<String> {
        public final CharSequence c;
        public final t22 d;
        public int e;
        public int f;

        public a(spe speVar, CharSequence charSequence) {
            this.a = m2.a.b;
            this.e = 0;
            this.d = speVar.a;
            this.f = speVar.c;
            this.c = charSequence;
        }
    }

    public spe(rpe rpeVar) {
        this.b = rpeVar;
    }

    public final List<String> a(CharSequence charSequence) {
        charSequence.getClass();
        rpe rpeVar = this.b;
        rpeVar.getClass();
        qpe qpeVar = new qpe(rpeVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (qpeVar.hasNext()) {
            arrayList.add(qpeVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
