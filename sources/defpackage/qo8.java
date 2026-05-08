package defpackage;

import defpackage.mr8;
import defpackage.wle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qo8 {
    public final /* synthetic */ so8 a;

    public qo8(so8 so8Var) {
        this.a = so8Var;
    }

    public final ArrayList a(final int i) {
        ArrayList arrayList = new ArrayList();
        wle.a aVar = wle.e;
        so8 so8Var = this.a;
        aVar.getClass();
        wle wleVarA = wle.a.a();
        Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
        wle wleVarB = wle.a.b(wleVarA);
        try {
            final go8 go8Var = so8Var.b ? so8Var.c : (go8) ((gme) so8Var.e).getValue();
            if (go8Var != null) {
                final juc jucVar = new juc();
                jucVar.element = 1;
                final List<Pair<Integer, iq2>> listInvoke = go8Var.k.invoke(Integer.valueOf(i));
                int size = listInvoke.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Pair<Integer, iq2> pair = listInvoke.get(i2);
                    mr8 mr8Var = so8Var.o;
                    int iIntValue = pair.d().intValue();
                    long j = pair.e().a;
                    ko2 ko2Var = so8.w;
                    jucVar = jucVar;
                    final ArrayList arrayList2 = null;
                    arrayList.add(mr8Var.a(iIntValue, j, false, new Function1(arrayList2, jucVar, listInvoke, i, go8Var) { // from class: po8
                        public final /* synthetic */ List a;
                        public final /* synthetic */ juc b;
                        public final /* synthetic */ List c;
                        public final /* synthetic */ go8 d;

                        {
                            this.d = go8Var;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            mr8.c cVar = (mr8.c) obj;
                            int iB = cVar.b();
                            int iA = 0;
                            for (int i3 = 0; i3 < iB; i3++) {
                                iA += (int) (this.d.q == dwa.a ? cVar.a(i3) & 4294967295L : cVar.a(i3) >> 32);
                            }
                            List list = this.a;
                            if (list != null) {
                                list.add(Integer.valueOf(iA));
                            }
                            juc jucVar2 = this.b;
                            if (jucVar2.element != this.c.size()) {
                                jucVar2.element++;
                            }
                            return j6g.a;
                        }
                    }));
                }
                j6g j6gVar = j6g.a;
            }
            wle.a.e(wleVarA, wleVarB, function1E);
            return arrayList;
        } catch (Throwable th) {
            wle.a.e(wleVarA, wleVarB, function1E);
            throw th;
        }
    }
}
