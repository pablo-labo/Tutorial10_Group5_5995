package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.lazy.layout.j;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q1b implements c {
    public final e2b a;
    public final b<i1b> b;
    public final j c;

    public static final class a implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                f3a f3aVarF = q1b.this.b.f();
                int i = this.b;
                mj7 mj7VarB = f3aVarF.b(i);
                ((i1b) mj7VarB.c).b.j(v1b.a, Integer.valueOf(i - mj7VarB.a), bVar2, 0);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public q1b(e2b e2bVar, p1b p1bVar, j jVar) {
        this.a = e2bVar;
        this.b = p1bVar;
        this.c = jVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final int a() {
        return this.b.f().a;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final int c(Object obj) {
        return this.c.c(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1b)) {
            return false;
        }
        return wl7.b(this.b, ((q1b) obj).b);
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final Object g(int i) {
        Object objA = this.c.a(i);
        return objA == null ? this.b.g(i) : objA;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final void h(int i, Object obj, androidx.compose.runtime.b bVar, int i2) {
        int i3;
        Object obj2;
        androidx.compose.runtime.c cVarH = bVar.h(-1201380429);
        int i4 = (cVarH.d(i) ? 4 : 2) | i2 | (cVarH.x(obj) ? 32 : 16) | (cVarH.K(this) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            wab.b(obj2, i3, this.a.A, bh2.c(1142237095, new a(i), cVarH), cVarH, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new oe0(this, i3, obj2, i2);
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
