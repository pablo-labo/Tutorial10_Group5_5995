package defpackage;

import defpackage.oyh;
import defpackage.vxh;

/* JADX INFO: loaded from: classes2.dex */
public class vxh<MessageType extends oyh<MessageType, BuilderType>, BuilderType extends vxh<MessageType, BuilderType>> extends mth<MessageType, BuilderType> {
    public final oyh a;
    public oyh b;

    public vxh(MessageType messagetype) {
        this.a = messagetype;
        if (messagetype.l()) {
            l5.q("Default instance must be immutable.");
            throw null;
        }
        this.b = (oyh) messagetype.e(4);
    }

    public final Object clone() {
        vxh vxhVar = (vxh) this.a.e(5);
        boolean zL = this.b.l();
        oyh oyhVar = this.b;
        if (zL) {
            oyhVar.h();
            oyhVar = this.b;
        }
        vxhVar.b = oyhVar;
        return vxhVar;
    }

    public final void e() {
        if (this.b.l()) {
            return;
        }
        oyh oyhVar = (oyh) this.a.e(4);
        y2i.c.a(oyhVar.getClass()).zzg(oyhVar, this.b);
        this.b = oyhVar;
    }
}
