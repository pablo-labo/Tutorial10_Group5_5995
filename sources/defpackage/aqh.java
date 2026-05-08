package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class aqh extends fqh {
    public final char[] e;

    public aqh(yph yphVar) {
        super(yphVar, (Character) null);
        this.e = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        char[] cArr = yphVar.b;
        if (cArr.length != 16) {
            o6.h();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER] = cArr[i & 15];
        }
    }

    @Override // defpackage.fqh, defpackage.iqh
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        zih.b(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER]);
        }
    }

    @Override // defpackage.fqh
    public final iqh c(yph yphVar, Character ch) {
        return new aqh(yphVar);
    }
}
