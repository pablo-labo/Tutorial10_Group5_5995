package defpackage;

import androidx.compose.foundation.lazy.layout.j;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class bs8 implements as8 {
    public final ss8 a;
    public final yr8 b;
    public final androidx.compose.foundation.lazy.a c;
    public final j d;

    public static final class a implements Function2<b, Integer, j6g> {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                bs8 bs8Var = bs8.this;
                f3a f3aVar = bs8Var.b.a;
                int i = this.b;
                mj7 mj7VarB = f3aVar.b(i);
                ((wr8) mj7VarB.c).c.j(bs8Var.c, Integer.valueOf(i - mj7VarB.a), bVar2, 0);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public bs8(ss8 ss8Var, yr8 yr8Var, androidx.compose.foundation.lazy.a aVar, j jVar) {
        this.a = ss8Var;
        this.b = yr8Var;
        this.c = aVar;
        this.d = jVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final int a() {
        return this.b.f().a;
    }

    @Override // defpackage.as8
    public final uq8 b() {
        return this.d;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final int c(Object obj) {
        return this.d.c(obj);
    }

    @Override // defpackage.as8
    public final z2a d() {
        this.b.getClass();
        return hh7.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final Object e(int i) {
        mj7 mj7VarB = this.b.f().b(i);
        return mj7VarB.c.getType().invoke(Integer.valueOf(i - mj7VarB.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs8)) {
            return false;
        }
        return wl7.b(this.b, ((bs8) obj).b);
    }

    @Override // defpackage.as8
    public final androidx.compose.foundation.lazy.a f() {
        return this.c;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final Object g(int i) {
        Object objA = this.d.a(i);
        return objA == null ? this.b.g(i) : objA;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public final void h(int i, Object obj, b bVar, int i2) {
        c cVarH = bVar.h(-462424778);
        int i3 = (cVarH.d(i) ? 4 : 2) | i2 | (cVarH.x(obj) ? 32 : 16) | (cVarH.K(this) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            wab.b(obj, i, this.a.r, bh2.c(-824725566, new a(i), cVarH), cVarH, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new tn8(this, i, obj, i2, 1);
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
