package defpackage;

import defpackage.slb;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import slb.a;

/* JADX INFO: loaded from: classes.dex */
public final class mr8 {
    public final wlb a;
    public final Function1<? super qea, j6g> b;
    public final tlb c;
    public slb d;
    public int e;
    public int f;
    public int g;

    public final class a implements qea {
        public final int a;
        public final ArrayList b = new ArrayList();

        public a(int i) {
            this.a = i;
        }

        @Override // defpackage.qea
        public final void a(int i) {
            mr8 mr8Var = mr8.this;
            slb slbVar = mr8Var.d;
            if (slbVar == null) {
                return;
            }
            tlb tlbVar = mr8Var.c;
            wlb wlbVar = slbVar.c;
            this.b.add(slbVar.new a(i, tlbVar, wlbVar instanceof nnb ? (nnb) wlbVar : null, null));
        }

        @Override // defpackage.qea
        public final int b() {
            return this.a;
        }
    }

    public interface b {
        void c();

        void cancel();
    }

    public interface c {
        long a(int i);

        int b();
    }

    public mr8() {
        this.c = new tlb();
        this.e = -1;
        this.f = -1;
    }

    public final b a(int i, long j, boolean z, Function1<? super c, j6g> function1) {
        slb slbVar = this.d;
        if (slbVar == null) {
            return ud4.a;
        }
        wlb wlbVar = slbVar.c;
        boolean z2 = wlbVar instanceof nnb;
        slb.a aVar = slbVar.new a(i, this.c, z2 ? (nnb) wlbVar : null, function1);
        aVar.d = new iq2(j);
        if (!z2) {
            wlbVar.a(aVar);
        } else if (z) {
            ((nnb) wlbVar).c(aVar);
        } else {
            ((nnb) wlbVar).b(aVar);
        }
        fb0.a(i, "compose:lazy:schedule_prefetch:index");
        return aVar;
    }

    @sy3
    public mr8(wlb wlbVar, Function1<? super qea, j6g> function1) {
        this();
        this.a = wlbVar;
        this.b = function1;
    }
}
