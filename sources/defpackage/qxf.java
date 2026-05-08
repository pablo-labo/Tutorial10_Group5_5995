package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class qxf {
    public static final qxf k = new qxf(false, false, false, false, false, new qxf(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final qxf f;
    public final boolean g;
    public final qxf h;
    public final qxf i;
    public final boolean j;

    public qxf(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, qxf qxfVar, boolean z6, qxf qxfVar2, qxf qxfVar3, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        qxfVar = (i & 32) != 0 ? null : qxfVar;
        z6 = (i & 64) != 0 ? true : z6;
        qxfVar2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? qxfVar : qxfVar2;
        qxfVar3 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? qxfVar : qxfVar3;
        boolean z7 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = qxfVar;
        this.g = z6;
        this.h = qxfVar2;
        this.i = qxfVar3;
        this.j = z7;
    }
}
