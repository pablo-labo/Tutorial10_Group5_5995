package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h90 implements xze, ga0 {
    public final String a;
    public final sze b;
    public final int c;
    public final ArrayList d;

    public static final class a extends mj8 implements Function1<wze, j6g> {
        final /* synthetic */ int $index;
        final /* synthetic */ String $string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i) {
            super(1);
            this.$string = str;
            this.$index = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(wze wzeVar) {
            wze wzeVar2 = wzeVar;
            wzeVar2.getClass();
            String str = this.$string;
            int i = this.$index + 1;
            if (str == null) {
                wzeVar2.u(i);
            } else {
                wzeVar2.n(i, str);
            }
            return j6g.a;
        }
    }

    public h90(String str, sze szeVar, int i) {
        str.getClass();
        szeVar.getClass();
        this.a = str;
        this.b = szeVar;
        this.c = i;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        this.d = arrayList;
    }

    @Override // defpackage.xze
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ga0
    public final long b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ga0
    public final <R> R c(Function1<? super wpe, ? extends l9c<R>> function1) throws IOException {
        function1.getClass();
        Cursor cursorZ = this.b.z(this);
        try {
            R value = function1.invoke(new r60(cursorZ)).getValue();
            cursorZ.close();
            return value;
        } finally {
        }
    }

    @Override // defpackage.ga0
    public final void close() {
    }

    @Override // defpackage.xze
    public final String h() {
        return this.a;
    }

    @Override // defpackage.bqe
    public final void n(int i, String str) {
        this.d.set(i, new a(str, i));
    }

    @Override // defpackage.xze
    public final void p(wze wzeVar) {
        for (Function1 function1 : this.d) {
            function1.getClass();
            function1.invoke(wzeVar);
        }
    }

    public final String toString() {
        return this.a;
    }
}
